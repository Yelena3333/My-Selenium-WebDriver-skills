package WebDriver;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.*;
import org.testng.Assert;

public class Demo3 {

	private static WebDriver driver;

	@BeforeTest
	public void launchApp() {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files (x86)\\Mozilla Firefox\\geckodriver.exe");
		driver = new FirefoxDriver();

		// Puts an Implicit wait, Will wait for 10 seconds before throwing
		// exception
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Launch web-site
		driver.navigate().to("http://www.calculator.net/");

		// Maximize the browser
		driver.manage().window().maximize();
	}

	@Test
	public void calculatePercent() {

		// Use element's path described once in PercentCalculatorPage class
		PercentCalculatorPage.lnk_percent_calc(driver).click();

		PercentCalculatorPage.txt_num_1(driver).clear();
		PercentCalculatorPage.txt_num_1(driver).sendKeys("10");

		PercentCalculatorPage.txt_num_2(driver).clear();
		PercentCalculatorPage.txt_num_2(driver).sendKeys("50");

		PercentCalculatorPage.btn_calc(driver).click();

		// Get the Result Text
		String result = PercentCalculatorPage.web_result(driver).getText();

		result = result.replaceAll("\\D", "");

		// Print a Log In message to the console
		System.out.println(" The Result is " + result);
		Assert.assertEquals(result, "5");

	}

	@AfterTest
	public void terminateTest() {
		// Close the Browser
		// driver.close();
		driver.quit();
	}
}
