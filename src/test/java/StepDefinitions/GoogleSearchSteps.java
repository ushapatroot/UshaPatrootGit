package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchSteps {
	
	WebDriver driver=null;

	@SuppressWarnings("deprecation")
	@Given("browser is open")
	public void browser_is_open() {
		String projectPath=System.getProperty("user.dir");
		//D:\SelJavaCucumber\CucumberJava\src\test\resources\drivers\chromedriver.exe
		
		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		
	}
	@And("user is on google page")
	public void user_is_on_google_page() {
		driver.navigate().to("https://google.com");
		
	}

	@When("user enters text to search")
	public void user_enters_text_to_search() {
		driver.findElement(By.name("q")).sendKeys("Lord Ganesha Images");
	}

	@And("hits enter")
	public void hits_enter() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
	}

	@Then("search results displayed")
	public void search_results_displayed() {
		System.out.println("search results displayed successfully");
	}
	@And("close browser")
	public void close_browser() {
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.close();
		
	}

}
