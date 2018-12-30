package testpartner.commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Arrays;
import java.util.List;

public class Footer extends AbstractBasePage {

    @FindBy(xpath = "//section[@class='linksCon']//h3")
    private List<WebElement> footerMenu;

    List<String> expectedFooterMenu = Arrays.asList("abc");

    public Footer(WebDriver driver){
        super(driver);

    }

   public void verifyFooterMenu()
    {
        System.out.println("test footer");
    //    List<String> getFooterMenu = footerMenu.stream().map(WebElement::getText).collect(Collectors.toList());
    //    return getFooterMenu.stream().allMatch(menu -> expectedFooterMenu.contains(menu.toLowerCase()));
    }
}
