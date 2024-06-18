package com.hrms.testscripts;

import org.testng.annotations.Test;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.testdata_obj_methods.Login_Page;
import com.hrms.utility.BaseClass;
public class TC005_Login_Page {

		//***Test Steps***//
@Test
	public void tc005() throws Exception
	{
	//***without username & password***//
	DOMConfigurator.configure("log4j.xml");
	BaseClass.openApplication("chrome");
		BaseClass.implicitlyWait();
		Login_Page.login("","");
		Login_Page.loginBtn();
		Thread.sleep(3000);
		BaseClass.closeApplication();
	}
}
