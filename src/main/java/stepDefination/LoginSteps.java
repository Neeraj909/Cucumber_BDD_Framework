package stepDefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginSteps {
	WebDriver driver ;
	@Given("^User is already on Login page$")
	public void user_already_on_login_page(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\11017\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.get("https://crmpro.com/index.html");		
		driver.manage().window().maximize();
	}

	@When("^Title of login page is free CRM$")
	public void Title_of_login_page(){
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);
	}
	
	/*@Then("^user enters \"(.*)\" and  \"(.*)\"$")
	public void user_enters_username_and_pass(String username,String Pass) {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(Pass);

	}*/
	@Then("^user enters username and  pass$")
	public void user_enters_username_and_pass(DataTable credential)  {
		List<List<String>> data= credential.raw();
		driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
	}
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button(){
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", loginBtn);

	}

	
	@Then("^user is on Home page$")
	public void user_is_on_home_page() {
		String title = driver.getTitle();
		System.out.println("CRM LOGIN PAGE TITLE======>"+title);
		// Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);
	}
	@Then("^user move new Deals page$")
	public void user_move_new_Deals_page(){
		driver.switchTo().frame("mainpanel");
	    Actions action = new Actions(driver);
	    action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
	    driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
	}
	
	/*@Then("^user move new contact page$")
	public void user_move_new_contact_page() {
	    driver.switchTo().frame("mainpanel");
	    Actions action = new Actions(driver);
	    action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
	    driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
	}*/
	/*@Then("^user enters contact \"([^\"]*)\" and  \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_contact_and_and(String arg1, String arg2, String arg3) {
	  driver.findElement(By.id("first_name")).sendKeys(arg1);
	  driver.findElement(By.id("surname")).sendKeys("arg2");
	  driver.findElement(By.id("company_position")).sendKeys("arg3");
	  driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
	}*/
	@Then("^user enters deals details$")
	public void user_enters_deals_details(DataTable table) {
		List<List<String>> data= table.raw();
		driver.findElement(By.id("title")).sendKeys(data.get(0).get(0));
		driver.findElement(By.id("amount")).sendKeys(data.get(0).get(1));
		driver.findElement(By.id("probability")).sendKeys(data.get(0).get(2));
		driver.findElement(By.id("commission")).sendKeys(data.get(0).get(3));
	
	}
	@Then("^close the browser$")
	public void close_the_browser()  {
		driver.close();
	}
}
