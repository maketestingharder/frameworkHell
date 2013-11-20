package cucumber.unit;

import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(
        features={"src/test/resources/cucumber/unit/UnitTests.feature"},
        glue="cucumber.unit.steps")
public class CucumberUnitTest {
}
