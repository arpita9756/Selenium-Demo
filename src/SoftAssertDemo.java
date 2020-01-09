import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.functors.TruePredicate;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class SoftAssertDemo 
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
	
	SoftAssert sa = new SoftAssert();
	sa.assertEquals(lst, lst1);
	System.out.println("Hello");
	sa.assertAll();
}
}