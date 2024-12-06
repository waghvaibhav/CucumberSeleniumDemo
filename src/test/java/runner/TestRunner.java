package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"steps", "hooks"},
        plugin = {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",  // Allure plugin for Cucumber
                "pretty",
                "html:target/cucumber-reports.html",
                "json:target/cucumber-reports/cucumber.json"},
        monochrome = true
)
public class TestRunner {
}
