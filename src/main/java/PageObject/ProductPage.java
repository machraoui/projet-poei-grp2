package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage {

    WebDriver driver;

    By shopSelector = By.cssSelector("li[id='menu-item-40'] a");
    By firstProductSelector = By.xpath("//*[@id='content']/ul/li[1]");
    By articleStockNumberSelector = By.cssSelector("[class='stock in-stock']");
    By articleDescription = By.cssSelector("[itemprop='description']");
    By articlePrice = By.cssSelector("[itemprop='price']");
    By articlePricebasketSelector = By.cssSelector("[class='amount']");
    By articleQuantity =By.cssSelector("name='quantity'");
    By addConfirmationMessage =By.cssSelector(".woocommerce-message");
    By addtoCartSelector = By.cssSelector("[class='single_add_to_cart_button button alt']");
    By articleviewSelector = By.cssSelector("[title='View Basket']");
    By basketiconeSelector = By.cssSelector(".wpmenucartli");

    long timeout =5;


    public ProductPage(WebDriver driver) {

        this.driver = driver;
    }


    public ProductPage openShopage(){

      driver.findElement(shopSelector).click();
      ProductPage productPage = new ProductPage(driver);
      return this;
    }

    public ProductPage openProduct(){

     driver.findElement(firstProductSelector).click();
     return this;

    }

    public ProductPage addTocart(){

        driver.findElement(addtoCartSelector).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.presenceOfElementLocated(basketiconeSelector));
        return this;
    }


    public String  getHasBeenAddTOBasket(){

        return driver.findElement(addConfirmationMessage).getText();


    }


    public String getArticePrice(){

        return driver.findElement(articlePricebasketSelector).getText();
    }

    public  String getAricleStock(){

        String ArcticleStock = driver.findElement(articleStockNumberSelector).getText();

        return ArcticleStock;

    }

      public  String getArticleDescriptif(){

         return  driver.findElement(articleDescription).getText();

    }

    public String getArticleQuantity(){

    return  driver.findElement(articleQuantity).getText();
    }


}




