package crm_demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver5.exe"); // Launch chrome driver
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS); // Professionally 30secs is enough,
																			// Synchronization Implicit(It will wait
																			// from one page to another page)
																			// implicit,explicit (For single elements),
																			// thread.sleep:50000ms

		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.findElement(By.cssSelector("input#travel_date")).click();

		// November 14

		while (!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText()
				.contains("January")) {

			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}
		List<WebElement> dates = driver.findElements(By.cssSelector(".day"));

		// Grab common attribute//Put it into list and iterate

		int count = driver.findElements(By.cssSelector(".day")).size();

		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.cssSelector(".day")).get(i).getText(); // here 25 will be returned

			if (text.equalsIgnoreCase("14")) {
				driver.findElements(By.cssSelector(".day")).get(i).click();
				break;
			}

		}

	}

}
