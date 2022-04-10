package project.test;
import framework.browser.allerts.MyAllerts;
import org.testng.annotations.Test;
import project.pages.WelcomePage;
import utils.ConfigFileReader;

public class MyTest extends BaseTest {
    private ConfigFileReader config = ConfigFileReader.configFileReader;

    @Test
    public void firstTest() {

        WelcomePage welcomePage = new WelcomePage();
        MyAllerts myAllerts = new MyAllerts();
        welcomePage.open();
        welcomePage.clickJSAlert();
        myAllerts.accept();
        welcomePage.clickJSConfirm();
        myAllerts.disimiss();
        welcomePage.clickJSPrompt();
        myAllerts.sendText();
        myAllerts.checkText();

    }
}
