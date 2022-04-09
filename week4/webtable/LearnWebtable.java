package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebtable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement fromsta = driver.findElement(By.id("txtStationFrom"));
		fromsta.clear();
		fromsta.sendKeys("Chennai Beach Jn",Keys.TAB);
		WebElement toSta = driver.findElement(By.id("txtStationTo"));
		toSta.clear();
		toSta.sendKeys("Mumbai Central");
		WebElement sortCheck = driver.findElement(By.id("chkSelectDateOnly"));
		sortCheck.click();
		WebElement colo = driver.findElement(By.tagName("th"));
		System.out.println(colo.getText());
		
		//Get the row size
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr"));
		int rowsize = rows.size();
		System.out.println(rowsize);
		//get the coloumnsize
		List<WebElement> columnsize = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr[2]/td"));
		System.out.println(columnsize.size());
		
		//Get the particular value
		String onename = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr/td[2]")).getText();
	System.out.println(onename);
	//get all value
	WebElement table = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']"));
	//System.out.println(table.getText());
	//print all the train names
	List<String>trainames=new ArrayList<String>();
	for (int i =1; i <rows.size() ; i++) {//dynamic xpath 
		String names = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]")).getText();
		//System.out.println(names);
		if(names.contains("EXPRESS")) {
			System.out.println(names);
		}
		
	}
	}

}











