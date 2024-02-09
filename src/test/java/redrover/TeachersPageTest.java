package redrover;


import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import runner.BaseTest;
import runner.BaseUtils;

@Epic("Main")
@Feature("Login in")
@Owner("Adelina")
@Link("https://qatoolbox.atlassian.net/browse/QT-2?atlOrigin=eyJpIjoiZjFjZTMzNDI0OGJhNGVjZGIzMzdmY2M5Yzc2MmEwMTEiLCJwIjoiaiJ9")


public class TeachersPageTest extends BaseTest {


    @Epic("Teachers page")
    @Story("Open teachers page")
    @Step("Open Teachers Page")
    @Test
    public void openTeachersPage(){
        Allure.step("Open main page");
        getDriver().get("https://redrover.school");
        Allure.step("Click on menu item Teachers");
        getDriver().findElement(By.xpath("//a[@href = '/en/teachers']")).click();
        Assert.assertEquals(getDriver().getTitle(), "RedRover | Teachers");
    }


    @Description("this is our mock test")
    @Test
    public void mockTest(){
        stepOne();
        stepTwo();
        Assert.assertEquals(getDriver().getTitle(), "RedRover | Teachers");

    }

    public void stepOne(){
        Allure.step("Open main page");
        Allure.description("description lalala");
        getDriver().get("https://redrover.school");
    }

    public void stepTwo(){
        Allure.step("Click on menu item Teachers");
        getDriver().findElement(By.xpath("//a[@href = '/en/teachers']")).click();
    }



}


