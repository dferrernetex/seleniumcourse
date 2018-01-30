package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Mantis {
	
	private static WebDriver driver;
	private static String baseUrl;

	public static void main(String[] args) {
		
		driver = new FirefoxDriver();
	    baseUrl = "http://tester.com.es/"; //login_page.php";
	    //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Utils.sleep(2);
		driver.get(baseUrl);
		
		MantisLoginPage loginPage = new MantisLoginPage(driver);
		loginPage.setUser("curso-sele");
		loginPage.initSession();
		loginPage.setPassword("sele-julio");
		loginPage.initSession();
		
		MantisMainPage mainPage = new MantisMainPage(driver);
	    mainPage.createIssue();
	    
	    MantisIssuePage issuePage = new MantisIssuePage(driver);
	    issuePage.setCategory("incidencia");
	    issuePage.setReproducibility("siempre");
	    issuePage.setSeverity("bloqueo");
	    issuePage.setPriority("urgente");
	    issuePage.setPlatform("W10");
	    issuePage.setOS("W10");
	    issuePage.setOSBuild("W10");
	    issuePage.setHandlerId("curso-sele");
	    issuePage.setSummary("DANIEL_ADAN_TEST Test1");
	    issuePage.setDescription("TEST 1");
	    issuePage.sendIssue();
	    
	    issuePage.removeIssue();
	    
	    /*
	     * LOGOUT
	    driver.findElement(By.cssSelector("span.user-info")).click();
	    driver.findElement(By.linkText("Salir")).click();
	    */
	    
	    driver.close();
	}
}
