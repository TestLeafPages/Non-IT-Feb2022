package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseClick {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebElement click = driver.findElement(By.xpath("//a[text()='Mobiles']"));
	   //Double click
        Actions builder=new Actions(driver);
        builder.doubleClick(click).perform();
        //Right click
        builder.contextClick().perform();
	
	
	
	
	
	
	
	
	
	
	
	}

}
