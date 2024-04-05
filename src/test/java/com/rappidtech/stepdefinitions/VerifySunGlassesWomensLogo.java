package com.rappidtech.stepdefinitions;

import com.rappidtech.pages.HomePage;
import com.rappidtech.pages.WomensSunGlassesPage;
import com.rappidtech.utilities.SeleniumUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class VerifySunGlassesWomensLogo {
HomePage homePage= new HomePage();
WomensSunGlassesPage womensSunGlassesPage= new WomensSunGlassesPage();

    @When("user clicks on Sunglasses Dropbox")
    public void user_clicks_on_sunglasses_dropbox() {
        homePage.clickOnSunglassesLinkOnHomePage();
    }
    @And("user clicks on Womens link")
    public void user_clicks_on_womens_link() {
        homePage.clickOnWomensSunGlassesLinkOnHomePage();

    }
    @Then("user is able to see Logo {string}")
    public void user_is_able_to_see_logo(String expectedLogo) {
        Assert.assertTrue(womensSunGlassesPage.isWomensSunglassesLabelDisplayed());
    }
}
