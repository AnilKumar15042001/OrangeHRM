package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class MembershipObj {

	public WebDriver driver;
	String yearXpath="//ul[@class='oxd-calendar-selector']//li[2]/descendant::i";
	String monthXpath="//ul[@class='oxd-calendar-selector']//li[1]/descendant::i";
	String dateXpath="//div[@class='oxd-calendar-dates-grid']/div/div";
	String listXpath="//ul[@role='menu']/li";

	public MembershipObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Memberships")
	@CacheLookup
	public WebElement membershipPage;

	@FindBy(xpath = "//h6[contains(.,'Memberships')]/parent::div//button[contains(.,'Add')]")
	@CacheLookup
	public WebElement membershipAdd;

	@FindBy(xpath = "//h6[contains(.,'Attachments')]/parent::div//button[contains(.,'Add')]")
	@CacheLookup
	public WebElement attachmentAdd;

	@FindBy(xpath = "//label[.='Membership']/ancestor::div[contains(@class,'field-bottom-space')]/descendant::i")
	@CacheLookup
	public WebElement selectMembership;

	@FindBy(xpath = "//label[.='Subscription Paid By']/ancestor::div[contains(@class,'field-bottom-space')]/descendant::i")
	@CacheLookup
	public WebElement selectSubscriptionPaidBy;

	@FindBy(xpath = "//label[contains(.,'Subscription Amount')]/ancestor::div[contains(@class,'field-bottom-space')]/descendant::input")
	@CacheLookup
	public WebElement subscriptionAmount;

	@FindBy(xpath = "//label[.='Currency']/ancestor::div[contains(@class,'field-bottom-space')]/descendant::i")
	@CacheLookup
	public WebElement currency;

	@FindBy(xpath = "//label[contains(.,'Commence Date')]/ancestor::div[contains(@class,'field-bottom-space')]/descendant::i")
	@CacheLookup
	public WebElement subscriptionCommenceDate;

	@FindBy(xpath = "//label[contains(.,'Renewal Date')]/ancestor::div[contains(@class,'field-bottom-space')]/descendant::i")
	@CacheLookup
	public WebElement subscriptionRenewalDate;

	@FindBy(xpath = "//h6[contains(.,'Membership')]/parent::div//button[contains(.,'Cancel')]")
	@CacheLookup
	public WebElement membershipCancel;

	@FindBy(xpath = "//h6[contains(.,'Membership')]/parent::div//button[contains(.,'Save')]")
	@CacheLookup
	public WebElement membershipSave;

	@FindBy(xpath = "//div[@class='oxd-file-button']")
	@CacheLookup
	public WebElement browse;

	@FindBy(xpath = "//textarea[@placeholder='Type comment here']")
	@CacheLookup
	public WebElement typeCommentHere;

	@FindBy(xpath = "//h6[contains(.,'Attachment')]/parent::div//button[contains(.,'Cancel')]")
	@CacheLookup
	public WebElement attchmentCancel;

	@FindBy(xpath = "//h6[contains(.,'Attachment')]/parent::div//button[contains(.,'Save')]")
	@CacheLookup
	public WebElement attachmentSave;

	public void setMembershipPage() throws Exception {
	BaseClass.buttonFunctionality(membershipPage);
	
	}

	public void setMembershipAdd() throws Exception {
	BaseClass.buttonFunctionality(membershipAdd);
	
	}

	public void setAttachmentAdd() throws Exception {
	BaseClass.buttonFunctionality(attachmentAdd);
	
	}

	public void setSelectMembership(String memberShip) throws Exception {
	BaseClass.buttonFunctionality(selectMembership);
	BaseClass.selectValues(By.xpath("//div[@role='listbox']/descendant::span"), memberShip);
	Reporter.log("Membership is:"+memberShip);
	}

	public void setSelectSubscriptionPaidBy(String subscriptonBy) throws Exception {
	BaseClass.buttonFunctionality(selectSubscriptionPaidBy);
	BaseClass.selectValues(By.xpath("//div[@role='listbox']/descendant::span"), subscriptonBy);
	Reporter.log("SelectSubscriptionPaidBy is:"+subscriptonBy);
	}

	public void setSubscriptionAmount(String txtSubscriptionAmount) throws Exception {
	BaseClass.textBoxFunctionality(subscriptionAmount, txtSubscriptionAmount);
	Reporter.log("SubscriptionAmount is:"+txtSubscriptionAmount);
	}

	public void setCurrency(String txtCurrency) throws Exception {
	BaseClass.buttonFunctionality(currency);
	BaseClass.selectValues(By.xpath("//div[@role='listbox']/descendant::span"), txtCurrency);
	Reporter.log("Currency is:"+txtCurrency);
	}

	public void setSubscriptionCommenceDate(String year, String month, String date) throws Exception {
	Thread.sleep(2000);
	BaseClass.buttonFunctionality(subscriptionCommenceDate);
	BaseClass.dateOrCalenderControl(year, month, date, yearXpath, monthXpath, By.xpath(dateXpath), By.xpath(listXpath));
	Reporter.log("SubscriptionCommenceDate is:"+year+month+date);
	}

	public void setSubscriptionRenewalDate(String year, String month, String date) throws Exception {
	Thread.sleep(2000);
	BaseClass.buttonFunctionality(subscriptionRenewalDate);
	BaseClass.dateOrCalenderControl(year, month, date, yearXpath, monthXpath, By.xpath(dateXpath), By.xpath(listXpath));
	Reporter.log("SubscriptionRenewalDate is:"+year+month+date);
	}

	public void setMembershipCancel() throws Exception {
	BaseClass.buttonFunctionality(membershipCancel);
	
	}

	public void setMembershipSave() throws Exception {
	BaseClass.buttonFunctionality(membershipSave);
	
	}

	public void setBrowse() throws Exception {
	BaseClass.buttonFunctionality(browse);
	
	}

	public void setTypeCommentHere(String CommentHere) throws Exception {
	BaseClass.textBoxFunctionality(typeCommentHere, CommentHere);
	Reporter.log("Attachment comment is:"+CommentHere);
	}

	public void setAttchmentCancel() throws Exception {
	BaseClass.buttonFunctionality(attchmentCancel);
	
	}

	public void setAttachmentSave() throws Exception {
	BaseClass.buttonFunctionality(attachmentSave);
	
	}

}
