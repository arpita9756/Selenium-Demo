import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class DemoList implements ITestListener
{
	@Override
	public void onStart(ITestContext arg0) 
	{
	System.out.println(arg0.getStartDate());
	System.out.println(arg0.getAllTestMethods().toString());
		
	}

	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println(result.getName());
		System.out.println(result.getStatus());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName());
		System.out.println(result.getStatus());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName());
		System.out.println(result.getStatus());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName());
		System.out.println(result.getStatus());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("onTestFailedButWithinSuccessPercentage");
		System.out.println(result.getName());
		System.out.println(result.getStatus());
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println(context.getEndDate());
		System.out.println(context.getPassedTests());
		System.out.println(context.getFailedTests());
	}

}
