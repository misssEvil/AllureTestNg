package redrover;

import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class mainPageTest extends BaseTest {

    @Story("Open main page")
    @Test
    public void openRedRoverMainPageP(){

        getDriver().get("https://redrover.school");
        Assert.assertEquals(getDriver().getTitle(), "RedRover | Non-commercial it-school");

    }

/*  @Story("Open main page")
    @Test
    public void openRedRoverMainPageN(){

        getDriver().get("https://redrover.school");
        Assert.assertEquals(getDriver().getTitle(), "RedRover Non-commercial it-school");

    }*/


    @Test
    public void header1Present(){
        getDriver().get("https://redrover.school");

        Assert.assertTrue(getDriver().findElement(By.xpath("//a[@href = '/#training']")).isEnabled());


    }


}
