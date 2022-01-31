package PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;


public class Base {

  public   WebDriver driver;

    By myaccountPageSelector = By.cssSelector("#menu-item-50");
    @BeforeMethod
    public void setup() {


        driver = new FirefoxDriver();
        driver.get("http://practice.automationtesting.in");
        driver.manage().deleteAllCookies();
        driver.findElement(myaccountPageSelector).click();

    }
}



