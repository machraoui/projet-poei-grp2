package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PageObject.ShopPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

import java.nio.channels.ScatteringByteChannel;
import java.time.Duration;

public class MainPage {


    WebDriver driver;

    By myaccountPageSelector = By.cssSelector("#menu-item-50");
    By shoptPageSelector = By.cssSelector("li[id='menu-item-40'] a");
    By getSelecArticleListSelector1 = By.xpath("//li[1]//img");

    long timeout = 5;
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


    public ShopPage openShopage() {


            driver.findElement(shoptPageSelector).click();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
            wait.until(ExpectedConditions.presenceOfElementLocated(getSelecArticleListSelector1));
            ShopPage shopPage = new ShopPage(driver);
            return shopPage;



    }

    public ProductPage openProductPage(){
        driver.findElement(shoptPageSelector).click();
        ProductPage productPage = new ProductPage(driver);
        return productPage;

    }
    public BasketPage openMy_Bascket_Page (){
        driver.findElement(shoptPageSelector).click();;
        BasketPage basketPage = new BasketPage(driver);
        return basketPage ;



    }

    public CheckoutPage CheckouPage() {

        driver.findElement(myaccountPageSelector).click();
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        return checkoutPage;

    }






}
