package crm_demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkbox_Select_Deselect_show_count {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver.exe"); //Launch chrome driver
		WebDriver driver=new ChromeDriver();
	    
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS); // Professionally 30secs is enough, Synchronization Implicit(It will wait from one page to another page) implicit,explicit (For single elements), thread.sleep:50000ms
		
	    driver.get("https://www.spicejet.com/");
	    
		//TO Check or tick the Checkbox (SELECT)
	    
	    driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
	    
	    Thread.sleep(3000);
	    
	    
	    //Assert.assertFalse(true, "driver.findElement(By.xpath(\"//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']\")).click()");
	    
	    System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
	    
	    
	    
	    //TO Uncheck the checkbox selected
	    
        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
	    
	    System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
	    
	    //TO CHECK THE NUMBER OF CHECKBOXES PRESENT IN THE WEBSITE
	    driver.findElements(By.cssSelector("input[value='checkbox']")).size(); 
	    
	    
	}

}
