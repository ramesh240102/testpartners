package testpartners;


import org.openqa.selenium.WebDriver;
import testpartner.commons.BasePage;

import static utilities.DataGenerator.getRandomFirstName;

public class HomePage extends BasePage {


   public HomePage(WebDriver driver) {
        super(driver, true);
    }


    public void testHome(){
       System.out.println("test home page : " + getRandomFirstName());
    }


}
