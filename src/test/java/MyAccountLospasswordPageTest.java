import PageObject.MainPage;
import PageObject.MyAccountLostPageReset;
import PageObject.MyAccountLostpasswordPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyAccountLospasswordPageTest {

    // TODO: 31/01/2022

    WebDriver driver;
    Logger log = LogManager.getLogger(MyAccountLoginPageTest.class);
    @BeforeMethod
    public void setup(){


        driver = new FirefoxDriver();
        driver.get("http://practice.automationtesting.in");
        driver.manage().deleteAllCookies();

    }
    @Test
    public void openMyAccountPage_Lostpasseword_emailValid (){
        String email= "ff";
        MainPage mainPage = new MainPage(driver);
        MyAccountLostPageReset myAccountLostPageReset = mainPage.openAccountPageforLostPassWord().openAccountLostPwdPage();
        myAccountLostPageReset.validResetPassword(email).sendPasswordMessage();
        String Answer = "Password reset email has been sent";

        Assert.assertTrue(myAccountLostPageReset.validResetPassword(email).sendPasswordMessage().contains(Answer));


    }
    @Test
    public void openMyAccountPage_Lostpasseword_emailinlValid (){
        String email= "frk";
        MainPage mainPage = new MainPage(driver);
        mainPage.openAccountPageforLostPassWord().openAccountLostPwdPage().validResetPassword(email);


        //lostPasswordPage(mail);
        //Assert.assertTrue(mainPage.openAccountPage().getLoginOK().contains(lostPassword),"Password reset email has been sent");
        //log.info("Password reset reussi");

    }
    @Test
    public void openMyAccountPage_Lostpasseword_Emptyemail (){
        String email= " ";
        MainPage mainPage = new MainPage(driver);
        mainPage.openAccountPageforLostPassWord().openAccountLostPwdPage().validResetPassword(email);


        //lostPasswordPage(mail);
        //Assert.assertTrue(mainPage.openAccountPage().getLoginOK().contains(lostPassword),"Password reset email has been sent");
        //log.info("Password reset reussi");

    }





}
