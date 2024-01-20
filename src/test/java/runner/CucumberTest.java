package runner;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;

import static runner.CucumberDriver.getDriver;


@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"cucumber"},
        plugin = {"pretty"}
        //tags = "not @ingnore"
)

public class CucumberTest extends AbstractTestNGCucumberTests {

}
