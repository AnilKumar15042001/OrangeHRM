package com.hrms.testscripts;

import org.testng.annotations.Test;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.testdata_obj_methods.AddEmp_Page;
import com.hrms.testdata_obj_methods.Login_Page;
import com.hrms.testdata_obj_methods.Logout_Page;
import com.hrms.utility.BaseClass;

public class TC021_AddEmployee_Page {
@Test
	public static void tc021() throws Exception
	{
	DOMConfigurator.configure("log4j.xml");
		BaseClass.openApplication("firefox");
		BaseClass.implicitlyWait();
		Login_Page.login("Admin", "admin123");
		Login_Page.loginBtn();
		BaseClass.implicitlyWait();
		AddEmp_Page.PIM();
		AddEmp_Page.addEmpPage();
		BaseClass.implicitlyWait();
		AddEmp_Page.addEmpHeading();
		Logout_Page.logout();
		BaseClass.closeApplication();
	}
}
