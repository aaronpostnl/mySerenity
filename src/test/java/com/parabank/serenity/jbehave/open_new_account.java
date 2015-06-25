package com.parabank.serenity.jbehave;

import net.thucydides.core.annotations.Step;
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

    @When("I open a new savings account with the minimum deposit")
    public void OpenAccount (){
        //open account of type with a deposit from account
    }
    @Then("A new savings account is created")
    public void CheckAccountCreated(){
        //check account is created with correct type and balance
    }
    @Step
    public void implementSomeSteps(){
        //implement some steps
    }

}
