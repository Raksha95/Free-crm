package crm_demo;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_ADD_TO_CART_Execution {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver3.exe"); // Launch chrome driver
		WebDriver driver = new ChromeDriver();

		int j = 0;

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //
		// Professionally 30secs is enough,
		// Synchronization Implicit(It will wait
		// from one page to another page)
		// implicit,explicit (For single elements),
		// thread.sleep:50000ms

		driver.get("https://www.amazon.in/?");

		//driver.navigate().refresh();

		driver.manage().window().maximize();
		
		String[] itemsNeeded = { "Gillette Mach 3 Shaving Blades","Dabur Red Paste" };
		

		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[5]")).click();// SELECTING 'Pantry'

		Thread.sleep(3000L);

		List<WebElement> products = driver.findElements(By.cssSelector("a.a-link-normal"));

		for (int i = 0; i < products.size(); i++) {

			// Format the string [] itemsNeeded "Pears Pure and Gentle Bathing Bar, 125 g
			// (Pack of 8)"

			String[] name = products.get(i).getText().split("-");

			String formattedName = name[0].trim();

			List<String> itemsNeededList = Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(formattedName)) {

				j++;

				driver.findElements(By.xpath("//div[@class='a-section p-prod-tile-inner']//*[@class='a-button-input']")).get(i).click();

				if (j == itemsNeeded.length) {

					break;
				}

			}
		}

	}

}
