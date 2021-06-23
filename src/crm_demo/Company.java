package crm_demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver3.exe"); //Launch chrome driver
		WebDriver driver=new ChromeDriver();
	    
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS); // Professionally 30secs is enough, Synchronization Implicit(It will wait from one page to another page) implicit,explicit (For single elements), thread.sleep:50000ms
		
	    driver.get("https://freecrm.co.in/"); // get-launch the Url of any application 
		
	    driver.manage().window().maximize(); //Maximize the WINDOW
		
	    driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click(); // LOG IN Button On the Web Page
		
	    driver.findElement(By.name("email")).sendKeys("raksha@mobignosis.net"); //Email id
		
	    driver.findElement(By.name("password")).sendKeys("P@ss12345"); //Password
		
	    driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click(); //Login button	
	    
        driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click(); //Menu--->Contacts 
        
	    driver.navigate().refresh();
        
	    driver.navigate().refresh(); //Refresh functionality
        
	    driver.navigate().refresh();
        
	    driver.findElement(By.xpath("//button[@class='ui linkedin button'and text()='New']")).click();//Contacts-->New Button
        driver.navigate().refresh();
        
	    
	    WebElement company=driver.findElement(By.xpath("//div[@name='company']//input[@class='search']"));              // company
		company.click();
		company.clear();
		company.sendKeys("mVerve");
		company.sendKeys(Keys.ENTER);
		
		
        
   
	    

	}

}
