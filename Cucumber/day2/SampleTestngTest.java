package testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTestngTest {

	@Test(retryAnalyzer=RetryFailedTestcase.class)
	public void main() throws Exception {
	System.out.println("ExecutionOrder");
	throw new RuntimeException();	
	}
	
}
