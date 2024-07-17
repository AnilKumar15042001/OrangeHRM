package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class DependentsObj extends BaseClass {

	public WebDriver driver;

	public DependentsObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Dependents")
	@CacheLookup
	public WebElement dependentsPage;

	@FindBy(xpath = "//h6[contains(.,'Dependents')]/parent::div//button[contains(.,'Add')]")
	@CacheLookup
	public WebElement dependentAdd;
	
	@FindBy(xpath = "//h6[contains(.,'Attachments')]/parent::div//button[contains(.,'Add')]")
	@CacheLookup
	public WebElement attachmentAdd;
	
	@FindBy(xpath = "//label[contains(.,'Name')]/ancestor::div[contains(@class,'field-bottom-space')]/descendant::input")
	@CacheLookup
	public WebElement name;
	
	@FindBy(xpath="//div[@class='oxd-select-wrapper']/descendant::i")
	@CacheLookup
	public WebElement relationship;

	@FindBy(xpath="//div[@class='oxd-date-wrapper']/descendant::i")
	@CacheLookup
	public WebElement dateOfBirth;

	@FindBy(xpath = "//h6[contains(.,'Add Dependent')]/parent::div//button[contains(.,'Cancel')]")
	@CacheLookup
	public WebElement dependentCancel;

	@FindBy(xpath = "//h6[contains(.,'Add Dependent')]/parent::div//button[contains(.,'Save')]")
	@CacheLookup
	public WebElement dependentSave;

	@FindBy(xpath = "//div[@class='oxd-file-button']")
	@CacheLookup
	public WebElement browse;

	@FindBy(xpath = "//textarea[@placeholder='Type comment here']")
	@CacheLookup
	public WebElement typeCommentHere;

	@FindBy(xpath = "//h6[contains(.,'Add Attachment')]/parent::div//button[contains(.,'Cancel')]")
	@CacheLookup
	public WebElement attachmentCancel;

	@FindBy(xpath = "//h6[contains(.,'Add Attachment')]/parent::div//button[contains(.,'Save')]")
	@CacheLookup
	public WebElement attachmentSave;

	public void setDependentsPage() throws Exception {
	BaseClass.buttonFunctionality(dependentsPage);
	}

	public void setDependentAdd() throws Exception {
	BaseClass.buttonFunctionality(dependentAdd);
	}

	public void setAttachmentAdd() throws Exception {
	BaseClass.buttonFunctionality(attachmentAdd);
	}

	public void setName(String txtName) throws Exception {
	BaseClass.textBoxFunctionality(name, txtName);
	Reporter.log("Name is:"+txtName);
	}

	public void setRelationship(String txtRelationship) throws Exception {
	BaseClass.buttonFunctionality(relationship);
	BaseClass.selectValues(By.xpath("//div[@role='listbox']/descendant::span"), txtRelationship);
	Reporter.log("Relationship is:"+txtRelationship);
	}

	public void setDateOfBirth(String year,String month,String date) throws Exception {
	BaseClass.buttonFunctionality(dateOfBirth);
	String monthXpath="//ul[@class='oxd-calendar-selector']/child::li[1]//i";
	String yearXpath="//ul[@class='oxd-calendar-selector']/child::li[2]//i";
	String dateXpath="//div[@class='oxd-calendar-dates-grid']/div/div";
	String listXpath="//ul[@role='menu']//li";
	BaseClass.dateOrCalenderControl(year, month, date, yearXpath, monthXpath, By.xpath(dateXpath), By.xpath(listXpath));
	Reporter.log("Date of birth is:"+year+month+date);
	}

	public void setDependentCancel() throws Exception {
	BaseClass.buttonFunctionality(dependentCancel);
	}

	public void setDependentSave() throws Exception {
	BaseClass.buttonFunctionality(dependentSave);
	}

	public void setBrowse() throws Exception {
	BaseClass.buttonFunctionality(browse);
	}

	public void setTypeCommentHere(String txtTypeCommentHere) throws Exception {
	BaseClass.textBoxFunctionality(typeCommentHere, txtTypeCommentHere);
	Reporter.log("Comment is:"+txtTypeCommentHere);
	}

	public void setAttachmentCancel() throws Exception {
	BaseClass.buttonFunctionality(attachmentCancel);
	}

	public void setAttachmentSave() throws Exception {
	BaseClass.buttonFunctionality(attachmentSave);
	}
	
	
}
