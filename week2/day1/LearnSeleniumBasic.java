package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;



public class LearnSeleniumBasic {

	public static void main(String[] args) {
		//To Set Path for Driver
		WebDriverManager.chromedriver().setup();
		//step 1:Launch the ChromeBrowser
		ChromeDriver driver=new ChromeDriver(); 
		//step 2:Launch the application
		//URL Loading(leafTap)
		driver.get("http://leaftaps.com/opentaps/control/login");
		//step3:To maximize the window
		driver.manage().window().maximize();
		//step 4:find the username and value
		//sendKeys pass the input value
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
      //step5: Find the password and value
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//step6:find the login button and click
		driver.findElement(By.className("decorativeSubmit")).click();
		//step7:Click the CRM/SFA 
		driver.findElement(By.linkText("CRM/SFA")).click();
		//click the lead 
		driver.findElement(By.linkText("Leads")).click();
		//click create lead
		driver.findElement(By.linkText("Create Lead")).click();
		//Give input to Company Name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		//Give input to Parent Account
		driver.findElement(By.id("createLeadForm_parentPartyId")).sendKeys("Edward");
		//Give First name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Princila");
		//Give Lastname
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Roseline");
	//DropDown
	//Select is a class
	WebElement dropDown = driver.findElement(By.id("createLeadForm_dataSourceId"));//ctrl+2+l
	Select source = new Select(dropDown);
	//source.selectByVisibleText("Direct Mail");//Directmail
	//source.selectByValue("LEAD_CONFERENCE");//conference
	source.selectByIndex(4);//space//1-cold call
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
