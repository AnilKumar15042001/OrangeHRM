package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class AddReportObj extends BaseClass{

	static WebDriver driver;
	public AddReportObj(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h6[text()='Add Report']")
	static WebElement heading;
	
	@FindBy(xpath="//input[@placeholder='Type here ...']")
	static WebElement txtReportName;
	
	@FindBy(xpath="//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/form[@class='oxd-form']/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")
	static WebElement selectionCriteriaDD;
	
	@FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/div/div")
	static WebElement includeDD;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[2]/button[1]/i[1]")
	static WebElement plusBtn;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]")
	static WebElement displayFieldDD;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")
	static WebElement selectDisplayFieldDD;
	
	@FindBy(xpath="//button[normalize-space()='Save']")
	static WebElement saveBtn;
	
	@FindBy(xpath="//button[normalize-space()='Cancel']")
	static WebElement cancelBtn;
	
	public static String getHeading() {
		return heading.getText();
	}

	public static void setTxtReportName(String reportName) {
		txtReportName.clear();
		txtReportName.sendKeys(reportName);  
 	}

	public static void setSelectionCriteriaDD(String selectionCriteria) {
		selectionCriteriaDD.click();
		BaseClass.selectValues(By.tagName("div"), selectionCriteria);
	}

	public static void setIncludeDD(String include) {
		includeDD.click();
		BaseClass.selectValues(By.tagName("div"), include);
	}

	public static void setPlusBtn() {
		Assert.assertTrue(plusBtn.isEnabled(), "it is not working");;
		plusBtn.click();
	}

	public void setDisplayFieldDD(String displayField) {
		displayFieldDD.click();
		BaseClass.selectValues(By.tagName("div"), displayField);
	}

	public static void setSelectDisplayFieldDD(String selectDisplayField) {
		selectDisplayFieldDD.click();
		BaseClass.selectValues(By.tagName("div"), selectDisplayField);
	}

	public static void setSaveBtn() {
		Assert.assertTrue(saveBtn.isEnabled(), "it is not valid");
		saveBtn.click();
	}

	public static void setCancelBtn() {
		Assert.assertTrue(cancelBtn.isEnabled(), "Element not found");
		cancelBtn.click();
	}

	public static void setIncludHeaderButton()
	{
		driver.findElement(By.xpath("//div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[5]/div/label/span")).click();
	}
	//div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[3]/button[1]
	
	
//	@FindBy(xpath="")
//	static WebElement ;
}
