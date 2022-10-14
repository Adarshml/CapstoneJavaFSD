package com.mAadhar.testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;

public class LoginServiceTest {
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
  public void signInTest() {
	  driver.get("http://localhost:4200/login");
	  driver.close();
  }

  @Test
  public void signUpTest() {
	  driver.get("http://localhost:4200/signup");
	  driver.close();
  }
}
