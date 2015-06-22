Meta:
@issue FH-001

Narrative:
In order to request a loan
As a customer
I must provide an account with sufficient funds and a sufficient downpayment amount

Scenario: Request a loan
Given an account <fromAccount> with a balance of <balance>
When the user requests a loan for <loanAmount> with a downpayment of <downPayment>
Then the loan is <approved>

Examples:
| fromAccount | balance   | loanAmount | downPayment | approved |
| 12345       | 0         | 10000      | 10          | false    |
| 12345       | 0         | 100        | 10          | true     |