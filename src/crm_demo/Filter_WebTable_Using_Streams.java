package crm_demo;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Filter_WebTable_Using_Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver3.exe"); // Launch chrome driver
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers"); // get-launch the Url of any application
		driver.manage().window().maximize();
		driver.navigate().refresh();

		driver.findElement(By.xpath("//input[@id='search-field']")).sendKeys("Strawberry");
		List<WebElement> veggies = driver.findElements(By.xpath("//tr/td[1]"));

		List<WebElement> filteredList = veggies.stream().filter(veggie -> veggie.getText().contains("Strawberry")).

				collect(Collectors.toList());

		Assert.assertEquals(veggies.size(), filteredList.size());
	}

}
