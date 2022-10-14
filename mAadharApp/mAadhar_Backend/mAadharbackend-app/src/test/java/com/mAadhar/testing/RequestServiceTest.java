package com.mAadhar.testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;

public class RequestServiceTest {
	WebDriver driver;
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Mphasis\\MLA\\Phase5\\browsers\\chromedriver.exe");
	  ChromeOptions options = new ChromeOptions();
	  options.addArguments("start-maximized");
	  driver = new ChromeDriver(options);
  }

  @AfterClass
  public void afterClass() {
  }


  @Test
  public void approveRequestTest() {
	  driver.get("http://localhost:4200/approve");
	  driver.close();
  }

  @Test
  public void denyRequestTest() {
	  driver.get("http://localhost:4200/deny");
	  driver.close();
  }

  @Test
  public void getAllRequestsTest() {
	  driver.get("http://localhost:4200/veiwAll");
	  driver.close();
  }

  @Test
  public void storeRequestTest() {
	  driver.get("http://localhost:4200/apply");
	  driver.close();
  }

  @Test
  public void updateAdharTest() {
	  driver.get("http://localhost:4200/updateaadhar");
	  driver.close();
  }

  @Test
  public void viewmyAdharTest() {
	  driver.get("http://localhost:4200/viewmyadhar");
	  driver.close();
  }
}
