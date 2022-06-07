package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WthreeSchoolSearch {
	WebDriver driver;
	
	@Given("^user visit wthree homepage$")//We can always Reuse OpenUrl page,we don't need to 
	public void user_visit_wthree_homepage() throws Throwable {//write this step every time, 
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		
	}		
	@When("^user give keyword in search field$")
	public void user_give_keyword_in_search_field() throws Throwable {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@onkeydown='key_pressed_in_search(event)']")).sendKeys("MysqlTutorial");

	}

	@When("^user click on search$")
	public void user_click_on_search() throws Throwable {
		driver.findElement(By.id("learntocode_searchbtn")).click();
	}

	@Then("^user should redirect to that page$")//span[@class='color_h1']
	public void user_should_redirect_to_that_page() throws Throwable {
		
	    boolean mysql = driver.findElement(By.xpath("//*[@id=\"main\"]/h1/span")).isDisplayed();
	    Assert.assertTrue(mysql);
	}


}
