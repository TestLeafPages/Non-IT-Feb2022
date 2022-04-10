package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/sortable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//handle the frame
		driver.switchTo().frame(0);
		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement item3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
		WebElement item5 = driver.findElement(By.xpath("//li[text()='Item 5']"));
		WebElement item2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
		Actions builder =new Actions(driver);
		//Action to perform
		builder.dragAndDrop(item3, item1).dragAndDrop(item5, item2).perform();	
		
		/*Leaf ground
		 * WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		 * WebElement item3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
		 * WebElement item4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
		 * WebElement item6 = driver.findElement(By.xpath("//li[text()='Item 6']"));
		 * Point location = item6.getLocation(); System.out.println(location.getX());
		 * Actions builder=new Actions(driver); builder.dragAndDrop(item4,
		 * item6).dragAndDrop(item3, item1).perform(); builder.dragAndDropBy(item6, 100,
		 * 120).perform();
		 * 
		 */

	}

}
