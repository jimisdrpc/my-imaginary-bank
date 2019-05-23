import { Component } from '@angular/core';
import { LoanService } from '../services/loan.service';
import { Loan } from '../loan';
import { Observable } from 'rxjs/Observable';
@Component({
  selector: 'app-loan',
  providers: [LoanService],
  templateUrl: './loan.component.html',
  styleUrls: ['./loan.component.css']
})
export class LoanComponent {
  loans: Observable<Loan[]>;

  constructor(private loanService: LoanService) { }

  requestLoanStream(): void {
      this.loans = this.loanService.getLoanStream();
  }
}


