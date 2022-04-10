package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindow {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://www.leafground.com/pages/Window.html");
		System.out.println(driver.getTitle());//get the title of current page
		String firstwindow = driver.getWindowHandle();
		System.out.println(firstwindow);
		//click the first option
		driver.findElement(By.id("home")).click();
		//new window opening
		System.out.println(driver.getTitle());
		//1.getWindowHandle:Returns the window handle of the active window/tab:String
		//2.getWindowHandles:Returns the window handles of all opened tab/window in the present
		//to handle all the windows by getWindowHandles method
		//print the number of window open
		Set<String> windowHandles = driver.getWindowHandles();
		//How to get the second window from the set
		//copy the set value into list
		List<String>lsthandles=new ArrayList<String>(windowHandles);
		//Get the second window handle
		String newwindow = lsthandles.get(1);
		//switch to second window(Move the control to the second window)
		driver.switchTo().window(lsthandles.get(1));
		//Or
		driver.switchTo().window(newwindow);
		//confirm the control move to the window  
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());//to verify using url
		driver.close();//close the current window
		//to move the control into firstwindow
		driver.switchTo().window(lsthandles.get(0));
		System.out.println(driver.getTitle());
		driver.quit();//will close all open window
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
