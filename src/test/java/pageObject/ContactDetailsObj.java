package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;


public class ContactDetailsObj extends BaseClass {

	public WebDriver driver;

	public ContactDetailsObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//input[contains(@class,'oxd-input--active')])[2]")
	@CacheLookup
	public WebElement street1;

	@FindBy(xpath = "(//input[contains(@class,'oxd-input--active')])[3]")
	@CacheLookup
	public WebElement street2;

	@FindBy(xpath = "(//input[contains(@class,'oxd-input--active')])[4]")
	@CacheLookup
	public WebElement city;

	@FindBy(xpath="(//input[contains(@class,'oxd-input--active')])[5]")
	@CacheLookup 
	public WebElement stateProvince;

	@FindBy(xpath="(//input[contains(@class,'oxd-input--active')])[6]")
	@CacheLookup 
	public WebElement zipPostalCode;

	@FindBy(xpath="//div[contains(@class,'select-text')]/descendant::i")
	@CacheLookup 
	public WebElement country;

	@FindBy(xpath="(//input[contains(@class,'oxd-input--active')])[7]")
	@CacheLookup
	public WebElement home;

	@FindBy(xpath = "(//input[contains(@class,'oxd-input--active')])[8]")
	@CacheLookup
	public WebElement mobile;

	@FindBy(xpath = "(//input[contains(@class,'oxd-input--active')])[9]")
	@CacheLookup
	public WebElement work;

	@FindBy(xpath = "(//input[contains(@class,'oxd-input--active')])[10]")
	@CacheLookup
	public WebElement workEmail;

	@FindBy(xpath = "(//input[contains(@class,'oxd-input--active')])[11]")
	@CacheLookup
	public WebElement otherEmail;

	@FindBy(css = "button[type='submit']")
	@CacheLookup
	public WebElement save;

	@FindBy(xpath = "//button[text()=' Add ']")
	@CacheLookup
	public WebElement add;
	
	@FindBy(linkText = "Contact Details")
	@CacheLookup
	public WebElement contactDetailsPage;
	
	@FindBy(xpath = "//div[text()='Browse']")
	@CacheLookup
	public WebElement browse;

	public void setContactDetailsPage() {
		contactDetailsPage.click();
		Reporter.log("Contact details page is opened");
	}

	public void setStreet1(String txtStreet1) throws Exception {
		BaseClass.textBoxFunctionality(street1, txtStreet1);
		Reporter.log("Street1 name is:"+street1.getAttribute("value"));
	}

	public void setStreet2(String txtStreet2) throws Exception {
		BaseClass.textBoxFunctionality(street2, txtStreet2);
		Reporter.log("Street2 name is:"+street2.getAttribute("value"));
	}

	public void setCity(String txtCity) throws Exception {
		BaseClass.textBoxFunctionality(city, txtCity);
		Reporter.log("City name is:"+city.getAttribute("value"));
	}

	public void setStateProvince(String txtStateProvince) throws Exception {
		BaseClass.textBoxFunctionality(stateProvince, txtStateProvince);
		Reporter.log("StateProvince name is:"+stateProvince.getAttribute("value"));
	}

	public void setZipPostalCode(String txtZipPostalCode) throws Exception {
		BaseClass.textBoxFunctionality(zipPostalCode, txtZipPostalCode);
		Reporter.log("ZipPostalCode name is:"+zipPostalCode.getAttribute("value"));
	}

	public void setCountry(String countryName) {
		country.click();
		List<WebElement> options=driver.findElements(By.xpath("//div[@role='option']//span"));
		BaseClass.selectValues(options, countryName);
		Reporter.log("Country name is:"+countryName);
	}

	public void setHome(String txtHome) throws Exception {
		BaseClass.textBoxFunctionality(home, txtHome);
		Reporter.log("Home contact number is:"+home.getAttribute("value"));
	}

	public void setMobile(String txtMobile) throws Exception {
		BaseClass.textBoxFunctionality(mobile, txtMobile);
		Reporter.log("Mobile number is:"+mobile.getAttribute("value"));
	}

	public void setWork(String txtWork) throws Exception {
		BaseClass.textBoxFunctionality(work, txtWork);
		Reporter.log("Work contact number is:"+work.getAttribute("value"));
	}

	public void setWorkEmail(String txtWorkEmail) throws Exception {
		BaseClass.textBoxFunctionality(workEmail, txtWorkEmail);
		Reporter.log("Work email id is:"+workEmail.getAttribute("value"));
	}

	public void setOtherEmail(String txtOtherEmail) throws Exception {
		BaseClass.textBoxFunctionality(otherEmail, txtOtherEmail);
		Reporter.log("Other email id is:"+otherEmail.getAttribute("value"));
	}

	public void setSave() throws Exception {
		BaseClass.buttonFunctionality(save);
		Reporter.log("Save button is clicked");
	}

	public void setAdd() throws Exception {
		BaseClass.scrollToElement(add);
		BaseClass.buttonFunctionality(add);
		BaseClass.buttonFunctionality(browse);
	}
}
