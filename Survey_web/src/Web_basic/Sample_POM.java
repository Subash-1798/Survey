package Web_basic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Page_objects_Model.AddQuestion;
import Page_objects_Model.LoginDigival;
import Page_objects_Model.OutcomeSelection;
import Page_objects_Model.Publishsurvey;
import Page_objects_Model.Reportspage;
import Page_objects_Model.Runnerflow;
import Page_objects_Model.SurveyCreator;
import Page_objects_Model.SurveyHome;
import Page_objects_Model.SurveyRunner;
import StudentPackage.Loginstudent;
import StudentPackage.StudentAnswer;
import StudentPackage.StudentPreview;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;

public class Sample_POM {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments(Arrays.asList("disable-infobars", "ignore-certificate-errors", "start-maximized",
				"use-fake-ui-for-media-stream"));
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebDriverWait Wait;

		String baseURL = "https://digival-staging-nginx-ds-yk25kmkzeq-el.a.run.app/dev-dcweb/auth/login";
		driver.get(baseURL);
		driver.manage().window().maximize();
		String mainWindowHandle = driver.getWindowHandle();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		Wait = new WebDriverWait(driver, Duration.ofSeconds(100));

		LoginDigival.username(driver).sendKeys("sf61@mail.com");
		LoginDigival.Password(driver).sendKeys("12345678");
		LoginDigival.Submit(driver).click();
		Wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='DigiClass']"))).click();

//			Thread.sleep(25000);
//			LoginDigival.Homepage(driver).click();
//			SurveyHome SurveyHome = new SurveyHome();

		SurveyHome.Sideicon(driver).click();
		SurveyHome.Surveybutton(driver).click();
		SurveyHome.SurveyManagement(driver).click();
		Thread.sleep(5000);
		SurveyHome.Surveybank(driver).click();
		SurveyHome.SurveyTemplate(driver).click();
		Thread.sleep(5000);

		// create Survey first step

//			SurveyCreator SurveyCreator = new SurveyCreator();

		SurveyCreator.CreateSurvey(driver).click();
		SurveyCreator.CreateTemplate(driver).click();
		SurveyCreator.EnterSurveyTitle(driver).sendKeys("Survey Automation");
		SurveyCreator.EnterDescription(driver).sendKeys("Testing");
		SurveyCreator.SurveyLevel(driver).click();
		SurveyCreator.Surveytypeselection(driver).click();
		SurveyCreator.Surveytype(driver).click();
		SurveyCreator.LearningOutcome(driver).click();
		SurveyCreator.MappingOutcome(driver).click();
		SurveyCreator.TagMapping(driver).click();
		SurveyCreator.StartCreation(driver).click();

		// Add New Question

//			AddQuestion AddQuestion = new AddQuestion();

		driver.findElement(By.xpath("//span[text()='Add Question']")).click();

		WebElement Ratingscale = driver.findElement(By.xpath("(//span[text()= 'question_1'])[1]"));
		Ratingscale.click();
		Ratingscale.sendKeys(Keys.CONTROL + "a");
		Ratingscale.sendKeys(Keys.DELETE);
		Ratingscale.sendKeys(
				" Which phase of the Software Development Life Cycle (SDLC) is most suitable for Automation Testing?");
		Thread.sleep(5000);

		AddQuestion.Duplicate(driver).click();
		AddQuestion.Required(driver).click();
		AddQuestion.Delete(driver).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("(//span[text()='Add Question'])[1]")).click();
		WebElement inputElement = Wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()='question_2'])[1]")));
		inputElement.click();
		inputElement.sendKeys(Keys.CONTROL + "a");
		inputElement.sendKeys(Keys.DELETE);
		inputElement.sendKeys(" What does SDLC stands for?");

		AddQuestion.Longtext1(driver).click();
		driver.findElement(By.xpath("(//div[@class=\"sv-list__item-body\"])[12]")).click();
		WebElement Longtext = driver.findElement(By.xpath("(//span[text()= 'question_3'])[1]"));
		Longtext.click();
		Longtext.sendKeys(Keys.CONTROL + "a");
		Longtext.sendKeys(Keys.DELETE);
		Longtext.sendKeys(" Agile Software Development is based on which of the following type?");
		AddQuestion.CreateTemplateSurvey(driver).click();

//	      Survey Runner flow

//	        Runnerflow Runnerflow = new Runnerflow();

		WebElement chooseElement = driver.findElement(By.xpath("//*[@class=\"fa fa-angle-down profile_icon \"]"));

		WebElement chooseElement1 = driver.findElement(By.xpath("//*[@class=\"fa fa-angle-down profile_icon \"]"));
		Actions action = new Actions(driver);
		action.moveToElement(chooseElement1).perform();
		Thread.sleep(10000);
		WebElement subElement = driver
				.findElement(By.xpath("//div[normalize-space()='Logged in as Survey Template Creator']"));
		action.moveToElement(subElement).perform();
		Thread.sleep(5000);
		WebElement runnerElement = driver.findElement(By.xpath("//li[normalize-space()='Survey Template Runner']"));
		action.moveToElement(runnerElement).perform();
		runnerElement.click();

		Thread.sleep(5000);
		WebElement sideiconbutton = Wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class=\"fa fa-angle-right\"]")));
		sideiconbutton.click();
		Runnerflow.surveybutton1(driver).click();
		Runnerflow.surveymangement1(driver).click();
		Thread.sleep(5000);
		Runnerflow.SurveyBank1(driver).click();
		Runnerflow.SurveyTemplates1(driver).click();
		Thread.sleep(5000);
		Runnerflow.CourseLevel1(driver).click();
		Thread.sleep(5000);

//		    Surveyrunner

		WebElement academiccalendar = Wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='LMS_CALENDAR-2(2024-2025)']")));
		academiccalendar.click();
		action.moveToElement(academiccalendar).perform();
		driver.findElement(By.xpath(
				"(//li[@class=\"MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz\"])[1]"))
				.click();
		Thread.sleep(5000);

//		    SurveyRunner SurveyRunner = new SurveyRunner();

		SurveyRunner.Runsurvey(driver).click();
		SurveyRunner.SelectProgram(driver).click();
		SurveyRunner.Programname(driver).click();
//		    Thread.sleep(5000);
		SurveyRunner.Selectterm(driver).click();
		SurveyRunner.Regular(driver).click();
		SurveyRunner.Selectyear(driver).click();
		SurveyRunner.Year(driver).click();
		SurveyRunner.SelectLevel(driver).click();
		SurveyRunner.Level(driver).click();
		SurveyRunner.SelectCourse(driver).click();
		SurveyRunner.Coursename(driver).click();
		SurveyRunner.Surveyversionname(driver).sendKeys("Automation testing");

		WebElement PLO = driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[1]"));
		action.moveToElement(PLO).perform();
		PLO.click();

		WebElement PLO2 = driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[3]"));
		action.moveToElement(PLO2).perform();
		PLO2.click();

		SurveyRunner.Page2(driver).click();
		WebElement SA1 = driver.findElement(By.xpath("//span[text() = 'Section A']"));
		js.executeScript("arguments[0].scrollIntoView(true);", SA1);
		Thread.sleep(5000);
		SurveyRunner.settings(driver).click();

		WebElement Outcomebutton = driver.findElement(
				By.xpath("//div[@class=\"border d-flex align-items-center justify-content-between p-2 rounded\"]"));
		Outcomebutton.click();
		Thread.sleep(5000);

		OutcomeSelection.courseout(driver).click();
		Thread.sleep(5000);
		OutcomeSelection.framework(driver).click();
		OutcomeSelection.Knowledge(driver).click();
		OutcomeSelection.Clo1checkbox(driver).click();
		OutcomeSelection.Tag(driver).click();
		OutcomeSelection.TagSelection(driver).click();
		OutcomeSelection.save1(driver).click();
		Thread.sleep(5000);
		SurveyRunner.nextPage3(driver).click();
		WebElement PLO3 = driver.findElement(By.xpath("(//input[@class=\"PrivateSwitchBase-input css-1m9pwf3\"])[1]"));
		action.doubleClick(PLO3).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);

//			Step 4
//			Clock 1		

		Publishsurvey.clock1select(driver).click();
		Publishsurvey.clock1label(driver).click();
		WebElement clock1 = driver.findElement(By.xpath("//input[@placeholder=\"hh:mm (a|p)m\"]"));
		Thread.sleep(5000);
		clock1.sendKeys(Keys.CONTROL + "a");
		clock1.sendKeys(Keys.DELETE);
		clock1.sendKeys("09:55 AM");
		Publishsurvey.clock1ok(driver).click();
		Thread.sleep(5000);

//			Clock 2

		Publishsurvey.clock2select(driver).click();
		Publishsurvey.clock2label(driver).click();
		WebElement clock2 = driver.findElement(By.xpath(
				"(//input[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall MuiInputBase-inputAdornedEnd css-b52kj1\"])[5]"));
		Thread.sleep(5000);
		clock2.sendKeys(Keys.CONTROL + "a");
		clock2.sendKeys(Keys.DELETE);
		clock2.sendKeys("09:57 AM");
		Publishsurvey.clock2ok(driver).click();
		Publishsurvey.publish(driver).click();

		// Set up ChromeOptions for incognito mode
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--incognito");
		WebDriver incognitoDriver = new ChromeDriver(chromeOptions);

		// Open a new window in Incognito mode
		incognitoDriver.get("https://digival-staging-nginx-ds-yk25kmkzeq-el.a.run.app/dev-dcweb/auth/login");
		incognitoDriver.manage().window().maximize();
		String secondWindowHandle = driver.getWindowHandle();
		incognitoDriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		// Student Login

		Loginstudent.username(incognitoDriver).sendKeys("st40@mail.com");
		Loginstudent.Password(incognitoDriver).sendKeys("12345678");
		Loginstudent.Submit(incognitoDriver).click();
		Thread.sleep(10000);
		Loginstudent.studentsideicon(incognitoDriver).click();
		Loginstudent.survey(incognitoDriver).click();
		Loginstudent.Mysurvey(incognitoDriver).click();
		Thread.sleep(5000);
		Loginstudent.Courselevel(incognitoDriver).click();

		WebElement academicCalendar1 = incognitoDriver.findElement(By.xpath("//div[text()=\"new calendar\"]"));
		Actions actions1 = new Actions(incognitoDriver);
		actions1.moveToElement(academicCalendar1).perform();
		Thread.sleep(5000);
		academicCalendar1.click();

		// Select an item from the dropdown
		incognitoDriver.findElement(By.xpath("//li[text()='LMS_CALENDAR-1(2024-2025)']")).click();
		Thread.sleep(5000);

		// Fill in the survey questions
		StudentAnswer.GOTOSURVEY(incognitoDriver).click();
		StudentAnswer.StronglyAgree(incognitoDriver).click();
		StudentAnswer.Neutral(incognitoDriver).click();
		StudentAnswer.StronglyDisAgree(incognitoDriver).click();

		StudentAnswer.NextPage(incognitoDriver).click();
		StudentAnswer.Agree(incognitoDriver).click();
		StudentAnswer.DisAgree(incognitoDriver).click();
		StudentAnswer.OpenendAnswer(incognitoDriver).sendKeys("The Testing is  done by Automation");
		StudentAnswer.Complete(incognitoDriver).click();
		Thread.sleep(5000);
		incognitoDriver.findElement(By.xpath("(//*[name()='svg'])[10]")).click();

//	      Switch back to the main window
		driver.switchTo().window(mainWindowHandle);
		driver.navigate().refresh();

//	        Reports Page

		Reportspage.Reporticon(driver).click();
		Thread.sleep(3000);
		Reportspage.ViewReports(driver).click();
		Thread.sleep(5000);

		WebElement Learningoutcomesection = driver.findElement(By.xpath("(//div/h6[text() = 'Overall Response'])[3]"));
		js.executeScript("arguments[0].scrollIntoView(true);", Learningoutcomesection);
		Thread.sleep(5000);
		WebElement Learningoutcomesection1 = driver.findElement(By.xpath("//div/h6[text() = 'Overall Response Rate']"));
		js.executeScript("arguments[0].scrollIntoView(true);", Learningoutcomesection1);
		Thread.sleep(5000);

		Reportspage.Section1(driver).click();
		Thread.sleep(5000);

		Reportspage.staticAnalysis(driver).click();
		Thread.sleep(5000);
		WebElement Questionnaire = driver
				.findElement(By.xpath("//h6[text()='Questionnaire - Mean & Standard Deviation']"));
		js.executeScript("arguments[0].scrollIntoView(true);", Questionnaire);
		Thread.sleep(5000);
		WebElement IndividualQuestions = driver.findElement(By.xpath("//div/span[text()='Individual Questions']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(IndividualQuestions, 500, 0).click().perform();
		Thread.sleep(5000);
		Reportspage.individualquestion(driver).click();

		WebElement i1 = driver.findElement(By.xpath("//div[text() = 'What does SDLC stands for?']"));
		js.executeScript("arguments[0].scrollIntoView(true);", i1);
		Thread.sleep(5000);
		WebElement IndividualResponders = driver.findElement(By.xpath("//span[text()='Individual Responders']"));
		actions.moveToElement(IndividualResponders, 500, 0).click().perform();
		Thread.sleep(5000);
		Reportspage.individualresponders(driver).click();
		Thread.sleep(5000);
		Reportspage.viewreports1(driver).click();
		Thread.sleep(5000);
		Reportspage.backbutton1(driver).click();
		Thread.sleep(5000);
		Reportspage.SentimentAnalysis(driver).click();
		Thread.sleep(5000);
		Reportspage.down1(driver).click();
		Thread.sleep(5000);
		WebElement Emoji = driver.findElement(By.xpath("//div[text()='View By Individual Response']"));
		js.executeScript("arguments[0].scrollIntoView(true);", Emoji);
		Thread.sleep(5000);
		WebElement Sentiment = driver.findElement(By.xpath("//span[text()='Sentiment Analysis']"));
		actions.moveToElement(Sentiment, 500, 0).click();
		Thread.sleep(5000);

//	        student Preview
		driver.switchTo().window(secondWindowHandle);
		StudentPreview.courselevel(incognitoDriver).click();
		Thread.sleep(5000);
		StudentPreview.Preview(incognitoDriver).click();
		StudentPreview.Next(incognitoDriver).click();
		StudentPreview.previous(incognitoDriver).click();
		StudentPreview.backbutton(incognitoDriver).click();

	}

}
