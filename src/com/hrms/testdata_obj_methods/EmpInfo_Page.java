package com.hrms.testdata_obj_methods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.hrms.utility.BaseClass;

public class EmpInfo_Page extends BaseClass{
//Employee information page objects/elements
	
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
	public static void setTxt_empname(String empName) {
		driver.findElement(txt_empname).clear();
		driver.findElement(txt_empname).sendKeys(empName);
		
	}
	public static void setTxt_empid(String empid) {
		driver.findElement(txt_empid).clear();
		driver.findElement(txt_empid).sendKeys(empid);
	}
	public static void setTxt_superVisorname(String superVisorname) {
		driver.findElement(txt_superVisorname).clear();
		driver.findElement(txt_superVisorname).sendKeys(superVisorname);
		
	}
	public static void setSearch_btn() {
		driver.findElement(search_btn).click();
	}
	public static void setReset_btn() {
		driver.findElement(reset_btn).click();
	}
	public static void setAddbtn() {
		driver.findElement(addbtn).click();
	}
	public static void setEmpstatus_dd(String empstatus) throws Exception {
		driver.findElement(empstatus_dd).click();
		//System.out.println(optionss.size());
		Thread.sleep(3000);
		try
		{List<WebElement> options=driver.findElements(By.tagName("div"));
		  BaseClass.selectValues(options, empstatus);
		}
		catch(StaleElementReferenceException e)
		{
			List<WebElement> options=driver.findElements(By.tagName("div"));
			BaseClass.selectValues(options, empstatus);
			
		}
	}
	public static void setInclude_dd(String include) {
		driver.findElement(include_dd).click();
		try
		{List<WebElement> options=driver.findElements(By.tagName("div"));
		  BaseClass.selectValues(options, include);
		}
		catch(StaleElementReferenceException e)
		{
			List<WebElement> options=driver.findElements(By.tagName("div"));
			BaseClass.selectValues(options, include);
			
		}
	}
	public static void setJobtitle_dd(String jobtitle) {
		driver.findElement(jobtitle_dd).click();
		try
		{List<WebElement> options=driver.findElements(By.tagName("div"));
		  BaseClass.selectValues(options, jobtitle);
		}
		catch(StaleElementReferenceException e)
		{
			List<WebElement> options=driver.findElements(By.tagName("div"));
			BaseClass.selectValues(options, jobtitle);
			
		}
	}
	public static void setSubunit_dd(String subunit) {
		driver.findElement(subunit_dd).click();
		try
		{List<WebElement> options=driver.findElements(By.tagName("div"));
		  BaseClass.selectValues(options, subunit);
		}
		catch(StaleElementReferenceException e)
		{
			List<WebElement> options=driver.findElements(By.tagName("div"));
			BaseClass.selectValues(options, subunit);
			
		}
	}
	public static void setEditButton(String nameOrId) {
	    int rows = driver.findElements(By.xpath("//div[@role='rowgroup'][2]/div")).size();
	    boolean stop=false;
	    	for(int i=1;i<=rows && !stop;i++)
		    {
		    	for(int j=2;j<=4;j++)
		    	{
		    		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		    		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='rowgroup'][2]/div["+i+"]//div["+j+"]")));
		    		if(element.getText().trim().equalsIgnoreCase(nameOrId))
		    		{
		    			System.out.println(element.getText());
		    			WebElement button=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='rowgroup'][2]/div["+i+"]//button[2]")));
		    			button.click();
		    			stop=true;
		    			break;
		    		}
		    	}
		    }
	}

	public static void setDeleteButton(String nameOrId) throws Exception
	{
		int rows=driver.findElements(By.xpath("//div[@role='rowgroup'][2]/div")).size();
		boolean stop=false;
    	for(int i=1;i<=rows && !stop;i++)
	    {
	    	for(int j=2;j<=4;j++)
	    	{
	    		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	    		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='rowgroup'][2]/div["+i+"]//div["+j+"]")));
	    		if(element.getText().trim().equalsIgnoreCase(nameOrId))
	    		{
	    			System.out.println(element.getText());
	    			WebElement button=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='rowgroup'][2]/div["+i+"]//button[1]")));
	    			button.click();
	    			stop=true;
	    			break;
	    		}
	    	}
	    }
	}
	public static void goToNextPage(String pageNo) throws Exception
	{
		String text=driver.findElement(By.xpath("//ul[@class='oxd-pagination__ul']/descendant::button[last()-1]")).getText();
		int pages=Integer.parseInt(text);
		for(int i=1;i<=pages;i++)
		{
			Thread.sleep(3000);
			if(pageNo.equals(String.valueOf(i)))
			{
				System.out.println("Page "+pageNo+" is displayed");
				break;
			}
			driver.findElement(By.xpath("//ul[@class='oxd-pagination__ul']/descendant::button[last()]")).click();
		}
	}
	public static void click(String empNameOrId) throws InterruptedException
	{
			BaseClass.findDataInTable("//div[@class='oxd-table-body']//div[@role='row']//div[@role='cell']", "//ul[@class='oxd-pagination__ul']/descendant::button[last()]", empNameOrId);
	}
	public static void clickCancelAndDeleteButton(String buttonName) throws InterruptedException
	{
		String button="//div[contains(@class,'orangehrm-modal-footer')]/child::button[contains(.,'"+buttonName+"')]";
		BaseClass.cancelAndDeleteButton(button);
	}
	
	
}