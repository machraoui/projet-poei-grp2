import PageObject.MainPage;
import PageObject.ProductPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProductPageTest {

    WebDriver driver;


    @BeforeMethod
    public void setup(){

        driver = new FirefoxDriver();
        driver.get("http://practice.automationtesting.in");
        driver.manage().deleteAllCookies();

    }

    @Test

    public void verifyOpenProductTest(){

        MainPage mainPage = new MainPage(driver);
        ProductPage productPage = mainPage.openProductPage().openShopage().openProduct().addTocart();

        String expectedPrice="450";
        String expectedStockNumber="7596";
        String expectedDescriptif = "is the latest version of";
        String expectedQuantity = "2";
        String expectedConfirmationMessage = "has been added to your basket";

        Assert.assertTrue(productPage.getArticePrice().contains(expectedPrice));
        Assert.assertTrue(productPage.getAricleStock().contains(expectedStockNumber));
        Assert.assertTrue(productPage.getArticleDescriptif().contains(expectedDescriptif));
        Assert.assertTrue(productPage.getHasBeenAddTOBasket().contains(expectedConfirmationMessage));

    }
}
