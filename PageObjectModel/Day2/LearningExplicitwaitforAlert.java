package week2.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningExplicitwaitforAlert {

	@Test()
	public  void xpathmain() throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/alertappear.html");
		
         
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		driver.findElement(By.id("alert")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert = driver.switchTo().alert();

		System.out.println(alert.getText());
		alert.accept();
		
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

	

		
	}

}
