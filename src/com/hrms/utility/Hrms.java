package com.hrms.utility;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hrms extends BaseClass{

	public static void main(String[] args) throws Exception {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		
		boolean element=BaseClass.isElementPresent(By.name("txtPassword"));
		System.out.println(element);
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		boolean alert=BaseClass.isAlertPresent();
		System.out.println(alert);
		Thread.sleep(3000);
		try
		{
			if(alert==true)
			{
				System.out.println(BaseClass.closeAlertAndGetItsText());
			}
			else
			{
				throw new NoAlertPresentException("No alert is present");
			}
		}
		
		finally {
			//System.out.println(Arrays.toString(BaseClass.generateRandomNumbers(10, 10)));
			for(int arr2:BaseClass.generateRandomNumbers(5, 4))
			{
				//System.out.println(arr2);
				if(arr2!=0 && arr2!=-1)
				{
					System.out.println(arr2);
				}
			}
			driver.close();
		}
		
		String elements[] = new String[5];
		
		elements[0]="dfvdvsfvdsfjd";
		
	}
}
