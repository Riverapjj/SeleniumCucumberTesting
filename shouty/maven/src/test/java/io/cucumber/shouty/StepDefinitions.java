package io.cucumber.shouty;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitions {

    private Person lucy;
    private Person sean;
    private String messageFromSean;

    public void getMessageShout() {
        for (String item : lucy.getMessageHeard()) {
            if (item.equals(messageFromSean)) {
                assertEquals(messageFromSean, item);
                break;
            }
        }
    }

    @Given("Lucy is {int} meters from Sean")
    public void lucy_located_meters_from_sean(Integer distance) {
        // Write code here that turns the phrase above into concrete actions
        lucy = new Person();
        sean = new Person();
        lucy.moveTo(distance);

    }

    @When("Sean shouts {string}")
    public void sean_shouts(String message) {
        // Write code here that turns the phrase above into concrete actions
        sean.shout(message);
        messageFromSean = message;
    }

    @Then("Lucy hears Sean's message")
    public void lucy_hears_sean_s_message() {
        // Write code here that turns the phrase above into concrete actions
        getMessageShout();
    }

    @Then("Lucy should hear Sean's message")
    public void lucy_should_hear_sean_s_message() {
        // Write code here that turns the phrase above into concrete actions
        getMessageShout();
    }
}
