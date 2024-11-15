package Page_objects_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;

public class SurveyHome {
	
	public static WebElement Sideicon(WebDriver driver) {
		return driver.findElement(By.xpath("//div/i[@class='fa fa-angle-right']"));
		
	}
	
	public static WebElement Surveybutton(WebDriver driver) {
		
		return driver.findElement(By.xpath("(//a [@aria-current=\"page\"])[3]"));
	}
	
    public static WebElement SurveyManagement(WebDriver driver) {
    	return driver.findElement(By.xpath("//div[text()='Survey Management']"));
		
		
		
	}
    
    public static WebElement Surveybank(WebDriver driver) {
    	return driver.findElement(By.xpath("//button[text() = 'Survey Bank']"));
    
    

}
    public static WebElement SurveyTemplate(WebDriver driver) {
    	return driver.findElement(By.xpath("//button[text()='Survey Templates']"));
    
    

}


    
}
