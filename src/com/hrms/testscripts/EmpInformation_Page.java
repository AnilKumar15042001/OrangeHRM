package com.hrms.testscripts;
import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.hrms.testdata_obj_methods.AddEmp_Page;
import com.hrms.testdata_obj_methods.Login_Page;
import com.hrms.testdata_obj_methods.PersonalDetailsObjPage;
import com.hrms.testdata_obj_methods.EmpInfo_Page;
import com.hrms.utility.BaseClass;

public class EmpInformation_Page extends BaseClass{

@Test
	public static void tc() throws Exception
	{
	try
	{
		BaseClass.openApplication("chrome");
		BaseClass.verifyPageTitle();
		BaseClass.implicitlyWait();
		Login_Page.login("Admin", "admin123");
		Login_Page.loginBtn();
		BaseClass.implicitlyWait();
		AddEmp_Page.PIM();
		EmpInfo_Page.setEditButton("0312");
		pdop=new PersonalDetailsObjPage(driver);
		Thread.sleep(3000);
		pdop.setBloodType("B+");
		Thread.sleep(3000);
//		pdop.setNationality("indian");
		
		
		
	}
	catch(Exception e)
	{
		e.getStackTrace();
	}
	finally
	{
//		driver.close();
		
	}
  }
}
