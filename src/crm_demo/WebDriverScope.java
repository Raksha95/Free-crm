package crm_demo;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverScope {

	public static void main(String[] args) throws InterruptedException {
		
		
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe"); // Launch chrome driver
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		System.out.println(driver.findElements(By.tagName("a")).size());

		WebElement footdriver = driver.findElement(By.id("gf-BIG"));

		System.out.println(footdriver.findElements(By.tagName("a")).size());

		WebElement columndriver = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul")); // 1st column

		System.out.println(columndriver.findElements(By.tagName("a")).size());

		for (int i = 1; i < columndriver.findElements(By.tagName("a")).size(); i++) {
			
			String s=Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(s);
			
			Thread.sleep(5000L);
		}
		
	
			
			Set<String> abc = driver.getWindowHandles();

			Iterator<String> l=abc.iterator();
			
			while(l.hasNext())
			{
				driver.switchTo().window(l.next());
				System.out.println(driver.getTitle());
				
			}
		
			
			

				
			

		}

	}
