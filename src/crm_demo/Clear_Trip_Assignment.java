package crm_demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Clear_Trip_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver4.exe"); // Launch chrome driver
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS); // Professionally 30secs is enough,
																			// Synchronization Implicit(It will wait
																			// from one page to another page)
																			// implicit,explicit (For single elements),
																			// thread.sleep:50000ms

		driver.get("https://www.cleartrip.com/");

		driver.manage().window().maximize();

		driver.navigate().refresh();

		/*---------------------Selection of Static Dropdown (ADULT,CHILDREN,INFANTS)---------------------------------------------------*/

		driver.findElement(By.id("Adults")).click();

		Select s = new Select(driver.findElement(By.id("Adults")));

		s.selectByIndex(3);

		driver.findElement(By.id("Childrens")).click();

		Select p = new Select(driver.findElement(By.id("Childrens")));

		p.selectByVisibleText("5");

		driver.findElement(By.id("Infants")).click();

		Select a = new Select(driver.findElement(By.id("Infants")));

		a.selectByValue("1");

		/*-----------------Selecting current Date in the calendar----------------------------------------*/
		driver.findElement(By.id("DepartDate")).click();

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

		/*-------------------------------Click on More Options---------------------------------------------------------*/
		driver.findElement(By.cssSelector("a[id='MoreOptionsLink']")).click();

		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Indigo");
		;

		/*------------------------Search Button --------------------------------------------------------------------*/

		driver.findElement(By.id("SearchBtn")).click();

		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

		driver.close();

	}

}
