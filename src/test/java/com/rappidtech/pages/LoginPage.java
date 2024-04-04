package com.rappidtech.pages;

import com.rappidtech.utilities.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private static final Logger logger = LogManager.getLogger(LoginPage.class);


    /**
     * Constructor to initialize the webdriver and elements on the page
     */
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

@FindBy(xpath = "//h2[.='Sign In']")
WebElement signInLogo;
    @FindBy(xpath = "//input[@name='userlogin']")
    WebElement emailField;
    @FindBy(xpath = "//input[@name='password']")
    WebElement passwordField;
    @FindBy(xpath = "//input[@name='rememberMe']")
    WebElement rememberMeButton;
    @FindBy(xpath = "//input[@name='button']")
    WebElement signInButton;

    //====================methods/ funtions=======================


    /**
     * This method will return true/false if field is displayed or not
     * @return true/false
     */
    public boolean isSignInLabelDisplayed(){
        logger.info("Checking if Sign In is displayed");
        return signInLogo.isDisplayed();
    }

    /**
     * This method will return true/false if field is displayed or not
     * @return true/false
     */
    public boolean isEmailInputBoxDisplayed(){
        logger.info("Checking if email is displayed");
        return  emailField.isDisplayed();
    }
    /**
     * This method will return true/false if field is displayed or not
     * @return true/false
     */
    public boolean isPasswordInputBoxDisplayed(){
        logger.info("Checking if password is displayed");
        return  passwordField.isDisplayed();
    }
    /**
     * This method will return true/false if field is displayed or not
     * @return true/false
     */
    public boolean isRememberMeButtonDisplayed(){
        logger.info("Checking if Remember Me is displayed");
        return rememberMeButton.isDisplayed();
    }
    /**
     * This method will return true/false if field is displayed or not
     * @return true/false
     */
    public boolean isSignInButtonDisplayed(){
        logger.info("Checking if sign in is displayed");
        return signInButton.isDisplayed();
    }
}
