package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment {//edit Button

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Selenium wait
		driver.get("http://www.leafground.com/pages/Edit.html");
		driver.findElement(By.id("email")).sendKeys("princila@testleaf.com");
		driver.findElement(By.xpath("//input[@value='Append ']")).clear();
		Thread.sleep(2000);//java wait
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("testleaf",Keys.TAB);
     
		//getText return the value as a string
		String leadid = driver.findElement(By.xpath("//input[@value='Append ']")).getText();
     System.out.println(leadid );
	if(leadid.contains("Displaying records ")) {
		System.out.println("My record created");
	}
	else 
	{
		System.out.println("record not created");
	}
	}

}
