package stepDefinition;

import org.testng.Reporter;

import io.cucumber.java.en.*;
import junit.framework.Assert;
import pageObject.BaseClass;
import pageObject.Login_Page;
import pageObject.Logout_Page;

public class Login extends BaseClass{

	
	@Given("User launch the chrome browser")
	public void user_launch_the_chrome_browser() throws Exception {
	   BaseClass.openBrowser("chrome");
	}

	@When("User enter url as {string}")
	public void user_enter_url_as(String string) throws Exception {
	    BaseClass.implicitlyWait();
	    BaseClass.enterUrl(string);
	}

	@When("User enter valid username as {string}")
	public void user_enter_valid_username_as(String string) throws Exception {
	   Login_Page.userName(string);
	}

	@When("User enter valid password as {string}")
	public void user_enter_valid_password_as(String string) throws Exception {
		Login_Page.password(string);
	}

	@When("User click on login button")
	public void user_click_on_login_button() throws Exception {
	    Login_Page.loginBtn();
	}

	@Then("User should be logged in successfully")
	public void user_should_be_logged_in_successfully() {
	    Reporter.log("");
	}
	
	@Then("User should see an error message")
	public void user_should_see_an_error_message() {
	    if(driver.getPageSource().contains("Invalid credentials")  || driver.getPageSource().contains("Required"))
	    {
	    	driver.close();
	    }
	}

}
