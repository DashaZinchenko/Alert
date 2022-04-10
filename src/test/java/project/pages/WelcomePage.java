package project.pages;
import framework.browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ConfigFileReader;

import java.time.Duration;

public class WelcomePage {
    private static ConfigFileReader config = ConfigFileReader.configFileReader;
    private Browser browser = Browser.BROWSER;
    private WebDriverWait wait;
    private By JSAlert = By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button");
    private By JSConfirm = By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button");
    private By JSPrompt = By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button");

    public WelcomePage() {
        this.wait = new WebDriverWait(browser.getDriver(), Duration.ofSeconds(10));
    }

    public void open() {
        browser.goTo(config.getApplicationUrl());
    }

    public void clickJSAlert() {
        wait.until(ExpectedConditions.elementToBeClickable(JSAlert));
        browser.findElement(JSAlert).click();
    }

    public void clickJSConfirm() {
        browser.findElement(JSConfirm).click();
    }

    public void clickJSPrompt() {
        browser.findElement(JSPrompt).click();
    }

}