package com.rappidtech.stepdefinitions;

import com.rappidtech.pages.HomePage;
import com.rappidtech.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class VerifyLogoDisplayHomePage {
    HomePage homePage= new HomePage();

    @Given("User is navigated successfully to Visionworks Home Page")
    public void user_is_navigated_successfully_on_home_page() {
        Driver.getDriver().get("https://www.visionworks.com/");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Then("User is able to see the company logo")
    public void user_is_able_to_see_the_company_logo() {
        Assert.assertEquals("VisionWorks home",homePage.getHomePageCompanyLogo());
    }
}
