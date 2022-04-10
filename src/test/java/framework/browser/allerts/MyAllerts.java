package framework.browser.allerts;
import framework.browser.Browser;
import org.openqa.selenium.By;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class MyAllerts {
    private Browser browser;
    private By check = By.xpath("//*[@id=\"result\"]");
    String text = randomText();

    public MyAllerts() {
        browser = Browser.BROWSER;
    }

    public void accept() {
        browser.getDriver().switchTo().alert().accept();
    }

    public void disimiss() {
        browser.getDriver().switchTo().alert().dismiss();
    }

    public String randomText() {
        int min = 5;
        char data = ' ';
        String text = "";
        Random random = new Random();
        for (int i = 0; i <= min; i++) {
            data = (char) (random.nextInt(25) + 97);
            text = data + text;
        }
        return text;
    }

    public void sendText() {
        browser.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        browser.getDriver().switchTo().alert().sendKeys(text);
        browser.getDriver().switchTo().alert().accept();
    }

    public void checkText() {
        String textOut = browser.getDriver().findElement(check).getText();
        if (textOut.equals("You entered: "+text)) System.out.println("Введен верный текст " + text);
        else System.out.println("Текст не совпадает, введено: " + textOut + " вместо: " + text);

    }
}