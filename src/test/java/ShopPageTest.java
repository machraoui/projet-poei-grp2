import PageObject.MainPage;
import PageObject.ShopPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.*;

public class ShopPageTest {

    WebDriver driver;


    //@BeforeMethod
    @BeforeTest
    public void setup(){

        driver = new FirefoxDriver();
        driver.get("http://practice.automationtesting.in");
        driver.manage().deleteAllCookies();

    }

    //affiche du premier article avec le bon nom
    @Test(groups = {"demo"})
    public void SaleArticlePresent ()throws  NullPointerException {

        String expectedFirsArticle = "Android Quick Start Guide";
        MainPage mainPage = new MainPage(driver);
        ShopPage shopPage = mainPage.openShopage();
        Assert.assertTrue(shopPage.getArticle().contains(expectedFirsArticle));


    }

    //rg2 : lien view basket apparait

    @Test
    public void addArticleToCartTest(){

        String expectedArcticlePrice = "View Basket";
        MainPage mainPage = new MainPage(driver);
        ShopPage shopPage =mainPage.openShopage().addToCart();
        Assert.assertTrue(shopPage.getViewArticleMessage().contains(expectedArcticlePrice));

    }


    @Test
    //rg3: acces au panier
    public void addArticleToCartBasketTest(){

        MainPage mainPage = new MainPage(driver);
        ShopPage shopPage =mainPage.openShopage().addToCart();
        shopPage.viewBasket();


    }

    @Test
    public void verifyViewBasket(){
        MainPage mainPage = new MainPage(driver);
        boolean isbasasketpresent = mainPage.openShopage().isbasketPresent();
        Assert.assertTrue(isbasasketpresent);
    }

    //choix par theme android
    @Test

    public void verifyFilterByTheme() {

        String expectedAndroidCat = "Android";// test a refaire avec un lien
        MainPage mainPage = new MainPage(driver);
        ShopPage shopPage = mainPage.openShopage().shopFilterbyTheme();
        shopPage.getshopFilterbyTheme();

        Assert.assertTrue(shopPage.getshopFilterbyTheme().contains(expectedAndroidCat));

    }


        @Test
    public void verifyFilterByPrice1(){


        int expectePprice = 30000;

        MainPage mainPage = new MainPage(driver);
        ShopPage shopPage1 =  mainPage.openShopage().shopFilterByPrice();
        shopPage1.getFilterArticle(expectePprice);

        Assert.assertTrue(shopPage1.getFilterArticle(expectePprice));


    }


}
