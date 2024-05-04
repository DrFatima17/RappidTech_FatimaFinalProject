package com.rappidtech.pages;

import com.rappidtech.utilities.Driver;
import com.rappidtech.utilities.SeleniumUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RaybansDisplayPage {
    private static final Logger logger = LogManager.getLogger(RaybansDisplayPage.class);

    /**
     * Constructor to initialize the webdriver and elements on the page
     */
    public RaybansDisplayPage() {
        PageFactory.initElements(Driver.getDriver(), this);}
        @FindBy(xpath = "//span[@class='data-brand']")
        WebElement brandLabel;
// //span[@class='data-brand]
        @FindBy(xpath = "//span[@class='data-color']")
        WebElement colorframeLabel;
        @FindBy(xpath = "//span[@class='p-name data-name']")
        WebElement skuLabel;
        @FindBy(xpath = "//div[@class='col-md-3 col-sm-3 col-xs-3 title']")
        WebElement colorsLabel;
        @FindBy(xpath = "//div[.='Frame:']")
        WebElement frameLabel;
        @FindBy(xpath = "//div[@class='text-normal data-price']")
        WebElement priceLabel;

        @FindBy(xpath = "//button[@class='btn btn-lg primary btn-addToCart center-block']")
        WebElement addToCartButton;

        //===========================methods/functions==============================

    public boolean isBrandLabelDisplayed(){
        logger.info("Checking if element is displayed");
        SeleniumUtils.waitForVisibilityOfElement(brandLabel);
        return  brandLabel.isDisplayed();
    }
    public boolean isColorFrameLabelDisplayed(){
        logger.info("Checking if element is displayed");
        return colorframeLabel.isDisplayed();
    }
    public boolean isSkuLabelDisplayed(){
        logger.info("Checking if element is displayed");
        return  skuLabel.isDisplayed();
    }
    public boolean isColorsLabelDisplayed(){
        logger.info("Checking if element is displayed");
        return  colorsLabel.isDisplayed();
    }
    public boolean isFrameLabelDisplayed(){
        logger.info("Checking if element is displayed");
        return  frameLabel.isDisplayed();
    }
    public boolean isPriceLabelDisplayed(){
        logger.info("Checking if element is displayed");
        return  priceLabel.isDisplayed();
    }
    public void clickOnAddToCartButton(){
        logger.info("Clicking on Add to Cart Button");
        SeleniumUtils.scrollToElementUsingJavaScriptExecutor(addToCartButton);
        addToCartButton.click();
    }

    }
