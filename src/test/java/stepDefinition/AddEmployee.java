package stepDefinition;

import io.cucumber.java.en.*;

public class AddEmployee {
	
	Login login=new Login();

	@Given("The user enter url as {string}")
	public void the_user_enter_url_as(String string) throws Exception {
	    login.user_launch_the_chrome_browser();
	    login.user_enter_url_as(string);
	}

	@Given("The user is logged in with valid username as {string} and password as {string}")
	public void the_user_is_logged_in_with_valid_username_as_and_password_as(String string, String string2) throws Exception {
	    login.user_enter_valid_username_as(string);
	    login.user_enter_valid_password_as(string2);
	    login.user_click_on_login_button();
	}

	@When("user click on PIM module")
	public void user_click_on_pim_module() {
	    
	}

	@When("user click on AddEmployee button")
	public void user_click_on_add_employee_button() {
	    
	}

	@Then("{string} page should be opened")
	public void page_should_be_opened(String string) {
	    
	}

	@When("user fill the textboxes {string} {string} {string} {string}")
	public void user_fill_the_textboxes(String string, String string2, String string3, String string4) {
	    
	}

	@When("user click on save button")
	public void user_click_on_save_button() {
	    
	}

	@Then("customer details should be added successfully and page displayed as {string}")
	public void customer_details_should_be_added_successfully_and_page_displayed_as(String string) {
	    
	}

	@When("click on logout button")
	public void click_on_logout_button() {
	    
	}

	@When("close the browser")
	public void close_the_browser() {
	    
	}

}
