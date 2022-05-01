package testng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTestcase implements IRetryAnalyzer{
	int count=0;
	public boolean retry(ITestResult result) {
	
		if(count<3)
		{
			count++;
			return true;
		}
		return false;
		
	}

}
