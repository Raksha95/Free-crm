package crm_demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoGuru99 {

	public static void main(String[] args) throws Exception {

		String URL = "https://demo.guru99.com/v4/index.php";
		String userIDValue = "mngr320198";
		String passwordValue = "vusAmEn";

		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver5.exe"); // Launch chrome driver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);

		// Handle Untrusted Certificate Selenium //How to bypass the message - "Your
		// connection is not private" on non-secure page using Selenium

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		chromeOptions.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

		// WebDriverManager.chromedriver().setup();
		// WebDriver driver = new ChromeDriver(chromeOptions);

		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// driver.get(URL);

		WebElement userIDElement = driver.findElement(By.xpath("//input[@name='uid']"));
		userIDElement.sendKeys(userIDValue);

		WebElement passwordElement = driver.findElement(By.xpath("//input[@name='password']"));
		passwordElement.sendKeys(passwordValue);

		WebElement loginBtnElement = driver.findElement(By.xpath("//input[@value='LOGIN']"));
		loginBtnElement.click();

		Thread.sleep(1000);

		WebElement newCustomerElement = driver.findElement(By.linkText("New Customer"));
		newCustomerElement.click();

		String date = "04-08-2021";
		WebElement dobElement = driver.findElement(By.xpath("//input[@id='dob']"));
		dobElement.sendKeys(date); // dd-mm-yyyy

	}

}
