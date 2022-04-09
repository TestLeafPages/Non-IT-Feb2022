package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnLlistInSelenium {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus",Keys.ENTER);
		String mobilename = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).getText();
		System.out.println(mobilename);
		
		//WebElement findElement = driver.findElement(By.id(mobilename));
		//find multiple elements on single method
	  List<WebElement>mobilesname  = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		for (WebElement name : mobilesname) {
			System.out.println(name.getText());
			
			
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
