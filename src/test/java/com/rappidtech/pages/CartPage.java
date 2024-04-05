package com.rappidtech.pages;

import com.rappidtech.utilities.Driver;
import com.rappidtech.utilities.SeleniumUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    private static final Logger logger = LogManager.getLogger(CartPage.class);

    /**
     * Constructor to initialize the webdriver and elements on the page
     */
    public CartPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "//p[@class='h5 vwCartheading'][.='Frame :']")
    WebElement frameLabel;
    @FindBy(xpath = "//p[@class='h5 vwCartheading'][.='Prescription Type']")
    WebElement prescriptionTypeLabel;
    @FindBy(xpath = "//p[@class='h5 vwCartheading'][.='Lens Material :']")
    WebElement lensMaterialLabel;
    @FindBy(xpath = "//span[@class='pull-right p-price text-nowrap p-sale-price font-weight-bold']")
    WebElement itemPriceLabel;

    @FindBy(xpath = "//button[@class='cc-button-primary btn primary btn-checkout col-xs-12']")
    WebElement checkoutButtonInCartPage;

    //=================================methods/functions====================================

    public boolean isFrameLabelDisplayed(){
        logger.info("Check is frame label is displayed or not");
        SeleniumUtils.waitForVisibilityOfElement(frameLabel);
        return frameLabel.isDisplayed();
    }

    public boolean isPrescriptionLabelDisplayed(){
        logger.info("Check is prescription type label is displayed or not");
        return prescriptionTypeLabel.isDisplayed();
    }
    public boolean isLensMaterialLabelDisplayed(){
        logger.info("Check is lens material label is displayed or not");
        return lensMaterialLabel.isDisplayed();
    }
    public boolean isItemPriceLabelDisplayed(){
        logger.info("Check is item price label is displayed or not");
        return itemPriceLabel.isDisplayed();
    }

    public void clickOnCheckOutButton(){
        logger.info("Clicking on checkout button");
        checkoutButtonInCartPage.click();
    }
}
