package com.companyproject.Utility;

import org.openqa.selenium.remote.RemoteWebDriver;
import static com.companyproject.Utility.Keywords.*;
public class PageBase {
	public  RemoteWebDriver driver;
    public PageBase() {
    	this.driver=BaseFramework.driver;
	}
}
