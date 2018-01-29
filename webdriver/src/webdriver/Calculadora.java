package webdriver;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://calculadora.net");
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
	    driver.findElement(By.xpath("//input[@value='+']")).click();
	    driver.findElement(By.xpath("//input[@value='2']")).click();
	    driver.findElement(By.xpath("//input[@value='=']")).click();
	    try {
	        assertEquals("4", driver.findElement(By.id("Display")).getAttribute("value"));
	      } catch (Error e) {
	        //verificationErrors.append(e.toString());
	      }
	    
	    //limpiar operación
	    driver.findElement(By.xpath("//input[@value='C']")).click();
	    
	    driver.findElement(By.xpath("//input[@value='3']")).click();
	    driver.findElement(By.xpath("//input[@value='+']")).click();
	    driver.findElement(By.xpath("//input[@value='3']")).click();
	    driver.findElement(By.xpath("//input[@value='=']")).click();
	    try {
	        assertEquals("6", driver.findElement(By.id("Display")).getAttribute("value"));
	      } catch (Error e) {
	        //verificationErrors.append(e.toString());
	      }
	    
	   
	}
	
	

}
