package com.hrms.testscripts;

import org.testng.annotations.Test;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.testdata_obj_methods.Login_Page;
import com.hrms.testdata_obj_methods.Logout_Page;
import com.hrms.utility.BaseClass;
public class TC001_Login_Page {

		//***Test Steps***//
@Test
	public void tc001() throws Exception 
	{
	//***valid username & password***//
	    DOMConfigurator.configure("log4j.xml");
	    BaseClass.openApplication("chrome");
		Thread.sleep(3000);
		Login_Page.login("Admin","admin123");
		Login_Page.loginBtn();
		BaseClass.implicitlyWait();
		Logout_Page.logout();
		BaseClass.closeApplication();
	}
}
