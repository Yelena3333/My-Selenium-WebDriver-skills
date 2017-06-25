package WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Program Files (x86)\\Mozilla Firefox\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		// Puts an Implicit wait, Will wait for 10 seconds before throwing
		// exception
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Launch web-site
		driver.navigate().to("http://www.calculator.net/");

		// Maximize the browser
		driver.manage().window().maximize();

		// Click on Percentage Calculator
		driver.findElement(By.xpath(".//*[@id='hl3']/li[3]/a")).click();

		// Enter value 10 in the first number of the percent Calculator
		driver.findElement(By.xpath(".//*[@id='cpar1']")).sendKeys("10");

		// Enter value 50 in the second number of the percent Calculator
		driver.findElement(By.xpath(".//*[@id='cpar2']")).sendKeys("50");

		// Click Calculate Button
		driver.findElement(By.xpath(".//*[@id='content']/table[1]/tbody/tr[2]/td/input[2]")).click();

		// Get the Result Text
		String result = driver.findElement(By.xpath(".//*[@id='content']/h2[1]")).getText();

		result = result.replaceAll("\\D", "");

		// Print a Log In message to the console
		System.out.println(" The Result is " + result);

		if (result.equals("5")) {
			System.out.println(" The Result is Passed");
		} else {
			System.out.println(" The Result is Failed");
		}

		// Close the Browser
		// driver.close();
		driver.quit();

	}

}
