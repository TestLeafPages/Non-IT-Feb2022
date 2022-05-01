package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClass {
	/*
	 * public ChromeDriver driver;
	 * 
	 * @Given("Open the browser") public void openBrowser() {
	 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver(); }
	 * 
	 * @Given("Load the Url") public void loadUrl() {
	 * driver.manage().window().maximize();
	 * driver.get("http://leaftaps.com/opentaps/");
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); }
	 * 
	 * @When("Enter the Username as {string}") public void
	 * enter_the_username_as_demosales_manger(String uname) {
	 * driver.findElement(By.id("username")).sendKeys(uname);
	 * 
	 * }
	 * 
	 * @When("Enter the Password as {string}") public void
	 * enter_the_password_as_crmsfa(String pwd) {
	 * driver.findElement(By.id("password")).sendKeys(pwd); }
	 */
	@When("Clicking the {string} link")
	public void clicking_the_crmsfa_link(String linktext) {
		driver.findElement(By.linkText(linktext)).click();
	}

	/*
	 * @When("Clicking the Leads link") public void clicking_the_leads_link() {
	 * driver.findElement(By.linkText("Leads")).click(); }
	 * 
	 * @When("Clicking the Create Leads link") public void
	 * clicking_the_create_leads_link() {
	 * driver.findElement(By.linkText("Create Lead")).click(); }
	 */
	@When("Enter the company name")
	public void enter_the_company_name() {
		WebElement findElement = driver.findElement(By.id("createLeadForm_companyName"));
		findElement.sendKeys("TL");
	}
	@When("Enter the first name")
	public void enter_the_first_name() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vidya");
	}
	@When("Enter the last name")
	public void enter_the_last_name() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
	}
	@When("Clicking the createlead button")
	public void clicking_the_createlead_button() {
		driver.findElement(By.name("submitButton")).click();
	  	}
	
	
	@Then("ViewLead page should be displayed")
	public void view_lead_page_should_be_displayed() {
	   System.out.println(driver.getTitle());
	}
}
