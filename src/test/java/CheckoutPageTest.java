import PageObject.MainPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckoutPageTest {
    WebDriver driver;
   Logger log = LogManager.getLogger(MyAccountLoginPageTest.class);
    @BeforeMethod
    public void setup(){

        driver = new FirefoxDriver();
        driver.get("http://practice.automationtesting.in");
        driver.manage().deleteAllCookies();

    }
@Test


public  void openMyAccountPage_LogoutPageTest(){
        String nom ="poeigrp2@yopmail.com";
        String pwd = "Poeigrp2.";
        MainPage mainPage = new MainPage(driver);
        mainPage.CheckouPage().OpenCheckout(nom,pwd).checkoutLogout();


}







}
