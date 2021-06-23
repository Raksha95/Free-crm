package crm_demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesAssignmentPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver4.exe"); // Launch chrome driver
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		driver.navigate().refresh();
		/* Row Count */

		List<WebElement> rowCount = driver.findElements(By.cssSelector("table[id='product'] tr"));
		System.out.println(rowCount.size());

		/* Column Count */

		List<WebElement> colCount = driver.findElements(By.cssSelector("table[id='product'] th"));
		System.out.println(colCount.size());
		
		
		/* Print 2nd Row */
		
		String secondRow=driver.findElement(By.xpath("//table[@id='product']//tr[3]")).getText();
		System.out.println(secondRow);
	}

}
