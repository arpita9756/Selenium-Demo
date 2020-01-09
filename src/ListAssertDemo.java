import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.functors.TruePredicate;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ListAssertDemo
{
	@Test
	public void demo()
	{
		List lst = new ArrayList();
		lst.add("Arpita");
		lst.add(10);;
		lst.add(true);
		
		List lst1 = new ArrayList();
		lst1.add("Arpita");
		lst1.add(2);
		lst1.add(false);
		
		Assert.assertEquals(lst, lst1);
		System.out.println("Valid");
	}
}
