package Page_objects_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Publishsurvey {
	
	public static WebElement clock1select(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1yxmbwk']"));
		
		
	}
	
	public static WebElement clock1label(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@aria-label=\"clock view is open, go to text input view\"]"));
		
		
	}
	
	public static WebElement clock1ok(WebDriver driver) {
		return driver.findElement(By.xpath("//button[text()='OK']"));
		
		
	}

	//clock2
	
	public static WebElement clock2select(WebDriver driver) {
		return driver.findElement(By.xpath("(//button[@class=\"MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1yxmbwk\"])[2]"));
		
	}
	
	public static WebElement clock2label(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@class=\"MuiButtonBase-root MuiIconButton-root MuiIconButton-colorInherit MuiIconButton-sizeMedium MuiPickersToolbar-penIconButton css-1beylcr\"]"));
		
		
	}
	
	public static WebElement clock2ok(WebDriver driver) {
		return driver.findElement(By.xpath("//button[text()='OK']"));
		
		
	}
	
	
	public static WebElement publish(WebDriver driver) {
		return driver.findElement(By.xpath("//span[text()='Publish Survey']"));
		
		
	}
	

	

}
