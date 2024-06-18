package com.hrms.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.chrome.ChromeDriver;

import com.hrms.testdata_obj_methods.AddEmp_Page;
import com.hrms.testdata_obj_methods.Login_Page;

public class UploadFile extends BaseClass{

	public static void main(String[] args) throws Exception {
		
		BaseClass.openApplication("chrome");
		BaseClass.implicitlyWait();
		Login_Page.login("Admin", "admin123");
		Login_Page.loginBtn();
		BaseClass.implicitlyWait();
		AddEmp_Page.PIM();
		BaseClass.implicitlyWait();
		AddEmp_Page.addEmpPage();
		BaseClass.implicitlyWait();
		try
		{
		driver.findElement(By.xpath("//button[@class='oxd-icon-button oxd-icon-button--solid-main employee-image-action']")).click();
		}
		catch(ElementClickInterceptedException e)
		{
			driver.findElement(By.xpath("//button[@class='oxd-icon-button oxd-icon-button--solid-main employee-image-action']")).click();
			e.getStackTrace();
		}
		BaseClass.fileUpload("C://Automation Testing/AutoIT/FileUpload(chrome).exe","C:\\Users\\ASUS\\OneDrive\\Pictures\\Pictures\\Screenshots\\Screenshot (45).png");
		Runtime.getRuntime().exec("C:\\Automation Testing\\AutoIT\\HandleText.exe");
//		Thread.sleep(5000);
//		try
//		{
//			Thread.sleep(5000);
//		driver.findElement(By.xpath("//i[@class='oxd-icon bi-plus']")).click();
//		
//		}
//		catch(ElementClickInterceptedException e)
//		{
//			Thread.sleep(5000);
//			driver.findElement(By.xpath("//i[@class='oxd-icon bi-plus']")).click();
//			e.getStackTrace();
//		}
//		BaseClass.fileUpload("C://Automation Testing/AutoIT/FileUpload(firefox).exe","C:\\Automation Testing\\Anil.png");
		
	}
}
