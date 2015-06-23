Meta:

Narrative:
As a customer
I want to open a new account
So that I can transfer money to the new account

Scenario: Open a new account
Given I am logged in as a customer
When I open a new savings account with the minimum deposit
Then a new savings account is created

Examples:
AccountType | DepositAccount | Created
Savings  | 12345 | true
