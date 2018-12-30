package seleniumutil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SeleniumUtil {
   private static WebDriver driver;

    public static <T> void enterText(final T element, final String value){
        clearText(element);
        if (element.getClass().getName().contains("By")){
            driver.findElement((By) element).sendKeys(value);
        }
        else
        {
            ((WebElement) element).sendKeys(value);
        }
    }

    public static <T> String getText(final T element){
        if (element.getClass().getName().contains("By")){
            return driver.findElement((By) element).getText();
        }
        else {
            return ((WebElement) element).getText();
        }
    }

    public static <T> void clearText(final T element){
        if (element.getClass().getName().contains("By")){
            driver.findElement((By) element).clear();
        }
        else
        {
            ((WebElement) element).clear();
        }
    }

    public static <T> void click(final T element){
        if (element.getClass().getName().contains("By")){
            driver.findElement((By) element).click();
        }
        else {
            ((WebElement) element).click();
        }
    }

    public static <T> void submit(final WebElement element){
        if (element.getClass().getName().contains("By")){
            driver.findElement((By) element).submit();
        }
        else
        {
            ((WebElement) element).submit();
        }
    }

    public static void selectByTextFromCombo(final WebElement element, final String value){
        final Select comboValue = new Select(element);
        comboValue.selectByValue(value);
    }

    public static void selectByTextFromComboUsingClick(final WebElement element, final String value){
        element.findElement(By.xpath("//option[contains(text(),'" + value + "')]")).click();
    }

}
