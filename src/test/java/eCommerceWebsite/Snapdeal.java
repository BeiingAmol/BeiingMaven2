package eCommerceWebsite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Snapdeal {
  @Test
  public void SnapdealTest() throws InterruptedException
  {
	 WebDriver driver = new ChromeDriver();
	 Reporter.log("Openning Snapdeal", true);
	 driver.get("https://www.snapdeal.com/");
	 driver.manage().deleteAllCookies();
	 Thread.sleep(5000);
	 driver.close();
	  
  }
}
