package crm_demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver3.exe"); // Launch chrome driver
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get(
				"https://www.cricbuzz.com/live-cricket-scorecard/30235/eng-vs-aus-3rd-odi-australia-tour-of-england-2020");

		driver.navigate().refresh();

		int sum = 0;

		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']")); // Parent
																													// Table
																													// css

		int rowcount = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size(); // Common
																													// CSS
																													// for
																													// all
																													// the
																													// rows
		int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)"))
				.size(); // 3rd Child traverse

		for (int i = 0; i < count - 2; i++) {

			String value = table
					.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i)
					.getText();

			int valueInteger = Integer.parseInt(value);

			sum = sum + valueInteger;

		}

		// System.out.println(sum);

		String Extras = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText(); // Grab
		// Extras

		int extraValue = Integer.parseInt(Extras);

		int totalSumValue = sum + extraValue;

		System.out.println(totalSumValue);

		// This is traversing from one sibling to another logic i.e Sibling -To -Sibling
		// traverse

		String actual = driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();

		int actualValue = Integer.parseInt(actual);

		if (actualValue == totalSumValue) {
			System.out.println("Total sum matches the actual value");
		} else {

			System.out.println("Does not match");
		}

	}

}
