package com.rappidtech.stepdefinitions;

import com.rappidtech.pages.CheckOutPage;
import com.rappidtech.pages.ContinueAsGuestPage;
import com.rappidtech.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class VerifyContinueAsGuest {
    CheckOutPage checkOutPage= new CheckOutPage();
    ContinueAsGuestPage continueAsGuestPage= new ContinueAsGuestPage();
    @Given("user is navigated successfully to Checkout page")
    public void user_is_navigated_successfully_to_checkout_page() {
        Driver.getDriver().get("https://www.visionworks.com/checkoutLogin?param=checkout");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @When("user clicks on continue as guest button")
    public void user_clicks_on_continue_as_guest_button() {
       checkOutPage.clickOnContinueAsGuestButton();
    }
    @Then("user is able to see continue as guest label")
    public void user_is_able_to_see_continue_as_guest_label(io.cucumber.datatable.DataTable dataTable) {
        Assert.assertTrue(continueAsGuestPage.isContinueAsGuestButtonDisplayed());
    }
}
