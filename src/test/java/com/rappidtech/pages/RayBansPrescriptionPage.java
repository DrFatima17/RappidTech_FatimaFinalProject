package com.rappidtech.pages;

import com.rappidtech.utilities.Driver;
import com.rappidtech.utilities.SeleniumUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RayBansPrescriptionPage {
    private static final Logger logger = LogManager.getLogger(RayBansPrescriptionPage.class);

    /**
     * Constructor to initialize the webdriver and elements on the page
     */
    public RayBansPrescriptionPage() {
        PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//input[@id='prescription']")
    WebElement radioButtonPrescription;

    @FindBy(xpath = "//input[@id='nonprescription']")
    WebElement radioButtonNonPrescription;

    @FindBy(xpath = "//button[@class='selection-btn btn primary hidden-xs']")
    WebElement checkoutButton;


    //=============================methods/funtions============================================

    public void clickOnNonPrescriptionButton(){
        radioButtonNonPrescription.click();
    }

    public void clickOnCheckoutButton(){
        SeleniumUtils.waitForVisibilityOfElement(checkoutButton);
        SeleniumUtils.scrollToElementUsingJavaScriptExecutor(checkoutButton);
        checkoutButton.click();
    }
}
