package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyAccountLostpasswordPage {

    By lostPassword = By.cssSelector(".woocommerce-message");
    By PasswordReset = By.cssSelector(".woocommerce-LostPassword > a:nth-child(1)");
    By urmail = By.cssSelector("woocommerce-Input woocommerce-Input--text input-text");
    WebDriver driver;
    long timeout=10;

    public MyAccountLostpasswordPage(WebDriver driver){

        this.driver=driver;
    }

    public MyAccountLostPageReset openAccountLostPwdPage () {
        driver.findElement(PasswordReset).click();

        MyAccountLostPageReset myAccountLostPageReset = new MyAccountLostPageReset(driver);



        return myAccountLostPageReset;
    }





}
