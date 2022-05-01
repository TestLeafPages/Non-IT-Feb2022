package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login extends BaseClass{

	
	@When("Enter the Username as {string}")
	public void enter_the_username_as_demosales_manger(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);
		
	}
	@When("Enter the Password as {string}")
	public void enter_the_password_as_crmsfa(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	
	}
	@When("Clicking the Login button")
	public void clicking_the_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("Verify the homepage")
	public void verify_the_homepage() {
	   System.out.println("Successfully landed in the homepage");
	}	
	
	@When("Error message is displayed")
	public void errorMessage() {
		System.out.println("Not landed in the right page");
	}
	

}
