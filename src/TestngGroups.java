import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestngGroups 
{
	@Test(groups="smoke", priority=3)
	public void demo()
	{
		Reporter.log("Hii",true);
	}
	@Test(groups="functional", dependsOnGroups="smoke")
	public void demo1()
	{
		Reporter.log("Hii1",true);
	}
	@Test(groups="smoke" , priority=1)
	public void demo2()
	{
		Reporter.log("Hii2",true);
	}
	@Test(groups="functional", dependsOnGroups="smoke")
	public void demo3()
	{
		Reporter.log("Hii3",true);
	}
	@Test(groups="system", dependsOnGroups="functional")
	public void demo4()
	{
		Reporter.log("Hii4",true);
	}
	@Test(groups="smoke", priority=2)
	public void demo5()
	{
		Reporter.log("Hii5",true);
	}
}
