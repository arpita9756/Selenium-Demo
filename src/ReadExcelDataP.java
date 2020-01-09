import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReadExcelDataP {
	@Test(dataProviderClass = ReadDataProvider.class,dataProvider = "createUser")
	public void test(String user, String pass) {
		Reporter.log(user,true);
		Reporter.log(pass,true);
	}
}
