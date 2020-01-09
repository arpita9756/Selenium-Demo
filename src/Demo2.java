import org.testng.annotations.Test;

public class Demo2 {
	@Test(dataProviderClass = ReadDataProvider.class, dataProvider = "CreateUser")
	public void demo(String un, String pw) {
		System.out.println(un + "     " + pw);
	}

}
