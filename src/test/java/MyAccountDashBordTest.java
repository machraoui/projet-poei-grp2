import PageObject.MyAccountDashboardLoginPage;
import PageObject.Base;
import PageObject.MainPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyAccountDashBordTest extends Base {


    @Test
//invalid user and valid password
    public  void AccountLinkTest() throws InterruptedException {

        String nom ="poeigrp2@yopmail.com";
        String pwd = "Poeigrp2.";
        String accountdetailsexpectedLink = "Account Details";

        String Dashbord = "Dashboard" ;
        String Orders =   "Orders" ;
        String Downloads= "Downloads" ;
        String adresses = "Addresses" ;
        String logout =  "Logout"  ;


        MainPage mainPage = new MainPage(driver);
        MyAccountDashboardLoginPage accountDashBordPage = mainPage.openAccountPage().loginValidUser1(nom,pwd);
        String accountdetailsLink = accountDashBordPage.accountdetailselector();
       // String Dash = accountDashBordPage.dashbordLinkSelector();
        String orders= accountDashBordPage.orderLinkSelector();
        String download = accountDashBordPage.downloadLinkSelector();
        String adress = accountDashBordPage.adressesLinkSelector();
        String logouut = accountDashBordPage.logOutSelector();


        System.out.println(accountdetailsLink);
        Assert.assertTrue(accountdetailsLink.contains(accountdetailsexpectedLink),"the link must be present");
        //Assert.assertTrue(Dash.contains(Dashbord),"the link must be present");
        Assert.assertTrue(orders.contains(Orders),"the link must be present");
        Assert.assertTrue(download.contains(Downloads),"the link must be present");
        Assert.assertTrue(adress.contains(adresses),"the link must be present");
        Assert.assertTrue(logouut.contains(logout),"the link must be present");



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
