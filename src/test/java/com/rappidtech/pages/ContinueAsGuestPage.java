package com.rappidtech.pages;

import com.rappidtech.utilities.Driver;
import com.rappidtech.utilities.SeleniumUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.velocity.util.introspection.VelPropertySet;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContinueAsGuestPage {
    private static final Logger logger = LogManager.getLogger(ContinueAsGuestPage.class);

    /**
     * Constructor to initialize the webdriver and elements on the page
     */
    public ContinueAsGuestPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h2[.='Continue as a Guest']")
    WebElement continueAsGuestLabel;
    @FindBy(xpath = "//input[@placeholder='Enter your first name']")
    WebElement firstNameField;
    @FindBy(xpath = "//input[@placeholder='Enter your last name']")
    WebElement lastNameField;
    @FindBy(xpath = "//input[@placeholder='Enter your email address'][@id='emailAddr']")
   //"(//input[@placeholder='Enter your email address'])[1]"
    WebElement emailField;
    @FindBy(xpath = "//div[@class='col-sm-12 col-xs-12 continueBtnWrap']")
   //(//input[@id='continueGuestBtn'])[1]
    WebElement continueAsGuestButtonInGuestCheckoutPage;

    @FindBy(xpath = "//h4[@class=\'no-outline hidden-xs\']")
    WebElement orderSummaryLabel;


    //======================methods=============================================

    public boolean isFirstNameFieldDisplayed() {
        logger.info("Check is the field is displayed or not");
        SeleniumUtils.waitForVisibilityOfElement(firstNameField);
        return firstNameField.isDisplayed();
    }

    public boolean isLastNameFieldDisplayed() {
        logger.info("Check is the field is displayed or not");
        SeleniumUtils.waitForVisibilityOfElement(lastNameField);
        return lastNameField.isDisplayed();
    }

    public boolean isEmailFieldDisplayed() {
        logger.info("Check is the field is displayed or not");
        SeleniumUtils.waitForVisibilityOfElement(emailField);
        return emailField.isDisplayed();
    }

    public boolean isContinueAsGuestButtonDisplayed() {
        logger.info("Check is the button is displayed or not");
        SeleniumUtils.waitForVisibilityOfElement(continueAsGuestLabel);
        return continueAsGuestLabel.isDisplayed();
    }

//    public ArrayList<String> addValuesToFieldsInContinueAsGuestPage(List<String> listOfFields) {
//        logger.info("adding values to fields in continue as guest page");
//        ArrayList<String> values = new ArrayList<>();
//        for (int i = 0; i < listOfFields.size(); i++) {
//            if (listOfFields.get(i).equals(firstNameField)) {
//                firstNameField.click();
//                firstNameField.sendKeys("FirstName");
//            } else if (listOfFields.get(i).equals(lastNameField)) {
//                lastNameField.click();
//                lastNameField.sendKeys("LastName");
//            } else if (listOfFields.get(i).equals(emailField)) {
//                emailField.click();
//                emailField.sendKeys("email12345@gmail.com");
//            }
//        }
//        return values;
//    }
    public void clickOnConitnueAsGuestButtonInGuestPage(){
        SeleniumUtils.scrollToElementUsingJavaScriptExecutor(continueAsGuestButtonInGuestCheckoutPage);
        continueAsGuestButtonInGuestCheckoutPage.click();
    }


    public void addValuesToFieldsInContinueAsGuestPage(List<String> expectedItems) {
        firstNameField.sendKeys("FirstName");
        lastNameField.sendKeys("LastName");
        emailField.sendKeys("email12345@gmail.com");
    }
    public boolean isOrderSummaryLabelDisplayed() {
        logger.info("Check is the order summary label is displayed or not");
        SeleniumUtils.scrollToElementUsingJavaScriptExecutor(orderSummaryLabel);
        return orderSummaryLabel.isDisplayed();
    }
}

