package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Utils {

	public static void setField(WebDriver driver, String fieldName, String value) {
		driver.findElement(By.id(fieldName)).clear();
	    driver.findElement(By.id(fieldName)).sendKeys(value);
	}
	
	public static void setSelectField(WebDriver driver, String fieldName, String value) {
		new Select(driver.findElement(By.id(fieldName))).selectByVisibleText(value);
	}
	
	public static void sleep(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
