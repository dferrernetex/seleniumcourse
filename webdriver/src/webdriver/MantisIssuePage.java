package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class MantisIssuePage {
	
	private WebDriver driver;

	public MantisIssuePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setCategory(String value) {
		Utils.setSelectField(driver, "category_id", value);
	}
	
	public void setReproducibility(String value) {
		Utils.setSelectField(driver, "reproducibility", value);
	}
	
	public void setSeverity(String value) {
		Utils.setSelectField(driver, "severity", value);
	}
	
	public void setPriority(String value) {
		Utils.setSelectField(driver, "priority", value);
	}
	
    public void setHandlerId(String value) {
    		Utils.setSelectField(driver, "handler_id", value);
    } 
    
    public void setPlatform(String value) {
        Utils.setField(driver, "platform", value);
    }
    
    public void setOS(String value) {
    		Utils.setField(driver, "os", value);
    }
    
    public void setOSBuild(String value) {
    		Utils.setField(driver, "os_build", value);
    }
    
    public void setSummary(String value) {
    		Utils.setField(driver, "summary", value);
    }
    
    public void setDescription(String value) {
    	    Utils.setField(driver, "description", value);
    }
    
	public void sendIssue() {
		driver.findElement(By.xpath("//input[@value='Enviar incidencia']")).click();
	    Utils.sleep(5);
	}
	
	public void removeIssue() {
		driver.findElement(By.cssSelector(".alert-success .btn-group .btn")).click();
	    driver.findElement(By.xpath("//input[@value='Eliminar']")).click();
	    driver.findElement(By.xpath("//input[@value='Eliminar incidencias']")).click();
	}
	
}
