package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobObj {

	public WebDriver driver;
	String yearXpath="//ul[@class='oxd-calendar-selector']//li[2]/descendant::i";
	String monthXpath="//ul[@class='oxd-calendar-selector']//li[1]/descendant::i";
	String dateXpath="//div[@class='oxd-calendar-dates-grid']/div/div";
	String listXpath="//ul[@role='menu']/li";

	public JobObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Job")
	@CacheLookup
	public WebElement jobPage;

	@FindBy(xpath = "(//div[@class='oxd-date-wrapper']/descendant::i)[1]")
	@CacheLookup
	public WebElement joinedDate;

	@FindBy(xpath = "(//div[@class='oxd-select-wrapper']/descendant::i)[1]")
	@CacheLookup
	public WebElement jobTitle;

	@FindBy(xpath = "//div[@class='input-container --disabled']")
	@CacheLookup
	public WebElement notDefined;

	@FindBy(xpath = "(//div[@class='oxd-select-wrapper']/descendant::i)[2]")
	@CacheLookup
	public WebElement jobCategory;

	@FindBy(xpath = "(//div[@class='oxd-select-wrapper']/descendant::i)[3]")
	@CacheLookup
	public WebElement subUnit;

	@FindBy(xpath = "(//div[@class='oxd-select-wrapper']/descendant::i)[4]")
	@CacheLookup
	public WebElement location;

	@FindBy(xpath = "(//div[@class='oxd-select-wrapper']/descendant::i)[5]")
	@CacheLookup
	public WebElement employmentStatus;

	@FindBy(xpath = "//div[contains(@class,'user-form-header')]/descendant::span")
	@CacheLookup
	public WebElement includeEmploymentContractDetails;

	@FindBy(xpath = "(//button[@type='submit'])[1]")
	@CacheLookup
	public WebElement jobDetailsSave;

	@FindBy(xpath = "//button[contains(.,'Add')]")
	@CacheLookup
	public WebElement attachmentsAdd;

	@FindBy(css = "button[title='Terminate Employment']")
	@CacheLookup
	public WebElement employeeTermination;

	@FindBy(xpath = "//textarea[@placeholder='Type comment here']")
	@CacheLookup
	public WebElement typeCommentHere;

	@FindBy(xpath = "//button[contains(.,'Cancel')]")
	@CacheLookup
	public WebElement attachmentsCancel;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	@CacheLookup
	public WebElement attachmentsSave;

	@FindBy(xpath = "(//div[contains(text(),'Browse')])[1]")
	@CacheLookup
	public WebElement jobDetailsBrowse;

	@FindBy(xpath = "(//div[@class='oxd-date-wrapper']/descendant::i)[2]")
	@CacheLookup
	public WebElement contractStartDate;

	@FindBy(xpath = "(//div[@class='oxd-date-wrapper']/descendant::i)[3]")
	@CacheLookup
	public WebElement contractEndDate;

	@FindBy(xpath = "(//div[contains(text(),'Browse')])[2]")
	@CacheLookup
	public WebElement attachmentsBrowse;

	public void setJobPage() throws Exception {
	BaseClass.buttonFunctionality(jobPage);
	}

	public void setJoinedDate(String year, String month, String date) throws Exception {
	Thread.sleep(2000);
	BaseClass.buttonFunctionality(joinedDate);
	BaseClass.dateOrCalenderControl(year, month, date, yearXpath, monthXpath, dateXpath, listXpath);
	}

	public void setJobTitle() throws Exception {
	BaseClass.buttonFunctionality(jobTitle);
	}

	public void setNotDefined(String txtNotDefined) throws Exception {
	BaseClass.textBoxFunctionality(notDefined, txtNotDefined);
	}

	public void setJobCategory() throws Exception {
	BaseClass.buttonFunctionality(jobCategory);
	}

	public void setSubUnit() throws Exception {
	BaseClass.buttonFunctionality(subUnit);
	}

	public void setLocation() throws Exception {
	BaseClass.buttonFunctionality(location);
	}

	public void setEmploymentStatus() throws Exception {
	BaseClass.buttonFunctionality(employmentStatus);
	}

	public void setIncludeEmploymentContractDetails() throws Exception {
	Thread.sleep(2000);
	BaseClass.radioButtonFunctionality(includeEmploymentContractDetails);
	}

	public void setJobDetailsSave() throws Exception {
	BaseClass.buttonFunctionality(jobDetailsSave);
	}

	public void setAttachmentsAdd() throws Exception {
	BaseClass.buttonFunctionality(attachmentsAdd);
	}

	public void setEmployeeTermination() throws Exception {
	BaseClass.buttonFunctionality(employeeTermination);
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

	public void setJobDetailsBrowse() throws Exception {
	BaseClass.buttonFunctionality(jobDetailsBrowse);
	}

	public void setContractStartDate(String year, String month, String date) throws Exception {
	Thread.sleep(2000);
	BaseClass.buttonFunctionality(contractStartDate);
	BaseClass.dateOrCalenderControl(year, month, date, yearXpath, monthXpath, dateXpath, listXpath);
	}

	public void setContractEndDate(String year, String month, String date) throws Exception {
	Thread.sleep(2000);
	BaseClass.buttonFunctionality(contractEndDate);
	BaseClass.dateOrCalenderControl(year, month, date, yearXpath, monthXpath, dateXpath, listXpath);
	}

	public void setAttachmentsBrowse() throws Exception {
	BaseClass.buttonFunctionality(attachmentsBrowse);
	}
	
	
}
