package testpartner.commons;

import org.openqa.selenium.WebDriver;


public class BasePage extends AbstractBasePage {

    public BasePage(WebDriver driver, Boolean mainMenuExist) {
        super(driver);
        if (mainMenuExist) {
            verifyHeaderAndFooterMenu();
            LOGGER.info("Page Header and Footer menu exist");
        }
    }



    public void verifyHeaderAndFooterMenu() {

        System.out.println("Test verify header footer");
     //   getPageInstance(Header.class).verifyHeaderMenu();
     //   getPageInstance(Footer.class).verifyFooterMenu();
    }
}
