package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.Products;
import com.saucedemo.testbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class LoginPageTest extends TestBase {
    LoginPage loginPage=new LoginPage();
    Products products=new Products();
    @Test
    public void userSholdLoginSuccessfullyWithValid() throws InterruptedException {
            loginPage.username("standard_user");
            loginPage.password("secret_sauce");
            loginPage.clickOnLogin();
            String expectedMessage="PRODUCTS";
            String actualMessage=loginPage.verifyProductText();
            Thread.sleep(1000);
        Assert.assertEquals(actualMessage,expectedMessage, "Page is not found");
        }
        @Test
    public void verifyThatSixProductsAreDisplayedOnPage(){
        loginPage.username("“standard_user”");
        loginPage.password("“secret_sauce”");
        loginPage.clickOnLogin();
        int expectedDisplayed= 6;
        int actualDisplayed=products.products();
        Assert.assertEquals(actualDisplayed,expectedDisplayed,"page is not as per requirment");

           
            }

                }









