package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MantisLoginPage {
	
	private WebDriver driver;

	public MantisLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setUser(String username) {
		Utils.setField(driver, "username", username);
	}
	
	public void initSession() {
		driver.findElement(By.xpath("//input[@value='Iniciar sesión']")).click();
	    Utils.sleep(4);
	}
	
	public void setPassword(String password) {
		Utils.setField(driver, "password", password);
	}
	
}
