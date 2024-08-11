package pageObject;

import org.openqa.selenium.By;
import org.testng.Reporter;

public class LogoutObj extends BaseClass{
//objects/elements
	static By empPf_dd=By.xpath("//img[@class='oxd-userdropdown-img']/following-sibling::i");
	static By link_logout=By.linkText("Logout");
	
//methods
	public static void logout()
	{
		driver.findElement(empPf_dd).click();
		driver.findElement(link_logout).click();
		Reporter.log("Logout completed");
	}
}
