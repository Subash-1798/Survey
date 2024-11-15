package Page_objects_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Runnerflow {

	
//	public static WebElement Sideicon1(WebDriver driver) {
//		return driver.findElement(By.xpath("//div/i[@class='fa fa-angle-right']"));
//		
//	}
	
	
	public static WebElement surveybutton1(WebDriver driver) {
		
		return driver.findElement(By.xpath("(//a [@aria-current=\"page\"])[3]"));
	}
	
	
	public static WebElement surveymangement1(WebDriver driver) {
		
		return driver.findElement(By.xpath("//div[text()='Survey Management']"));
	}
	
	public static WebElement SurveyBank1(WebDriver driver) {
		
		return driver.findElement(By.xpath("//button[text()='Survey Bank']"));
	}
	
    public static WebElement SurveyTemplates1(WebDriver driver) {
		
		return driver.findElement(By.xpath("//button[text()='Survey Templates']"));
	}
	
    public static WebElement CourseLevel1(WebDriver driver) {
		
		return driver.findElement(By.xpath("//button[text() = 'Course level']"));
	}
    

}
