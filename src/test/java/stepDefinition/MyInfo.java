package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.*;
import junit.framework.Assert;
import pageObject.BaseClass;
import pageObject.LogoutObj;
import pageObject.PersonalDetailsObj;

public class MyInfo extends BaseClass{

	String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	String userName="Admin";
	String password="admin123";
	
	Login login=new Login();
	PersonalDetailsObj personalDetails;
	
	@Given("User logged in successfully")
	public void user_logged_in_successfully() throws Exception {
	    login.user_launch_the_chrome_browser();
	    login.user_enter_url_as(url);
	    login.user_enter_valid_username_as(userName);
	    login.user_enter_valid_password_as(password);
	    login.user_click_on_login_button();
	    login.user_should_be_logged_in_successfully();
	}

	@When("User clicked on My Info module")
	public void user_clicked_on_my_info_module() throws Exception {
	    WebElement myInfo=driver.findElement(By.linkText("My Info"));
	    BaseClass.buttonFunctionality(myInfo);
	}
	
	@Then("{string} page should be displayed")
	public void page_should_be_displayed(String string) throws Exception {
	   Assert.assertEquals(string, BaseClass.retrieveElementInnerText(By.xpath("//h6[text()='"+string+"']")));
	}
	
	@When("User edit first name as {string}")
	public void user_edit_first_name_as(String string) throws Exception {
		personalDetails=new PersonalDetailsObj(driver);
		personalDetails.setFirstName(string);
	}

	@When("User edit middle name as {string}")
	public void user_edit_middle_name_as(String string) throws Exception {
		personalDetails.setMiddleName(string);
	}

	@When("User edit last name as {string}")
	public void user_edit_last_name_as(String string) throws Exception {
		personalDetails.setLastName(string);
	}

	@When("User edit employee id as {string}")
	public void user_edit_employee_id_as(String string) throws Exception {
		personalDetails.setEmployeeId(string);
	}

	@When("User edit other id as {string}")
	public void user_edit_other_id_as(String string) throws Exception {
		personalDetails.setOtherId(string);
	}

	@When("User edit driver license number as {string}")
	public void user_edit_driver_license_number_as(String string) throws Exception {
		personalDetails.setDriversLicenseNumber(string);
	}

	@When("User edit license expiry date as year {string} , month {string} and date {string}")
	public void user_edit_license_expiry_date_as_year_month_and_date(String string, String string2, String string3) throws InterruptedException {
		personalDetails.setLicenseExpiryDate(string, string2, string3);
	}

	@When("User edit nationality as {string}")
	public void user_edit_nationality_as(String string) throws Exception {
		Thread.sleep(2000);
		personalDetails.setNationality(string);
	}

	@When("User edit marital status as {string}")
	public void user_edit_marital_status_as(String string) {
		personalDetails.setMaritalStatus(string);
	}

	@When("User edit date of birth as year {string} , month {string} and date {string}")
	public void user_edit_date_of_birth_as_year_month_and_date(String string, String string2, String string3) throws Exception {
		personalDetails.setDateOfBirth(string, string2, string3);
	}
	@When("User edit gender as {string}")
	public void user_edit_gender_as(String string) throws Exception {
		personalDetails.setMale();
	}
	
	@When("User click on personal details save button")
	public void user_click_on_personal_details_save_button() throws Exception {
		personalDetails.setPersonalDetailsSaveButton();
	}

	@Then("User should be seen a sucessfully updated message")
	public void user_should_be_seen_a_sucessfully_updated_message() {
	    
	}

	@When("User edit blood group as {string}")
	public void user_edit_blood_group_as(String string) {
		personalDetails.setBloodType(string);
	}

	@When("User fill the test_field as {string}")
	public void user_fill_the_test_field_as(String string) throws Exception {
		personalDetails.setTestField(string);
	}

	@When("User click on custom fields save button")
	public void user_click_on_custom_fields_save_button() throws Exception {
		personalDetails.setCustomFieldsSaveButton();
	}

	@When("User click on attachments add button")
	public void user_click_on_attachments_add_button() throws Exception {
		personalDetails.setAddButton();
	}

	@When("User click on browse button")
	public void user_click_on_browse_button() throws Exception {
		personalDetails.setBrowse();
	}

	@When("User upload his file")
	public void user_upload_his_file(String source,String output) throws Exception {
		personalDetails.setUploadButton(source, output);
	}

	@When("User enter the comments in comment text box field")
	public void user_enter_the_comments_in_comment_text_box_field(String string) throws Exception {
		personalDetails.setComment(string);
	}

	@When("User click on attachments save button")
	public void user_click_on_attachments_save_button() throws Exception {
		personalDetails.setAddAttachmentSaveButton();
	}

	@Then("User click on logout link and close the application")
	public void user_click_on_logout_link_and_close_the_application() {
	    LogoutObj.logout();
	    BaseClass.closeApplication();
	}

}
