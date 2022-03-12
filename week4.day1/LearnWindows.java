package week2.day2;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.manage()
		.timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		
		
		driver.findElement(By.xpath("//button[text()='Open Home Page']")).click();
				
	//	Set<String> windowHandles = driver.getWindowHandles();
		/*
		 * int size = windowHandles.size(); System.out.println(size);
		 */		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> newWindow=new LinkedList<String>(windowHandles);
		driver.switchTo().window(newWindow.get(1));
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		String title = driver.getTitle();
		System.out.println(title);	
		driver.close();
Thread.sleep(3000);
		driver.switchTo().window(newWindow.get(0));
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> newWindow1=new LinkedList<String>(windowHandles1);
		driver.switchTo().window(newWindow1.get(2));
		System.out.println(driver.getTitle());
		driver.switchTo().window(newWindow1.get(1));
		System.out.println(driver.getTitle());
		driver.switchTo().window(newWindow.get(0));
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
