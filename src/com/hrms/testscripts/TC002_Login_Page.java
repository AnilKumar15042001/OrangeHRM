package com.hrms.testscripts;

import org.testng.annotations.Test;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.testdata_obj_methods.Login_Page;
import com.hrms.utility.BaseClass;
public class TC002_Login_Page {

		//***Test Steps***//
@Test
	public void tc002() throws Exception
	{
	//***invalid username & valid password***//
	DOMConfigurator.configure("log4j.xml");
	    BaseClass.openApplication("chrome");
		BaseClass.implicitlyWait();
		Login_Page.login("Admin123","admin123");
		Login_Page.loginBtn();
		Login_Page.errorMsg();
		BaseClass.closeApplication();
	}
}
