import PageObject.MainPage;
import PageObject.MyAccountDashboardLoginPage;
import PageObject.MyAccountLostpasswordPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class MyAccountDashboardLoginPageTest {

    WebDriver driver;

    @BeforeMethod
    public void setup(){


        driver = new FirefoxDriver();
        driver.get("http://practice.automationtesting.in");
        driver.manage().deleteAllCookies();

    }
    @Test
//invalid user and valid password
    public  void AccountLinkTest() {
        String nom ="poeigrp2@yopmail.com";
        String pwd = "Poeigrp2.";
        String accountdetailsexpectedLink = "Account Details";

        MainPage mainPage = new MainPage(driver);
        MyAccountDashboardLoginPage myAccountDashboardLoginPage = mainPage.openAccountPage().loginValidUser1(nom,pwd);
        String accountdetailsLink = myAccountDashboardLoginPage.accountdetailselector();
        System.out.println(accountdetailsLink);
        Assert.assertTrue(accountdetailsLink.contains(accountdetailsexpectedLink),"the link must be present");



    }

   /* @Test
    public void DashboardLinkTest(){

        // TODO: 30/01/2022
        String nom ="poeigrp2@yopmail.com";
        String pwd = "Poeigrp2.";

        String dashboardLink = "Dashboard";

        MainPage mainPage = new MainPage(driver);
        MyAccountDashboardLoginPage myaccountDashBordPage = mainPage.openAccountPage().loginValidUser1(nom,pwd);
        String dashnoardLink = myaccountDashBordPage.dashbordLinkSelector();
        System.out.println(dashnoardLink);
        Assert.assertTrue(dashnoardLink.contains(dashnoardLink),"the link must be present");*/



    }
  /*  @Test
    public void OrdersLinkTest(){

        // TODO: 30/01/2022
        String nom ="poeigrp2@yopmail.com";
        String pwd = "Poeigrp2.";

        String dashboardLink = "Orders";

        MainPage mainPage = new MainPage(driver);
        MyAccountLostpasswordPage  myaccountDashBordPage = mainPage.openAccountPage().loginValidUser1(nom,pwd);
        String OrdersLink = myaccountDashBordPage.orderLinkSelector();
        System.out.println(OrdersLink);
        Assert.assertTrue(OrdersLink.contains(OrdersLink),"the link must be present");


    }
    @Test
    public void DownloadsTest(){

        // TODO: 30/01/2022
        String nom ="poeigrp2@yopmail.com";
        String pwd = "Poeigrp2.";

        String dashboardLink = "Downloads";

        MainPage mainPage = new MainPage(driver);
        AcountDashboardLoginPage accountDashBordPage = mainPage.openAccountPage().loginValidUser1(nom,pwd);
        String downloadLink= accountDashBordPage.downloadLinkSelector();
        System.out.println(downloadLink);
        Assert.assertTrue(downloadLink.contains(downloadLink),"the link must be present");
    }
    @Test
    public void LogOutLinkTest(){

        // TODO: 30/01/2022
        String nom ="poeigrp2@yopmail.com";
        String pwd = "Poeigrp2.";

        String dashboardLink = "Downloads";

        MainPage mainPage = new MainPage(driver);
        AcountDashboardLoginPage accountDashBordPage = mainPage.openAccountPage().loginValidUser1(nom,pwd);
        String LogOutLink= accountDashBordPage.logOutSelector();
        System.out.println(LogOutLink);
        Assert.assertTrue(LogOutLink.contains(LogOutLink),"the link must be present");

    }
    @Test
    public void adressesLinkTest(){

        // TODO: 30/01/2022
        String nom ="poeigrp2@yopmail.com";
        String pwd = "Poeigrp2.";

        String adresses = "Downloads";

        MainPage mainPage = new MainPage(driver);
        AcountDashboardLoginPage accountDashBordPage = mainPage.openAccountPage().loginValidUser1(nom,pwd);
        String adressLink= accountDashBordPage.adressesLinkSelector ();
        System.out.println(adressLink);
        Assert.assertTrue(adressLink.contains(adressLink),"the link must be present");

    } */






