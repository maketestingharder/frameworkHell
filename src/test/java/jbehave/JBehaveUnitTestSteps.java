package jbehave;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * email: maketestingharder@gmail.com
 * blog: www.maketestingharder.blogspot.com
 * FB: www.facebook.com/maketestingharder
 */
public class JBehaveUnitTestSteps {

    @Given("Unit test setup")
    public void setup() {
        System.out.println("JBehave Unit test - @Given");
    }

    @When("Action is performed")
    public void takeAction() {
        System.out.println("JBehave Unit test - @When");
    }

    @Then("Output is validated")
    public void validateOutput() {
        System.out.println("JBehave Unit test - @Then");
    }
}
