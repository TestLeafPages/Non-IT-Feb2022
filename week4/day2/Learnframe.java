package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Learnframe {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.switchTo().frame(0);
		WebElement frame1 = driver.findElement(By.id("Click"));
		frame1.click();
		System.out.println(frame1.getText());
		//Taking the snapshot
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		//create an image file to store screenshot
		File image=new File("./snaps/frameimg.jpg");
		//Merging the image file source and target
		FileUtils.copyFile(screenshotAs, image);
			
      //get outside
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		//enter into the nested frame
		driver.switchTo().frame(1);//index based
		//Locate by webElement 
		//WebElement frame = driver.findElement(By.id("frame2"));
		driver.switchTo().frame("frame2");//Name and id to locate the frame
		driver.findElement(By.id("Click1")).click();
		driver.switchTo().parentFrame();
		
	}

}
