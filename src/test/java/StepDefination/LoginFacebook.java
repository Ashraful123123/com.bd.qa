package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginFacebook {

	WebDriver driver;// Here we declared our driver globally,because we need to lunch our Browser
		//We can use this step everytime,user visit facebook homepage.
	@Given("^user visit facebook homepage$")//We can always Reuse OpenUrl page,we don't need to 
	public void user_visit_facebook_homepage() throws Throwable {//write this step every time, 
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	@When("^user give username and password$")
	public void user_give_username_and_password() throws Throwable {
		driver.findElement(By.id("navbtn_exercises")).click();// it's a good practice,it clear anything
		driver.findElement(By.linkText("SQL Quiz")).click();

		Thread.sleep(3000);

	}

	@When("^user click on login$")
	public void user_click_on_login() throws Throwable {
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("window.scroll(0,400)");
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/p[2]/a")).click();

		Thread.sleep(3000);

	}

	@Then("^user should be able to login in facebook$")
	public void user_should_be_able_to_login_in_facebook() throws Throwable {
		boolean wrongPass = driver.findElement(By.id("qtext")).isDisplayed();
		Assert.assertTrue(wrongPass);
	}
	
	@Then("^verify Wthree school logo$")
	public void verify_Wthree_school_logo() throws Throwable {
		boolean logo = driver.findElement(By.xpath("//h1[text()='Learn to Cde']")).isDisplayed();
		Assert.assertTrue(logo);
		driver.close();
	}

}
