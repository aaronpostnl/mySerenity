package com.parabank.serenity.jbehave;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * Created by Oelan on 24-6-2015.
 */
public class open_new_account {

    @Given("I am logged in as a customer")
    public void logIn() {
        //do some login
    }

    @When("I open a new <accountType> with the minimum <deposit>")
    public void OpenAccount (){

    }
    @Then("A new account of <accountType> is <created>")
    public void CheckAccountCreated(){

    }

}
