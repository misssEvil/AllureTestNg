package redrover;

import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class mainPageTest extends BaseTest {

    @Epic("Main page")
    @Story("User story 1")
    @Severity(SeverityLevel.CRITICAL)
    @Link("https://qatoolbox.atlassian.net/browse/QT-2?atlOrigin=eyJpIjoiMjFjNGE1OThhMWYyNDkxNDg0Y2VlZDUxMDY5ZDUzZTciLCJwIjoiaiJ9")
    public void openRedRoverMainPageP(){

        getDriver().get("https://redrover.school");
        Assert.assertEquals(getDriver().getTitle(), "RedRover | Non-commercial it-school");

    }

  @Story("Open main page")
    @Test
    public void openRedRoverMainPageN(){

        getDriver().get("https://redrover.school");
        Assert.assertEquals(getDriver().getTitle(), "RedRover Non-commercial it-school");

    }


    @Epic("Main page")
    @Story("User story 1")
    @Severity(SeverityLevel.MINOR)
    @Test
    public void header1Present(){
        getDriver().get("https://redrover.school");
        Assert.assertTrue(getDriver().findElement(By.xpath("//a[@href = '/#training']")).isEnabled());


    }


}
