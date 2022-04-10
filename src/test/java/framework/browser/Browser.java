package framework.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.ConfigFileReader;

import java.util.List;

public class Browser {

    private static WebDriver driver;
    private ConfigFileReader config = ConfigFileReader.configFileReader;
    public static Browser BROWSER = new Browser();

    private Browser() {
        driver = BrowserFactory.getDriver(config.getBrowserName());
    }

    public void goTo(String url) {
        driver.get(url);
    }

    public  WebDriver getDriver() {
        return driver;
    }

    public WebElement findElement(By locator) {
        return driver.findElement(locator);
    }
    public void quit(){
        driver.quit();
    }
    public List<WebElement> findElements(By locator){
        return  driver.findElements(locator);
    }




}