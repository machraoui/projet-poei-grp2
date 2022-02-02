import PageObject.MyAccountLoginPage;
import PageObject.MainPage;
import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MyAccountLoginPageTest {

    WebDriver driver;
    Logger log = LogManager.getLogger(MyAccountLoginPageTest.class);

    @DataProvider
    public static Object[][] getdataa() {
        return new Object[][]{
                {"poeigrp2@yopmail.com", "Poeigrp2."},
                {"user2", "pwd1"}
        };
    }

    @BeforeMethod
    public void setup(){

        //System.setProperty("webdriver.gecko.driver", "path/to/geckodriver.exe");
       driver = new FirefoxDriver();
        //driver = new ChromeDriver();
        /*ChromeOptions options = new ChromeOptions();
        options.addArguments("load-extension=C:\\Users\\ib\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\Extensions\\cfhdojbkjhnklbpkdaibdccddilifddb");
        ChromeDriver driver = new ChromeDriver(options);*/

        driver.get("http://practice.automationtesting.in");
        driver.manage().deleteAllCookies();

    }

    //valid username and password
   @Test//(dataProvider="getdataa")

    public  void openMyAccountPage_LoginPageTest(){//(String nom,String pwd){
        //String nom ="poeigrp2@yopmail.com";
       //String pwd = "Poeigrp2.";

       String nom ="cyrille@yopmail.com";
       String pwd = "Pa55w.rd2";

       String expectedHello= "Hello";
        log.info("loginTest");
        MainPage mainPage = new MainPage(driver);
        log.info("practice.automationtestingisopen");
        mainPage.openAccountPage().loginValidUser(nom,pwd);
        MyAccountLoginPage a = mainPage.openAccountPage().loginValidUser(nom,pwd);
        Assert.assertTrue(mainPage.openAccountPage().getLoginOK().contains(expectedHello),"echec de la connexion");
        log.info("connexion reussi");

    }
    //valid  invalid password
    @Test

    public  void openMyAccountPage_LoginPageTest_correctUser_falsePassword(){
        String nom ="poeigrp2@yopmail.com";
        String pwd = "Poeigrp";
        String expectedLost= "Lost your password";
        log.info("loginTest");
        MainPage mainPage = new MainPage(driver);
        log.info("practice.automationtestingisopen");
        mainPage.openAccountPage().loginValidUser(nom,pwd);
        Assert.assertTrue(mainPage.openAccountPage().getLoginFail().contains(expectedLost),"testter avec des idendifinats incorrect");
        log.info("connexion reussi");

    }
    @Test()
//invalid user and valid password
    public  void openMyAccountPage_LoginPageTest_falseUser_correctPassword() throws InterruptedException {
        String nom ="p5";
        String pwd = "Poeigrp2.";
        String expectedInvalidUsername= "Invalid username";
        log.info("loginTest");
        MainPage mainPage = new MainPage(driver);
        log.info("practice.automationtestingisopen");

        MyAccountLoginPage myAccountLoginPage = mainPage.openAccountPage();
        myAccountLoginPage.loginValidUser(nom,pwd);
        String  invalidUsername = myAccountLoginPage.getLoginUserFail();
        System.out.println(invalidUsername);
        Assert.assertTrue(invalidUsername.contains(expectedInvalidUsername),"invalid user name");
        log.info("ERROR: Invalid username. Lost your password?");

    }

    @Test
    //valid user and emptyPassword
    public  void openMyAccountPage_LoginPageTest_validUser_emptytPassword() throws InterruptedException {
        String nom ="poeigrp2@yopmail.com";
        String pwd = "";
        String expectedInvalidUsername= "Password is required";
        log.info("loginTest");
        MainPage mainPage = new MainPage(driver);
        log.info("practice.automationtestingisopen");

        MyAccountLoginPage myAccountLoginPage = mainPage.openAccountPage();
        myAccountLoginPage.loginValidUser(nom,pwd);
        String  invalidUsername = myAccountLoginPage.getLoginUserFail();
        System.out.println(invalidUsername);
        Assert.assertTrue(invalidUsername.contains(expectedInvalidUsername),"password must be require");
        log.info("Error: Password is required.?");

        //correct user empty password

    }
@Test(dataProvider="getdataa")

    //empty user empty password
    public  void openMyAccountPage_LoginPageTest_emptyUser_emptytPassword() throws InterruptedException {
        String nom ="";
        String pwd = "";
        String expectedInvalidUsername= "Username is required";
        log.info("loginTest");
        MainPage mainPage = new MainPage(driver);
        log.info("practice.automationtestingisopen");

        MyAccountLoginPage myAccountLoginPage = mainPage.openAccountPage();
        myAccountLoginPage.loginValidUser(nom,pwd);
        String  invalidUsername = myAccountLoginPage.getLoginUserFail();
        System.out.println(invalidUsername);
        Assert.assertTrue(invalidUsername.contains(expectedInvalidUsername),"login passed but should not");
        log.info("Error: Username is required.?");

        //correct user empty password

    }

    @Test
    //logo is display
    public  void openMyAccountPage_LoginPage_logo() {

        MainPage mainPage = new MainPage(driver);
        log.info("practice.automationtestingisopen");
        MyAccountLoginPage myAccountLoginPage = mainPage.openAccountPage();
        Boolean isdisplay = myAccountLoginPage.validateLogo();
        System.out.println(isdisplay);
        Assert.assertTrue(isdisplay);


        //correct user empty password

    }

    @Test
    public  void openMyAccountPage_LoginDashBordPage() {
        String nom ="poeigrp2@yopmail.com";
        String pwd = "Poeigrp2.";
        MainPage mainPage = new MainPage(driver);
        log.info("practice.automationtestingisopen");
        MyAccountLoginPage myAccountLoginPage = mainPage.openAccountPage();
        myAccountLoginPage.loginValidUser1(nom,pwd);

    }

    //tester la presence des elements


    // TODO: 30/01/2022 remeber me

    public void  MyAccountPageRememberMe(){


    }


   /* @AfterMethod
    public void teardown() {

        driver.quit();

    }*/

    @Test
//presence de basket incon
    public void verifyViewBasket(){
        MainPage mainPage = new MainPage(driver);
        boolean isbasasketpresent = mainPage.openAccountPage().isbasketPresent();
        Assert.assertTrue(isbasasketpresent);
    }


}
