package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSelenium {

	public static void main(String[] args) throws InterruptedException  {
	
		
		// TODO Auto-generated method stub
		//to setup your driver				
		WebDriverManager.chromedriver().setup();	
		//to lauch the browser
		ChromeDriver driver=new ChromeDriver();
		// to load your URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		 driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		 
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 
		 driver.findElement(By.className("decorativeSubmit")).click();		
		
		 String title = driver.getTitle();
		 
		 String name="LeafTaps";
		 
		 System.out.println(title);		
		 
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 
		 //click leads 
		 driver.findElement(By.linkText("Leads")).click();

		 //verify the page -getTitle(); //ctrl 2L
		 
		 String leadsPage = driver.getTitle();	
		 
		 System.out.println(leadsPage);
		 
		 driver.findElement(By.linkText("Create Lead")).click();
		 
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TL");
		 
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vidya");
		 
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("bharathi");	 
		 
		 //to select the options from the dropdown-use Select class
		 WebElement sourceId = driver.findElement(By.id("createLeadForm_dataSourceId"));		 
		 Select choose=new Select(sourceId);		 
		 choose.selectByIndex(1);
		 
		 WebElement marketCampaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		 Select market=new Select(marketCampaign);		 
		 market.selectByValue("CATRQ_AUTOMOBILE");
		 
		 WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));		 
		 Select indus=new Select(industry);		 
		 indus.selectByVisibleText("Computer Software");
		 
		 WebElement country=driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		 country.clear();
		 country.sendKeys("2");		 
		 
		 String LeadName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		 System.out.println(LeadName); 	 
		 
		
		//Thread.sleep(3000);createLeadForm_primaryPhoneCountryCode
		driver.close();
		

	}

}
