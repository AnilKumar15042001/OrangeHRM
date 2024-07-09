package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class AddEmployeeObj extends BaseClass{
//objects/elements
	static By txt_lastname=By.name("lastName");
	static By txt_firstname=By.name("firstName");
	static By txt_middlename=By.name("middleName");
	static By txt_empid=By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	static By save_btn=By.xpath("button[type='submit']");
	static By cancel_btn=By.xpath("//button[text()=' Cancel ']");
	static By PIM_module=By.xpath("//a[contains(@href,'PimModule')]");
	static By addEmp_Submodule=By.linkText("Add Employee");
	static By slt_photo=By.xpath("//input[@type='file'][@class='oxd-file-input']");
	static By addEmp_heading=By.xpath("//h6[text()='Add Employee']");
	
	static By txt_un=By.xpath("(//input[@autocomplete='off'])[1]");
	static By txt_pwd=By.xpath("(//input[@autocomplete='off'])[2]");
	static By txt_confpwd=By.xpath("(//input[@autocomplete='off'])[3]");
	static By enabled_btn=By.xpath("(//div[@class='oxd-input-group']//span)[1]");
	static By disabled_btn=By.xpath("(//div[@class='oxd-input-group']//span)[2]");
	
	
	public static void setTxt_lastname(String lastname) throws Exception {
		WebElement lstname=driver.findElement(txt_lastname);
		BaseClass.textBoxFunctionality(lstname, lastname);
	}
	public static void setTxt_firstname(String firstname) throws Exception {
		WebElement fstname=driver.findElement(txt_firstname);
		BaseClass.textBoxFunctionality(fstname, firstname);
	}
	public static void setTxt_middlename(String middlename) throws Exception {
		WebElement mdlname=driver.findElement(txt_middlename);
		BaseClass.textBoxFunctionality(mdlname, middlename);
	}
	public static void setTxt_empid(String employeeId) throws Exception {
		WebElement empid=driver.findElement(txt_empid);
		BaseClass.textBoxFunctionality(empid, employeeId);
	}
	public static void setSave_btn() throws Exception {
		WebElement saveBtn=driver.findElement(save_btn);
		BaseClass.buttonFunctionality(saveBtn);
	}
	public static void setCancel_btn() throws Exception {
		WebElement cancelBtn=driver.findElement(cancel_btn);
		BaseClass.buttonFunctionality(cancelBtn);
	}
	public static void setPIM_module() throws Exception {
		WebElement pim=driver.findElement(PIM_module);
		BaseClass.buttonFunctionality(pim);
	}
	public static void setAddEmp_Submodule() {
		driver.findElement(addEmp_Submodule).click();
	}
	public static void setSlt_photo() {
		AddEmployeeObj.slt_photo = slt_photo;
	}
	public static void setTxt_un(String userName) throws Exception {
		WebElement un=driver.findElement(txt_un);
		BaseClass.textBoxFunctionality(un, userName);
	}
	public static void setTxt_pwd(String password) throws Exception {
		WebElement pwd=driver.findElement(txt_pwd);
		BaseClass.textBoxFunctionality(pwd, password);
	}
	public static void setTxt_confpwd(String confirmPassword) throws Exception {
		WebElement confpwd=driver.findElement(txt_confpwd);
		BaseClass.textBoxFunctionality(confpwd, confirmPassword);
	}
	public static void setEnabled_btn() throws Exception {
		WebElement enableBtn=driver.findElement(enabled_btn);
		BaseClass.buttonFunctionality(enableBtn);
	}
	public static void setDisabled_btn() throws Exception {
		WebElement disableBtn=driver.findElement(disabled_btn);
		BaseClass.buttonFunctionality(disableBtn);
	}
	
	
	
}
