package stepDefinition;

import org.openqa.selenium.By;
import org.testng.Reporter;

import io.cucumber.java.en.*;
import junit.framework.Assert;
import pageObject.BaseClass;
import pageObject.LoginObj;
import pageObject.LogoutObj;

public class Login extends BaseClass{
	
	public String userName;
	public String password;

	public Login login;
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
	   LoginObj.userName(string);
	}

	@When("User enter valid password as {string}")
	public void user_enter_valid_password_as(String string) throws Exception {
		LoginObj.password(string);
	}

	@When("User click on login button")
	public void user_click_on_login_button() throws Exception {
		userName=LoginObj.getTxt_un();
    	password=LoginObj.getTxt_pwd();
	    LoginObj.loginBtn();
	}

	@Then("User should be logged in successfully")
	public void user_should_be_logged_in_successfully() {
		System.out.println(LoginObj.getTxt_un());
	}
	
	@Then("User should see an error message")
	public void user_should_see_an_error_message() throws Exception {
	    if(driver.getPageSource().contains("Invalid credentials") || driver.getPageSource().contains("Required"))
	    {
	    	System.out.println("User entered username is:"+userName);
	    	System.out.println("User entered password is:"+password);
	    	driver.close();
	    }
	}
	
	@When("User click on logout link")
	public void user_click_on_logout_link() {
	    LogoutObj.logout();
	}

	@Then("User close the browser")
	public void user_close_the_browser() {
	    driver.close();
	}
	
	@But("User should be logged in successfully with invalid details")
	public void user_should_be_logged_in_successfully_with_invalid_details() throws Exception {
	    
		if(BaseClass.isElementPresent(By.xpath("//h6[text()='Dashboard']")))
	    {
			BaseClass.implicitlyWait();
			LogoutObj.logout();
			driver.close();
	    	Assert.assertTrue(false);
	    }
//		else
//		{
//			login=new Login();
//			Thread.sleep(2000);
//			login.user_should_see_an_error_message();
//		}
	}

}
