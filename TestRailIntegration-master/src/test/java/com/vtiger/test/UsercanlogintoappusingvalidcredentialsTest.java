package com.vtiger.test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.gurock.test.BaseClass;
import com.gurock.test.TestRailManager;
import com.gurock.testrail.APIException;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsercanlogintoappusingvalidcredentialsTest extends BaseClass {
	
	
	
	@Test
	public void userCanloginToApp() throws Throwable, APIException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Isti Wiska\\eclipse-workspace\\TestRailIntegration-master\\TestRailIntegration-master (1).zip_expanded\\TestRailIntegration-master\\src\\test\\java\\Drivergeckodriver.exe");
		
		TestcaseID="1";
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("manager", Keys.ENTER);
		
		TestRailManager.addResultForTestCase(TestcaseID, TestRailManager.TEST_CASE_FAILED_STATUS, "");
		
	}

}
