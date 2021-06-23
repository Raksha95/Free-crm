package crm_demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver6.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/droppable/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		System.out.println(driver.findElements(By.tagName("iframe")).size()); // To Get the Number of Frames present in
																				// the webpage

		/*-------------------------------SWITCH TO - FRAME -------------------------------------------------------------------*/

		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));

		// driver.findElement(By.id("draggable")).click();

		/*------------------------------BUILD ACTION ----------------------------------------------------------------------------*/

		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.cssSelector("div[id='draggable']"));

		WebElement target = driver.findElement(By.cssSelector("div[id='droppable']"));

		a.dragAndDrop(source, target).build().perform();

		driver.switchTo().defaultContent();

	}

}
