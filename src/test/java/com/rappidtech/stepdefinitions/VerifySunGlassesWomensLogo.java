package com.rappidtech.stepdefinitions;

import com.rappidtech.pages.HomePage;
import com.rappidtech.pages.WomensSunGlassesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class VerifySunGlassesWomensLogo {
HomePage homePage= new HomePage();
WomensSunGlassesPage womensSunGlassesPage= new WomensSunGlassesPage();
    @Given("user clicks on Sunglasses Dropbox")
    public void user_clicks_on_sunglasses_dropbox() {
        homePage.clickOnSunglassesLinkOnHomePage();
    }
    @And("user clicks on Women's link")
    public void user_clicks_on_women_s_link() {
        homePage.clickOnWomensSunGlassesLinkOnHomePage();
    }
    @Then("user is able to see Logo {string}")
    public void user_is_able_to_see_logo(String string) {
        Assert.assertTrue(womensSunGlassesPage.isWomensSunglassesLabelDisplayed());
    }
}
