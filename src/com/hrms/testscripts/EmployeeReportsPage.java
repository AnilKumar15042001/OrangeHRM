package com.hrms.testscripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.hrms.testdata_obj_methods.AddEmp_Page;
import com.hrms.testdata_obj_methods.EmployeeReportsObj;
import com.hrms.testdata_obj_methods.Login_Page;
import com.hrms.utility.BaseClass;

public class EmployeeReportsPage extends BaseClass{
@Test
	public static void tc() throws Exception
	{
        try
        {
		BaseClass.openApplication("chrome");
		BaseClass.implicitlyWait();
		Login_Page.login("Admin", "admin123");
		Login_Page.loginBtn();
		BaseClass.implicitlyWait();
		AddEmp_Page.PIM();
		BaseClass.implicitlyWait();
		ero=new EmployeeReportsObj(driver);
		ero.setReportsModule();
//		BaseClass.selectAllCheckBox(driver.findElement(By.xpath("//div[@role='columnheader']//span[@class='oxd-checkbox-input oxd-checkbox-input--active --label-right oxd-checkbox-input']")));
//		BaseClass.selectOneCheckBox(driver.findElement(By.xpath("//div[@role='table']//div[1]//div[1]//div[1]//div[1]//div[1]//label[1]//span[1]")));
//		ero.setDeleteAndEditButton(2,"file");
		ero.clickMultiCheckBox();
        }
        catch(Exception e)
        {
        	System.out.println(e.getMessage());
        }
        finally
        {
		System.out.println("success");
		BaseClass.closeApplication();
        }
	}
}
