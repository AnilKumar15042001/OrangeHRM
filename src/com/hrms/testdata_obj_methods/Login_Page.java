package com.hrms.testdata_obj_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import com.hrms.utility.BaseClass;

public class Login_Page extends BaseClass {

//objects/elements
	static By txt_un=By.name("username");
	static By txt_pwd=By.name("password");
	static By login_btn=By.xpath("//button[@type='submit']");
	static By un_lable=By.xpath("//label[text()='Username']");
	static By pwd_lable=By.xpath("//label[text()='Password']");
	static By heading=By.xpath("//h5[text()='Login']");
	static int len;
	
//methods
	public static void login(String un,String pwd)
	{
		driver.findElement(txt_un).sendKeys(un);
		driver.findElement(txt_pwd).sendKeys(pwd);
		len=pwd.length();
	}
	public static void txtValue()
	{
		Reporter.log("username="+driver.findElement(txt_un).getAttribute("value"));
		Reporter.log("password="+driver.findElement(txt_pwd).getAttribute("value"));
	}
	public static void loginBtn()
	{
		driver.findElement(login_btn).click();
		Reporter.log("Login completed");
	}
	public static void encodePwd()
	{
		Reporter.log("password format:");
		for(int i=0;i<len;i++)
		{
			Reporter.log("*");
		}
	}
	public static void heading()
	{
		Reporter.log("Login page heading is:-"+driver.findElement(heading).getText());
	}
	public static void lablesAndText()
	{
		String unlable=driver.findElement(un_lable).getText();
		String pwdlable=driver.findElement(pwd_lable).getText();
		Reporter.log("username lable="+unlable);
		Reporter.log("password lable="+pwdlable);
		int size=driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div/p")).size();
		for(int i=1;i<=size;i++)
		{
			String text=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div/p["+i+"]")).getText();
			Reporter.log(text);
		}
	}
	public static void errorMsg()
	{
		
		Reporter.log("Error message should be displayed as:-"+driver.findElement(By.xpath
				("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")).getText());
	}
}
	
