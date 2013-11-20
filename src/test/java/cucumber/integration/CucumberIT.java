package cucumber.integration;

import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * email: maketestingharder@gmail.com
 * blog: www.maketestingharder.blogspot.com
 * FB: www.facebook.com/maketestingharder
 */
@RunWith(Cucumber.class)
@Cucumber.Options(format={"json:target/report.json", "html:target/report"},
        features="classpath:cucumber/integration/IntegrationTests.feature")
public class CucumberIT {
}
