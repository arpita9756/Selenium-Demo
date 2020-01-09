import org.testng.Assert;
import org.testng.annotations.Test;
public class AssertDemo
{
	@Test
	public void demo()
	{
		String s1 = "Abc";
		String s2 = "Abc";
		Assert.assertEquals(s1, s2);
		System.out.println("valid");
	}
}
