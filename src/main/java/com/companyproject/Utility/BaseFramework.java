package com.companyproject.Utility;

import static com.companyproject.Utility.Keywords.*;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseFramework {
	public static RemoteWebDriver driver;

	@BeforeMethod
	public void setUp() {
		openBrowser("chrome");
		launchURL("https://rahulshettyacademy.com/AutomationPractice/");
	}

	/*
	 * @AfterMethod public void teardown() { closetab(); }
	 */
}
