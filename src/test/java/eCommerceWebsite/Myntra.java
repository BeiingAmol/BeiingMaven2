package eCommerceWebsite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Myntra {
  @Test
  public void MyntraTest() throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
		 Reporter.log("Openning Myntra", true);
		 driver.get("https://www.myntra.com/");
		 driver.manage().deleteAllCookies();
		 Thread.sleep(5000);
		 driver.close();
		   
  }
}
