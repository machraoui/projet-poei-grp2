package dataprovider;
import org.testng.annotations.DataProvider;
public class DataProviderClass {

    @DataProvider(name = "getdataa")
    public static Object[][] getDataFromDataprovider() {
        return new Object[][]{
                {"user1", "pwd1"},
                {"user2", "pwd1"}
        };
    }
}
