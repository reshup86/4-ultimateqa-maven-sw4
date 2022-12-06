package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By textMessage = By.xpath("//h1[@class=\"page__heading\"]");
    By emailField = By.id("user[email]");
    By passwordField = By.id("user[password]");
    By signInButton = By.xpath("//input[@type=\"submit\"]");

    By errorMessage = By.xpath("//li[contains(text(),\"Invalid email or password.\")]");

    public String getTextMessage(){
        return getTextFromElement(textMessage);
    }
    public void enterInvalidEmail(String email){
        sendTextToElement(emailField,email);
    }
    public void enterInvalidPassword(String password){
        sendTextToElement(passwordField,password);
    }
    public void clickOnSignInButton(){
        clickOnElement(signInButton);
    }
    public String getErrorMessage(){
        return getTextFromElement(errorMessage);
    }
}
