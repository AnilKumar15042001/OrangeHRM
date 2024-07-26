package pageObject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;


public class EmployeeListObj extends BaseClass{
//Employee information page objects/elements
	
	static String rowXpath="//div[@role='rowgroup'][2]/div";
	static String colXpath="//div[@role='rowgroup'][2]/div[1]/div/div";
	static String elementXpath="//div[@role='rowgroup'][2]/div[%d]//div[%d]";
	static String nextButtonXpath="//ul[@class='oxd-pagination__ul']/descendant::button[last()]";
	
	static By txt_empname=By.xpath("//div[contains(@class,'orangehrm-full')]//div[1]//div[1]//div[2]//input[1]");
	static By txt_empid=By.xpath("//div[contains(@class,'grid-item--gutter')]//input[contains(@class,'oxd-input--active')]");
	static By txt_superVisorname=By.xpath("(//div[contains(@class,'item--gutters')])[1]//input");
	static By search_btn=By.xpath("button[type='submit']");
	static By reset_btn=By.xpath("button[type='reset']");
	static By addbtn=By.xpath("//div[@class='orangehrm-header-container']//button");
	public static By empstatus_dd=By.xpath("(//div[@class='oxd-select-wrapper'])[1]//i");
	static By include_dd=By.xpath("(//div[@class='oxd-select-wrapper'])[2]//i");
	static By jobtitle_dd=By.xpath("(//div[@class='oxd-select-wrapper'])[3]//i");
	static By subunit_dd=By.xpath("(//div[@class='oxd-select-wrapper'])[4]//i");
	static By deleteSelectedBtn=By.xpath("//button[text()=' Delete Selected ']");
	
	
	public static void setDeleteSelectedBtn() {
		driver.findElement(deleteSelectedBtn).click();
	}
	public static void setTxt_empname(String empName) throws Exception {
		WebElement txtEmpName=driver.findElement(txt_empname);
		BaseClass.textBoxFunctionality(txtEmpName, empName);
		Reporter.log("Employee name is:"+txtEmpName.getAttribute("value"));
	}
	public static void setTxt_empid(String empid) throws Exception {
		WebElement txtEmpId=driver.findElement(txt_empid);
		BaseClass.textBoxFunctionality(txtEmpId, empid);
		Reporter.log("Employee ID is:"+txtEmpId.getAttribute("value"));
	}
	public static void setTxt_superVisorname(String superVisorname) throws Exception {
		WebElement txtSuperVisorName=driver.findElement(txt_superVisorname);
		BaseClass.textBoxFunctionality(txtSuperVisorName, superVisorname);
		Reporter.log("SuperVisor name is:"+txtSuperVisorName.getAttribute("value"));
	}
	public static void setSearch_btn() throws Exception {
		WebElement searchButton=driver.findElement(search_btn);
		BaseClass.buttonFunctionality(searchButton);
		Reporter.log("Search button is clicked successfully");
	}
	public static void setReset_btn() throws Exception {
		WebElement resetButton=driver.findElement(reset_btn);
		BaseClass.buttonFunctionality(resetButton);
		Reporter.log("Reset button is clicked successfully");
	}
	public static void setAddbtn() throws Exception {
		WebElement addButton=driver.findElement(addbtn);
		BaseClass.buttonFunctionality(addButton);
		Reporter.log("Add button is clicked successfully");
	}
	public static void setEmpstatus_dd(String empstatus) throws Exception {
		driver.findElement(empstatus_dd).click();
		//System.out.println(optionss.size());
		Thread.sleep(3000);
		try
		{
		  BaseClass.selectValues(By.tagName("div"), empstatus);
		}
		catch(StaleElementReferenceException e)
		{
			BaseClass.selectValues(By.tagName("div"), empstatus);
			
		}
	}
	public static void setInclude_dd(String include) {
		driver.findElement(include_dd).click();
		try
		{
		  BaseClass.selectValues(By.tagName("div"), include);
		}
		catch(StaleElementReferenceException e)
		{
			BaseClass.selectValues(By.tagName("div"), include);
			
		}
	}
	public static void setJobtitle_dd(String jobtitle) {
		driver.findElement(jobtitle_dd).click();
		try
		{
		  BaseClass.selectValues(By.tagName("div"), jobtitle);
		}
		catch(StaleElementReferenceException e)
		{
			BaseClass.selectValues(By.tagName("div"), jobtitle);
			
		}
	}
	public static void setSubunit_dd(String subunit) {
		driver.findElement(subunit_dd).click();
		try
		{
		  BaseClass.selectValues(By.tagName("div"), subunit);
		}
		catch(StaleElementReferenceException e)
		{
			BaseClass.selectValues(By.tagName("div"), subunit);
			
		}
	}
	public static void setEditButton(String nameOrId) {
		
		String editButtonXpath="//div[@role='rowgroup'][2]/div[%d]//button[2]";
		BaseClass.findElementInPegenation(nameOrId, rowXpath,colXpath, elementXpath, editButtonXpath,nextButtonXpath);
	}

	public static void setDeleteButton(String nameOrId) throws Exception
	{
		String deleteButtonXpath="//div[@role='rowgroup'][2]/div[%d]//button[1]";
	    BaseClass.findElementInPegenation(nameOrId, rowXpath,colXpath, elementXpath, deleteButtonXpath, nextButtonXpath);
	}

	public static void clickCancelAndDeleteButton(String buttonName) throws InterruptedException
	{
		String button="//div[contains(@class,'orangehrm-modal-footer')]/child::button[contains(.,'"+buttonName+"')]";
		BaseClass.cancelAndDeleteButton(button);
		Reporter.log(buttonName+" Button is clicked");
	}
	
	public static void sortTheTableDataInAscendingOrder(String colName) throws Exception
	{
		WebElement element=driver.findElement(By.xpath("(//div[@role='columnheader'][text()='"+colName+"']//i)[1]"));
		WebElement ascending=driver.findElement(By.xpath("//div[contains(@class,'active oxd-table')]//span[contains(.,'Ascending')]"));
		BaseClass.ascending(element,ascending);
		Reporter.log("Sorting is success");
	}
	public static void sortTheTableDataInDescendingOrder(String colName) throws Exception
	{
		WebElement descending =driver.findElement(By.xpath("//div[contains(@class,'active oxd-table')]//span[contains(.,'Descending')]"));
		WebElement element=driver.findElement(By.xpath("(//div[@role='columnheader'][text()='"+colName+"']//i)[1]"));
		BaseClass.descending(element,descending);
		Reporter.log("Sorting is success");
	}
	
}