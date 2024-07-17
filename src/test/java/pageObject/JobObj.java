package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

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

	@FindBy(xpath = "//label[contains(.,'Joined Date')]/ancestor::div[contains(@class,'field-bottom-space')]/descendant::i")
	@CacheLookup
	public WebElement joinedDate;

	@FindBy(xpath = "//label[contains(.,'Job Title')]/ancestor::div[contains(@class,'field-bottom-space')]/descendant::i")
	@CacheLookup
	public WebElement jobTitle;

	@FindBy(xpath = "//div[@class='input-container --disabled']")
	@CacheLookup
	public WebElement notDefined;

	@FindBy(xpath = "//label[contains(.,'Job Category')]/ancestor::div[contains(@class,'field-bottom-space')]/descendant::i")
	@CacheLookup
	public WebElement jobCategory;

	@FindBy(xpath = "//label[contains(.,'Sub Unit')]/ancestor::div[contains(@class,'field-bottom-space')]/descendant::i")
	@CacheLookup
	public WebElement subUnit;

	@FindBy(xpath = "//label[contains(.,'Location')]/ancestor::div[contains(@class,'field-bottom-space')]/descendant::i")
	@CacheLookup
	public WebElement location;

	@FindBy(xpath = "//label[contains(.,'Employment Status')]/ancestor::div[contains(@class,'field-bottom-space')]/descendant::i")
	@CacheLookup
	public WebElement employmentStatus;

	@FindBy(xpath = "//div[contains(@class,'user-form-header')]/descendant::span")
	@CacheLookup
	public WebElement includeEmploymentContractDetails;

	@FindBy(xpath = "//h6[contains(.,'Job Details')]/parent::div//button[contains(.,'Save')]")
	@CacheLookup
	public WebElement jobDetailsSave;

	@FindBy(xpath = "//h6[contains(.,'Attachments')]/parent::div//button[contains(.,'Add')]")
	@CacheLookup
	public WebElement attachmentsAdd;

	@FindBy(css = "button[title='Terminate Employment']")
	@CacheLookup
	public WebElement employeeTermination;

	@FindBy(xpath = "//textarea[@placeholder='Type comment here']")
	@CacheLookup
	public WebElement typeCommentHere;

	@FindBy(xpath = "//h6[contains(.,'Add Attachment')]/ancestor::div[contains(@class,'orangehrm-attachment')]//button[contains(.,'Cancel')]")
	@CacheLookup
	public WebElement attachmentsCancel;

	@FindBy(xpath = "//h6[contains(.,'Add Attachment')]/ancestor::div[contains(@class,'orangehrm-attachment')]//button[contains(.,'Save')]")
	@CacheLookup
	public WebElement attachmentsSave;

	@FindBy(xpath = "//label[contains(.,'Contract Details')]/ancestor::div[contains(@class,'field-bottom-space')]/descendant::i")
	@CacheLookup
	public WebElement jobDetailsBrowse;

	@FindBy(xpath = "//label[contains(.,'Contract Start Date')]/ancestor::div[contains(@class,'field-bottom-space')]/descendant::i")
	@CacheLookup
	public WebElement contractStartDate;

	@FindBy(xpath = "//label[contains(.,'Contract End Date')]/ancestor::div[contains(@class,'field-bottom-space')]/descendant::i")
	@CacheLookup
	public WebElement contractEndDate;

	@FindBy(xpath = "//label[contains(.,'Select File')]/ancestor::div[contains(@class,'field-bottom-space')]/descendant::i")
	@CacheLookup
	public WebElement attachmentsBrowse;

	public void setJobPage() throws Exception {
	BaseClass.buttonFunctionality(jobPage);
	}

	public void setJoinedDate(String year, String month, String date) throws Exception {
	Thread.sleep(2000);
	BaseClass.buttonFunctionality(joinedDate);
	BaseClass.dateOrCalenderControl(year, month, date, yearXpath, monthXpath, By.xpath(dateXpath), By.xpath(listXpath));
	Reporter.log("Joined date is:"+year+month+date);
	}

	public void setJobTitle(String txtJobTitle) throws Exception {
	BaseClass.buttonFunctionality(jobTitle);
	BaseClass.selectValues(By.xpath("//div[@role='listbox']/descendant::span"), txtJobTitle);
	Reporter.log("Job title is:"+txtJobTitle);
	}

	public void setNotDefined(String txtNotDefined) throws Exception {
	BaseClass.textBoxFunctionality(notDefined, txtNotDefined);
	Reporter.log(txtNotDefined);
	}

	public void setJobCategory(String txtJobCategory) throws Exception {
	BaseClass.buttonFunctionality(jobCategory);
	BaseClass.selectValues(By.xpath("//div[@role='listbox']/descendant::span"), txtJobCategory);
	Reporter.log("Job category is:"+txtJobCategory);
	}

	public void setSubUnit(String txtSubUnit) throws Exception {
	BaseClass.buttonFunctionality(subUnit);
	BaseClass.selectValues(By.xpath("//div[@role='listbox']/descendant::span"), txtSubUnit);
	Reporter.log("Sub unit is:"+txtSubUnit);
	}

	public void setLocation(String txtLocation) throws Exception {
	BaseClass.buttonFunctionality(location);
	BaseClass.selectValues(By.xpath("//div[@role='listbox']/descendant::span"), txtLocation);
	Reporter.log("Location is:"+txtLocation);
	}

	public void setEmploymentStatus(String txtEmployeeStatus) throws Exception {
	BaseClass.buttonFunctionality(employmentStatus);
	BaseClass.selectValues(By.xpath("//div[@role='listbox']/descendant::span"), txtEmployeeStatus);
	Reporter.log("Employee status is:"+txtEmployeeStatus);
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
	Reporter.log("Comment is:"+txtTypeCommentHere);
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
	BaseClass.dateOrCalenderControl(year, month, date, yearXpath, monthXpath, By.xpath(dateXpath), By.xpath(listXpath));
	Reporter.log("ContractStartDate is:"+year+month+date);
	}

	public void setContractEndDate(String year, String month, String date) throws Exception {
	Thread.sleep(2000);
	BaseClass.buttonFunctionality(contractEndDate);
	BaseClass.dateOrCalenderControl(year, month, date, yearXpath, monthXpath, By.xpath(dateXpath), By.xpath(listXpath));
	Reporter.log("ContractEndDate is:"+year+month+date);
	}

	public void setAttachmentsBrowse() throws Exception {
	BaseClass.buttonFunctionality(attachmentsBrowse);
	}
	
	
}
