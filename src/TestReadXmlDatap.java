

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestReadXmlDatap 
{
@Test(dataProviderClass=ReadDataXmlDatap.class,dataProvider="createUser")
public void test(String user,String pass)
{
	Reporter.log(user,true);
	Reporter.log(pass,true);
}
}
