package com.rappidtech.pages;

import com.rappidtech.utilities.Driver;
import com.rappidtech.utilities.SeleniumUtils;
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

    @FindBy(xpath = "//h3[@title='Chelsea Morgan CMS 20212']")
    WebElement ChelseaMorganSunglass;

    @FindBy(xpath = "//h3[@id='CC-product-grid-displayName-0214010050084-20']")
    WebElement raybanSunglasses;


    //===========================methods/funtions=================

    public boolean isWomensSunglassesLabelDisplayed(){
        logger.info("Checking if Label is displayed  on Women's Sunglasses Page");
        SeleniumUtils.waitForVisibilityOfElement(womensSunGlassesLogo);
        return womensSunGlassesLogo.isDisplayed();
    }

    public void clickOnChelseaMorganSunglasses(){
        logger.info("Clicking on Chelsea Morgan Sunglasses on Women's Sunglasses Page");
        ChelseaMorganSunglass.click();
    }

    public void clickOnRaybanSunglasses(){
        logger.info("Clicking on RayBan Sunglasses on Women's Sunglasses Page");
        SeleniumUtils.scrollToElementUsingJavaScriptExecutor(raybanSunglasses);
        raybanSunglasses.click();
    }

}
