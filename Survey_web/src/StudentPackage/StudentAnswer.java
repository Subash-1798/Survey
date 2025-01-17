package StudentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StudentAnswer {

	
	public static WebElement GOTOSURVEY(WebDriver incognitoDriver) {
		
		return incognitoDriver.findElement(By.xpath("(//button[text()='GO TO SURVEY'])[1]"));
		
	}
	

    public static WebElement StronglyAgree(WebDriver incognitoDriver) {
		
		return incognitoDriver.findElement(By.xpath("(//span[text()='Strongly Agree'])[1]"));
		
	}
	
    public static WebElement Neutral(WebDriver incognitoDriver) {
		
		return incognitoDriver.findElement(By.xpath("(//span[text()='Neutral'])[2]"));
		
	}
    public static WebElement StronglyDisAgree(WebDriver incognitoDriver) {
		
		return incognitoDriver.findElement(By.xpath("(//span[text()='Strongly Disagree'])[3]"));
		
	}
    
     public static WebElement NextPage(WebDriver incognitoDriver) {
		
		return incognitoDriver.findElement(By.xpath("//input[@title='Next']"));
		
	}
     
     public static WebElement Agree(WebDriver incognitoDriver) {
 		
 		return incognitoDriver.findElement(By.xpath("(//span[text()='Agree'])[1]"));
 		
 	}
	
    public static WebElement DisAgree(WebDriver incognitoDriver) {
 		
 		return incognitoDriver.findElement(By.xpath("(//span[text()='Disagree'])[2]"));
 		
 	}
    
    public static WebElement Complete(WebDriver incognitoDriver) {
 		
 		return  incognitoDriver.findElement(By.xpath("//input[@title='Complete']"));
 		
 	}
    
	
    
    public static WebElement OpenendAnswer(WebDriver incognitoDriver) {
    
        return incognitoDriver.findElement(By.xpath("//textarea[@id=\"sq_105i\"]"));
}
}
