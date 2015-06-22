package com.parabank.serenity.jbehave;


import com.eviware.soapui.tools.SoapUITestCaseRunner;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oelan on 8-6-2015.
 */
public class request_loan_story {

    String fromAccount;
    String loanAmount;
    String downPayment;
    String approved;
    String balance;

    List<String> Properties = new ArrayList<String>();

    @Given("an account $fromAccount with a balance of $balance")
    public void givenAnAccountfromAccountWithABalanceOfbalance (@Named("fromAccount") String fromAccount, @Named("balance") String balance){
        this.fromAccount = fromAccount;
        Properties.add("fromAccount=" + fromAccount);
    }


    @When("the user requests a loan for $loanAmount with a downpayment of $downPayment")
    public void whenTheUserRequestsALoanForloanAmountWithADownpaymentOfdownPayment(@Named("loanAmount") String loanAmount, @Named("downPayment") String downPayment) {
        this.loanAmount = loanAmount;
        this.downPayment = downPayment;
        Properties.add("loanAmount=" + loanAmount);
        Properties.add("downPayment=" + downPayment);
    }


    @Then("the loan is $approved")
    public void thenTheLoanIsapproved(@Named("approved") String approved)throws Exception {
        SoapUITestCaseRunner runner = new SoapUITestCaseRunner();
        this.approved = approved;
        Properties.add("approved=" + approved);

        runner.setProjectFile("SoapuiProject/Parabank-soapui-project.xml");
        String[] ProjectProperties = Properties.toArray(new String[Properties.size()]);
        runner.setProjectProperties(ProjectProperties);
        runner.setTestCase("LoanRequestTestcase");
        //runner.setPrintReport(true);  //Outputs a small table to stdout of test results.
        runner.run();
    }
}