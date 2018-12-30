package seleniumutil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager {

    private WebDriver driver;


    public WebDriver getDriver()
    {
        String browserType = "chrome";
        System.out.println("Browser Type : " + browserType);

        if ( browserType.equalsIgnoreCase("chrome") && driver==null) {
            // System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        }

        return driver;
    }

    public void closeDriver()
    {
        driver.quit();
    }

}
