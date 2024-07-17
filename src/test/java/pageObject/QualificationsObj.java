package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class QualificationsObj {

	public WebDriver driver;
	String yearXpath="//ul[@class='oxd-calendar-selector']//li[2]/descendant::i";
	String monthXpath="//ul[@class='oxd-calendar-selector']//li[1]/descendant::i";
	String dateXpath="//div[@class='oxd-calendar-dates-grid']/div/div";
	String listXpath="//ul[@role='menu']/li";

	public QualificationsObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Qualifications")
	@CacheLookup
	public WebElement qualificationsPage;

	@FindBy(xpath = "//h6[text()='Work Experience']/parent::div//button")
	@CacheLookup
	public WebElement workExperienceAdd;

	@FindBy(xpath = "//h6[text()='Education']/parent::div//button")
	@CacheLookup
	public WebElement educationAdd;

	@FindBy(xpath = "//h6[text()='Skills']/parent::div//button")
	@CacheLookup
	public WebElement skillsAdd;

	@FindBy(xpath = "//h6[text()='Languages']/parent::div//button")
	@CacheLookup
	public WebElement languagesAdd;

	@FindBy(xpath = "//h6[text()='License']/parent::div//button")
	@CacheLookup
	public WebElement licenseAdd;

	@FindBy(xpath = "//h6[text()='Attachments']/parent::div//button")
	@CacheLookup
	public WebElement attachmentsAdd;

	@FindBy(xpath = "//h6[text()='Add Work Experience']/parent::div//button[contains(.,'Cancel')]")
	@CacheLookup
	public WebElement workExperienceCancel;

	@FindBy(xpath = "//h6[text()='Add Work Experience']/parent::div//button[@type='submit']")
	@CacheLookup
	public WebElement workExperienceSave;

	@FindBy(xpath = "//h6[text()='Add Education']/parent::div//button[contains(.,'Cancel')]")
	@CacheLookup
	public WebElement educationCancel;

	@FindBy(xpath = "//h6[text()='Add Education']/parent::div//button[@type='submit']")
	@CacheLookup
	public WebElement educationSave;

	@FindBy(xpath = "//h6[text()='Add Skill']/parent::div//button[contains(.,'Cancel')]")
	@CacheLookup
	public WebElement skillsCancel;

	@FindBy(xpath = "//h6[text()='Add Skill']/parent::div//button[@type='submit']")
	@CacheLookup
	public WebElement skillsSave;

	@FindBy(xpath = "//h6[text()='Add Language']/parent::div//button[contains(.,'Cancel')]")
	@CacheLookup
	public WebElement languagesCancel;

	@FindBy(xpath = "//h6[text()='Add Language']/parent::div//button[@type='submit']")
	@CacheLookup
	public WebElement languagesSave;

	@FindBy(xpath = "//h6[text()='Add License']/parent::div//button[contains(.,'Cancel')]")
	@CacheLookup
	public WebElement licenseCancel;

	@FindBy(xpath = "//h6[text()='Add License']/parent::div//button[@type='submit']")
	@CacheLookup
	public WebElement licenseSave;

	@FindBy(xpath = "//h6[text()='Add Attachment']/parent::div//button[contains(.,'Cancel')]")
	@CacheLookup
	public WebElement attachmentsCancel;

	@FindBy(xpath = "//h6[text()='Add Attachment']/parent::div//button[@type='submit']")
	@CacheLookup
	public WebElement attachmentsSave;

	@FindBy(xpath = "//label[.='Company']/ancestor::div[contains(@class,'input-field-bottom-space')]/descendant::input")
	@CacheLookup
	public WebElement company;

	@FindBy(xpath = "//label[.='Job Title']/ancestor::div[contains(@class,'input-field-bottom-space')]/descendant::input")
	@CacheLookup
	public WebElement jobTitle;

	@FindBy(xpath = "//label[.='From']/ancestor::div[contains(@class,'field-bottom-space')]//i")
	@CacheLookup
	public WebElement from;

	@FindBy(xpath = "//label[.='To']/ancestor::div[contains(@class,'field-bottom-space')]//i")
	@CacheLookup
	public WebElement to;

	@FindBy(xpath = "//h6[text()='Add Work Experience']/parent::div//textarea")
	@CacheLookup
	public WebElement workExperienceComment;

	@FindBy(xpath = "//label[.='Level']/ancestor::div[contains(@class,'input-field-bottom-space')]/descendant::i")
	@CacheLookup
	public WebElement selectEducationLevel;

	@FindBy(xpath = "//label[contains(.,'Institute')]/parent::div[contains(@class,'label-wrapper')]/following-sibling::div//input")
	@CacheLookup
	public WebElement institute;

	@FindBy(xpath = "//label[contains(.,'Major/Specialization')]/parent::div[contains(@class,'label-wrapper')]/following-sibling::div//input")
	@CacheLookup
	public WebElement majorSpecialization;

	@FindBy(xpath = "//label[contains(.,'Year')]/parent::div[contains(@class,'label-wrapper')]/following-sibling::div//input")
	@CacheLookup
	public WebElement year;

	@FindBy(xpath = "//label[contains(.,'GPA/Score')]/parent::div[contains(@class,'label-wrapper')]/following-sibling::div//input")
	@CacheLookup
	public WebElement gPAScore;

	@FindBy(xpath = "//label[contains(.,'Start Date')]/parent::div[contains(@class,'label-wrapper')]/parent::div//i")
	@CacheLookup
	public WebElement startDate;

	@FindBy(xpath = "//label[contains(.,'End Date')]/parent::div[contains(@class,'label-wrapper')]/parent::div//i")
	@CacheLookup
	public WebElement endDate;

	@FindBy(xpath = "//label[.='Skill']/ancestor::div[contains(@class,'input-field-bottom-space')]/descendant::i")
	@CacheLookup
	public WebElement selectSkill;

	@FindBy(xpath = "//label[contains(.,'Years of Experience')]/parent::div[contains(@class,'label-wrapper')]/following-sibling::div//input")
	@CacheLookup
	public WebElement yearsOfExperience;

	@FindBy(xpath = "//h6[text()='Add Skill']/parent::div//textarea")
	@CacheLookup
	public WebElement skillComments;

	@FindBy(xpath = "//label[.='Language']/ancestor::div[contains(@class,'input-field-bottom-space')]/descendant::i")
	@CacheLookup
	public WebElement selectLanguage;

	@FindBy(xpath = "//label[.='Fluency']/ancestor::div[contains(@class,'input-field-bottom-space')]/descendant::i")
	@CacheLookup
	public WebElement selectFluency;

	@FindBy(xpath = "//label[.='Competency']/ancestor::div[contains(@class,'input-field-bottom-space')]/descendant::i")
	@CacheLookup
	public WebElement selectCompetency;

	@FindBy(xpath = "//h6[text()='Add Language']/parent::div//textarea")
	@CacheLookup
	public WebElement languageComments;

	@FindBy(xpath = "//label[.='License Type']/ancestor::div[contains(@class,'input-field-bottom-space')]/descendant::i")
	@CacheLookup
	public WebElement selectLicense;

	@FindBy(xpath = "//label[contains(.,'License Number')]/parent::div[contains(@class,'label-wrapper')]/following-sibling::div//input")
	@CacheLookup
	public WebElement licenseNumber;

	@FindBy(xpath = "//label[contains(.,'Issued Date')]/parent::div[contains(@class,'label-wrapper')]/parent::div//i")
	@CacheLookup
	public WebElement issuedDate;

	@FindBy(xpath = "//label[contains(.,'Expiry Date')]/parent::div[contains(@class,'label-wrapper')]/parent::div//i")
	@CacheLookup
	public WebElement expiryDate;

	@FindBy(xpath = "//div[@class='oxd-file-button']")
	@CacheLookup
	public WebElement browse;

	@FindBy(xpath = "//textarea[@placeholder='Type comment here']")
	@CacheLookup
	public WebElement typeCommentHere;

	public void setQualificationsPage() throws Exception {
	BaseClass.buttonFunctionality(qualificationsPage);
	
	}

	public void setWorkExperienceAdd() throws Exception {
	BaseClass.buttonFunctionality(workExperienceAdd);
	
	}

	public void setEducationAdd() throws Exception {
	BaseClass.buttonFunctionality(educationAdd);
	
	}

	public void setSkillsAdd() throws Exception {
	BaseClass.buttonFunctionality(skillsAdd);
	
	}

	public void setLanguagesAdd() throws Exception {
	BaseClass.buttonFunctionality(languagesAdd);
	
	}

	public void setLicenseAdd() throws Exception {
	BaseClass.buttonFunctionality(licenseAdd);
	
	}

	public void setAttachmentsAdd() throws Exception {
	BaseClass.buttonFunctionality(attachmentsAdd);
	
	}

	public void setWorkExperienceCancel() throws Exception {
	BaseClass.buttonFunctionality(workExperienceCancel);
	
	}

	public void setWorkExperienceSave() throws Exception {
	BaseClass.buttonFunctionality(workExperienceSave);
	
	}

	public void setEducationCancel() throws Exception {
	BaseClass.buttonFunctionality(educationCancel);
	
	}

	public void setEducationSave() throws Exception {
	BaseClass.buttonFunctionality(educationSave);
	
	}

	public void setSkillsCancel() throws Exception {
	BaseClass.buttonFunctionality(skillsCancel);
	
	}

	public void setSkillsSave() throws Exception {
	BaseClass.buttonFunctionality(skillsSave);
	
	}

	public void setLanguagesCancel() throws Exception {
	BaseClass.buttonFunctionality(languagesCancel);
	
	}

	public void setLanguagesSave() throws Exception {
	BaseClass.buttonFunctionality(languagesSave);
	
	}

	public void setLicenseCancel() throws Exception {
	BaseClass.buttonFunctionality(licenseCancel);
	
	}

	public void setLicenseSave() throws Exception {
	BaseClass.buttonFunctionality(licenseSave);
	
	}

	public void setAttachmentsCancel() throws Exception {
	BaseClass.buttonFunctionality(attachmentsCancel);
	
	}

	public void setAttachmentsSave() throws Exception {
	BaseClass.buttonFunctionality(attachmentsSave);
	
	}

	public void setCompany(String txtCompany) throws Exception {
	BaseClass.textBoxFunctionality(company, txtCompany);
	Reporter.log("Company is:"+txtCompany);
	}

	public void setJobTitle(String txtJobTitle) throws Exception {
	BaseClass.textBoxFunctionality(jobTitle, txtJobTitle);
	Reporter.log("Job title is:"+txtJobTitle);
	}

	public void setFrom(String year, String month, String date) throws Exception {
	Thread.sleep(2000);
	BaseClass.buttonFunctionality(from);
	BaseClass.dateOrCalenderControl(year, month, date, yearXpath, monthXpath, By.xpath(dateXpath), By.xpath(listXpath));
	Reporter.log("From is:"+year+month+date);
	}

	public void setTo(String year, String month, String date) throws Exception {
	Thread.sleep(2000);
	BaseClass.buttonFunctionality(to);
	BaseClass.dateOrCalenderControl(year, month, date, yearXpath, monthXpath, By.xpath(dateXpath), By.xpath(listXpath));
	Reporter.log("To is:"+year+month+date);
	}

	public void setWorkExperienceComment(String Comment) throws Exception {
	BaseClass.textBoxFunctionality(workExperienceComment, Comment);
	Reporter.log("WorkExperienceComment is:"+Comment);
	}

	public void setSelectEducationLevel(String education) throws Exception {
	BaseClass.buttonFunctionality(selectEducationLevel);
	BaseClass.selectValues(By.xpath("//div[@role='listbox']/descendant::span"), education);
	Reporter.log("Education level is:"+education);
	}

	public void setInstitute(String txtInstitute) throws Exception {
	BaseClass.textBoxFunctionality(institute, txtInstitute);
	Reporter.log("Institute is:"+txtInstitute);
	}

	public void setMajorSpecialization(String specialization) throws Exception {
	BaseClass.textBoxFunctionality(majorSpecialization, specialization);
	Reporter.log("MajorSpecialization is:"+specialization);
	}

	public void setYear(String txtYear) throws Exception {
	BaseClass.textBoxFunctionality(year, txtYear);
	Reporter.log("Year is:"+txtYear);
	}

	public void setgPAScore(String txtGPAScore) throws Exception {
	BaseClass.textBoxFunctionality(gPAScore, txtGPAScore);
	Reporter.log("GPA score is:"+txtGPAScore);
	}

	public void setStartDate(String year, String month, String date) throws Exception {
	Thread.sleep(2000);
	BaseClass.buttonFunctionality(startDate);
	BaseClass.dateOrCalenderControl(year, month, date, yearXpath, monthXpath, By.xpath(dateXpath), By.xpath(listXpath));
	Reporter.log("Start date is:"+year+month+date);
	}

	public void setEndDate(String year, String month, String date) throws Exception {
	Thread.sleep(2000);
	BaseClass.buttonFunctionality(endDate);
	BaseClass.dateOrCalenderControl(year, month, date, yearXpath, monthXpath, By.xpath(dateXpath), By.xpath(listXpath));
	Reporter.log("End date is:"+year+month+date);
	}

	public void setSelectSkill(String skill) throws Exception {
	BaseClass.buttonFunctionality(selectSkill);
	BaseClass.selectValues(By.xpath("//div[@role='listbox']/descendant::span"), skill);
	Reporter.log("Skill is:"+skill);
	}

	public void setYearsOfExperience(String txtYearsOfExperience) throws Exception {
	BaseClass.textBoxFunctionality(yearsOfExperience, txtYearsOfExperience);
	Reporter.log("YearsOfExperience is:"+txtYearsOfExperience);
	}

	public void setSkillComments(String comments) throws Exception {
	BaseClass.textBoxFunctionality(skillComments, comments);
	Reporter.log("SkillComments is:"+comments);
	}

	public void setSelectLanguage(String language) throws Exception {
	BaseClass.buttonFunctionality(selectLanguage);
	BaseClass.selectValues(By.xpath("//div[@role='listbox']/descendant::span"), language);
	Reporter.log("Language is:"+language);
	}

	public void setSelectFluency(String fluency) throws Exception {
	BaseClass.buttonFunctionality(selectFluency);
	BaseClass.selectValues(By.xpath("//div[@role='listbox']/descendant::span"), fluency);
	Reporter.log("Fluency is:"+fluency);
	}

	public void setSelectCompetency(String competency) throws Exception {
	BaseClass.buttonFunctionality(selectCompetency);
	BaseClass.selectValues(By.xpath("//div[@role='listbox']/descendant::span"), competency);
	Reporter.log("Competency is:"+competency);
	}

	public void setLanguageComments(String comments) throws Exception {
	BaseClass.textBoxFunctionality(languageComments, comments);
	Reporter.log("LanguageComments is:"+comments);
	}

	public void setSelectLicense(String license) throws Exception {
	BaseClass.buttonFunctionality(selectLicense);
	BaseClass.selectValues(By.xpath("//div[@role='listbox']/descendant::span"), license);
	Reporter.log("License is:"+license);
	}

	public void setLicenseNumber(String txtLicenseNumber) throws Exception {
	BaseClass.textBoxFunctionality(licenseNumber, txtLicenseNumber);
	Reporter.log("LicenseNumber is:"+txtLicenseNumber);
	}

	public void setIssuedDate(String year, String month, String date) throws Exception {
	Thread.sleep(2000);
	BaseClass.buttonFunctionality(issuedDate);
	BaseClass.dateOrCalenderControl(year, month, date, yearXpath, monthXpath, By.xpath(dateXpath), By.xpath(listXpath));
	Reporter.log("Issued date is:"+year+month+date);
	}

	public void setExpiryDate(String year, String month, String date) throws Exception {
	Thread.sleep(2000);
	BaseClass.buttonFunctionality(expiryDate);
	BaseClass.dateOrCalenderControl(year, month, date, yearXpath, monthXpath, By.xpath(dateXpath), By.xpath(listXpath));
	Reporter.log("Expiry date is:"+year+month+date);
	}

	public void setBrowse() throws Exception {
	BaseClass.buttonFunctionality(browse);
	
	}

	public void setTypeCommentHere(String comment) throws Exception {
	BaseClass.textBoxFunctionality(typeCommentHere, comment);
	Reporter.log("Attachment comment is:"+comment);
	}
	
	
}
