import org.apache.commons.collections4.functors.FalsePredicate;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestngAnnotations 
{
	@Test(invocationCount=3)
	public void demo()
	{
		Reporter.log("Demo", true);
	}
	
	@Test(enabled=false)
	public void demo1()
	{
		Reporter.log("Demo1", true);
	}
	
	@Test(priority=-1)
	public void demo2()
	{
		Reporter.log("Demo2", true);
	}
}
