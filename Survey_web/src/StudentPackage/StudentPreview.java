package StudentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StudentPreview {

	
        public static WebElement courselevel(WebDriver incognitoDriver) {
		
		return incognitoDriver.findElement(By.xpath("//button[text()='Course level']"));
		
	}
        
       public static WebElement Preview(WebDriver incognitoDriver) {
    		
    		return incognitoDriver.findElement(By.xpath("(//button[text()='preview'])[1]"));
    		
    	}
           
       public static WebElement Next(WebDriver incognitoDriver) {
   		
   		return incognitoDriver.findElement(By.xpath("//input[@title=\"Next\"]"));
   		
   	}
       
       public static WebElement previous(WebDriver incognitoDriver) {
      		
      		return incognitoDriver.findElement(By.xpath("//input[@title=\"Previous\"]"));
      		
      	}
       
       public static WebElement backbutton(WebDriver incognitoDriver) {
     		
     		return incognitoDriver.findElement(By.xpath("//i[@class=\" fa fa-arrow-left pr-3 pt-1 cursor-pointer\"]"));
     		
     	}

}
