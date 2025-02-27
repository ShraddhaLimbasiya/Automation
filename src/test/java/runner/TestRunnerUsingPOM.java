package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/java/Features/LoginDemo.feature",
        glue = {"StepDefinations"},
        plugin = {"pretty", "junit:target/JUnitReports/report.xml",
                "json:target/JSONReport/report.json",
                "html:target/HtmlReports.html"})


public class TestRunnerUsingPOM {
}
