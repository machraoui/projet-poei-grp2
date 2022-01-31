import PageObject.MyAccountDashboardLoginPage;
import PageObject.Base;
import PageObject.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyAccountDashBordTest extends Base {

    @Test
//invalid user and valid password
    public  void AccountLinkTest() throws InterruptedException {

        String nom ="poeigrp2@yopmail.com";
        String pwd = "Poeigrp2.";
        String accountdetailsexpectedLink = "Account Details";

        MainPage mainPage = new MainPage(driver);
        MyAccountDashboardLoginPage accountDashBordPage = mainPage.openAccountPage().loginValidUser1(nom,pwd);
        String accountdetailsLink = accountDashBordPage.accountdetailselector();
        System.out.println(accountdetailsLink);
        Assert.assertTrue(accountdetailsLink.contains(accountdetailsexpectedLink),"the link must be present");


    }

    public void DashnoardLinkTest(){

        // TODO: 30/01/2022

    }

    public void OrdersLinkTest(){

        // TODO: 30/01/2022

    }

    public void DownloadsTest(){

        // TODO: 30/01/2022
    }
    public void LogOutLinkTest(){

        // TODO: 30/01/2022
    }







}
