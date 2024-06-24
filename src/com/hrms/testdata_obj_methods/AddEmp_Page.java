package com.hrms.testdata_obj_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import com.hrms.utility.BaseClass;

public class AddEmp_Page extends BaseClass{
//objects/elements
	static By txt_lastname=By.name("lastName");
	static By txt_firstname=By.name("firstName");
	static By txt_middlename=By.name("middleName");
	static By txt_empid=By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	static By save_btn=By.xpath("button[type='submit']");
	static By cancel_btn=By.xpath("//button[text()=' Cancel ']");
	static By PIM_module=By.xpath("//a[contains(@href,'PimModule')]");
	static By addEmp_Submodule=By.linkText("Add Employee");
	static By slt_photo=By.xpath("//input[@type='file'][@class='oxd-file-input']");
	static By addEmp_heading=By.xpath("//h6[text()='Add Employee']");
	
	
	static By txt_un=By.xpath("(//input[@autocomplete='off'])[1]");
	static By txt_pwd=By.xpath("(//input[@autocomplete='off'])[2]");
	static By txt_confpwd=By.xpath("(//input[@autocomplete='off'])[3]");
	static By enabled_btn=By.xpath("(//div[@class='oxd-input-group']//span)[1]");
	static By disabled_btn=By.xpath("(//div[@class='oxd-input-group']//span)[2]");
	
	
//methods
	public static void addEmp(String fstname,String lstname,String mdlname)
	{
		driver.findElement(txt_firstname).sendKeys(fstname);
		driver.findElement(txt_lastname).sendKeys(lstname);
		driver.findElement(txt_middlename).sendKeys(mdlname);
	}
//save button
	public static void saveEmp()
	{
		driver.findElement(save_btn).click();
		Reporter.log("save button should be clicked");
	}
//reset button
	public static void cancelEmp()
	{
		driver.findElement(cancel_btn).click();
		Reporter.log("");
	}
	public static void PIM()
	{
		driver.findElement(PIM_module).click();
		Reporter.log("Employee list page opened");
	}
	public static void addEmpPage()
	{
		driver.findElement(addEmp_Submodule).click();
		Reporter.log("Add Employee page opened");
	}
//upload photo
	public static void uploadPhoto(String path)
	{
		fileinput=driver.findElement(slt_photo);
		fileinput.sendKeys(path);
	}
//heading
	public static void addEmpHeading()
	{
		String data=driver.findElement(addEmp_heading).getText();
		Reporter.log("heading:-"+data);
	}
//labels and mandatory fields
	public static void labelsAndMandFields()
	{
	List<WebElement> element=driver.findElements(By.tagName("label"));
	Reporter.log("labels and mandatory fields are:");
	for(WebElement elements:element)
	{
		Reporter.log(elements.getText());
	}
	Reporter.log("important information:"+driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[1]/p")).getText());
	}
	public static void ldChkBox()
	{
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div/label/span")).click();
	}
	
	
	public static void loginDetails(String un,String pwd,String confpwd)
	{
		driver.findElement(txt_un).sendKeys(un);
		driver.findElement(txt_pwd).sendKeys(pwd);
		driver.findElement(txt_confpwd).sendKeys(confpwd);
    }
	public static void status(String stus)
	{
		if(stus=="e")
		{
			driver.findElement(enabled_btn).click();
		}
		else
		{
			driver.findElement(disabled_btn).click();
		}
	}
}
