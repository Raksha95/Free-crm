package crm_demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/nested_frames");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		System.out.println(driver.findElements(By.tagName("frameset")).size());

		driver.switchTo().frame("frame-top");

		driver.switchTo().frame("frame-middle");

		System.out.println(driver.findElement(By.cssSelector("div[id='content']")).getText());

		/*
		 * WebDriverWait w = new WebDriverWait(driver, 10);
		 * w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(
		 * "frame[name='frame-bottom']")));
		 */

		// System.out.println(driver.findElements(By.tagName("frame")).size());

		driver.switchTo().defaultContent();

		/*------------------------- Displaying BOTTOM text as well :)-----------------------------------------------------
		 */

		driver.switchTo().frame("frame-bottom");

		System.out.println(driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]")).getText());

	}

}
