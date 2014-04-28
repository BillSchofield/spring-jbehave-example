package com.thoughtworks.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Pending;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MySteps {
    private Integer firstNumber;
    private Integer secondNumber;
    private Integer result;

    @Given("the numbers $firstNumber and $secondNumber")
    public void numbers(Integer firstNumber, Integer secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    @When("I add them")
    public void addNumbers(){
        result = firstNumber + secondNumber;

    }

    @Then("I get $expectedResult")
    public void verifyResult(Integer expectedResult){
        assertThat(result, is(expectedResult));
    }
}
