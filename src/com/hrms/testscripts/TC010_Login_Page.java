package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.testdata_obj_methods.Login_Page;
import com.hrms.utility.BaseClass;
@Test
public class TC010_Login_Page {

	
	public static void tc010() throws Exception
	{
		BaseClass.openApplication("chrome");
		Thread.sleep(4000);
		Login_Page.lablesAndText();
		BaseClass.closeApplication();
	}
}
