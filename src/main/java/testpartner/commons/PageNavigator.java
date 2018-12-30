package testpartner.commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.stereotype.Component;
import testpartners.HomePage;


@Component
public class PageNavigator {

    private WebDriver driver;

    public PageNavigator(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage openHomePage() {
        driver.navigate().to("https://www.testpartners.co.uk");
        return new PageFactory().initElements(driver, HomePage.class);
        //return getPageInstance(HomePage.class);
    }


}
