package crm_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait_assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe"); // Launch chrome driver
		WebDriver driver = new ChromeDriver();


		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // This is Implicit wait ()

		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		
		driver.findElement(By.xpath("//a[contains(text(),'Click to load get data via Ajax!')]")).click();
		
		/*---------------------------------------------This is EXPLICIT WAIT mechanism---------------------------------------------*/
	     
		WebDriverWait w= new WebDriverWait(driver,5);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='results']")));
		
		System.out.println(driver.findElement(By.xpath("//div[@id='results']")).getText());

	}

}
