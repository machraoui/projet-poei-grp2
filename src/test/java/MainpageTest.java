import PageObject.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainpageTest {


    public class ShopPageTest {

        WebDriver driver;


        @BeforeMethod
        public void setup() {

            driver = new FirefoxDriver();
            driver.get("http://practice.automationtesting.in");
            driver.manage().deleteAllCookies();

        }

       




    }
}
