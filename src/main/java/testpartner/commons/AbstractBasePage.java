package testpartner.commons;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public abstract class AbstractBasePage {
    @Autowired
    protected WebDriver driver;


    protected static final Logger LOGGER = LogManager.getLogger(AbstractBasePage.class.getName());


    public AbstractBasePage(WebDriver driver){
        this.driver = driver;
    }

    public <TPage> TPage getPageInstance(Class<TPage> pageClass )
    {
        try {
            LOGGER.info("Page factory initialisation" + pageClass);
            return PageFactory.initElements(driver, pageClass);
        }
        catch (Exception e){
            e.printStackTrace();
            LOGGER.error(e);
            throw e;
        }

    }

}
