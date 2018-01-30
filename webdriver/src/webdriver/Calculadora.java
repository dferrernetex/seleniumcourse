package webdriver;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calculadora {

	static WebDriver driver;// = new FirefoxDriver();
	
	public static void main(String[] args) {
		//suma(2, 2);
	    //resta(3, 2);
	    verificarValor(suma(22, 33), 55);
	    
	    driver.close();
	}
	
	public static void launchDriver() {
		if (driver == null) {
			driver = new ChromeDriver(); //new FirefoxDriver();
		}
		driver.get("http://calculadora.net");
	}
	
	public static void closeDriver() {
		driver.close();
	}
	
	public static void verificarValor(String result, int a) {
	    String message = "Valores " + String.valueOf(a) + " --> " + String.valueOf(result);
	    	createLog(message,  result.equalsIgnoreCase(String.valueOf(a)) );
	}
	
	public static String suma(int a, int b) {
		launchDriver();
		clearOperations();
		insertValue(a);
	    driver.findElement(By.xpath("//input[@value='+']")).click();
	    insertValue(b);
	    driver.findElement(By.xpath("//input[@value='=']")).click();
	    String web_result = driver.findElement(By.id("Display")).getAttribute("value");
	    
	    return web_result;
	}
	
	public static String resta(int a, int b) {
		launchDriver();
		clearOperations();
		insertValue(a);
	    driver.findElement(By.xpath("//input[@value='-']")).click();
	    insertValue(b);
	    driver.findElement(By.xpath("//input[@value='=']")).click();
	    String web_result = driver.findElement(By.id("Display")).getAttribute("value");
	    
	    return web_result;
	}
	
	public static void clearOperations() {
		driver.findElement(By.xpath("//input[@value='C']")).click();
	}
	
	public static void insertValue(int value) {
		driver.findElement(By.id("Display")).clear();
	    driver.findElement(By.id("Display")).sendKeys( String.valueOf(value) );
	}
	
	public static void createLog(String message, boolean ok) {
		System.out.println((ok?"SUCCESS --> ":"FAIL --> ") +  message);
	}
	
	

}
