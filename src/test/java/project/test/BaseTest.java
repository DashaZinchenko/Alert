package project.test;
import framework.browser.Browser;
import org.testng.annotations.BeforeClass;
import utils.ConfigFileReader;


public class BaseTest {
    private Browser browser;
    private ConfigFileReader config = ConfigFileReader.configFileReader;
    @BeforeClass

    public void before(){
        System.setProperty(config.getDriverAdapter(),config.getDriverPath());
        // browser.getDriver().manage().window().maximize();
    }
}