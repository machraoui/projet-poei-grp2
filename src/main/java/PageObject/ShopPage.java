package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopPage {

    WebDriver driver;

    By shopSelector = By.cssSelector("li[id='menu-item-40'] a");
    By SelectArticle = By.cssSelector("#site-logo");
    public ShopPage(WebDriver driver){

        this.driver=driver;
    }

public void openShopage() throws InterruptedException {


        driver.findElement(shopSelector).click();
        Thread.sleep(5);
        driver.findElement(SelectArticle).click();
    //Thread.sleep(5);

    /*driver.switchTo().frame(driver.findElement(By.cssSelector("#pagewrap > iframe")));
    driver.findElement(By.id("close-button<iframe")).click();
    driver.switchTo().defaultContent();*/
    //WebElement barreRecherche = driver.findElement(By.id("twotabsearchtextbox"));


}




}
