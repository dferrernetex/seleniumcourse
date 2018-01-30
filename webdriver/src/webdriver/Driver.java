package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
	
	protected static WebDriver mdriver;
	
	public enum driver {
		firefox, chrome
	}
	
	public static WebDriver getDriver(driver driver) {
		if(mdriver != null) {
			//TODO verificar tipo
			return mdriver;
		}
		
		switch(driver) {
		case firefox:
			mdriver = new FirefoxDriver();
			return mdriver;
		case chrome:
			mdriver = new ChromeDriver();
			return mdriver;
		}
		
		return null;
	}
	
	public static void close() {
		if(mdriver != null) {
			mdriver.close();
		}
	}
	
	public static void reset() {
		mdriver = null;
	}
	
	
}
