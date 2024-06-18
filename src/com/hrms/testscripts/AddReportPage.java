package com.hrms.testscripts;

import java.io.File;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.hrms.testdata_obj_methods.AddEmp_Page;
import com.hrms.testdata_obj_methods.AddReportObj;
import com.hrms.testdata_obj_methods.EmployeeReportsObj;
import com.hrms.testdata_obj_methods.Login_Page;
import com.hrms.utility.BaseClass;

public class AddReportPage extends BaseClass{

@Test
	public static void tc() throws Exception
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
		ero.setAddBtn();
		aro=new AddReportObj(driver);
		aro.setTxtReportName("dvfvsdjhvds");
		aro.setSelectionCriteriaDD("Education");
		aro.setIncludeDD("Past Employees Only");
		aro.setSelectDisplayFieldDD("Dependents");
		aro.setDisplayFieldDD("Relationship");
		aro.setPlusBtn();
		aro.setIncludHeaderButton();
		aro.setSaveBtn();
		System.out.println(BaseClass.isAlertPresent());
//		aro.setSelectionCriteriaDD("Education");
//		aro.setPlusBtn();
//		aro.setIncludeDD("Past Employees Only");
//		aro.setSelectDisplayFieldDD("Dependents");
//		aro.setDisplayFieldDD("Relationship");
		
	}
}
