package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountDashboardLoginPage extends MyAccountLoginPage {
    public MyAccountDashboardLoginPage(WebDriver driver) {
        super(driver);
    }

    By accountNavigateSelector = By.cssSelector(".woocommerce-MyAccount-navigation");
    //By dashbordLinkSelector =  By.cssSelector("li[class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--dashboard'] a");
    By orderLinkSelector = By.cssSelector("li[class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--orders'] a");
    By downloadLinkSelector = By.cssSelector("li[class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--downloads'] a");
    By adressesLinkSelector = By.cssSelector("a[href='http://practice.automationtesting.in/my-account/edit-address/']");
    By accountdetailsSelector = By.cssSelector("a[href='http://practice.automationtesting.in/my-account/edit-account/']");
    By logOutSelector = By.cssSelector("a[href='http://practice.automationtesting.in/my-account/customer-logout/']");
    By basketiconeSelector = By.cssSelector(".wpmenucartli");//shop icon




    public  String accountdetailselector(){

        return driver.findElement(accountdetailsSelector).getText();
    }

   /* public String dashbordLinkSelector(){

        return driver.findElement(dashbordLinkSelector).getText();
    }*/

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
