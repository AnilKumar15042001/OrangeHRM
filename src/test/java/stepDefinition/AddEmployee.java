package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.*;
import pageObject.AddEmployeeObj;
import pageObject.BaseClass;
import pageObject.LogoutObj;

public class AddEmployee extends BaseClass{
	
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
	public void user_click_on_pim_module() throws Exception {
	   AddEmployeeObj.setPIM_module();
	   By listXpath=By.xpath("//div[@role='rowgroup'][2]/div/div/div[2]");
	   String xpath="//div[@role='row']//div[contains(text(),'%s')]/parent::div[@role='cell']/parent::div//span";
	   BaseClass.selectCheckBox(driver, listXpath, null, xpath, "0312","0360");
	   Thread.sleep(5000);
	   
	}

	@When("user click on AddEmployee button")
	public void user_click_on_add_employee_button() {
	    AddEmployeeObj.setAddEmp_Submodule();
	}

	@Then("{string} page should be opened")
	public void page_should_be_opened(String string) throws Exception {
	    Assert.assertEquals(string, BaseClass.retrieveElementInnerText(By.xpath("//h6[text()='Add Employee']")));
	}

	@When("user fill the textboxes {string} {string} {string} {string}")
	public void user_fill_the_textboxes(String string, String string2, String string3, String string4) throws Exception {
	    
		AddEmployeeObj.setTxt_firstname(string);
		AddEmployeeObj.setTxt_middlename(string2);
		AddEmployeeObj.setTxt_lastname(string3);
		AddEmployeeObj.setTxt_empid(string4);
	}

	@When("user click on save button")
	public void user_click_on_save_button() throws Exception {
	    AddEmployeeObj.setSave_btn();
	}

	@Then("customer details should be added successfully and page displayed as {string}")
	public void customer_details_should_be_added_successfully_and_page_displayed_as(String string) throws Exception {
	    Assert.assertEquals(string, BaseClass.retrieveElementInnerText(By.xpath("//h6[text()='Personal Details']")));
	}

	@When("click on logout button")
	public void click_on_logout_button() {
	    LogoutObj.logout();
	}

	@When("close the browser")
	public void close_the_browser() {
	    BaseClass.closeApplication();
	}

}
