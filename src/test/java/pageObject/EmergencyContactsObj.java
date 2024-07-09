package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmergencyContactsObj {

	public WebDriver driver;

	public EmergencyContactsObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//div[@class='oxd-form-row']/descendant::input)[1]")
	@CacheLookup
	public WebElement name;

	@FindBy(xpath = "(//div[@class='oxd-form-row']/descendant::input)[2]")
	@CacheLookup
	public WebElement relationship;

	@FindBy(xpath = "(//div[@class='oxd-form-row']/descendant::input)[3]")
	@CacheLookup
	public WebElement homeTelephone;

	@FindBy(xpath = "(//div[@class='oxd-form-row']/descendant::input)[4]")
	@CacheLookup
	public WebElement mobile;

	@FindBy(xpath = "(//div[@class='oxd-form-row']/descendant::input)[5]")
	@CacheLookup
	public WebElement workTelephone;

	@FindBy(xpath = "//button[contains(.,'Cancel')]")
	@CacheLookup
	public WebElement emergencyContactsCancel;

	@FindBy(xpath = "(//button[@type='submit'])[1]")
	@CacheLookup
	public WebElement emergencyContactsSave;

	@FindBy(xpath = "(//button[text()=' Add '])[1]")
	@CacheLookup
	public WebElement emergencyContactsAdd;
	
	@FindBy(xpath = "(//button[text()=' Add '])[2]")
	@CacheLookup
	public WebElement attachmentsAdd;

	@FindBy(xpath = "//div[@class='oxd-file-button']")
	@CacheLookup
	public WebElement browse;

	@FindBy(xpath = "//textarea[@placeholder='Type comment here']")
	@CacheLookup
	public WebElement typeCommentHere;

	@FindBy(xpath = "//button[contains(.,'Cancel')]")
	@CacheLookup
	public WebElement attachmentsCancel;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	@CacheLookup
	public WebElement attachmentsSave;
	
	@FindBy(linkText = "Emergency Contacts")
	@CacheLookup
	public WebElement emergencyContactsPage;

	public void setEmergencyContactsPage() throws Exception {
	BaseClass.buttonFunctionality(emergencyContactsPage);
	}

	public void setAttachmentsAdd() throws Exception {
	BaseClass.buttonFunctionality(attachmentsAdd);
	}

	public void setName(String txtName) throws Exception {
	BaseClass.textBoxFunctionality(name, txtName);
	}

	public void setRelationship(String txtRelationship) throws Exception {
	BaseClass.textBoxFunctionality(relationship, txtRelationship);
	}

	public void setHomeTelephone(String txtHomeTelephone) throws Exception {
	BaseClass.textBoxFunctionality(homeTelephone, txtHomeTelephone);
	}

	public void setMobile(String txtMobile) throws Exception {
	BaseClass.textBoxFunctionality(mobile, txtMobile);
	}

	public void setWorkTelephone(String txtWorkTelephone) throws Exception {
	BaseClass.textBoxFunctionality(workTelephone, txtWorkTelephone);
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
	}

	public void setAttachmentsCancel() throws Exception {
	BaseClass.buttonFunctionality(attachmentsCancel);
	}

	public void setAttachmentsSave() throws Exception {
	BaseClass.buttonFunctionality(attachmentsSave);
	}
	
	
}
