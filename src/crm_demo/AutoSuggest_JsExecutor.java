package crm_demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggest_JsExecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver3.exe"); // Launch chrome driver
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://www.makemytrip.com/flights/");
		driver.navigate().refresh();

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("MUM");

		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);

		// Thread.sleep(2000);

		// WebDriverWait w = new WebDriverWait(driver, 5);
		// w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='toCity']")));

		WebElement target = driver.findElement(By.cssSelector("label[for='toCity']"));
		target.click();

		Thread.sleep(2000);

		target.sendKeys("Del");

		target.sendKeys(Keys.ARROW_DOWN);
		target.sendKeys(Keys.ARROW_DOWN);
		target.sendKeys(Keys.ENTER);

	}

}
