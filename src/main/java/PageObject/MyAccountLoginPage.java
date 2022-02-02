package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyAccountLoginPage {

    WebDriver driver;
//Login
    By userNameSelector = By.cssSelector("#username");
    By passwordSelector = By.cssSelector("#password");
    By buttonLoginSelector = By.cssSelector("[name=login]");
    By rememberMeSelector = By.cssSelector("#rememberme");
    By lostPassword = By.cssSelector("woocommerce-LostPassword lost_password");

    By loginsucces= By.cssSelector(".woocommerce-MyAccount-content");
    By loginfail = By.cssSelector("p[class='woocommerce-LostPassword lost_password'] a");
    By invalidUsername = By.cssSelector(".woocommerce .woocommerce-error");

    By logoImage = By.cssSelector("#site-logo");
    By basketiconeSelector = By.cssSelector(".wpmenucartli");//shop icon
    long timeout=10;
    //*[@id="page-36"]/div/div[1]/ul

    //Register

    public MyAccountLoginPage(WebDriver driver){

        this.driver=driver;
    }
    public MyAccountLoginPage loginValidUser(String userName, String password) {
        driver.findElement(userNameSelector).sendKeys(userName);
        driver.findElement(passwordSelector).sendKeys(password);
        driver.findElement(buttonLoginSelector).click();
        By basketiconeSelector = By.cssSelector(".wpmenucartli");//shop icon


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.presenceOfElementLocated(invalidUsername));

return  this;



    }

    public MyAccountDashboardLoginPage loginValidUser1(String userName, String password) {
        driver.findElement(userNameSelector).sendKeys(userName);
        driver.findElement(passwordSelector).sendKeys(password);
        driver.findElement(buttonLoginSelector).click();

        MyAccountDashboardLoginPage acountDashboardPage = new MyAccountDashboardLoginPage(driver);


        return  acountDashboardPage;



    }

    public String getLoginOK(){

        return driver.findElement(loginsucces).getText();
    }

    public String getLoginFail(){

        return driver.findElement(loginfail).getText();
    }
    public String getLoginUserFail(){

        return driver.findElement(invalidUsername).getText();
    }

    //logoPage

    public boolean validateLogo(){
        return driver.findElement(logoImage).isDisplayed();
    }

    public boolean isbasketPresent(){

        return driver.findElement(basketiconeSelector).isDisplayed();
    }

}
