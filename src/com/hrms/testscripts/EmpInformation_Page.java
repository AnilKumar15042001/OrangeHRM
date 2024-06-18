package com.hrms.testscripts;
import org.testng.annotations.Test;
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
		BaseClass.openApplication("chrome");
		BaseClass.implicitlyWait();
		Login_Page.login("Admin", "admin123");
		Login_Page.loginBtn();
		BaseClass.implicitlyWait();
		AddEmp_Page.PIM();
		//BaseClass.explicityWait(driver.findElement(EmpInfo_Page.empstatus_dd));
		Thread.sleep(3000);
		EmpInfo_Page.setRecordFound("0312");
		
	}
}
