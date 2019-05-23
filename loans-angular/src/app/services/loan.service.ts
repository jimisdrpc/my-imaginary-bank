import { Injectable } from '@angular/core';
//import * as EventSource from 'eventsource';
import { Observable } from 'rxjs/Observable';
import { Loan } from '../loan';

@Injectable({
  providedIn: 'root'
})
export class LoanService {
  loans: Loan[] = [];
  url: string = 'http://localhost:8080/';

  getLoanStream(page?: number, size?: number): Observable<Array<Loan>> {
    this.loans = [];
    return Observable.create((observer) => {
      let url = this.url;

      let eventSource = new EventSource(url);
      eventSource.onmessage = (event) => {
        console.debug('Received event: ', event);
        let json = JSON.parse(event.data);
        this.loans.push(new Loan(json['result']));
        observer.next(this.loans);
      };
      eventSource.onerror = (error) => {
        if (eventSource.readyState === 0) {
          console.log('The stream has been closed by the server.');
          eventSource.close();
          observer.complete();
        } else {
          observer.error('EventSource error: ' + error);
        }
      }
    });
  }

}

