package crm_demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class E2E {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver4.exe"); // Launch chrome driver
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS); // Professionally 30secs is enough,
																			// Synchronization Implicit(It will wait
																			// from one page to another page)
																			// implicit,explicit (For single elements),
																			// thread.sleep:50000ms

		driver.get("https://www.spicejet.com/");

		driver.manage().window().maximize();

		driver.navigate().refresh();

		driver.findElement(By.cssSelector("#divpaxinfo")).click();

		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult"))); // Selecting 7 Adult from the
																							// STATIC DROPDOWN

		// s.selectByVisibleText("7");

		s.selectByIndex(3);

		Thread.sleep(2000L);

		s.selectByValue("8");

		Thread.sleep(2000L);

		s.selectByVisibleText("5");

		/* Selecting Dynamic Dropdown */

		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();

		driver.findElement(By.cssSelector("a[value='DEL']")).click(); // From destination

		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']"))
				.click(); // PARENT-CHILD Relationship.

		driver.findElement(
				By.cssSelector("a[class='ui-state-default ui-state-highlight ui-state-active ui-state-hover']"))
				.click();

		/*------------------------------------------ SELECTION OF 'FROM', 'TO' & 'Date' is done above --------------------------------- */

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style")); // To get the STYLE ATTRIBUTE which
																						// is used to check whether
																						// RETURN DATE is enabled/
																						// disabled.

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {

			System.out.println("Return Date is disabled");

			Assert.assertTrue(true);

		}

		else {

			System.out.println("Return Date is enabled");

			Assert.assertFalse(false);
		}

		/*----------------Checking whether RETURN DATE IS ENABLED/DISABLED above-------------------------------------------*/

		driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();

		Select i = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));

		i.selectByValue("INR");
		/*
		 * ----------------------------------------------------------Selecting CURRENCY
		 * dropdown above ---------------------------------
		 */

		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).click();

		// driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();

		/*------------------------------------Selecting the check-box options above-------------------------------------------------------*/

		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click(); // SEARCH button
	}

}
