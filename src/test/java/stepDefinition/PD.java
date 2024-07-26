package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import pageObject.AddEmployeeObj;
import pageObject.BaseClass;
import pageObject.LoginObj;
import pageObject.PersonalDetailsObj;

public class PD extends BaseClass{

	public static void main(String[] args) throws Exception {
		
		BaseClass.openBrowser("chrome");
		BaseClass.enterUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		LoginObj.loginBtn();
		Thread.sleep(3000);
		AddEmployeeObj.setPIM_module();
		checkBox("0380");
		
		//div[@role='row']//div[contains(text(),'Mohit')]/parent::div[@role='cell']/parent::div//span
		
		
		//List<WebElement> elements=driver.findElements(By.xpath("//div[@class='orangehrm-container']//div[@role='rowgroup'][2]/div"));
		
	}
	
	public static void checkBox(String...values)
	{
		int rows=driver.findElements(By.xpath("//div[@class='orangehrm-container']//div[@role='rowgroup'][2]/div")).size();
		int cols=driver.findElements(By.xpath("//div[@role='rowgroup'][2]/div[1]/div/div")).size();
		while(true)
		{
			for(int i=1;i<=rows;i++)
			{
				for(int j=2;j<=cols-1;j++)
				{
					String text=driver.findElement(By.xpath("//div[@role='rowgroup'][2]/div[1]/div/div["+j+"]")).getText();
					for(String value:values)
					{
						if(text.trim().equals(value))
						{
							driver.findElement(By.xpath("//div[@role='row']//div[contains(text(),'"+text+"')]/parent::div[@role='cell']/parent::div//span")).click();
							
						}
					}
				}
			}
		}
	}
}
