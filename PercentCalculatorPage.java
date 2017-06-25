package WebDriver;

import org.openqa.selenium.*;

public class PercentCalculatorPage {

	private static WebElement element = null;

	// Percentage Calc Link
	public static WebElement lnk_percent_calc(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='hl3']/li[3]/a"));
		return element;
	}

	// Number 1 Text Box
	public static WebElement txt_num_1(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='cpar1']"));
		return element;
	}

	// Number 2 Text Box
	public static WebElement txt_num_2(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='cpar2']"));
		return element;
	}

	// Calculate Button
	public static WebElement btn_calc(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='content']/table[1]/tbody/tr[2]/td/input[2]"));
		return element;
	}

	// Result
	public static WebElement web_result(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='content']/h2[1]"));
		return element;
	}

}
