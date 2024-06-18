package com.hrms.testscripts;

import org.testng.annotations.Test;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.testdata_obj_methods.Login_Page;
import com.hrms.utility.BaseClass;
public class TC006_Login_Page {

		//***Test Steps***//
@Test
	public void tc006() throws Exception
	{
	//***password format***//
	DOMConfigurator.configure("log4j.xml");
		BaseClass.openApplication("chrome");
		BaseClass.implicitlyWait();
		Login_Page.login("","admin123");
		Login_Page.encodePwd();
		BaseClass.closeApplication();
	}
}
