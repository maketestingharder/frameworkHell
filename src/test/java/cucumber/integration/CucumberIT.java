package cucumber.integration;

import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * email: maketestingharder@gmail.com
 * blog: www.maketestingharder.blogspot.com
 * FB: www.facebook.com/maketestingharder
 */
@RunWith(Cucumber.class)
@Cucumber.Options(
        features={"src/test/resources/cucumber/integration/IntegrationTests.feature"},
        glue="cucumber.integration.steps")
public class CucumberIT {
}
