package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;


public class ImmigrationObj {

	public WebDriver driver;
	String yearXpath="//ul[@class='oxd-calendar-selector']//li[2]/descendant::i";
	String monthXpath="//ul[@class='oxd-calendar-selector']//li[1]/descendant::i";
	String dateXpath="//div[@class='oxd-calendar-dates-grid']/div/div";
	String listXpath="//ul[@role='menu']/li";

	public ImmigrationObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Immigration")
	@CacheLookup
	public WebElement immigrationPage;

	@FindBy(xpath = "//h6[contains(.,'Immigration Records')]/parent::div//button[contains(.,'Add')]")
	@CacheLookup
	public WebElement immigrationAdd;

	@FindBy(xpath = "//h6[contains(.,'Attachments')]/parent::div//button[contains(.,'Add')]")
	@CacheLookup
	public WebElement attachmentsAdd;

	@FindBy(xpath = "//label[text()='Passport']/span")
	@CacheLookup
	public WebElement passport;

	@FindBy(xpath = "//label[text()='Visa']/span")
	@CacheLookup
	public WebElement visa;
	
	@FindBy(xpath = "//label[contains(.,'Number')]/ancestor::div[contains(@class,'field-bottom-space')]/descendant::input")
	@CacheLookup
	public WebElement number;

	@FindBy(xpath = "//label[contains(.,'Issued Date')]/ancestor::div[contains(@class,'field-bottom-space')]/descendant::i")
	@CacheLookup
	public WebElement issuedDate;

	@FindBy(xpath = "//label[contains(.,'Expiry Date')]/ancestor::div[contains(@class,'field-bottom-space')]/descendant::i")
	@CacheLookup
	public WebElement expiryDate;

	@FindBy(xpath = "//label[contains(.,'Eligible Status')]/ancestor::div[contains(@class,'field-bottom-space')]/descendant::input")
	@CacheLookup
	public WebElement eligibleStatus;

	@FindBy(xpath = "//label[contains(.,'Issued By')]/ancestor::div[contains(@class,'field-bottom-space')]/descendant::i")
	@CacheLookup
	public WebElement issuedBy;

	@FindBy(xpath = "//label[contains(.,'Eligible Review Date')]/ancestor::div[contains(@class,'field-bottom-space')]/descendant::i")
	@CacheLookup
	public WebElement eligibleReviewDate;

	@FindBy(xpath = "//textarea[@placeholder='Type Comments here']")
	@CacheLookup
	public WebElement immigrationTypeCommentsHere;

	@FindBy(xpath = "//h6[contains(.,'Add Immigration')]/parent::div//button[contains(.,'Cancel')]")
	@CacheLookup
	public WebElement immigrationCancel;
	
	@FindBy(xpath = "//h6[contains(.,'Add Immigration')]/parent::div//button[contains(.,'Save')]")
	@CacheLookup
	public WebElement immigrationSave;

	@FindBy(xpath = "//div[@class='oxd-file-button']")
	@CacheLookup
	public WebElement browse;

	@FindBy(xpath = "//textarea[@placeholder='Type comment here']")
	@CacheLookup
	public WebElement attachmentsTypeCommentHere;

	@FindBy(xpath = "//h6[contains(.,'Add Attachment')]/parent::div//button[contains(.,'Cancel')]")
	@CacheLookup
	public WebElement attachmentsCancel;
	
	@FindBy(xpath = "//h6[contains(.,'Add Attachment')]/parent::div//button[contains(.,'Save')]")
	@CacheLookup
	public WebElement attachmentsSave;

	public void setImmigrationPage() throws Exception {
	BaseClass.buttonFunctionality(immigrationPage);
	}

	public void setImmigrationAdd() throws Exception {
	BaseClass.buttonFunctionality(immigrationAdd);
	}

	public void setAttachmentsAdd() throws Exception {
	BaseClass.buttonFunctionality(attachmentsAdd);
	}

	public void setPassport() throws Exception {
	BaseClass.radioButtonFunctionality(passport);
	}

	public void setVisa() throws Exception {
	BaseClass.radioButtonFunctionality(visa);
	}

	public void setNumber(String txtNumber) throws Exception {
	BaseClass.textBoxFunctionality(number, txtNumber);
	Reporter.log("Number is:"+txtNumber);
	}

	public void setIssuedDate(String year,String month,String date) throws Exception {
	BaseClass.buttonFunctionality(issuedDate);
	BaseClass.dateOrCalenderControl(year, month, date, yearXpath, monthXpath, By.xpath(dateXpath), By.xpath(listXpath));
	Reporter.log("Issued date is:"+year+month+date);
	}

	public void setExpiryDate(String year, String month, String date) throws Exception {
	Thread.sleep(2000);
	BaseClass.buttonFunctionality(expiryDate);
	BaseClass.dateOrCalenderControl(year, month, date, yearXpath, monthXpath, By.xpath(dateXpath), By.xpath(listXpath));
	Reporter.log("Expiry date is:"+year+month+date);
	}

	public void setEligibleStatus(String txtEligibleStatus) throws Exception {
	BaseClass.textBoxFunctionality(eligibleStatus, txtEligibleStatus);
	Reporter.log("EligibleStatus"+txtEligibleStatus);
	}

	public void setIssuedBy() throws Exception {
	BaseClass.buttonFunctionality(issuedBy);
	}

	public void setEligibleReviewDate(String year, String month, String date) throws Exception {
	Thread.sleep(2000);
	BaseClass.buttonFunctionality(eligibleReviewDate);
	BaseClass.dateOrCalenderControl(year, month, date, yearXpath, monthXpath, By.xpath(dateXpath), By.xpath(listXpath));
	Reporter.log("Eligible Review Date is:"+year+month+date);
	}

	public void setImmigrationTypeCommentsHere(String txtImmigrationTypeCommentsHere) throws Exception {
	BaseClass.textBoxFunctionality(immigrationTypeCommentsHere, txtImmigrationTypeCommentsHere);
	}

	public void setImmigrationCancel() throws Exception {
	BaseClass.buttonFunctionality(immigrationCancel);
	}

	public void setImmigrationSave() throws Exception {
	BaseClass.buttonFunctionality(immigrationSave);
	}

	public void setBrowse() throws Exception {
	BaseClass.buttonFunctionality(browse);
	}

	public void setAttachmentsTypeCommentHere(String txtAttachmentsTypeCommentHere) throws Exception {
	BaseClass.textBoxFunctionality(attachmentsTypeCommentHere, txtAttachmentsTypeCommentHere);
	Reporter.log("Comment is:"+txtAttachmentsTypeCommentHere);
	}

	public void setAttachmentsCancel() throws Exception {
	BaseClass.buttonFunctionality(attachmentsCancel);
	}

	public void setAttachmentsSave() throws Exception {
	BaseClass.buttonFunctionality(attachmentsSave);
	}
	
	
}
