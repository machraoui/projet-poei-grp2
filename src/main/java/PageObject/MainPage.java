package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    WebDriver driver;

    By myaccountPageSelector = By.cssSelector("#menu-item-50");
    public MainPage(WebDriver driver){

        this.driver=driver;
    }

    public MyAccountLoginPage openAccountPage(){

        driver.findElement(myaccountPageSelector).click();

        MyAccountLoginPage myAccountLoginPage = new MyAccountLoginPage(driver);
        return myAccountLoginPage;
    }

    public MyAccountCreationPage invalidOpenAccountCreationPage(){

        driver.findElement(myaccountPageSelector).click();

        MyAccountCreationPage myAccountCreationPage = new MyAccountCreationPage(driver);
       return myAccountCreationPage;
    }
}
