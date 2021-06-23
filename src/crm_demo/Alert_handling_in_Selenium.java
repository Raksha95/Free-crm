package crm_demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_handling_in_Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver3.exe"); //Launch chrome driver
		WebDriver driver=new ChromeDriver();
	    
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS); // Professionally 30secs is enough, Synchronization Implicit(It will wait from one page to another page) implicit,explicit (For single elements), thread.sleep:50000ms
		
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    
	    driver.manage().window().maximize();
	    
	    driver.navigate().refresh();
	    
	    
	   driver.findElement(By.id("name")).sendKeys("Raksha");
	   
	   driver.findElement(By.id("alertbtn")).click();
	   
		System.out.println(driver.switchTo().alert().getText());
	   
	   driver.switchTo().alert().accept();                                    ///ACCEPT METHOD 

	}

}
