package runner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseUtils {

    private static Properties properties;
    private static final ChromeOptions chromeOption;




    static {
        if (properties == null){
            properties = new Properties();
            try{
                InputStream inputStream = BaseUtils.class.getClassLoader().getResourceAsStream("local.properties");
                if (inputStream == null) {
                    System.out.println("ERROR: The \u001B[31mlocal.properties\u001B[0m file not found in src/test/resources/ directory.");
                    System.out.println("You need to create it from local.properties.TEMPLATE file.");
                    System.exit(1);
                }
                properties.load(inputStream);

            }
            catch (IOException ignore){
            }
        }

        chromeOption = new ChromeOptions();
        String options = properties.getProperty("default.chrome_options");
        if (options != null){
            for (String argument : options.split(";")){
                chromeOption.addArguments(argument);
            }
        }

        WebDriverManager.chromedriver().setup();
    }

    static Properties getProperties(){
        return properties;
    }

    static WebDriver createDriver(){
        WebDriver driver = new ChromeDriver(chromeOption);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

    static void captureScreenFile(WebDriver driver, String methodName, String className) {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File(String.format("ScreenshotsFailure/%s-%s.png", className, methodName)));
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}
