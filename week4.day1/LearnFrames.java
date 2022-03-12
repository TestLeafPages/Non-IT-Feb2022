package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrames {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		System.out.println(driver);
		driver.get("http://www.leafground.com/pages/frame.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		WebElement frame = driver.findElement(By.xpath("//div[@id='wrapframe']/iframe"));
		driver.switchTo().frame(frame);
		WebElement clickMe1 = driver.findElement(By.id("Click"));
		clickMe1.click();
		System.out.println(clickMe1.getText());
		driver.switchTo().defaultContent();
		
		
		WebElement nestedFrame = driver.findElement(By.xpath("(//div[@id='wrapframe']/iframe)[2]"));
		driver.switchTo().frame(nestedFrame);
		driver.switchTo().frame("frame2");		
		WebElement frame2Text = driver.findElement(By.id("Click1"));		
		frame2Text.click();
		System.out.println(frame2Text.getText()); 			
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();

	}

}
