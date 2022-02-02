package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import PageObject.MainPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.PublicKey;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import PageObject.BasketPage;

public class ShopPage  extends Base {


    WebDriver driver;


    By shopSelector = By.cssSelector("li[id='menu-item-40'] a");
    By SelectLogo = By.cssSelector("#site-logo");
    By selecArticleListSelector = By.xpath("//*[@id='content']/ul/li[1]");
    By addToCartSelector = By.xpath("//li[1]/a[. = 'Add to basket']");
    By articleviewSelector = By.cssSelector("[title='View Basket']");
    By articleAddtocartForwardSelector = By.cssSelector("[class='added_to_cart wc-forward']");
    By basketiconeSelector = By.cssSelector(".wpmenucartli");//shop icon
    By shopFilterThemeSelecter = By.xpath("//a[. = 'Android']");
    By shopFilterThemeTitleSelecter = By.xpath("product-categories");


    long timeout = 5;

    String[] price_therme_filter = new String[2];

    public ShopPage(WebDriver driver) {

        this.driver = driver;
    }


    public String getArticle() {
        //List<WebElement> listeDeResultat = driver.findElements(selecArticleListSelector);

        //String article1 =listeDeResultat.get(1).getText();
        //System.out.println(listeDeResultat.get(1).getText());

        String article1 = driver.findElement(selecArticleListSelector).getText();
        System.out.println(article1);


        return article1;
    }

    public String getViewArticleMessage() {
        System.out.println(driver.findElement(articleviewSelector).getText());

        return driver.findElement(articleviewSelector).getText();
    }


    public ShopPage addToCart() {

        driver.findElement(addToCartSelector).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.presenceOfElementLocated(articleviewSelector));

        return this;

    }



    public BasketPage viewBasket() {

        driver.findElement(articleAddtocartForwardSelector).click();
        BasketPage basketPage = new BasketPage(driver);

        return basketPage;


    }

    public boolean isbasketPresent() {

        return driver.findElement(basketiconeSelector).isDisplayed();
    }

    public ShopPage  shopFilterbyTheme() {

      /*  List<WebElement> list = driver.findElements(shopFilterThemeSelecter);
        list.get(0).click();
        System.out.println(list.get(0).getText());*/


        driver.findElement(shopFilterThemeSelecter).click();

        return this;

    }

    public String getshopFilterbyTheme() {

        List<WebElement> list = driver.findElements(shopFilterThemeSelecter);
        String themeText =list.get(0).getText();


        return themeText;

    }




}









