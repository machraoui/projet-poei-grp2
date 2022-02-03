import PageObject.BasketPage;
import PageObject.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasketPageTest {


    WebDriver driver;

    @BeforeMethod
    public void setup() {


        driver = new FirefoxDriver();
        driver.get("http://practice.automationtesting.in");

        driver.manage().deleteAllCookies();

    }

   /* @Test
    public void Priceunitaire_Test() {
        String Priceunitaire = "450.00";
        MainPage mainPage = new MainPage(driver);
        BasketPage basketPage = mainPage.openMy_Bascket_Page().addToCart().viewBasket();
        String PriceunitaireLink = basketPage.getPriceunitaire();
        System.out.println(PriceunitaireLink);
        Assert.assertTrue(PriceunitaireLink.contains(Priceunitaire), "the link must be present");
    }*/

    @Test
    public void Quantity_Test() {

        String Quantity = "1";
        MainPage mainPage = new MainPage(driver);
        BasketPage basketPage = mainPage.openMy_Bascket_Page().addToCart().viewBasket1();
        String QuantityLink = basketPage.getQuantity();
        System.out.println(QuantityLink);
        Assert.assertTrue(basketPage.getQuantity().contains(Quantity), "the link must be present");
    }

    /*  @Test
      public void TotalPrice_Test() {
          String TotalPrice = "450.00";
          MainPage mainPage = new MainPage(driver);
          BasketPage basketPage = mainPage.openMy_Bascket_Page().addToCart().viewBasket();
          String TotalPriceLink = basketPage.getTotalPrice();
          System.out.println(TotalPriceLink);
          Assert.assertTrue(TotalPriceLink.contains(TotalPrice), "the link must be present");
      }*/
    @Test

    public void Delectarticl_Test() {
        String BascketEmpty = "Android Quick Start Guide removed";
        MainPage mainPage = new MainPage(driver);
        BasketPage basketPage = mainPage.openMy_Bascket_Page().addToCart().viewBasket().delectFrombascket();
        String Articlnumber = basketPage.getmessage();
        System.out.println(Articlnumber);
        Assert.assertTrue(Articlnumber.contains(BascketEmpty), "bascket is Empty");
    }


    @Test
    public void ModifQuantity_Test() {
        String newquantity = "2";
        MainPage mainPage = new MainPage(driver);
        BasketPage basketPage = mainPage.openMy_Bascket_Page().addToCart().viewBasket().modifQuantity(newquantity);
        basketPage.updateBasket().viewBasket();
        String QuantityLink = basketPage.getQuantity();
        System.out.println(QuantityLink);

        //a terminer les Assert


    }

    @Test
    public void recap_Basket() {
        String PrixWithTaxe = "472.50";
        String taxe = "22.50";
        String Priceunitaire = "450.00";
        MainPage mainPage = new MainPage(driver);
        BasketPage basketPage = mainPage.openMy_Bascket_Page().addToCart().viewBasket();

        String PriceunitaireLink = basketPage.getPriceunitaire();
        String taxe_link = basketPage.Basket_Taxes();
        String Total_a_payer = basketPage.Price_after_taxes();

        System.out.println(PriceunitaireLink);
        System.out.println(taxe_link);
        System.out.println(Total_a_payer);

        basketPage.checkout_Bascket();
        //Assert
        Assert.assertTrue(PriceunitaireLink.contains(Priceunitaire), "the link must be present");
        Assert.assertTrue(taxe_link.contains(taxe), "the link must be present");
        Assert.assertTrue(Total_a_payer.contains(PrixWithTaxe), "the link must be present");


    }
}




