package com.rappidtech.pages;

import com.rappidtech.utilities.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomensSunGlassesPage {
    private static final Logger logger = LogManager.getLogger(WomensSunGlassesPage.class);

    /**
     * Constructor to initialize the webdriver and elements on the page
     */
    public WomensSunGlassesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//div[@id='glassesDeptA']/h1")
    WebElement womensSunGlassesLogo;
    //===========================methods/funtions=================

    public boolean isWomensSunglassesLabelDisplayed(){
        logger.info("Checking if Label is displayed  on Women's Sunglasses Page");
        return womensSunGlassesLogo.isDisplayed();
    }

}
