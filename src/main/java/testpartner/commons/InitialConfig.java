package testpartner.commons;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.AbstractFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import report.ScreenShotCapture;
import seleniumutil.DriverManager;
import seleniumutil.SeleniumUtil;
import utilities.DataGenerator;

@Configuration
@ComponentScan(basePackages = {"testpartner.commons"})
public class InitialConfig {

    @Bean
    public PageNavigator pageNavigator(WebDriver driver)
    {return new PageNavigator(driver);}

    @Bean
    @Primary
    public FactoryBean<WebDriver> webDriverFactoryBean()
    {
        return new AbstractFactoryBean<WebDriver>() {
            @Override
            public Class<?> getObjectType() {return WebDriver.class;}

            @Override
            protected WebDriver createInstance() throws Exception {
                return new DriverManager().getDriver();
            }
        };
    }


    @Bean
    public SeleniumUtil seleniumUtil(){
        return new SeleniumUtil();
    }

   @Bean
    public ScreenShotCapture screenShotCapture(WebDriver driver){
        return new ScreenShotCapture(driver);}

    @Bean
    public DataGenerator dataGenerator()
    {
        return new DataGenerator();
    }

}
