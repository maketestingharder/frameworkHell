package cucumber.integration.steps;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

/**
 * email: maketestingharder@gmail.com
 * blog: www.maketestingharder.blogspot.com
 * FB: www.facebook.com/maketestingharder
 */
public class CucumberITSteps {
    @Given("^Integration Test Setup$")
    public void Integration_Test_Setup(){
        System.out.println("Cucumber Integration test - @Given");
    }

    @When("^Action is performed$")
    public void Action_is_performed(){
        System.out.println("Cucumber Integration test - @When");
    }

    @Then("^Output is verified$")
    public void Output_is_verified(){
        System.out.println("Cucumber Integration test - @Then");
    }
}
