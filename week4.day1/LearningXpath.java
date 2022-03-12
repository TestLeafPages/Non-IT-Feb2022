package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// to setup your driver
		WebDriverManager.chromedriver().setup();
		// to lauch the browser
		ChromeDriver driver = new ChromeDriver();
		// to load your URL
		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesManager");

		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");

		driver.findElement(By.xpath("//input[@type='submit']")).click();

		String title = driver.getTitle();

		String name = "LeafTaps";

		System.out.println(title);

		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		// click leads
		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Vidya");
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		
		List<WebElement> firstName = driver
				.findElements(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']"));
		System.out.println(firstName);

		for (int i = 0; i < firstName.size(); i++) {
			String text = firstName.get(i).getText();
			System.out.println(text);
		}


	}

}
