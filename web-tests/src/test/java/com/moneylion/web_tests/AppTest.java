package com.moneylion.web_tests;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.cdimascio.dotenv.Dotenv;

public class AppTest{
	
	WebDriver driver;
	public Properties properties;
	Dotenv dotenv = Dotenv.load();
	
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@AfterMethod
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
	
	@Test
	public void visitAboutUSPage() {
		driver.get(dotenv.get("BASE_URL"));
		String title = driver.getTitle();
		System.out.println("Page title is: " + title);
		assert title.contains("MoneyLion");
	}
}