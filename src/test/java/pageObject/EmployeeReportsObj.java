package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class EmployeeReportsObj extends BaseClass{

	public static WebDriver driver;
	public EmployeeReportsObj(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//div[@class='orangehrm-container']/div/div[2]/div[1]/div/div[3]/div/button
	@FindBy(xpath="//a[normalize-space()='Reports']")
	static WebElement reportsModule;
	
	@FindBy(xpath="//h5[text()='Employee Reports']")
	static WebElement heading;
	
	@FindBy(xpath="//i[@class='oxd-icon bi-caret-up-fill']")
	static WebElement upAndDownArrow;
	
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	static WebElement txtReportsName;
	
	@FindBy(xpath="//button[normalize-space()='Search']")
	static WebElement searchBtn;
	
	@FindBy(xpath="//button[normalize-space()='Reset']")
	static WebElement resetBtn;
	
	@FindBy(xpath="//button[normalize-space()='Add']")
	static WebElement addBtn;
	
	@FindBy(xpath="//button[normalize-space()='Delete Selected']")
	static WebElement deleteBtn;
	
	
	public static void setDeleteBtn() {
		Assert.assertTrue(deleteBtn.isEnabled(), "This element is not visible");
		deleteBtn.click();
	}

	public static String getHeading() {
		return heading.getText();
	}

	public static void setReportsModule() {
		Assert.assertTrue(reportsModule.isEnabled(), "This is false");
		reportsModule.click();
	}

	public static void setUpAndDownArrow() {
		upAndDownArrow.click();
	}

	public static void setTxtReportsName(String reportName) {
		Assert.assertTrue(txtReportsName.isEnabled(), "This is false");
		txtReportsName.clear();
		txtReportsName.sendKeys(reportName);
		
	}

	public static void setSearchBtn() {
		Assert.assertTrue(searchBtn.isEnabled(), "This is false");
		searchBtn.click();
	}

	public static void setResetBtn() {
		Assert.assertTrue(resetBtn.isEnabled(), "This is false");
		resetBtn.click();
	}

	public static void setAddBtn() {
		Assert.assertTrue(addBtn.isEnabled(), "This is false");
		addBtn.click();
	}
	
	public static void setDeleteAndEditButton(int row,String button) throws Exception
	{
		int buttons=driver.findElements(By.xpath("//div[@class='orangehrm-container']/div/div[2]/div[1]/div/div[3]/div/button")).size();
		if(button.equalsIgnoreCase("delete"))
		{
			driver.findElement(By.xpath("//div[@class='orangehrm-container']/div/div[2]/div["+row+"]/div/div[3]/div/button[1]")).click();
		}
		else if(button.equalsIgnoreCase("edit"))
		{
			driver.findElement(By.xpath("//div[@class='orangehrm-container']/div/div[2]/div["+row+"]/div/div[3]/div/button[2]")).click();
		}
		else if(button.equalsIgnoreCase("file"))
		{
			driver.findElement(By.xpath("//div[@class='orangehrm-container']/div/div[2]/div["+row+"]/div/div[3]/div/button[3]")).click();
		}
		else
		{
			throw new Exception("Invalid input");
		}
	}
	
	public static void clickMultiCheckBox()
	{
		int rows=driver.findElements(By.xpath("//div[@class='orangehrm-container']/div/div[2]/div/div/div[1]/div/div/label/span")).size();
		for(int row:BaseClass.generateRandomNumbers(rows+1, rows))
		{
			if(row!=0 && row!=-1)
			{
				System.out.println(row);
				BaseClass.explicityWait(driver.findElement(By.xpath("//div[@class='orangehrm-container']/div/div[2]/div["+row+"]/div/div[1]/div/div/label/span")));
				driver.findElement(By.xpath("//div[@class='orangehrm-container']/div/div[2]/div["+row+"]/div/div[1]/div/div/label/span")).click();
			}
			
		}
	}
	
//	@FindBy(xpath="")
//	WebElement ;

	
}
