package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PersonalDetailsObj extends BaseClass {

	public WebDriver driver;

	public PersonalDetailsObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//div[contains(@class,'oxd-input-field-bottom-space')]/descendant::input)[1]")
	@CacheLookup
	public WebElement firstName;

	@FindBy(xpath = "(//div[contains(@class,'oxd-input-field-bottom-space')]/descendant::input)[2]")
	@CacheLookup
	public WebElement middleName;

	@FindBy(xpath = "(//div[contains(@class,'oxd-input-field-bottom-space')]/descendant::input)[3]")
	@CacheLookup
	public WebElement lastName;

	@FindBy(xpath = "(//div[contains(@class,'oxd-input-field-bottom-space')]/descendant::input)[4]")
	@CacheLookup
	public WebElement employeeId;

	@FindBy(xpath = "(//div[contains(@class,'oxd-input-field-bottom-space')]/descendant::input)[5]")
	@CacheLookup
	public WebElement otherId;

	@FindBy(xpath = "(//div[contains(@class,'oxd-input-field-bottom-space')]/descendant::input)[6]")
	@CacheLookup
	public WebElement driversLicenseNumber;

	@FindBy(xpath = "(//div[@class='oxd-select-text--after'])[1]")
	@CacheLookup
	public WebElement nationality;

	@FindBy(xpath = "(//div[@class='oxd-select-text--after'])[2]")
	@CacheLookup
	public WebElement maritalStatus;

	@FindBy(xpath = "(//div[@class='oxd-select-text--after'])[3]")
	@CacheLookup
	public WebElement bloodType;

	@FindBy(xpath = "(//div[@class='oxd-radio-wrapper']//span)[1]")
	@CacheLookup
	public WebElement male;

	@FindBy(xpath = "(//div[@class='oxd-radio-wrapper']//span)[2]")
	@CacheLookup
	public WebElement female;

	@FindBy(xpath = "(//button[@type='submit'])[1]")
	@CacheLookup
	public WebElement personalDetailsSaveButton;
	
	@FindBy(xpath = "(//div[@class='oxd-date-wrapper']/descendant::i)[2]")
	@CacheLookup
	public WebElement dateOfBirth;
	
	@FindBy(xpath = "//div[2]/div[1]/div[2]/div[1]/div[1]/i[1]")
	@CacheLookup
	public WebElement licenseExpiryDate;
	
	@FindBy(xpath = "(//div[contains(@class,'oxd-input-field-bottom-space')]/descendant::input)[11]")
	@CacheLookup
	public WebElement testField;
	
	@FindBy(xpath = "//i[@class='oxd-icon bi-plus oxd-button-icon']")
	@CacheLookup
	public WebElement addButton;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	@CacheLookup
	public WebElement customFieldsSaveButton;
	
	@FindBy(xpath = "(//button[@type='submit'])[3]")
	@CacheLookup
	public WebElement addAttachmentSaveButton;
	
	@FindBy(xpath = "//button[text()=' Cancel ']")
	@CacheLookup
	public WebElement addAttachmentCancelButton;
	
	@FindBy(xpath = "//textarea[@placeholder='Type comment here']")
	@CacheLookup
	public WebElement comment;
	
	@FindBy(xpath = "//i[@class='oxd-icon bi-upload oxd-file-input-icon']")
	@CacheLookup
	public WebElement uploadButton;


	public void setFirstName(String fName) throws Exception {
		BaseClass.textBoxFunctionality(firstName, fName);
	}

	public void setMiddleName(String mName) throws Exception {
		BaseClass.textBoxFunctionality(middleName, mName);
	}

	public void setLastName(String lName) throws Exception {
		BaseClass.textBoxFunctionality(lastName, lName);
	}

	public void setEmployeeId(String empId) throws Exception {
		BaseClass.textBoxFunctionality(employeeId, empId);
	}

	public void setOtherId(String othId) throws Exception {
		BaseClass.textBoxFunctionality(otherId, othId);
	}

	public void setDriversLicenseNumber(String licenseNumber) throws Exception {
		BaseClass.textBoxFunctionality(driversLicenseNumber, licenseNumber);
	}

	public void setNationality(String national) throws Exception {
		BaseClass.explicityWait(nationality);
		BaseClass.scrollToElement(nationality);
		nationality.click();
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='oxd-select-option']//span"));
		BaseClass.selectValues(options, national);
	}

	public void setMaritalStatus(String maritalStus) {
		BaseClass.scrollToElement(maritalStatus);
		BaseClass.explicityWait(maritalStatus);
		maritalStatus.click();
		List<WebElement> options = driver.findElements(By.xpath("//div[@role='listbox']//span"));
		BaseClass.selectValues(options, maritalStus);
	}

	public void setBloodType(String bloodGroup) {
		BaseClass.explicityWait(bloodType);
		BaseClass.scrollToElement(bloodType);
		bloodType.click();
		List<WebElement> options = driver.findElements(By.xpath("//div[@role='option']//span"));
		BaseClass.selectValues(options, bloodGroup);
	}

	public void setMale() throws Exception {
		BaseClass.radioButtonFunctionality(male);
	}

	public void setFemale() throws Exception {
		BaseClass.radioButtonFunctionality(female);
	}

	public void setPersonalDetailsSaveButton() throws Exception {
		BaseClass.buttonFunctionality(personalDetailsSaveButton);
	}
	
	public void setDateOfBirth(String year,String month,String date) throws Exception
	{
		String yearXpath="//ul[@class='oxd-calendar-selector']/child::li[2]/descendant::i";
		String monthXpath="//ul[@class='oxd-calendar-selector']/child::li[1]/descendant::i";
		String dateXpath="//div[@class='oxd-calendar-dates-grid']//div//div";
		String listXpath="//ul[@role='menu']//li";
		dateOfBirth.click();
		Thread.sleep(3000);
		BaseClass.dateOrCalenderControl(year, month, date, yearXpath, monthXpath, dateXpath, listXpath);
	}
	
	public void licenseExpiryDate(String year,String month,String date) throws InterruptedException
	{
		String yearXpath="//li[@class='oxd-calendar-selector-year']//i";
		String monthXpath="//li[@class='oxd-calendar-selector-month']//i";
		String dateXpath="//div[@class='oxd-calendar-dates-grid']/div/div";
		String listValue="//ul[@role='menu']/li";
		licenseExpiryDate.click();
		Thread.sleep(3000);
		BaseClass.dateOrCalenderControl(year,month,date,yearXpath,monthXpath,dateXpath,listValue);
	}

	public void setTestField(String tstField) throws Exception {
		BaseClass.textBoxFunctionality(testField, tstField);
	}

	public void setAddButton() throws Exception {
	    BaseClass.buttonFunctionality(addButton);
	}

	public void setCustomFieldsSaveButton() throws Exception {
		BaseClass.buttonFunctionality(customFieldsSaveButton);
	}

	public void setAddAttachmentSaveButton() throws Exception {
		BaseClass.buttonFunctionality(addAttachmentSaveButton);
	}

	public void setAddAttachmentCancelButton() throws Exception {
		BaseClass.buttonFunctionality(addAttachmentCancelButton);
	}

	public void setComment(String cmt) throws Exception {
		BaseClass.textBoxFunctionality(comment, cmt);
	}
	
	public void setUploadButton(String sourceFile,String outputFile) throws Exception
	{
		BaseClass.buttonFunctionality(uploadButton);
		if(BaseClass.findFileSize(sourceFile)>1)
		{
			BaseClass.compressedFile(sourceFile, outputFile);
			System.out.println("Sourcefile:"+BaseClass.findFileSize(sourceFile));
			System.out.println("Compressedfile:"+BaseClass.findFileSize(outputFile));
			BaseClass.fileUpload("C:\\Automation Testing\\OrangeHRM\\src\\FileUpload(chrome).exe", outputFile);
		}
		else if(BaseClass.findFileSize(sourceFile)<1)
		{
			System.out.println(BaseClass.findFileSize(sourceFile));
			BaseClass.fileUpload("C:\\Automation Testing\\OrangeHRM\\src\\FileUpload(chrome).exe", sourceFile);
		}
	}
}
