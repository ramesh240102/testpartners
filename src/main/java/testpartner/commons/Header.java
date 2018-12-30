package testpartner.commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Arrays;
import java.util.List;

public class Header extends AbstractBasePage {

    @FindBy(xpath = "//nav[@class='mainNav']/ul//li[@class='main-link']/a")
    private List<WebElement> mainMenuList;

    List<String> expectedMainMenu = Arrays.asList("test");

    public Header(WebDriver driver){super(driver);}


    public void verifyHeaderMenu()
    {
       if (mainMenuList.size()!=0){
           System.out.println("Test Header" + mainMenuList);
       }
       else
       {
           System.out.println("Test Header Not Exist");
       }
        // System.out.println("Test Header" + mainMenuList);

        //List<String> getMainMenu = mainMenuList.stream().map(WebElement::getText).collect(Collectors.toList());
        //return getMainMenu.stream().allMatch(menu -> expectedMainMenu.contains(menu.toLowerCase()));
    }


}
