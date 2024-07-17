package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class EmergencyContactsObj {

	public WebDriver driver;

	public EmergencyContactsObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//label[.='Name']/ancestor::div[contains(@class,'input-field-bottom-space')]/descendant::input")
	@CacheLookup
	public WebElement name;

	@FindBy(xpath = "//label[.='Relationship']/ancestor::div[contains(@class,'input-field-bottom-space')]/descendant::input")
	@CacheLookup
	public WebElement relationship;

	@FindBy(xpath = "//label[.='Home Telephone']/ancestor::div[contains(@class,'input-field-bottom-space')]/descendant::input")
	@CacheLookup
	public WebElement homeTelephone;

	@FindBy(xpath = "//label[.='Mobile']/ancestor::div[contains(@class,'input-field-bottom-space')]/descendant::input")
	@CacheLookup
	public WebElement mobile;

	@FindBy(xpath = "//label[.='Work Telephone']/ancestor::div[contains(@class,'input-field-bottom-space')]/descendant::input")
	@CacheLookup
	public WebElement workTelephone;

	@FindBy(xpath = "//h6[contains(.,'Emergency Contact')]/parent::div//button[contains(.,'Cancel')]")
	@CacheLookup
	public WebElement emergencyContactsCancel;

	@FindBy(xpath = "//h6[contains(.,'Emergency Contact')]/parent::div//button[contains(.,'Save')]")
	@CacheLookup
	public WebElement emergencyContactsSave;

	@FindBy(xpath = "//h6[contains(.,'Emergency Contacts')]/parent::div//button[contains(.,'Add')]")
	@CacheLookup
	public WebElement emergencyContactsAdd;
	
	@FindBy(xpath = "//h6[contains(.,'Attachments')]/parent::div//button[contains(.,'Add')]")
	@CacheLookup
	public WebElement attachmentsAdd;

	@FindBy(xpath = "//div[@class='oxd-file-button']")
	@CacheLookup
	public WebElement browse;

	@FindBy(xpath = "//textarea[@placeholder='Type comment here']")
	@CacheLookup
	public WebElement typeCommentHere;

	@FindBy(xpath = "//h6[contains(.,'Add Attachment')]/parent::div//button[contains(.,'Cancel')]")
	@CacheLookup
	public WebElement attachmentsCancel;

	@FindBy(xpath = "//h6[contains(.,'Add Attachment')]/parent::div//button[contains(.,'Save')]")
	@CacheLookup
	public WebElement attachmentsSave;
	
	@FindBy(linkText = "Emergency Contacts")
	@CacheLookup
	public WebElement emergencyContactsPage;

	public void setEmergencyContactsPage() throws Exception {
	BaseClass.buttonFunctionality(emergencyContactsPage);
	Reporter.log("Emergency Contact page is displayed");
	}

	public void setAttachmentsAdd() throws Exception {
	BaseClass.buttonFunctionality(attachmentsAdd);
	Reporter.log("User clicked Attachment Add button");
	}

	public void setName(String txtName) throws Exception {
	BaseClass.textBoxFunctionality(name, txtName);
	Reporter.log("Name is:"+txtName);
	}

	public void setRelationship(String txtRelationship) throws Exception {
	BaseClass.textBoxFunctionality(relationship, txtRelationship);
	Reporter.log("Relationship is:"+txtRelationship);
	}

	public void setHomeTelephone(String txtHomeTelephone) throws Exception {
	BaseClass.textBoxFunctionality(homeTelephone, txtHomeTelephone);
	Reporter.log("HomeTelephone is:"+txtHomeTelephone);
	}

	public void setMobile(String txtMobile) throws Exception {
	BaseClass.textBoxFunctionality(mobile, txtMobile);
	Reporter.log("Mobile is:"+txtMobile);
	}

	public void setWorkTelephone(String txtWorkTelephone) throws Exception {
	BaseClass.textBoxFunctionality(workTelephone, txtWorkTelephone);
	Reporter.log("WorkTelephone is:"+txtWorkTelephone);
	}

	public void setEmergencyContactsCancel() throws Exception {
	BaseClass.buttonFunctionality(emergencyContactsCancel);
	}

	public void setEmergencyContactsSave() throws Exception {
	BaseClass.buttonFunctionality(emergencyContactsSave);
	}

	public void setEmergencyContactsAdd() throws Exception {
	BaseClass.buttonFunctionality(emergencyContactsAdd);
	}

	public void setBrowse() throws Exception {
	BaseClass.buttonFunctionality(browse);
	}

	public void setTypeCommentHere(String txtTypeCommentHere) throws Exception {
	BaseClass.textBoxFunctionality(typeCommentHere, txtTypeCommentHere);
	Reporter.log("Comment is:"+txtTypeCommentHere);
	}

	public void setAttachmentsCancel() throws Exception {
	BaseClass.buttonFunctionality(attachmentsCancel);
	}

	public void setAttachmentsSave() throws Exception {
	BaseClass.buttonFunctionality(attachmentsSave);
	}
	
	
}
