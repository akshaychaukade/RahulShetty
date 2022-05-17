package com.companyproject.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.companyproject.Utility.BaseFramework;
import com.companyproject.pages.HomePage;

public class HomePageTest extends BaseFramework{
	
	@Test
    public void functionalitiesCheck() throws InterruptedException {
    	//HomePage home=new HomePage();
    	HomePage home=PageFactory.initElements(driver, HomePage.class);
    	Thread.sleep(5000);
    	home.clickOnRadioBtn1();
    	
	}
}
