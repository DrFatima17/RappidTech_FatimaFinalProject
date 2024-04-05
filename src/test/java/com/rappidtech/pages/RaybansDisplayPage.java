package com.rappidtech.pages;

import com.rappidtech.utilities.Driver;
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

        //===========================methods/functions==============================

    public boolean isBrandLabelDisplayed(){
        logger.info("Checking if element is displayed");
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

    }
