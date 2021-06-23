package crm_demo;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Sorting_WebTables_Using_Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver4.exe"); // Launch chrome driver
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers"); // get-launch the Url of any application
		driver.manage().window().maximize();
		driver.navigate().refresh();
		WebElement e = driver.findElement(By.xpath("//tr/th[1]"));
		e.click();

		List<WebElement> originalList = driver.findElements(By.xpath("//tr/td[1]"));

		List<String> sortedList = originalList.stream().map(s -> s.getText()).collect(Collectors.toList());

		List<String> newList = sortedList.stream().sorted().collect(Collectors.toList());

		Assert.assertTrue(sortedList.equals(newList));

		System.out.println(newList);

		List<String> price;
		do {

			List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));

			price = rows.stream().filter(s -> s.getText().contains("Strawberry")).map(s -> getPriceVeg(s))
					.collect(Collectors.toList());
			price.forEach(s -> System.out.println(s));
			if (price.size() < 1) {
				driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
			}
		}

		while (price.size() < 1);

	}

	private static String getPriceVeg(WebElement s) {

		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;

	}

} 