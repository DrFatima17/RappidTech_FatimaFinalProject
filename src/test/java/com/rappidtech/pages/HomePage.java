package com.rappidtech.pages;

import com.rappidtech.utilities.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class HomePage {
    private static final Logger logger = LogManager.getLogger(HomePage.class);

    /**
     * Constructor to initialize the webdriver and elements on the page
     */
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//img[@class='img']")
    WebElement logoHomePage;

    @FindBy(xpath = "//li[@class='dropdown dropdownSignin']")
    WebElement myAccountButton;

    @FindBy(xpath = "//a[@class='btn primary signInButton']")
    WebElement signinLink;

    @FindBy(xpath = "//a[@title='Glasses']")
    WebElement glassesLink;
    @FindBy(xpath = "//a[@title='Sunglasses']")
    WebElement sunglassesLink;
    @FindBy(xpath = "//a[@title='Contact Lenses']")
    WebElement contactlensesLink;
    @FindBy(xpath = "//a[@title='Brands']")
    WebElement brandsLink;
    @FindBy(xpath = "//li[@class='mega-menu-desktop-level-1 lenses hidden-xs']")
    WebElement lensesLink;
    @FindBy(xpath = "//a[.='Offers']")
    WebElement offersLink;

    @FindBy(xpath = "//ul[@class='mega-menu-desktop-level-1-container nav navbar-nav occ-data-category row']")
    List<WebElement> listOfItemLinks;
    //=======================methods/functions===================================

    /**
     * This method will return the company logo of the homepage logo in the UI
     * @return strings of the company logo
     */
    public String getHomePageCompanyLogo(){
        logger.info("Getting the Home Page Company Logo");
        return logoHomePage.getAttribute("alt");
    }

    public void clickMyAccountButton(){
        logger.info("Clicking on My Account Button on Home Page");
        myAccountButton.click();
    }
    public void clickSigninLink(){
        logger.info("Clicking on sign in link on Home Page");
        signinLink.click();
    }

    /**
     * This method will get the list of the inventory items from the main page
     * @return list of inventory items
     */
    public ArrayList<String> getListOfItemLinks(){
        logger.info("Getting the items from home page");
        ArrayList<String> inventory = new ArrayList<>();
        for(WebElement item : listOfItemLinks){
            logger.info("Items are: {" + item.getText() +"} ");
            inventory.add(item.getText());
        }
        return inventory;
    }


}