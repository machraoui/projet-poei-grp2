package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountCreationPage {

    WebDriver driver;

    public MyAccountCreationPage(WebDriver driver){

        this.driver=driver;
    }

    By emailSelector = By.cssSelector("#reg_email");
    By passSelector = By.cssSelector("#reg_password");
    By registerLoginSelector = By.cssSelector("[name='register']");
    By sstrongPasswordSelector = By.cssSelector(".woocommerce-password-hint");
    By invalidPasswordSelector = By.cssSelector(".woocommerce-Button button disabled");
    By emptyPwd_validPassword_MessareErrorSelector= By.cssSelector("woocommerce-error");
    By basketiconeSelector = By.cssSelector(".wpmenucartli");//shop icon
    // TODO: 31/01/2022  By -> valid mail empty password selector
    long timeout = 5;
    public void validCreateAccount(String email, String pwd){

        driver.findElement(emailSelector).sendKeys();
        driver.findElement(passSelector).sendKeys();
        driver.findElement(registerLoginSelector).click();

    }

    public void invalidCreateAccount(String email, String pwd){

        driver.findElement(emailSelector).sendKeys(email);
        driver.findElement(passSelector).sendKeys(pwd);
        driver.findElement(registerLoginSelector).click();

    }

    public  boolean getRegisterButtonIsnotDisplayed(){

        return  driver.findElement(registerLoginSelector).isDisplayed();
    }

    public String getEmptyEmailErrorSeletor(){

        // TODO: 31/01/2022
        return driver.findElement(emptyPwd_validPassword_MessareErrorSelector).getText();
    }








}
