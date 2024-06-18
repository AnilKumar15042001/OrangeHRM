package com.hrms.testdata_obj_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.utility.BaseClass;

public class PersonalDetailsObjPage extends BaseClass{

	public static WebDriver driver;
	
	public PersonalDetailsObjPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

@FindBy(xpath="//input[@placeholder='First Name']")
@CacheLookup public static WebElement firstName;

@FindBy(xpath="//input[@placeholder='Middle Name']")
@CacheLookup public static WebElement middleName;

@FindBy(xpath="//input[@placeholder='Last Name']")
@CacheLookup public static WebElement lastName;

@FindBy(xpath="(//input[contains(@class,'input--focus')])[1]")
@CacheLookup public static WebElement employeeId;

@FindBy(xpath="(//input[contains(@class,'input--active')])[2]")
@CacheLookup public static WebElement otherId;

@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[3]")
@CacheLookup public static WebElement driversLicenseNumber;

@FindBy(xpath="(//div[@class='oxd-select-text--after'])[1]")
@CacheLookup public static WebElement nationality;

@FindBy(xpath="(//div[@class='oxd-select-text--after'])[2]")
@CacheLookup public static WebElement maritalStatus;

@FindBy(xpath="(//div[@class='oxd-select-text--after'])[3]")
@CacheLookup public static WebElement bloodType;

@FindBy(xpath="(//div[@class='oxd-radio-wrapper']//span)[1]")
@CacheLookup public static WebElement male;

@FindBy(xpath="(//div[@class='oxd-radio-wrapper']//span)[2]")
@CacheLookup public static WebElement female;

@FindBy(xpath="(//button[@type='submit'])[1]")
@CacheLookup public static WebElement save;

public static void setFirstName(String fName) {
	firstName.clear();
	firstName.sendKeys(fName);
}

public static void setMiddleName(String mName) {
	middleName.clear();
	middleName.sendKeys(mName);
}

public static void setLastName(String lName) {
	lastName.clear();
	lastName.sendKeys(lName);
}

public static void setEmployeeId(String empId) {
	employeeId.clear();
	employeeId.sendKeys(empId);
}

public static void setOtherId(String othId) {
	otherId.clear();
	otherId.sendKeys(othId);
}

public static void setDriversLicenseNumber(String licenseNumber) {
	driversLicenseNumber.clear();
	driversLicenseNumber.sendKeys(licenseNumber);
}

public static void setNationality(String national) {
	BaseClass.explicityWait(nationality);
	nationality.click();
	List<WebElement> options=driver.findElements(By.xpath("//div[@class='oxd-select-option']//span"));
	BaseClass.selectBootStrapDropDown(options, national);
}

public static void setMaritalStatus(String maritalStus) {
	BaseClass.explicityWait(maritalStatus);
	maritalStatus.click();
	List<WebElement> options=driver.findElements(By.xpath("//div[@role='listbox']//span"));
	BaseClass.selectBootStrapDropDown(options, maritalStus);
}

public static void setBloodType(String bloodGroup) {
	BaseClass.explicityWait(bloodType);
	bloodType.click();
	List<WebElement> options=driver.findElements(By.xpath("//div[@role='option']//span"));
	BaseClass.selectBootStrapDropDown(options, bloodGroup);
}

public static void setMale(WebElement male) {
	PersonalDetailsObjPage.male = male;
}

public static void setFemale(WebElement female) {
	PersonalDetailsObjPage.female = female;
}

public static void setSave(WebElement save) {
	PersonalDetailsObjPage.save = save;
}
}
