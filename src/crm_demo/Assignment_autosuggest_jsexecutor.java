package crm_demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_autosuggest_jsexecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver3.exe"); // Launch chrome driver
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.navigate().refresh();

		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		WebElement auto=driver.findElement(By.cssSelector("input[id='autocomplete']"));
		
		auto.sendKeys("Unit");
		
	for (int i=0; i<=3;i++)
		{
		auto.sendKeys(Keys.ARROW_DOWN);
		}
		
	System.out.println(auto.getAttribute("value"));

	}

}
