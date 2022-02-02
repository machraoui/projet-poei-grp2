package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasketPage {
     WebDriver driver ;
    By TotalPrice = By.cssSelector("td.product-subtotal > span:nth-child(1)");
    By Priceunitaireselector = By.cssSelector("td.product-price > span:nth-child(1)");
    By basketiconeSelector = By.cssSelector(".wpmenucartli");//shop icon
    By Quantityselector = By.cssSelector("input.input-text:nth-child(1)");
    By Quantityselector2 = By.cssSelector(".cartcontents");
    By addToCartSelector = By.xpath("//li[1]/a[. = 'Add to basket']");
    By Bascketselector = By.cssSelector(".cartcontents");
    By articleviewSelector = By.cssSelector("[title='View Basket']");
    By Delectarticl = By.cssSelector(".remove");
    By delectmessage = By.cssSelector(".woocommerce-message");
    By updatebascket = By.cssSelector("input.button:nth-child(2)");
    By Taxes_selector = By.cssSelector(".tax-rate > td:nth-child(2) > span:nth-child(1)");
    By Prix_total_selector = By.cssSelector(".order-total > td:nth-child(2) > strong:nth-child(1) > span:nth-child(1)");
    By Checkout_Basket_selector = By.cssSelector(".checkout-button");
    long timeout=5;

    public   BasketPage (WebDriver driver){

        this.driver=driver;
    }

  public BasketPage addToCart() {

        driver.findElement(addToCartSelector).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
      wait.until(ExpectedConditions.presenceOfElementLocated(articleviewSelector));
        return this;

    }



    public BasketPage viewBasket() {

        driver.findElement(Bascketselector ).click();


        return this;


    }
    public BasketPage viewBasket1() {

        driver.findElement(Bascketselector ).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.presenceOfElementLocated(Quantityselector));
        return this;


    }

    public  String getPriceunitaire(){

        return driver.findElement(Priceunitaireselector).getText();
    }

    public  String getQuantity(){

        return driver.findElement(Quantityselector2).getText();
    }
    public  String getTotalPrice(){

        return driver.findElement(TotalPrice).getText();
    }

    public String getmessage (){
        return driver.findElement(delectmessage).getText();
    }

   public BasketPage delectFrombascket () {

       driver.findElement(Delectarticl).click();

       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
       wait.until(ExpectedConditions.presenceOfElementLocated(delectmessage));

   return this ;
   }

  public BasketPage modifQuantity (String quantity) {

      driver.findElement(Quantityselector).clear();
      driver.findElement(Quantityselector).sendKeys(quantity);
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
      wait.until(ExpectedConditions.presenceOfElementLocated(updatebascket));
      /*driver.findElement((updatebascket)).click();
      WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(timeout));
      wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(updatebascket));*/

            return this;
  }



  public BasketPage updateBasket (){
        //a voir

        driver.findElement((updatebascket)).click();

        return this;
  }

  public String Basket_Taxes () {

      return driver.findElement(Taxes_selector).getText();

  }
  public String Price_after_taxes () {
      return driver.findElement(Prix_total_selector).getText();

    }
    public MyPaimentPage checkout_Bascket (){

        driver.findElement(Checkout_Basket_selector).click();

        MyPaimentPage myPaimentPage = new MyPaimentPage() ;
        return myPaimentPage ;


    }





}
