package crm_demo;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ecommerce_Add_To_Cart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver3.exe"); // Launch chrome driver
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // This is Implicit wait ()

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot", "Tomato" };
		
		addItems(driver,itemsNeeded);
}


public static void addItems (WebDriver driver,String[] itemsNeeded) {
	
	int j = 0;

	List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

	for (int i = 0; i < products.size(); i++) {

		String[] name = products.get(i).getText().split("-");

		String formattedName = name[0].trim();

		List itemsNeededList = Arrays.asList(itemsNeeded);

		if (itemsNeededList.contains(formattedName)) {

			j++;

			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

			// Thread.sleep(3000L);
			if (j == itemsNeeded.length)

				break;
		}
	}

	driver.findElement(By.cssSelector("img[alt='Cart']")).click();

	//driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click(); --> Regular expression of xpath

	driver.findElement(By.xpath("//div[@class='cart-preview active']//button")).click(); // Parent-Child relationship
	
	driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");

	driver.findElement(By.cssSelector("button.promoBtn")).click();

	System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
    
	driver.close();
}
}


