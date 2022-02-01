package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class resetPasswordMessage {

    By lostPassword = By.cssSelector(".woocommerce-message");
    WebDriver driver;


    public resetPasswordMessage(WebDriver driver){

        this.driver=driver;
    }


    public String sendPasswordMessage(){

        // TODO: 31/01/2022
        return driver.findElement(lostPassword).getText();
    }




}
