package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/FindHotelTicket.feature",
        glue = {"StepDefinitions"},
        monochrome = true,
        plugin = {"pretty", "html:target/HtmlReports",
                "json:target/JSONReports/report.json",
                "html:target/JUnitReports/report.xml"})
public class TestRunner {
}
