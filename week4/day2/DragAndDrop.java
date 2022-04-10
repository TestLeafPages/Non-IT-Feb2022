package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/drop.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//loacte the element
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement traget = driver.findElement(By.id("droppable"));
		//Create object for actions class 
		Actions builder =new Actions(driver);
		//Action to perform
		builder.dragAndDrop(source, traget).perform();
		
		
		
		
		

	}

}
