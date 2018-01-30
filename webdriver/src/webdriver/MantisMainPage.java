package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MantisMainPage {
	
	private WebDriver driver;

	public MantisMainPage(WebDriver driver) {
		this.driver = driver;
	}

	public void createIssue() {
		driver.findElement(By.linkText("Reportar incidencia")).click();
	    Utils.sleep(2);
	}
}
