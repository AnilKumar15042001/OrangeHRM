package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


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

	@FindBy(xpath = "(//button[text()=' Add '])[1]")
	@CacheLookup
	public WebElement immigrationAdd;

	@FindBy(xpath = "(//button[text()=' Add '])[2]")
	@CacheLookup
	public WebElement attachmentsAdd;

	@FindBy(xpath = "//label[text()='Passport']/span")
	@CacheLookup
	public WebElement passport;

	@FindBy(xpath = "//label[text()='Visa']/span")
	@CacheLookup
	public WebElement visa;
	
	@FindBy(xpath = "(//div[@class='oxd-grid-item oxd-grid-item--gutters']/descendant::input)[3]")
	@CacheLookup
	public WebElement number;

	@FindBy(xpath = "(//div[@class='oxd-date-wrapper']//i)[1]")
	@CacheLookup
	public WebElement issuedDate;

	@FindBy(xpath = "(//div[@class='oxd-date-wrapper']//i)[2]")
	@CacheLookup
	public WebElement expiryDate;

	@FindBy(xpath = "(//div[@class='oxd-grid-item oxd-grid-item--gutters']/descendant::input)[6]")
	@CacheLookup
	public WebElement eligibleStatus;

	@FindBy(xpath = "//div[@class='oxd-select-wrapper']//i")
	@CacheLookup
	public WebElement issuedBy;

	@FindBy(xpath = "(//div[@class='oxd-date-wrapper']//i)[3]")
	@CacheLookup
	public WebElement eligibleReviewDate;

	@FindBy(xpath = "//textarea[@placeholder='Type Comments here']")
	@CacheLookup
	public WebElement immigrationTypeCommentsHere;

	@FindBy(xpath = "(//button[text()=' Cancel '])[1]")
	@CacheLookup
	public WebElement immigrationCancel;
	
	@FindBy(xpath = "(//button[@type='submit'])[1]")
	@CacheLookup
	public WebElement immigrationSave;

	@FindBy(xpath = "//div[@class='oxd-file-button']")
	@CacheLookup
	public WebElement browse;

	@FindBy(xpath = "//textarea[@placeholder='Type comment here']")
	@CacheLookup
	public WebElement attachmentsTypeCommentHere;

	@FindBy(xpath = "(//button[text()=' Cancel '])[2]")
	@CacheLookup
	public WebElement attachmentsCancel;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
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
	}

	public void setIssuedDate(String year,String month,String date) throws Exception {
	BaseClass.buttonFunctionality(issuedDate);
	BaseClass.dateOrCalenderControl(year, month, date, yearXpath, monthXpath, dateXpath, listXpath);
	}

	public void setExpiryDate(String year, String month, String date) throws Exception {
	Thread.sleep(3000);
	BaseClass.buttonFunctionality(expiryDate);
	BaseClass.dateOrCalenderControl(year, month, date, yearXpath, monthXpath, dateXpath, listXpath);
	}

	public void setEligibleStatus(String txtEligibleStatus) throws Exception {
	BaseClass.textBoxFunctionality(eligibleStatus, txtEligibleStatus);
	}

	public void setIssuedBy() throws Exception {
	BaseClass.buttonFunctionality(issuedBy);
	}

	public void setEligibleReviewDate(String year, String month, String date) throws Exception {
	Thread.sleep(3000);
	BaseClass.buttonFunctionality(eligibleReviewDate);
	BaseClass.dateOrCalenderControl(year, month, date, yearXpath, monthXpath, dateXpath, listXpath);
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
	}

	public void setAttachmentsCancel(WebElement attachmentsCancel) throws Exception {
	BaseClass.buttonFunctionality(attachmentsCancel);
	}

	public void setAttachmentsSave(WebElement attachmentsSave) throws Exception {
	BaseClass.buttonFunctionality(attachmentsSave);
	}
	
	
}
