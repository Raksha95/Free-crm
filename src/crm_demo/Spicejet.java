package crm_demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spicejet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver4.exe"); //Launch chrome driver
		WebDriver driver=new ChromeDriver();
	    
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS); // Professionally 30secs is enough, Synchronization Implicit(It will wait from one page to another page) implicit,explicit (For single elements), thread.sleep:50000ms
		
	    driver.get("https://www.spicejet.com/");
	    
	    driver.manage().window().maximize();
	    
	   driver.findElement(By.cssSelector("input#ctl00_mainContent_ddl_originStation1_CTXT")).click(); // selecting the dropdown
	    
	 /*   driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	   
	    driver.findElement(By.xpath("//a[@value='BLR']")).click(); // Select BENGALURU from the dynamic drop down.
	    
	    driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
	    
	    */
	    
	    
	    //Now, let's try by traversing through the PARENT-CHILD relationship ,not locating the element through INDEX NUMBERS
	    
	    driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//a[@value='BLR']")).click();
	    
	    driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
	 
	   
	    
	    
	}

}
