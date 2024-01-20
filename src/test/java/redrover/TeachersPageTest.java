package redrover;

import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class TeachersPageTest extends BaseTest {

    @Story("Open teachers page")
    @Test
    public void openTeachersPage(){
        getDriver().get("https://redrover.school");
        getDriver().findElement(By.xpath("//a[@href = '/en/teachers']")).click();
        Assert.assertEquals(getDriver().getTitle(), "RedRover | Teachers");
    }

}

