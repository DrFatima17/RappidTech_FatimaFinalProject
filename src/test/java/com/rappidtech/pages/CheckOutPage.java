package com.rappidtech.pages;

import com.rappidtech.utilities.Driver;
import com.rappidtech.utilities.SeleniumUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
    private static final Logger logger = LogManager.getLogger(CheckOutPage.class);

    /**
     * Constructor to initialize the webdriver and elements on the page
     */
    public CheckOutPage() {
        PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//h3[.='New Customers']")
    WebElement newCustomerLabel;

    @FindBy(xpath = "(//input[@class='btn primary btn-signin'])[1]")
    WebElement continueAsGuestButton;

    //===================methods/funtions=======================

    public boolean isNewCustomerLabelDisplayed(){
        logger.info("Check if New Customer Label is displayed");
        SeleniumUtils.waitForVisibilityOfElement(newCustomerLabel);
        return newCustomerLabel.isDisplayed();
    }
    public void clickOnContinueAsGuestButton(){
        SeleniumUtils.waitForVisibilityOfElement(continueAsGuestButton);
        continueAsGuestButton.click();
    }

}
