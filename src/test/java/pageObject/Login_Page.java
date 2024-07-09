package pageObject;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

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
	public static void userName(String un) throws Exception
	{
		WebElement username=driver.findElement(txt_un);
		BaseClass.textBoxFunctionality(username, un);
	}
	
	public static void password(String pwd) throws Exception
	{
		WebElement password=driver.findElement(txt_pwd);
		BaseClass.textBoxFunctionality(password, pwd);
	}
	public static void txtValue()
	{
		Reporter.log("username="+driver.findElement(txt_un).getAttribute("value"));
		Reporter.log("password="+driver.findElement(txt_pwd).getAttribute("value"));
	}
	
	public static void loginBtn() throws Exception
	{
		WebElement login=driver.findElement(login_btn);
		BaseClass.buttonFunctionality(login);
		Reporter.log("Login completed");
	}
	
	public static void validation() throws Exception
	{
		if(driver.getPageSource().contains("Invalid credentials"))
		{
			String str=BaseClass.retrieveElementInnerText(By.xpath("(//div[contains(.,'Username : Admin')])[9]"));
			System.out.println(str);
			driver.close();
		}
		else if(driver.getPageSource().contains("Required"))
		{
			userName("Admin");
			password("admin123");
		}
	}
	
	public static void heading()
	{
		Reporter.log("Login page heading is:-"+driver.findElement(heading).getText());
	}
}
	
