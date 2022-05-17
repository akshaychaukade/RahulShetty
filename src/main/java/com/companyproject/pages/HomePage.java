package com.companyproject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.companyproject.Utility.PageBase;

public class HomePage extends PageBase {
	/*
	 * public HomePage() { PageFactory.initElements(driver, this); }
	 */
	@FindBy(xpath = "//button[@id=\'openwindow\']")
	WebElement RadioBtn1;

	public void clickOnRadioBtn1() {
		RadioBtn1.click();
	}

}
