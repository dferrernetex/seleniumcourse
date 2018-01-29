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
		
		sleep(2);
		driver.get(baseUrl);
		
	    driver.findElement(By.id("username")).clear();
	    driver.findElement(By.id("username")).sendKeys("curso-sele");
	    sleep(2);
	    driver.findElement(By.xpath("//input[@value='Iniciar sesión']")).click();
	    
	    //if (!driver.findElement(By.id("secure-session")).isSelected()) {
	        //driver.findElement(By.id("secure-session")).click();
	    //};
	    sleep(2);
	    //
	    
	    
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("sele-julio");
	    
	    
	    driver.findElement(By.xpath("//input[@value='Iniciar sesión']")).click();
	    sleep(4);
	    
	    
	    driver.findElement(By.linkText("Reportar incidencia")).click();
	    sleep(2);
	    new Select(driver.findElement(By.id("category_id"))).selectByVisibleText("incidencia");
	    new Select(driver.findElement(By.id("reproducibility"))).selectByVisibleText("siempre");
	    new Select(driver.findElement(By.id("severity"))).selectByVisibleText("bloqueo");
	    new Select(driver.findElement(By.id("priority"))).selectByVisibleText("urgente");
	    driver.findElement(By.id("platform")).clear();
	    driver.findElement(By.id("platform")).sendKeys("W10");
	    driver.findElement(By.id("os")).clear();
	    driver.findElement(By.id("os")).sendKeys("W10");
	    driver.findElement(By.id("os_build")).clear();
	    driver.findElement(By.id("os_build")).sendKeys("W10");
	    new Select(driver.findElement(By.id("handler_id"))).selectByVisibleText("curso-sele");
	    driver.findElement(By.id("summary")).clear();
	    driver.findElement(By.id("summary")).sendKeys("DANIEL_ADAN_TEST Test1");
	    driver.findElement(By.id("description")).clear();
	    driver.findElement(By.id("description")).sendKeys("TEST 1");
	    
	    driver.findElement(By.xpath("//input[@value='Enviar incidencia']")).click();
	    sleep(5);
	    
	    
	    // ELIMINAR INCIDENCIA
	    
	    driver.findElement(By.cssSelector(".alert-success .btn-group .btn")).click();
	    driver.findElement(By.xpath("//input[@value='Eliminar']")).click();
	    driver.findElement(By.xpath("//input[@value='Eliminar incidencias']")).click();
	    
	    
	    
	    /*
	     * LOGOUT
	    driver.findElement(By.cssSelector("span.user-info")).click();
	    driver.findElement(By.linkText("Salir")).click();
	    */
	    
	    driver.close();
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
