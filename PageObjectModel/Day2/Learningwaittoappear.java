package week2.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Learningwaittoappear {

	@Test()
	public  void runvisiblityofele() throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/appear.html");	
         
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		  WebElement eleappear = driver.findElement(By.id("btn"));
		  wait.until(ExpectedConditions.visibilityOf(eleappear));
		 
		
		String text = driver.findElement(By.xpath("//button[@id='btn']/b")).getText();
	
        System.out.println(text);
		
	}

}
