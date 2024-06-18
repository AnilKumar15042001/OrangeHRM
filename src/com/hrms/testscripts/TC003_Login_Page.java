package com.hrms.testscripts;

import org.testng.annotations.Test;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.testdata_obj_methods.Login_Page;
import com.hrms.utility.BaseClass;
public class TC003_Login_Page {

		//***Test Steps***//
@Test
	public void tc003() throws Exception
	{
	//***valid username & invalid password***//
	DOMConfigurator.configure("log4j.xml");
	BaseClass.openApplication("chrome");
		BaseClass.implicitlyWait();
		Login_Page.login("Admin","admin1234");
		Login_Page.loginBtn();
		Login_Page.errorMsg();
		BaseClass.closeApplication();
	}
}
