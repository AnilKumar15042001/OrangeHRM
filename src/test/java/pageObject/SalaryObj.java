package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class SalaryObj {

	public WebDriver driver;

	public SalaryObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Salary")
	@CacheLookup
	public WebElement salaryPage;

	@FindBy(xpath = "//h6[contains(.,'Salary Components')]/parent::div//button[contains(.,'Add')]")
	@CacheLookup
	public WebElement salaryComponentAdd;

	@FindBy(xpath = "//h6[contains(.,'Attachments')]/parent::div//button[contains(.,'Add')]")
	@CacheLookup
	public WebElement attachmentsAdd;

	@FindBy(xpath = "//label[contains(.,'Salary Component')]/ancestor::div[contains(@class,'field-bottom-space')]/descendant::input")
	@CacheLookup
	public WebElement salaryComponent;

	@FindBy(xpath = "//label[contains(.,'Pay Grade')]/ancestor::div[contains(@class,'field-bottom-space')]/descendant::i")
	@CacheLookup
	public WebElement payGrade;

	@FindBy(xpath = "//label[contains(.,'Pay Frequency')]/ancestor::div[contains(@class,'field-bottom-space')]/descendant::i")
	@CacheLookup
	public WebElement payFrequency;

	@FindBy(xpath = "//label[contains(.,'Currency')]/ancestor::div[contains(@class,'field-bottom-space')]/descendant::i")
	@CacheLookup
	public WebElement currency;

	@FindBy(xpath = "//h6[contains(.,'Salary Component')]/parent::div//textarea")
	@CacheLookup
	public WebElement salaryComponentComments;

	@FindBy(xpath = "//label[contains(.,'Account Type')]/ancestor::div[contains(@class,'field-bottom-space')]/descendant::i")
	@CacheLookup
	public WebElement accountType;

	@FindBy(xpath = "//h6[contains(.,'Salary Component')]/parent::div//button[contains(.,'Cancel')]")
	@CacheLookup
	public WebElement salaryComponentCancel;

	@FindBy(xpath = "//h6[contains(.,'Add Attachment')]/parent::div//button[contains(.,'Cancel')]")
	@CacheLookup
	public WebElement attachmentsCancel;

	@FindBy(xpath = "//h6[contains(.,'Salary Component')]/parent::div//button[contains(.,'Save')]")
	@CacheLookup
	public WebElement salaryComponentSave;

	@FindBy(xpath = "//h6[contains(.,'Add Attachment')]/parent::div//button[contains(.,'Save')]")
	@CacheLookup
	public WebElement attachmentsSave;

	@FindBy(xpath = "//div[@class='oxd-switch-wrapper']/descendant::span")
	@CacheLookup
	public WebElement includeDirectDepositDetails;

	@FindBy(xpath = "//label[contains(.,'Account Number')]/ancestor::div[contains(@class,'field-bottom-space')]/descendant::input")
	@CacheLookup
	public WebElement accountNumber;

	@FindBy(xpath = "//label[contains(.,'Routing Number')]/ancestor::div[contains(@class,'field-bottom-space')]/descendant::input")
	@CacheLookup
	public WebElement routingNumber;

	@FindBy(xpath = "//div[contains(@class,'directdeposit-form-header')]/following-sibling::div[1]//label[contains(.,'Amount')]/ancestor::div[contains(@class,'field-bottom-space')]/descendant::input")
	@CacheLookup
	public WebElement amount2;

	@FindBy(xpath = "//div[@class='oxd-file-button']")
	@CacheLookup
	public WebElement browse;

	@FindBy(xpath = "//label[contains(.,'Amount')]/ancestor::div[contains(@class,'field-bottom-space')]/descendant::input")
	@CacheLookup
	public WebElement amount;

	@FindBy(xpath = "//textarea[@placeholder='Type comment here']")
	@CacheLookup
	public WebElement attachmentsComment;

	public void setSalaryPage() throws Exception {
	BaseClass.buttonFunctionality(salaryPage);
	}

	public void setSalaryComponentAdd() throws Exception {
	BaseClass.buttonFunctionality(salaryComponentAdd);
	}

	public void setAttachmentsAdd() throws Exception {
	BaseClass.buttonFunctionality(attachmentsAdd);
	}

	public void setSalaryComponent(String txtSalaryComponent) throws Exception {
	BaseClass.textBoxFunctionality(salaryComponent, txtSalaryComponent);
	Reporter.log("Salary component is:"+txtSalaryComponent);
	}

	public void setPayGrade(String txtPayGrade) throws Exception {
	BaseClass.buttonFunctionality(payGrade);
	BaseClass.selectValues(By.xpath("//div[@role='listbox']/descendant::span"), txtPayGrade);
	Reporter.log("Pay garde is:"+txtPayGrade);
	}

	public void setPayFrequency(String txtPayFrequency) throws Exception {
	BaseClass.buttonFunctionality(payFrequency);
	BaseClass.selectValues(By.xpath("//div[@role='listbox']/descendant::span"), txtPayFrequency);
	Reporter.log("Pay frequency is:"+txtPayFrequency);
	}

	public void setCurrency(String txtCurrency) throws Exception {
	BaseClass.buttonFunctionality(currency);
	BaseClass.selectValues(By.xpath("//div[@role='listbox']/descendant::span"), txtCurrency);
	Reporter.log("Currency is:"+txtCurrency);
	}

	public void setSalaryComponentComments(String txtSalaryComponentComment) throws Exception {
	BaseClass.textBoxFunctionality(salaryComponentComments, txtSalaryComponentComment);
	Reporter.log("SalaryComponentComment is:"+txtSalaryComponentComment);
	}

	public void setAccountType(String txtAccountType) throws Exception {
	BaseClass.buttonFunctionality(accountType);
	BaseClass.selectValues(By.xpath("//div[@role='listbox']/descendant::span"), txtAccountType);
	Reporter.log("Account type is:"+txtAccountType);
	}

	public void setSalaryComponentCancel() throws Exception {
	BaseClass.buttonFunctionality(salaryComponentCancel);
	}

	public void setAttachmentsCancel() throws Exception {
	BaseClass.buttonFunctionality(attachmentsCancel);
	}

	public void setSalaryComponentSave() throws Exception {
	BaseClass.buttonFunctionality(salaryComponentSave);
	}

	public void setAttachmentsSave() throws Exception {
	BaseClass.buttonFunctionality(attachmentsSave);
	}

	public void setIncludeDirectDepositDetails() throws Exception {
	BaseClass.radioButtonFunctionality(includeDirectDepositDetails);
	}

	public void setAccountNumber(String txtAccountNumber) throws Exception {
	BaseClass.textBoxFunctionality(accountNumber, txtAccountNumber);
	Reporter.log("AccountNumber is:"+txtAccountNumber);
	}

	public void setRoutingNumber(String txtRoutingNumber) throws Exception {
	BaseClass.textBoxFunctionality(routingNumber, txtRoutingNumber);
	Reporter.log("Routing number is:"+txtRoutingNumber);
	}

	public void setAmount2(String txtAmount2) throws Exception {
	BaseClass.textBoxFunctionality(amount2, txtAmount2);
	Reporter.log("2nd Amount is:"+txtAmount2);
	}

	public void setBrowse() throws Exception {
	BaseClass.buttonFunctionality(browse);
	}

	public void setAmount(String txtAmount) throws Exception {
	BaseClass.textBoxFunctionality(amount, txtAmount);
	Reporter.log("1st Amount is:"+txtAmount);
	}

	public void setAttachmentsComment(String txtAttachmentsComment) throws Exception {
	BaseClass.textBoxFunctionality(attachmentsComment, txtAttachmentsComment);
	Reporter.log("AttachmentsComment is:"+txtAttachmentsComment);
	}
	
	
}
