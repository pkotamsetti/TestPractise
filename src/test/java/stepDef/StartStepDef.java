package stepDef;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StartStepDef {

	WebDriver driver;

	By CookiesAcceptButton = By.cssSelector("a.cc-btn.cc-dismiss");
	By escape = By.cssSelector(".content-wrapper");
	By logRegislink = By.cssSelector("#myAccountDropdown > button > span > svg");
	By regisElement = By.cssSelector("a._1k1reGo[href*='https://my.asos.com/identity']");
	By emailele = By.xpath("//*[@id=\"Email\"]");

	@Given("^The new user is on homepage$")
	public void the_new_user_is_on_homepage() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:/Users/prasadkfsc/Desktop/Automation/driver/ChromeDriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-infobars");
		WebDriver driver = new ChromeDriver(options);
//		driver.get("https://www.asos.com/");
		driver.get(
				"https://my.asos.com/identity/register?lang=en-GB&store=COM&country=GB&keyStoreDataversion=ckp5egq-11&returnUrl=https%3A%2F%2Fwww.asos.com%2F");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
		
//
//		WebElement target = driver.findElement(logRegislink);
//		Actions action = new Actions(driver);
//		action.moveToElement(target).build().perform();
//
//		WebDriverWait wait = new WebDriverWait(driver, 20);
//		WebElement regisLink = wait.until(ExpectedConditions.elementToBeClickable(regisElement));
//		regisLink.click();
//	    Added a method for screenshot 
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(screenshotFile, new File("D:\\Screenshot.jpg"));

	}

	@When("^User enters the valid details$")
	public void user_enters_the_valid_details(DataTable userData) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		
		List<Map<String,String>> data = userData.asMaps(String.class,String.class);
		driver.findElement(emailele).sendKeys(data.get(0).get("Email"));
	    
	}

	@Then("^User must be registered$")
	public void user_must_be_registered() throws Throwable {

	}

}
