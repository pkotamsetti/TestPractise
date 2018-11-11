package stepDef;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StartStepDef {

	By CookiesAcceptButton = By.cssSelector("a.cc-btn.cc-dismiss");
	By escape = By.cssSelector(".content-wrapper");

	@Given("^The new user is on homepage$")
	public void the_new_user_is_on_homepage() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:/Users/prasadkfsc/Desktop/Automation/driver/ChromeDriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-infobars");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.summit.co.uk/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
		driver.findElement(CookiesAcceptButton).click();

		try {

			driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			Actions action = new Actions(driver);
			By locator = By.cssSelector(".context-menu-one");
			Thread.sleep(2000);
			WebDriverWait wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(2000);
			WebElement rightClickElement = driver.findElement(locator);

			action.contextClick(rightClickElement).build().perform();
			WebElement getCopyText = driver.findElement(By.cssSelector(".context-menu-icon-copy"));

			String GetText = getCopyText.getText();
			Thread.sleep(2000);
			System.out.println(GetText);

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@When("^User enters the valid details$")
	public void user_enters_the_valid_details(DataTable arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)

	}

	@Then("^User must be registered$")
	public void user_must_be_registered() throws Throwable {

	}

}
