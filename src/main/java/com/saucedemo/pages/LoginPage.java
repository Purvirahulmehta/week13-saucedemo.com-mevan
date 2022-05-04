package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By usernameLink=By.xpath("//input[@id='user-name']");
    By passwordLink=By.xpath("//input[@id='password']");
    By logInLink=By.xpath("//input[@id='login-button']");
    By productPage=By.xpath("//span[contains(text(),'Products')]");//products header xpath
    By product=By.xpath("//div[@id='']");//one of the products xpath

   public void username(String textUserName){
       sendTextToElement(usernameLink,"standard_user");
    }
    public void password(String textpassword){
   sendTextToElement(passwordLink,"secret_sauce");
   }
   public void clickOnLogin(){
       clickOnElement(logInLink);
   }
   public void productlist(){
        clickOnElement(productPage);

   }
    public String verifyProductText(){
        return getTextFromElement(productPage);

    }
}

