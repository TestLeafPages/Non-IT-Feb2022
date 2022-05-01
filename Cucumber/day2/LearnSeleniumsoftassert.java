package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSeleniumsoftassert {

	@Test
	public void createLead() throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("demoSalesManager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		WebElement loginbutton = driver.findElement(By.className("decorativeSubmit"));
		
		boolean displayed = loginbutton.isDisplayed();
		loginbutton.click();

		String actualresult = driver.getTitle();

		String expectedresult = "LeafTaps";

		System.out.println(actualresult);

		SoftAssert verify=new SoftAssert();
		
		verify.assertEquals(actualresult, expectedresult);
		
		System.out.println("Both values are different");
		
		verify.assertAll();
		
		
	}

}
