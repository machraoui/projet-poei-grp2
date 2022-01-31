import PageObject.MyAccountCreationPage;
import PageObject.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyAccoutCreationTest {

    WebDriver driver;


    @BeforeMethod
    public void setup(){

        driver = new FirefoxDriver();
        driver.get("http://practice.automationtesting.in");
        driver.manage().deleteAllCookies();

    }

// test with Strong Password

@Test
  //test user with invalid password

    public  void openMyAccountCreationPage1(){
        String nom ="poeigrp2@yopmail.com";
        String pwd = "Poeigrp";


        String expectedHello= "The password should be at least seven characters long";


        MainPage mainPage = new MainPage(driver);
        MyAccountCreationPage myAccountCreationPage = mainPage.invalidOpenAccountCreationPage();
        myAccountCreationPage.invalidCreateAccount(nom,pwd);
        Boolean invalidPassword = myAccountCreationPage.getRegisterButtonIsnotDisplayed();
        Assert.assertTrue(invalidPassword,"type a valid passwword");
        System.out.println(invalidPassword);


    }

    //mauvais email et bon mot de passe


    public  void openMyAccountCreationPage1_invalidUserName(){
        // TODO: 30/01/2022 !!! chercher le bon selector pour le test sinon Javacript
        //Error: Please provide a valid email address.

    }


    //test sans email et bon mot de passe
    public  void openMyAccountCreationPage1_emptypassword(){
        // TODO: 30/01/2022

        //Error: Please provide a valid email address.

    }

    //test email valide et sans mot de passe
    public  void openMyAccountCreatioPage_validEmail_emptyPAssword(){
        // TODO: 30/01/2022

        //Error: Please enter an account password.

    }


    //test sans email sans mot de passe
    public  void openMyAccountCreatioPage_emptyEmail_EmptyPassword(){
        // TODO: 30/01/2022

        //Error: Please provide a valid email address.

    }
    //test email dejaexistant

    public  void openMyAccountCreatioPage_alreadyExitEmail(){
        // TODO: 30/01/2022

    }


}
