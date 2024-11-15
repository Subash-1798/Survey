package Page_objects_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OutcomeSelection {
	
	
	public static  WebElement courseout(WebDriver driver) {
		
		return driver.findElement(By.xpath("//div[@class=\"pl-4 ml-2\"]"));
	}
	
    public static  WebElement framework (WebDriver driver) {
		
		return driver.findElement(By.xpath("//div[@class=\"d-flex align-items-center pl-5\"]"));
	}
     public static  WebElement Knowledge (WebDriver driver) {
		
		return driver.findElement(By.xpath("(//div[@class=\"d-flex align-items-center pl-5 ml-4\"])[1]"));
	}
     
     public static WebElement Clo1checkbox (WebDriver driver) {
    	 
    	 return driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[5]"));
     }
     
     public static WebElement Tag(WebDriver driver) {
    	 
    	 return driver.findElement(By.xpath("(//div[@class=\"border d-flex align-items-center justify-content-between p-2 rounded\"])[2]"));
    	 
     }
     
    public static WebElement TagSelection(WebDriver driver) {
    	 
    	 return driver.findElement(By.xpath("(//input[@class=\"PrivateSwitchBase-input css-1m9pwf3\"])[8]"));
    	 
     }
     
     
     
     public static WebElement save1 (WebDriver driver) {
    	 
    	 return driver.findElement(By.xpath("//span[text() = 'Save']"));
     }



	
	
	
}
