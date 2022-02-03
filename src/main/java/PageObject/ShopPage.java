package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import PageObject.MainPage;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.PublicKey;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import PageObject.BasketPage;

import static java.lang.Integer.parseInt;

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
    By shopfilterBythemeSelctor = By.cssSelector("class=['cat-item cat-item-24 current-cat']");
    By shopFilterThemeTitleSelecter = By.xpath("product-categories");
    By sliderSelector = By.cssSelector("[class='ui-slider-range ui-widget-header ui-corner-all']");
    By filterButtonSelector = By.cssSelector("[class='button']");
    By filterProductSelector = By.cssSelector("[class='products masonry-done']");

    By filterAllArticlePrice = By.cssSelector("[class='woocommerce-Price-amount amount']");


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
        wait.until(ExpectedConditions.presenceOfElementLocated(filterButtonSelector));

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

    public ShopPage shopFilterbyTheme() {


        driver.findElement(shopFilterThemeSelecter).click();

        return this;

    }

    public ShopPage shopFilterByPrice() {

        //String url = "http://practice.automationtesting.in/shop/?min_price=0&max_price=200"
        Actions actions = new Actions(driver);
        WebElement slider = driver.findElement(sliderSelector);
        actions.dragAndDropBy(slider, 10, 150).build().perform();
        slider.click();
        driver.findElement(filterButtonSelector).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.presenceOfElementLocated(filterProductSelector));

        List<WebElement> listeDeResultat = driver.findElements(filterButtonSelector);
        listeDeResultat.get(0).getText();


        return this;
    }

    public String getshopFilterbyTheme() {

        List<WebElement> list = driver.findElements(shopFilterThemeSelecter);
        String themeText = list.get(0).getText();


        return themeText;

    }

    public ShopPage shopFilterbyTheme2() {

        driver.findElement(shopFilterThemeSelecter).click();

        return this;

    }

    public Boolean getFilterArticle(int prix) {

        List<WebElement> listArticle = driver.findElements(filterAllArticlePrice);
        //System.out.println(listArticle);

        String[] test = new String[5];


        int price = parseInt(driver.findElement(filterAllArticlePrice).getText().replaceAll("[^a-zA-Z0-9]", ""));

        if (prix >= 420){
            return true;
        }


return true;

    }
}









