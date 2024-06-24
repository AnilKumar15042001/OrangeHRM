package com.hrms.testdata_obj_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.utility.BaseClass;

public class PersonalDetailsObjPage extends BaseClass {

	public static WebDriver driver;

	public PersonalDetailsObjPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//div[contains(@class,'oxd-input-field-bottom-space')]/descendant::input)[1]")
	@CacheLookup
	public static WebElement firstName;

	@FindBy(xpath = "(//div[contains(@class,'oxd-input-field-bottom-space')]/descendant::input)[2]")
	@CacheLookup
	public static WebElement middleName;

	@FindBy(xpath = "(//div[contains(@class,'oxd-input-field-bottom-space')]/descendant::input)[3]")
	@CacheLookup
	public static WebElement lastName;

	@FindBy(xpath = "(//div[contains(@class,'oxd-input-field-bottom-space')]/descendant::input)[4]")
	@CacheLookup
	public static WebElement employeeId;

	@FindBy(xpath = "(//div[contains(@class,'oxd-input-field-bottom-space')]/descendant::input)[5]")
	@CacheLookup
	public static WebElement otherId;

	@FindBy(xpath = "(//div[contains(@class,'oxd-input-field-bottom-space')]/descendant::input)[6]")
	@CacheLookup
	public static WebElement driversLicenseNumber;

	@FindBy(xpath = "(//div[@class='oxd-select-text--after'])[1]")
	@CacheLookup
	public static WebElement nationality;

	@FindBy(xpath = "(//div[@class='oxd-select-text--after'])[2]")
	@CacheLookup
	public static WebElement maritalStatus;

	@FindBy(xpath = "(//div[@class='oxd-select-text--after'])[3]")
	@CacheLookup
	public static WebElement bloodType;

	@FindBy(xpath = "(//div[@class='oxd-radio-wrapper']//span)[1]")
	@CacheLookup
	public static WebElement male;

	@FindBy(xpath = "(//div[@class='oxd-radio-wrapper']//span)[2]")
	@CacheLookup
	public static WebElement female;

	@FindBy(xpath = "(//button[@type='submit'])[1]")
	@CacheLookup
	public static WebElement save;
	
	@FindBy(xpath = "(//div[@class='oxd-date-wrapper']/descendant::i)[2]")
	@CacheLookup
	public static WebElement dateOfBirth;
	@FindBy(xpath = "//div[2]/div[1]/div[2]/div[1]/div[1]/i[1]")
	@CacheLookup
	public static WebElement licenseExpiryDate;

	public static void setFirstName(String fName) throws Exception {
		BaseClass.textBoxFunctionality(firstName, fName);
	}

	public static void setMiddleName(String mName) throws Exception {
		BaseClass.textBoxFunctionality(middleName, mName);
	}

	public static void setLastName(String lName) throws Exception {
		BaseClass.textBoxFunctionality(lastName, lName);
	}

	public static void setEmployeeId(String empId) throws Exception {
		BaseClass.textBoxFunctionality(employeeId, empId);
	}

	public static void setOtherId(String othId) throws Exception {
		BaseClass.textBoxFunctionality(otherId, othId);
	}

	public static void setDriversLicenseNumber(String licenseNumber) throws Exception {
		BaseClass.textBoxFunctionality(driversLicenseNumber, licenseNumber);
	}

	public static void setNationality(String national) throws Exception {
		BaseClass.explicityWait(nationality);
		BaseClass.scrollElement(nationality);
		nationality.click();
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='oxd-select-option']//span"));
		BaseClass.selectValues(options, national);
	}

	public static void setMaritalStatus(String maritalStus) {
		BaseClass.scrollElement(maritalStatus);
		BaseClass.explicityWait(maritalStatus);
		maritalStatus.click();
		List<WebElement> options = driver.findElements(By.xpath("//div[@role='listbox']//span"));
		BaseClass.selectValues(options, maritalStus);
	}

	public static void setBloodType(String bloodGroup) {
		BaseClass.explicityWait(bloodType);
		BaseClass.scrollElement(bloodType);
		bloodType.click();
		List<WebElement> options = driver.findElements(By.xpath("//div[@role='option']//span"));
		BaseClass.selectValues(options, bloodGroup);
	}

	public static void setMale() throws Exception {
		BaseClass.radioButtonFunctionality(male);
	}

	public static void setFemale() throws Exception {
		BaseClass.radioButtonFunctionality(female);
	}

	public static void setSave() throws Exception {
		BaseClass.buttonFunctionality(save);
	}
	
	public static void setDateOfBirth(String year,String month,String date) throws Exception
	{
		String yearXpath="//ul[@class='oxd-calendar-selector']/child::li[2]/descendant::i";
		String monthXpath="//ul[@class='oxd-calendar-selector']/child::li[1]/descendant::i";
		String dateXpath="//div[@class='oxd-calendar-dates-grid']//div//div";
		String listXpath="//ul[@role='menu']//li";
		dateOfBirth.click();
		Thread.sleep(3000);
		BaseClass.dateOrCalenderControl(year, month, date, yearXpath, monthXpath, dateXpath, listXpath);
	}
	
	public static void licenseExpiryDate(String year,String month,String date) throws InterruptedException
	{
		String yearXpath="//li[@class='oxd-calendar-selector-year']//i";
		String monthXpath="//li[@class='oxd-calendar-selector-month']//i";
		String dateXpath="//div[@class='oxd-calendar-dates-grid']/div/div";
		String listValue="//ul[@role='menu']/li";
		licenseExpiryDate.click();
		Thread.sleep(3000);
		BaseClass.dateOrCalenderControl(year,month,date,yearXpath,monthXpath,dateXpath,listValue);
	}
}
