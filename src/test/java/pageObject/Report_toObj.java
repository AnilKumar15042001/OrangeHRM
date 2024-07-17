package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Report_toObj extends BaseClass {

	public WebDriver driver;

	public Report_toObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Report-to")
	@CacheLookup
	public WebElement reportToPage;

	@FindBy(xpath = "//h6[contains(.,'Supervisors')]/parent::div//button[contains(.,'Add')]")
	@CacheLookup
	public WebElement supervisorsAdd;

	@FindBy(xpath = "//h6[contains(.,'Subordinates')]/parent::div//button[contains(.,'Add')]")
	@CacheLookup
	public WebElement subordinatesAdd;

	@FindBy(xpath = "//h6[contains(.,'Attachments')]/parent::div//button[contains(.,'Add')]")
	@CacheLookup
	public WebElement attachmentsAdd;

	@FindBy(xpath = "//h6[contains(.,'Supervisor')]/parent::div//input")
	@CacheLookup
	public WebElement supervisorName;

	@FindBy(xpath = "//h6[contains(.,'Supervisor')]/parent::div//div[contains(@class,'field-bottom-space')]/descendant::i")
	@CacheLookup
	public WebElement supervisorReportingMethod;

	@FindBy(xpath = "//h6[contains(.,'Supervisor')]/parent::div//button[contains(.,'Cancel')]")
	@CacheLookup
	public WebElement supervisorCancel;

	@FindBy(xpath = "//h6[contains(.,'Supervisor')]/parent::div//button[contains(.,'Save')]")
	@CacheLookup
	public WebElement supervisorSave;
	
	@FindBy(xpath = "//h6[contains(.,'Subordinate')]/parent::div//input")
	@CacheLookup
	public WebElement subordinatName;
	
	@FindBy(xpath = "//h6[contains(.,'Subordinate')]/parent::div//div[contains(@class,'field-bottom-space')]/descendant::i")
	@CacheLookup
	public WebElement subordinatReportingMethod;
	
	@FindBy(xpath = "//h6[contains(.,'Subordinate')]/parent::div//button[contains(.,'Cancel')]")
	@CacheLookup
	public WebElement subordinatCancel;
	
	@FindBy(xpath = "//h6[contains(.,'Subordinate')]/parent::div//button[contains(.,'Save')]")
	@CacheLookup
	public WebElement subordinatSave;
	
	@FindBy(xpath="//div[@class='oxd-file-button']")
	@CacheLookup 
	public WebElement browse;
	
	@FindBy(xpath="//textarea[@placeholder='Type comment here']")
	@CacheLookup
	public WebElement typeCommentHere;
	
	@FindBy(xpath = "//h6[contains(.,'Attachment')]/parent::div//button[contains(.,'Cancel')]")
	@CacheLookup
	public WebElement attachmentCancel;
	
	@FindBy(xpath = "//h6[contains(.,'Attachment')]/parent::div//button[contains(.,'Save')]")
	@CacheLookup
	public WebElement attachmentSave;

	public void setReportToPage() throws Exception {
	BaseClass.buttonFunctionality(reportToPage);
	
	}

	public void setSupervisorsAdd() throws Exception {
	BaseClass.buttonFunctionality(supervisorsAdd);
	
	}

	public void setSubordinatesAdd() throws Exception {
	BaseClass.buttonFunctionality(subordinatesAdd);
	
	}

	public void setAttachmentsAdd() throws Exception {
	BaseClass.buttonFunctionality(attachmentsAdd);
	
	}

	public void setSupervisorName(String name) throws Exception {
	BaseClass.textBoxFunctionality(supervisorName, name);
	Reporter.log("SupervisorName is:"+name);
	}

	public void setSupervisorReportingMethod(String reportingMethod) throws Exception {
	BaseClass.buttonFunctionality(supervisorReportingMethod);
	BaseClass.selectValues(By.xpath("//div[@role='option']/descendant::span"), reportingMethod);
	Reporter.log("SupervisorReportingMethod is:"+reportingMethod);
	}

	public void setSupervisorCancel() throws Exception {
	BaseClass.buttonFunctionality(supervisorCancel);
	
	}

	public void setSupervisorSave() throws Exception {
	BaseClass.buttonFunctionality(supervisorSave);
	
	}

	public void setSubordinatName(String name) throws Exception {
	BaseClass.textBoxFunctionality(subordinatName, name);
	Reporter.log("SubordinatName is:"+name);
	}

	public void setSubordinatReportingMethod(String reportingMethod) throws Exception {
	BaseClass.buttonFunctionality(subordinatReportingMethod);
	BaseClass.selectValues(By.xpath("//div[@role='option']/descendant::span"), reportingMethod);
	Reporter.log("SubordinatReportingMethod is:"+reportingMethod);
	}

	public void setSubordinatCancel() throws Exception {
	BaseClass.buttonFunctionality(subordinatCancel);
	
	}

	public void setSubordinatSave() throws Exception {
	BaseClass.buttonFunctionality(subordinatSave);
	
	}

	public void setBrowse() throws Exception {
	BaseClass.buttonFunctionality(browse);
	
	}

	public void setTypeCommentHere(String comment) throws Exception {
	BaseClass.textBoxFunctionality(typeCommentHere, comment);
	Reporter.log("Comment is"+comment);
	}

	public void setAttachmentCancel() throws Exception {
	BaseClass.buttonFunctionality(attachmentCancel);
	
	}

	public void setAttachmentSave() throws Exception {
	BaseClass.buttonFunctionality(attachmentSave);
	
	}
	
	
}
