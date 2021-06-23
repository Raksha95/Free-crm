package crm_demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invalid_Login_Errors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver3.exe"); //Launch chrome driver
		WebDriver driver=new ChromeDriver();
	    
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS); // Professionally 30secs is enough, Synchronization Implicit(It will wait from one page to another page) implicit,explicit (For single elements), thread.sleep:50000ms
		
	    driver.get("https://freecrm.co.in/"); // get-launch the Url of any application 
		
	    driver.manage().window().maximize(); //Maximize the WINDOW
		
	    driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click(); // LOG IN Button On the Web Page 
		
	    
	    /*driver.findElement(By.name("email")).sendKeys("em!@@934843982947.com"); //Invalid Email
		
	    driver.findElement(By.name("password")).sendKeys("P@ss12345"); // Valid Password
	   
	    driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click(); //Login button 
	    
	    	    //Something went wrong...Invalid login

	    
        driver.findElement(By.name("email")).sendKeys("1234567890;*)))(***&&"); //Invalid Email
		
	    driver.findElement(By.name("password")).sendKeys("P@ss12345"); //Valid Password
	   
	    driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
	    
	    	    //Something went wrong...Invalid login
	    */
	    
	   /* driver.findElement(By.name("email")).sendKeys("raksha@mobi");  //Invalid email
	    driver.findElement(By.name("password")).sendKeys("difoiwfoid"); //Invalid password
	    driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click(); //Login button
	    
	    //Something went wrong...Invalid login
	    
	     */
	    
	   

	    
	}

}
