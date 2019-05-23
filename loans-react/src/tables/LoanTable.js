import React from 'react'

const LoanTable = props => (
    <table>
        <thead>
            <tr>
                <th>Result</th>
            </tr>
        </thead>
        <tbody>
            {props.loans.length > 0 ? (
                props.loans.map(loan => (
                    <tr>
                        <td>{loan.result}</td>

                    </tr>
                ))
            ) : (
                    <tr>
                        <td>No loans</td>
                    </tr>
                )}
        </tbody>
    </table>
)

export default LoanTable