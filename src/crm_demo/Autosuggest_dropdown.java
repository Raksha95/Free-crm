package crm_demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggest_dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver6.exe"); //Launch chrome driver
		WebDriver driver=new ChromeDriver();
	    
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS); // Professionally 30secs is enough, Synchronization Implicit(It will wait from one page to another page) implicit,explicit (For single elements), thread.sleep:50000ms
		
	    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	    
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.id("autosuggest")).sendKeys("Ind");
	    
	   List<WebElement> options= driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
	   for(WebElement option: options)
	   {
		   if (option.getText().equalsIgnoreCase("India"))
		   {
			   option.click();
			   break;
		   }
		   
	   }
	  
	   
	    
	    
	    
	}

}
