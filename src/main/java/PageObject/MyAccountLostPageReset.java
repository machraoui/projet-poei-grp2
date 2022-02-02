package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyAccountLostPageReset {

    public MyAccountLostPageReset(WebDriver driver){

        this.driver=driver;
    }
    WebDriver driver;
    //By lostPassword = By.cssSelector(".woocommerce-LostPassword > a:nth-child(1)");
    By urmail = By.cssSelector("#user_login");
    By PasswordReset = By.cssSelector(".woocommerce-Button");

    long timeout=10;


    public resetPasswordMessage validResetPassword(String mail){

        driver.findElement(urmail).sendKeys(mail);
        driver.findElement(PasswordReset).click();


       /* WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.presenceOfElementLocated(PasswordReset));*/

        resetPasswordMessage resetPasswordMessage = new resetPasswordMessage(driver);
           return  resetPasswordMessage;
        //System.out.println("page reset open");

    }


}
