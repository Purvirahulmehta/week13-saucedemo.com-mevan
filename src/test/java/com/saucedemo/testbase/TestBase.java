package com.saucedemo.testbase;

import com.saucedemo.propertyreader.PropertyReader;
import com.saucedemo.utility.Utility;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

public class TestBase extends Utility {
    String browser= PropertyReader.getInstance().getProperty("browser");
    @BeforeTest
    public void setUp(){
        selectBrowser(browser);
    }
    @AfterClass
    public void tearDown(){
        closeBrowser();
    }

}
