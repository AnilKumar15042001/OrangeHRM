package com.hrms.utility;

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

import com.hrms.testdata_obj_methods.AddReportObj;
import com.hrms.testdata_obj_methods.EmployeeReportsObj;
import com.hrms.testdata_obj_methods.PersonalDetailsObjPage;

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
	
	public static EmployeeReportsObj ero;
	public static AddReportObj aro;
	public static PersonalDetailsObjPage pdop;

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
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
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

	public static void selectBootStrapDropDown(List<WebElement> options, String value) {
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase(value)) {
				System.out.println(option.getText());
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
	
	public static void verifyPageTitle(String title)
	{
		if(driver.getTitle().equalsIgnoreCase("503 Service Temporarily Unavailable"))
		{
			driver.close();
		}
		else
		{
			Reporter.log(driver.getTitle());	
		}
	}
	
	public static void dateOrCalenderControl() throws InterruptedException
	{
		driver.findElement(By.xpath("//div[2]/div[1]/div[2]/div[1]/div[1]/i[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@class='oxd-calendar-selector-year']//i")).click();
		List<WebElement> elements=driver.findElements(By.xpath("//ul[@role='menu']/li"));
		selectBootStrapDropDown(elements,"2000");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@class='oxd-calendar-selector-month']//i")).click();
		List<WebElement> element=driver.findElements(By.xpath("//ul[@role='menu']/li"));
		selectBootStrapDropDown(element,"June");
		Thread.sleep(3000);
		List<WebElement> date=driver.findElements(By.xpath("//div[@class='oxd-calendar-dates-grid']/div/div"));
		selectBootStrapDropDown(date,"22");
	}
	public static void selectFutureDate(String day,String month,String year)
	{
		String currentYear=driver.findElement(By.xpath("//span[contains(@class,'year')]")).getText();
		String currentMonth=driver.findElement(By.xpath("//span[contains(@class,'month')]")).getText();
		
		while(true)
		{
			if(currentMonth.equalsIgnoreCase(month) && currentYear.equalsIgnoreCase(year))
			{
				break;
			}
			driver.findElement(By.xpath("//span[contains(@class,'circle-triangle-e')]")).click();
		}
	}
	public static void findCurrentPage()
	{
		int pages=driver.findElements(By.xpath("//li//button")).size();
		for(int i=1;i<=pages;i++)
		{
			if(i>1)
			{
				driver.findElement(By.xpath("//li//button["+i+"]")).click();
			}
		}
	}
	//li//button[@type='button']
}
