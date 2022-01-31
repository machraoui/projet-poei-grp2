import PageObject.MainPage;
import org.testng.annotations.Test;
public class test_MyAcc_Login extends MyAccountLoginPageTest {

 @Test

    public  void openMyAccountPage_LoginPage(){
        MainPage mainPage = new MainPage(driver);
        mainPage.openAccountPage().loginValidUser("cyrille","landry");

    }
}
