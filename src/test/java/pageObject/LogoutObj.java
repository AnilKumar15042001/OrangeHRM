package pageObject;

import org.openqa.selenium.By;
import org.testng.Reporter;

public class LogoutObj extends BaseClass{
//objects/elements
	static By empPf_dd=By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/i");
	static By link_logout=By.linkText("Logout");
	
//methods
	public static void logout()
	{
		driver.findElement(empPf_dd).click();
		driver.findElement(link_logout).click();
		Reporter.log("Logout completed");
	}
}
