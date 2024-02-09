package cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Epic;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.testng.Assert;
import runner.CucumberDriver;

import static runner.CucumberDriver.getDriver;

public class CucumberSteps {



    @When ("Open Main Page")
    public void openRedRoverMainPageP(){
        CucumberDriver.getDriver().get("https://redrover.school");
    }

    @Then("Main Page is opened")
    public void assertMainPageOpened(){
        Assert.assertEquals(CucumberDriver.getDriver().getTitle(), "RedRover | Non-commercial it-school");

    }

    @And("Open Teachers Page")
    public void openTeachersPage(){
        CucumberDriver.getDriver().findElement(By.xpath("//a[@href = '/en/teachers']")).click();
    }

    @Then("Teachers Page is opened")
    public void assertTeachersPageOpened(){
        Assert.assertEquals(CucumberDriver.getDriver().getTitle(), "RedRover | Teachers");
    }
}
