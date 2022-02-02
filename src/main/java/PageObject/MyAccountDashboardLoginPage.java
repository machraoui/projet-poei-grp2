package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountDashboardLoginPage extends MyAccountLoginPage {
    public MyAccountDashboardLoginPage(WebDriver driver) {

        super(driver);
    }

   // By accountNavigateSelector = By.cssSelector(".woocommerce-MyAccount-navigation");
    By dashbordLinkSelector =  By.cssSelector("li.woocommerce-MyAccount-navigation-link:nth-child(1) > a:nth-child(1)");
    By orderLinkSelector = By.cssSelector("li.woocommerce-MyAccount-navigation-link:nth-child(2) > a:nth-child(1)");
    By downloadLinkSelector = By.cssSelector("li.woocommerce-MyAccount-navigation-link:nth-child(3) > a:nth-child(1)");
    By adressesLinkSelector = By.cssSelector("li.woocommerce-MyAccount-navigation-link:nth-child(4) > a:nth-child(1)");
    By accountdetailsSelector = By.cssSelector("li.woocommerce-MyAccount-navigation-link:nth-child(5) > a:nth-child(1)");
    By logOutSelector = By.cssSelector("li.woocommerce-MyAccount-navigation-link:nth-child(6) > a:nth-child(1)");
    By basketiconeSelector = By.cssSelector(".wpmenucartli");//shop icon




    public  String accountdetailselector(){

        return driver.findElement(accountdetailsSelector).getText();


    }


    public String dashbordLinkSelector(){

        return driver.findElement(dashbordLinkSelector).getText();
    }

    public String logOutSelector (){

        return driver.findElement(logOutSelector).getText();

    }
    public String adressesLinkSelector (){

        return driver.findElement(adressesLinkSelector).getText();

    }
    public String downloadLinkSelector (){

        return driver.findElement(downloadLinkSelector).getText();

    }
    public String orderLinkSelector (){

        return driver.findElement(orderLinkSelector).getText();

    }
}
