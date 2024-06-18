package com.hrms.testdata_obj_methods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.hrms.utility.BaseClass;

public class EmpInfo_Page extends BaseClass{
//Employee information page objects/elements
	
	static By txt_empname=By.xpath("//div[@class='oxd-grid-4 orangehrm-full-width-grid']//div[1]//div[1]//div[2]//div[1]//div[1]//input[1]");
	static By txt_empid=By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']");
	static By txt_superVisorname=By.xpath("//div[5]//div[1]//div[2]//div[1]//div[1]//input[1]");
	static By search_btn=By.xpath("//button[normalize-space()='Search']");
	static By reset_btn=By.xpath("//button[normalize-space()='Reset']");
	static By addbtn=By.xpath("//button[normalize-space()='Add']");
	public static By empstatus_dd=By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]");
	static By include_dd=By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[2]");
	static By jobtitle_dd=By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/div[2]");
	static By subunit_dd=By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[7]/div[1]/div[2]/div[1]/div[1]/div[2]");
	static By deleteSelectedBtn=By.xpath("//button[normalize-space()='Delete Selected']");
	
	
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
		  BaseClass.selectBootStrapDropDown(options, empstatus);
		}
		catch(StaleElementReferenceException e)
		{
			List<WebElement> options=driver.findElements(By.tagName("div"));
			BaseClass.selectBootStrapDropDown(options, empstatus);
			
		}
	}
	public static void setInclude_dd(String include) {
		driver.findElement(include_dd).click();
		try
		{List<WebElement> options=driver.findElements(By.tagName("div"));
		  BaseClass.selectBootStrapDropDown(options, include);
		}
		catch(StaleElementReferenceException e)
		{
			List<WebElement> options=driver.findElements(By.tagName("div"));
			BaseClass.selectBootStrapDropDown(options, include);
			
		}
	}
	public static void setJobtitle_dd(String jobtitle) {
		driver.findElement(jobtitle_dd).click();
		try
		{List<WebElement> options=driver.findElements(By.tagName("div"));
		  BaseClass.selectBootStrapDropDown(options, jobtitle);
		}
		catch(StaleElementReferenceException e)
		{
			List<WebElement> options=driver.findElements(By.tagName("div"));
			BaseClass.selectBootStrapDropDown(options, jobtitle);
			
		}
	}
	public static void setSubunit_dd(String subunit) {
		driver.findElement(subunit_dd).click();
		try
		{List<WebElement> options=driver.findElements(By.tagName("div"));
		  BaseClass.selectBootStrapDropDown(options, subunit);
		}
		catch(StaleElementReferenceException e)
		{
			List<WebElement> options=driver.findElements(By.tagName("div"));
			BaseClass.selectBootStrapDropDown(options, subunit);
			
		}
	}
	public static void getRecordFound()
	{
		int rows=driver.findElements(By.xpath("//div[@class='orangehrm-container']/div/div[2]/div")).size();
		int rowsData=driver.findElements(By.xpath("//div[@class='orangehrm-container']/div/div[2]/div[1]/div/div")).size();
		for(int i=1;i<=rows;i++)
		{
			for(int j=2;j<rowsData;j++)
			{
				String data=driver.findElement(By.xpath("//div[@class='orangehrm-container']/div/div[2]/div["+i+"]/div/div["+j+"]")).getText();
				System.out.print(data+" ");
			}
			System.out.println();
		}
	}
	public static void setRecordFound(String text1) throws Exception
	{
		int rows=driver.findElements(By.xpath("//div[@role='rowgroup'][2]/div")).size();
		List<WebElement> texts=driver.findElements(By.xpath("//div[@role='rowgroup'][2]/div"));
		System.out.println(driver.findElement(By.xpath("//div[@role='rowgroup'][2]/div//*[text()='"+text1+"']")).getText());
		for(int i=1;i<=rows;i++)
		{
//			String data=text.getText();
//			System.out.println(data);
			if(driver.findElement(By.xpath("//div[@role='rowgroup'][2]/div//*[text()='"+text1+"']")).isDisplayed())
			{
				driver.findElement(By.xpath("//div[@role='rowgroup'][2]/div[1]//button[2]")).click();
			}
			else
			{
				System.out.println("invalid");
			}
		}
	}
	public static void setEditButton(String button) throws Exception
	{
		int rows=driver.findElements(By.xpath("//div[@class='orangehrm-container']/div/div[2]/div")).size();
		for(int i=1;i<=rows;i++)
		{
		    if(button.equalsIgnoreCase("edit"))
			{
				driver.findElement(By.xpath("//div[@class='orangehrm-container']/div/div[2]/div["+i+"]/div/div[9]/div/button[2]")).click();
				break;
			}
			else
			{
				throw new Exception("Invalid input");
			}
		}
	}
	public static void goToNextPage(int num) throws Exception
	{
		int pageCount=driver.findElements(By.xpath("//div[@class='orangehrm-bottom-container']/nav/ul/li")).size();	
		int rows=driver.findElements(By.xpath("//div[@class='orangehrm-container']/div/div[2]/div/div/div[1]/div/div/label/span")).size();
		System.out.println(rows);
		for(int arr2:BaseClass.generateRandomNumbers(rows, rows))
		{
			//System.out.println(arr2);
			Thread.sleep(5000);
			if(arr2!=0 && arr2!=-1)
			{
				System.out.println(arr2);
				try
				{
				    if(driver.findElement(By.xpath("//div[@class='orangehrm-container']/div/div[2]/div["+arr2+"]/div/div[1]/div/div/label/span")).isEnabled())
				   {
					  driver.findElement(By.xpath("//div[@class='orangehrm-container']/div/div[2]/div["+arr2+"]/div/div[1]/div/div/label/span")).click();
				   }
				}
				catch(NoSuchElementException e)
				{
					driver.findElement(By.xpath("//div[@class='orangehrm-container']/div/div[2]/div["+arr2+"]/div/div[1]/div/div/label/span")).click();
					System.out.println(e.getMessage());
				}
				
			}
		}
//		System.out.println(Arrays.toString(BaseClass.generateRandomNumbers(10,10)));
	}
}