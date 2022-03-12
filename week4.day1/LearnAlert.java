import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {

	
	public	void call(){
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		//Simple Alert
		
		  Alert alert = driver.switchTo().alert(); 
		  String alertMessage =
		  alert.getText(); 
		  System.out.println(alertMessage); alert.accept();		 
		
		//Confirmation Alert
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();		
		//Alert alert = driver.switchTo().alert();
		alert.dismiss();
		String text = driver.findElement(By.id("result")).getText();		
		System.out.println(text);
	    
	    //Prompt Alert//button[text()='Prompt Box']
	    
	    driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
	    alert.sendKeys("Vidya");
	    alert.accept();  
	    String prompttext = driver.findElement(By.id("result1")).getText();	
	    System.out.println(prompttext);
	    
	    if(prompttext.contains("vidya")) {
	    	System.out.println("message enterd properly in the alert box");
	    }else {
	    	System.out.println("message not enterd properly");

	    }
	    
	    
	    driver.findElement(By.xpath("//button[text()='Sweet Alert']")).click();
	   // alert.accept();
	    
	    
	    driver.findElement(By.xpath("//button[text()='OK']")).click();
	    
	    
	}

}
