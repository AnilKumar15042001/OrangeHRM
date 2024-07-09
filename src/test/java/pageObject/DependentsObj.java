package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DependentsObj extends BaseClass {

	public WebDriver driver;

	public DependentsObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Dependents")
	@CacheLookup
	public WebElement dependentsPage;

	@FindBy(xpath = "(//button[contains(.,'Add')])[1]")
	@CacheLookup
	public WebElement dependentAdd;
	
	@FindBy(xpath = "(//button[contains(.,'Add')])[2]")
	@CacheLookup
	public WebElement attachmentAdd;
	
	@FindBy(xpath = "(//div[@class='oxd-form-row'][1]/descendant::input)[1]")
	@CacheLookup
	public WebElement name;
	
	@FindBy(xpath="//div[@class='oxd-select-wrapper']/descendant::i")
	@CacheLookup
	public WebElement relationship;

	@FindBy(xpath="//div[@class='oxd-date-wrapper']/descendant::i")
	@CacheLookup
	public WebElement dateOfBirth;

	@FindBy(xpath = "(//button[contains(.,'Cancel')])[1]")
	@CacheLookup
	public WebElement dependentCancel;

	@FindBy(xpath = "(//button[contains(.,'Save')])[1]")
	@CacheLookup
	public WebElement dependentSave;

	@FindBy(xpath = "//div[@class='oxd-file-button']")
	@CacheLookup
	public WebElement browse;

	@FindBy(xpath = "//textarea[@placeholder='Type comment here']")
	@CacheLookup
	public WebElement typeCommentHere;

	@FindBy(xpath = "(//button[contains(.,'Cancel')])[2]")
	@CacheLookup
	public WebElement attachmentCancel;

	@FindBy(xpath = "(//button[contains(.,'Save')])[2]")
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
	}

	public void setRelationship(String txtRelationship) throws Exception {
	BaseClass.buttonFunctionality(relationship);
	List<WebElement> options=driver.findElements(By.xpath("//div[@role='listbox']/descendant::span"));
	BaseClass.selectValues(options, txtRelationship);
	}

	public void setDateOfBirth(String year,String month,String date) throws Exception {
	BaseClass.buttonFunctionality(dateOfBirth);
	String monthXpath="//ul[@class='oxd-calendar-selector']/child::li[1]//i";
	String yearXpath="//ul[@class='oxd-calendar-selector']/child::li[2]//i";
	String dateXpath="//div[@class='oxd-calendar-dates-grid']/div/div";
	String listXpath="//ul[@role='menu']//li";
	BaseClass.dateOrCalenderControl(year, month, date, yearXpath, monthXpath, dateXpath, listXpath);
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
	}

	public void setAttachmentCancel() throws Exception {
	BaseClass.buttonFunctionality(attachmentCancel);
	}

	public void setAttachmentSave() throws Exception {
	BaseClass.buttonFunctionality(attachmentSave);
	}
	
	
}
