import React, { Component } from 'react';

interface Result {
  result: string;
}

interface ResultListProps {
}

interface ResultListState {
  results: Array<Result>;
  isLoading: boolean;
}

class ResultList extends Component<ResultListProps, ResultListState> {

  constructor(props: ResultListProps) {
    super(props);

    this.state = {
      results: [],
      isLoading: false
    };
  }

  async componentDidMount() {
    this.setState({isLoading: true});


    {/*fetch('http://localhost:8080')
      //.then(res => res.json()) // comment this out for now
      .then(res => res.text())          // convert to plain text
      .then(text => console.log(text))  // then log it out
*/}
    const response = await fetch('http://localhost:8080');
    const data = await response.json();
    //const data = await response.text();
    console.log(data);

    this.setState({results: data, isLoading: false});
  }

  render() {
    const {results, isLoading} = this.state;

    if (isLoading) {
      return <p>Loading...</p>;
    }

    return (
      <div>
        <h2>Result List</h2>
        {results.map((result: Result) =>
          <div >
            {result.result}<br/>
          </div>
        )}
      </div>
    );
  }
}

export default ResultList;
