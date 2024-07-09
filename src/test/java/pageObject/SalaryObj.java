package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalaryObj {

	public WebDriver driver;

	public SalaryObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Salary")
	@CacheLookup
	public WebElement salaryPage;

	@FindBy(xpath = "(//button[contains(.,'Add')])[1]")
	@CacheLookup
	public WebElement salaryComponentAdd;

	@FindBy(xpath = "(//button[contains(.,'Add')])[2]")
	@CacheLookup
	public WebElement attachmentsAdd;

	@FindBy(xpath = "//div[@class='oxd-form-row']/descendant::input[1]")
	@CacheLookup
	public WebElement salaryComponent;

	@FindBy(xpath = "(//div[@class='oxd-select-wrapper']/descendant::i)[1]")
	@CacheLookup
	public WebElement payGrade;

	@FindBy(xpath = "(//div[@class='oxd-select-wrapper']/descendant::i)[2]")
	@CacheLookup
	public WebElement payFrequency;

	@FindBy(xpath = "(//div[@class='oxd-select-wrapper']/descendant::i)[3]")
	@CacheLookup
	public WebElement currency;

	@FindBy(xpath = "//textarea[contains(@class,'oxd-textarea--resize-vertical')]")
	@CacheLookup
	public WebElement salaryComponentComments;

	@FindBy(xpath = "(//div[@class='oxd-select-wrapper']/descendant::i)[4]")
	@CacheLookup
	public WebElement accountType;

	@FindBy(xpath = "(//button[contains(.,'Cancel')])[1]")
	@CacheLookup
	public WebElement salaryComponentCancel;

	@FindBy(xpath = "(//button[contains(.,'Cancel')])[2]")
	@CacheLookup
	public WebElement attachmentsCancel;

	@FindBy(xpath = "(//button[@type='submit'])[1]")
	@CacheLookup
	public WebElement salaryComponentSave;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	@CacheLookup
	public WebElement attachmentsSave;

	@FindBy(xpath = "//div[@class='oxd-switch-wrapper']/descendant::span")
	@CacheLookup
	public WebElement includeDirectDepositDetails;

	@FindBy(xpath = "(//div[@class='oxd-form-row']/descendant::input)[3]")
	@CacheLookup
	public WebElement accountNumber;

	@FindBy(xpath = "(//div[@class='oxd-form-row']/descendant::input)[4]")
	@CacheLookup
	public WebElement routingNumber;

	@FindBy(xpath = "//div[@class='oxd-form-row']/descendant::input[3]")
	@CacheLookup
	public WebElement amount2;

	@FindBy(xpath = "//div[@class='oxd-file-button']")
	@CacheLookup
	public WebElement browse;

	@FindBy(xpath = "//div[@class='oxd-form-row']/descendant::input[2]")
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
	}

	public void setPayGrade(String txtPayGrade) throws Exception {
	BaseClass.buttonFunctionality(payGrade);
	}

	public void setPayFrequency(String txtPayFrequency) throws Exception {
	BaseClass.buttonFunctionality(payFrequency);
	}

	public void setCurrency(String txtCurrency) throws Exception {
	BaseClass.buttonFunctionality(currency);
	}

	public void setSalaryComponentComments(String txtSalaryComponentComment) throws Exception {
	BaseClass.textBoxFunctionality(salaryComponentComments, txtSalaryComponentComment);
	}

	public void setAccountType(String txtAccountType) throws Exception {
	BaseClass.buttonFunctionality(accountType);
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
	}

	public void setRoutingNumber(String txtRoutingNumber) throws Exception {
	BaseClass.textBoxFunctionality(routingNumber, txtRoutingNumber);
	}

	public void setAmount2(String txtAmount2) throws Exception {
	BaseClass.textBoxFunctionality(amount2, txtAmount2);
	}

	public void setBrowse() throws Exception {
	BaseClass.buttonFunctionality(browse);
	}

	public void setAmount(String txtAmount) throws Exception {
	BaseClass.textBoxFunctionality(amount, txtAmount);
	}

	public void setAttachmentsComment(String txtAttachmentsComment) throws Exception {
	BaseClass.textBoxFunctionality(attachmentsComment, txtAttachmentsComment);
	}
	
	
}
