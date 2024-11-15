package Page_objects_Model;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class LoginDigival {

	public static WebElement username(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@type =\"input\"]"));
		
	}

	public static WebElement Password( WebDriver driver) {
		
		return driver.findElement(By.xpath("//input [@type= \"password\"]"));
	}
	
	public static WebElement Submit(WebDriver driver) {
		
		return driver.findElement(By.xpath("//button [@type= 'submit']"));
	}


	

//	
//    public static WebElement Homepage(WebDriver driver) {
//		
//		return driver.findElement(By.xpath("(//div[@class=\"px-2 py-2\"])[1]"));
//	}
	
//	@FindBy(xpath = ("/input[@type =\"input\"]"))
//	public static WebElement username ;
//	
//	@FindBy(xpath = ("//input [@type= \"password\"]"))	
//	public static WebElement password;
//
//	@FindBy(xpath = ("//button [@type= 'submit']"))
//	public static WebElement submitbutton;
//	
	
	}

