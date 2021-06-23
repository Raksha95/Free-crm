package crm_demo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;
public class URL_statuscodes {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver3.exe"); // Launch chrome driver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		
/*		String url = driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
		
		System.out.println(url); 
	}
}

*/
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		
	      SoftAssert a =new SoftAssert();



		for (WebElement link : links) {

			String url = link.getAttribute("href");

			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();

			conn.setRequestMethod("HEAD");

			conn.connect();

			int i = conn.getResponseCode();

			System.out.println(i);
		    a.assertTrue(i<400, "The link with Text" + "" + link.getText()+" is broken with code" + i);
	      }
	      a.assertAll();
		}

}
