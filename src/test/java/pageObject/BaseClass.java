package pageObject;

import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.googlecode.pngtastic.core.PngImage;
import com.googlecode.pngtastic.core.PngOptimizer;

import pageObject.AddReportObj;
import pageObject.ContactDetailsObj;
import pageObject.DependentsObj;
import pageObject.EmergencyContactsObj;
import pageObject.EmployeeReportsObj;
import pageObject.ImmigrationObj;
import pageObject.JobObj;
import pageObject.PersonalDetailsObj;

public class BaseClass {
//driver
	public static WebDriver driver;
//mouserOver
	public static Actions act;
//Alert
	public static Alert alt;
//WebElement
	public static WebElement fileinput;
//select
	public static Select s;
//WebDriverWait
	public static WebDriverWait wait;
//Robot
	public static Robot r;
	public static Dimension ds;
	public static File f;
	
	public static EmployeeReportsObj employeeReport;
	public static AddReportObj addReport;
	public static PersonalDetailsObj personalDetails;
	public static JavascriptExecutor js;
	public static ContactDetailsObj contactDetails;
	public static EmergencyContactsObj emergencyContacts;
	public static DependentsObj dependents;
	public static ImmigrationObj immigration;
	public static JobObj job;

//open application
	public static void openApplication(String browser) throws Exception {
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Reporter.log("Chrome browser opened");
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Reporter.log("Firefox browser opened");
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Reporter.log("Edge browser opened");
		} else {
			throw new Exception("Browser not support");
		}
	}

//close application
	public static void closeApplication() {
		driver.close();
		Reporter.log("Application closed");
	}

//frame
	public static void enterFrame(int id) {
		driver.switchTo().frame(id);
	}

	public static void exitFrame() {
		driver.switchTo().defaultContent();
	}

	public static void implicitlyWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	public static void explicityWait(WebElement element) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	public static String closeAlertAndGetItsText() {
		try {
			driver.switchTo().alert();
			String alertText = driver.switchTo().alert().getText();
			if (BaseClass.isAlertPresent() == true) {
				driver.switchTo().alert().accept();
			}
			return alertText;
		} catch (NoAlertPresentException e) {
			return e.getMessage();
		}
	}

	public static boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	public static void selectValues(List<WebElement> options, String value) {
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase(value)) {
				option.click();
				break;
			}
		}
	}
	
	public static void selectAllCheckBox(WebElement element) throws Exception
	{
		if(element.isEnabled() && element.isDisplayed())
		{
			element.click();
		}
		else
		{
			throw new Exception("Invalid element");
		}
	}
	
	public static void selectOneCheckBox(WebElement element) throws Exception
	{
		if(element.isEnabled() && element.isDisplayed())
		{
			element.click();
		}
		else
		{
			throw new Exception("Invalid element");
		}
	}

	public static int[] generateRandomNumbers(int digit,int size)
	{
		Random rand=new Random();
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=rand.nextInt(digit);
		}
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]=-1;
				}
			}
		}
		return arr;	
	}
	
	public static void selectTagDropDownBox(WebElement element,String value)
	{
		s=new Select(element);
		List<WebElement> options=s.getOptions();
		for(WebElement option:options)
		{
			if(option.getText().equalsIgnoreCase(value))
			{
				option.click();
				break;
			}
		}
	}
	
	public static void fileUpload(String exeFile,String uploadedFile) throws IOException
	{
		String[] filePath= {exeFile,uploadedFile};
		Runtime.getRuntime().exec(filePath);
	}
	
	public static double findFileSize(String filePath)
	{
		f=new File(filePath);
		long bytes=f.length();
		double kb=(double)bytes / 1024;
		double mb=kb/1024;
		return mb;
	}
	
	public static Dimension findFileDimension(String filePath) throws IOException
	{
		File file=new File(filePath);
		BufferedImage img=ImageIO.read(file);
		int width=img.getWidth();
		int height=img.getHeight();
		return new Dimension(width,height);
	}
	
	public static boolean warningMsg(String msg)
	{
		if(driver.getPageSource().contains(msg))
		{
			driver.close();
			Assert.assertTrue(false);
		}
		return true;
	}
	
	public static void verifyPageTitle()
	{
		if(driver.getTitle().contains("503 Service Temporarily Unavailable"))
		{
			driver.close();
		}
	}
	
	public static void dateOrCalenderControl(String year,String month,String date,String yearXpath,String monthXpath,String dateXpath,String listXpath) throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath(yearXpath)).click();
		List<WebElement> years=driver.findElements(By.xpath(listXpath));
		selectValues(years,year);
		Thread.sleep(3000);
		driver.findElement(By.xpath(monthXpath)).click();
		List<WebElement> months=driver.findElements(By.xpath(listXpath));
		selectValues(months,month);
		Thread.sleep(3000);
		List<WebElement> dates=driver.findElements(By.xpath(dateXpath));
		selectValues(dates,date);
	}
	
	public static void selectFutureDate(String day,String month,String year,String yearXpath,String monthXpath,String nextButtonXpath,String listXpath)
	{
		while(true)
		{
			String currentYear=driver.findElement(By.xpath(yearXpath)).getText();
			String currentMonth=driver.findElement(By.xpath(monthXpath)).getText();
			
			if(currentMonth.equalsIgnoreCase(month) && currentYear.equalsIgnoreCase(year))
			{
				break;
			}
			driver.findElement(By.xpath(nextButtonXpath)).click();
		}
		List<WebElement> dates=driver.findElements(By.xpath(listXpath));
		for(WebElement date:dates)
		{
			if(date.getText().equals(day))
			{
				date.click();
				break;
			}
		}
	}
	
	public static void selectPastDate(String day,String month,String year,String yearXpath,String monthXpath,String backButtonXpath,String listXpath)
	{
		while(true)
		{
			String currentYear=driver.findElement(By.xpath(yearXpath)).getText();
			String currentMonth=driver.findElement(By.xpath(monthXpath)).getText();
			
			if(currentMonth.equalsIgnoreCase(month) && currentYear.equalsIgnoreCase(year))
			{
				break;
			}
			driver.findElement(By.xpath(backButtonXpath)).click();
		}
		List<WebElement> dates=driver.findElements(By.xpath(listXpath));
		for(WebElement date:dates)
		{
			if(date.getText().equals(day))
			{
				date.click();
				break;
			}
		}
	}
	
	public static void cancelAndDeleteButton(String xpath)
	{
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement button=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
		button.click();
	}
	
	public static void retrievePegenationTableData(String tableDataXpath,String nextPageButtonXpath) throws InterruptedException
	{
		boolean stop=false;
		while(!stop)
		{
			List<WebElement> tableData=driver.findElements(By.xpath(tableDataXpath));
			for(WebElement data:tableData)
			{
				System.out.print(data.getText()+"\b");
			}
			System.out.println();
			if(driver.findElement(By.xpath(nextPageButtonXpath)).isDisplayed() && !stop)
			{
				try
				{
					driver.findElement(By.xpath(nextPageButtonXpath)).click();
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
					driver.findElement(By.xpath(nextPageButtonXpath)).click();
				}
			}
			else
			{
				break;
			}
		
		}
	}
	
	public static void buttonFunctionality(WebElement button) throws Exception
	{
		explicityWait(button);
		if(button.isDisplayed() && button.isEnabled())
		{
			button.click();
		}
		else
		{
			throw new Exception("Button is displayed as:"+button.isDisplayed()+"Button is enabled as:"+button.isEnabled());
		}
	}
	
	public static void radioButtonFunctionality(WebElement radioButton) throws Exception
	{
		explicityWait(radioButton);
		if(radioButton.isDisplayed() && radioButton.isEnabled() && !radioButton.isSelected())
		{
			radioButton.click();
		}
		else
		{
			throw new Exception("RadioButton is displayed as:"+radioButton.isDisplayed()+"RadioButton is enabled as:"+radioButton.isEnabled()+"RadioButton is selected as:"+radioButton.isSelected());
		}
	}
	
	public static void textBoxFunctionality(WebElement textBox,String value) throws Exception
	{
		Thread.sleep(2000);
		js = (JavascriptExecutor) driver;
		String value1=(String) js.executeScript("return arguments[0].value;", textBox);
		System.out.println(value1);
		if(textBox.isDisplayed() && textBox.isEnabled() && value1.isEmpty())
		{
			textBox.sendKeys(value);
		}
		else if(textBox.isDisplayed() && textBox.isEnabled())
		{
			js.executeScript("arguments[0].value=arguments[1];", textBox, value);
		}
		else
		{
			throw new Exception("TextBox is displayed as:"+textBox.isDisplayed()+"TextBox is enabled as:"+textBox.isEnabled());
		}
	}
	
	public static void scrollToElement(WebElement element)
	{
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
//		js.executeScript("window.scrollBy(0,-1000);");
	}
	
	public static void compressedFile(String sourceFile,String outputFile) throws IOException
	{
		PngImage image = new PngImage(new File(sourceFile).getPath(), outputFile);
		PngOptimizer optimizer = new PngOptimizer();
		optimizer.optimize(image,new File(outputFile).getPath(),true,9);
	}
	
	public static void findElementInPegenation(String nameOrId,String pegenationXpath,String elementXpath,String buttonXpath, String nextPageButtonXpath) {
	    int rows = driver.findElements(By.xpath(pegenationXpath)).size();
	    boolean stop=false;
	    	while(!stop)
			{
	    		for(int i=1;i<=rows && !stop;i++)
			    {
			    	for(int j=2;j<=4;j++)
			    	{
			    		String dynamicElementXpath = String.format(elementXpath, i, j);
			    		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
			    		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(dynamicElementXpath)));
			    		if(element.getText().trim().equalsIgnoreCase(nameOrId))
			    		{
			    			System.out.println(element.getText());
			    			String dynamicButtonXpath = String.format(buttonXpath, i);
			    			WebElement button=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(dynamicButtonXpath)));
			    			button.click();
			    			stop=true;
			    			break;
			    		}
			    	}
			    }
		    	if(!stop)
				{
					try
					{
						driver.findElement(By.xpath(nextPageButtonXpath)).click();
					}
					catch(Exception e)
					{
						System.out.println(e.getMessage());
						driver.findElement(By.xpath(nextPageButtonXpath)).click();
					}
				}
				else
				{
					break;
				}
			
			}
	}
	
	public static void ascending(WebElement ascending) throws Exception
	{
		explicityWait(ascending);
		buttonFunctionality(ascending);
		WebElement asc=driver.findElement(By.xpath("//div[contains(@class,'active oxd-table')]//span[contains(.,'Ascending')]"));
		buttonFunctionality(asc);
	}
	public static void descending(WebElement descending) throws Exception
	{
		explicityWait(descending);
		buttonFunctionality(descending);
		WebElement asc=driver.findElement(By.xpath("//div[contains(@class,'active oxd-table')]//span[contains(.,'Descending')]"));
		buttonFunctionality(asc);
	}
	
	public static void retrieveAllInnerText(By by)
	{
		List<WebElement> elements=driver.findElements(by);
		js=(JavascriptExecutor) driver;
		for(WebElement element:elements)
		{
			String innerText=(String) js.executeScript("return arguments[0].innerText;", element);
			Reporter.log(innerText);
		}
	}
	public static String retrieveElementInnerText(By by)
	{
		WebElement element = driver.findElement(by);
		js = (JavascriptExecutor) driver;
		String innerText = (String) js.executeScript("return arguments[0].innerText;", element);
		return innerText;
	}
}
