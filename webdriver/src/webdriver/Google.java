package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google {

	private static WebDriver driver;
	private static String baseUrl;
	
	private static String msearchURL = "agiletester.org";
	
	private static String msearch = "Agile tester";
	
	private static int numPage = 0;
	private static int limitPages = 10;
	
	public static void main(String[] args) {
		
		find(msearch, msearchURL);
		
		find(msearch, "ISTQB");
		
		find(msearch, "gierhguefghgiiuub ehuigheriug");
	}
	
	public static void find(String search, String searchURL) {
		numPage = 0;
		
		driver = new FirefoxDriver();
	    baseUrl = "http://www.bing.com/";
		driver.get(baseUrl);
		Utils.sleep(1);
		sendSearch(search);
		Utils.sleep(1);
		numPage++;
		
		findSearch(searchURL);
		
		driver.close();
	}
	
	protected static void goToNextPage() {
		driver.findElement(
				By.className("sb_pagN")
			).click();
		Utils.sleep(1);
		numPage++;
	}
	
	protected static void findSearch(String searchURL) {
		String html = driver.findElement(By.tagName("body")).getAttribute("innerHTML");
		
		//Utils.createLog(html, true);
		Utils.createLog("Pagina " + String.valueOf(numPage), true);
		
		if (html.contains(searchURL)) {
			Utils.createLog("Encontrado en página: " + String.valueOf(numPage), true);
		} else if (numPage < limitPages) {
			//Utils.createLog("No encontrado", false);
			goToNextPage();
			findSearch(searchURL);
		} else {
			Utils.createLog("Alcanzado límite de páginas: " + String.valueOf(limitPages), false);
		} 
		
	}
	
	public static void sendSearch(String search) {
		driver.findElement(By.id("sb_form_q")).clear();
	    driver.findElement(By.id("sb_form_q")).sendKeys(search);
	    driver.findElement(By.id("sb_form_go")).click();
	}

}
