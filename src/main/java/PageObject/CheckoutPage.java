package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

    By logOutSelector = By.cssSelector("a[href='http://practice.automationtesting.in/my-account/customer-logout/']");
    WebDriver driver;

    By userNameSelector = By.cssSelector("#username");
    By passwordSelector = By.cssSelector("#password");
    By buttonLoginSelector = By.cssSelector("[name=login]");
    public   CheckoutPage (WebDriver driver){

        this.driver=driver;
    }
    public CheckoutPage OpenCheckout (String userName, String password) {
        driver.findElement(userNameSelector).sendKeys(userName);
        driver.findElement(passwordSelector).sendKeys(password);
        driver.findElement(buttonLoginSelector).click();

        return this;
    }

    public void  checkoutLogout(){

        driver.findElement(logOutSelector).click();


    }

}
