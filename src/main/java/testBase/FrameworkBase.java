package testBase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class FrameworkBase
{
    private static WebDriver driver;

    @BeforeTest
    public void setup()
    {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
    }

    @AfterTest
    public void tearDown()
    {
        if(driver != null)
            driver.quit();
    }

    public static WebDriver webDriver()
    {
        return driver;
    }
}
