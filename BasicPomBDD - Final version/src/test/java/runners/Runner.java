package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"pageObjectTests"},
        plugin = {"pretty",
        "html:target/cucumber-report/Report.html"}
)
public class Runner
{

}
