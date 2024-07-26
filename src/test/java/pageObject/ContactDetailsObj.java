package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;


public class ContactDetailsObj extends BaseClass {

	public WebDriver driver;

	public ContactDetailsObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//label[.='Street 1']/ancestor::div[contains(@class,'input-field-bottom-space')]/descendant::input")
	@CacheLookup
	public WebElement street1;

	@FindBy(xpath = "//label[.='Street 2']/ancestor::div[contains(@class,'input-field-bottom-space')]/descendant::input")
	@CacheLookup
	public WebElement street2;

	@FindBy(xpath = "//label[.='City']/ancestor::div[contains(@class,'input-field-bottom-space')]/descendant::input")
	@CacheLookup
	public WebElement city;

	@FindBy(xpath="//label[.='State/Province']/ancestor::div[contains(@class,'input-field-bottom-space')]/descendant::input")
	@CacheLookup 
	public WebElement stateProvince;

	@FindBy(xpath="//label[.='Zip/Postal Code']/ancestor::div[contains(@class,'input-field-bottom-space')]/descendant::input")
	@CacheLookup 
	public WebElement zipPostalCode;

	@FindBy(xpath="//div[contains(@class,'select-text')]/descendant::i")
	@CacheLookup 
	public WebElement country;

	@FindBy(xpath="//label[.='Home']/ancestor::div[contains(@class,'input-field-bottom-space')]/descendant::input")
	@CacheLookup
	public WebElement home;

	@FindBy(xpath = "//label[.='Mobile']/ancestor::div[contains(@class,'input-field-bottom-space')]/descendant::input")
	@CacheLookup
	public WebElement mobile;

	@FindBy(xpath = "//label[.='Work']/ancestor::div[contains(@class,'input-field-bottom-space')]/descendant::input")
	@CacheLookup
	public WebElement work;

	@FindBy(xpath = "//label[.='Work Email']/ancestor::div[contains(@class,'input-field-bottom-space')]/descendant::input")
	@CacheLookup
	public WebElement workEmail;

	@FindBy(xpath = "//label[.='Other Email']/ancestor::div[contains(@class,'input-field-bottom-space')]/descendant::input")
	@CacheLookup
	public WebElement otherEmail;

	@FindBy(css = "//h6[.='Contact Details']/parent::div//button")
	@CacheLookup
	public WebElement contactDetailsSave;

	@FindBy(xpath = "//button[text()=' Add ']")
	@CacheLookup
	public WebElement add;
	
	@FindBy(linkText = "Contact Details")
	@CacheLookup
	public WebElement contactDetailsPage;
	
	@FindBy(xpath = "//div[text()='Browse']")
	@CacheLookup
	public WebElement browse;
	
	@FindBy(xpath = "//textarea[@placeholder='Type comment here']")
	@CacheLookup
	public WebElement comment;
	
	@FindBy(xpath = "//h6[.='Add Attachment']/parent::div//button[contains(.,'Cancel')]")
	@CacheLookup
	public WebElement attachmentCancel;
	
	@FindBy(xpath = "//h6[.='Add Attachment']/parent::div//button[contains(.,'Save')]")
	@CacheLookup
	public WebElement attachmentSave;

	public void setContactDetailsPage() {
		contactDetailsPage.click();
		Reporter.log("Contact details page is opened");
	}

	public void setStreet1(String txtStreet1) throws Exception {
		BaseClass.textBoxFunctionality(street1, txtStreet1);
		Reporter.log("Street1 name is:"+street1.getAttribute("value"));
	}

	public void setStreet2(String txtStreet2) throws Exception {
		BaseClass.textBoxFunctionality(street2, txtStreet2);
		Reporter.log("Street2 name is:"+street2.getAttribute("value"));
	}

	public void setCity(String txtCity) throws Exception {
		BaseClass.textBoxFunctionality(city, txtCity);
		Reporter.log("City name is:"+city.getAttribute("value"));
	}

	public void setStateProvince(String txtStateProvince) throws Exception {
		BaseClass.textBoxFunctionality(stateProvince, txtStateProvince);
		Reporter.log("StateProvince name is:"+stateProvince.getAttribute("value"));
	}

	public void setZipPostalCode(String txtZipPostalCode) throws Exception {
		BaseClass.textBoxFunctionality(zipPostalCode, txtZipPostalCode);
		Reporter.log("ZipPostalCode name is:"+zipPostalCode.getAttribute("value"));
	}

	public void setCountry(String countryName) {
		country.click();
		BaseClass.selectValues(By.xpath("//div[@role='option']//span"), countryName);
		Reporter.log("Country name is:"+countryName);
	}

	public void setHome(String txtHome) throws Exception {
		BaseClass.textBoxFunctionality(home, txtHome);
		Reporter.log("Home contact number is:"+home.getAttribute("value"));
	}

	public void setMobile(String txtMobile) throws Exception {
		BaseClass.textBoxFunctionality(mobile, txtMobile);
		Reporter.log("Mobile number is:"+mobile.getAttribute("value"));
	}

	public void setWork(String txtWork) throws Exception {
		BaseClass.textBoxFunctionality(work, txtWork);
		Reporter.log("Work contact number is:"+work.getAttribute("value"));
	}

	public void setWorkEmail(String txtWorkEmail) throws Exception {
		BaseClass.textBoxFunctionality(workEmail, txtWorkEmail);
		Reporter.log("Work email id is:"+workEmail.getAttribute("value"));
	}

	public void setOtherEmail(String txtOtherEmail) throws Exception {
		BaseClass.textBoxFunctionality(otherEmail, txtOtherEmail);
		Reporter.log("Other email id is:"+otherEmail.getAttribute("value"));
	}

	public void setContactDetailsSave() throws Exception {
		BaseClass.buttonFunctionality(contactDetailsSave);
		Reporter.log("Save button is clicked");
	}

	public void setAdd() throws Exception {
		BaseClass.scrollToBottomElement(add);
		BaseClass.buttonFunctionality(add);
	}

	public void setBrowse() throws Exception {
	BaseClass.buttonFunctionality(browse);
	
	}

	public void setComment(String txtComment) throws Exception {
	BaseClass.textBoxFunctionality(comment, txtComment);
	Reporter.log("Comment is:"+txtComment);
	}

	public void setAttachmentCancel() throws Exception {
	BaseClass.buttonFunctionality(attachmentCancel);
	
	}

	public void setAttachmentSave() throws Exception {
	BaseClass.buttonFunctionality(attachmentSave);
	
	}
	
	
}
