package com.rappidtech.stepdefinitions;

import com.rappidtech.pages.CheckOutPage;
import com.rappidtech.pages.ContinueAsGuestPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import io.cucumber.datatable.DataTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VerifyFieldsInContinueAsGuestPage {
    ContinueAsGuestPage continueAsGuestPage= new ContinueAsGuestPage();
    CheckOutPage checkOutPage= new CheckOutPage();
    @And("user is able to enter following values in their proper input boxes")
    public void userIsAbleToEnterFollowingValuesInTheirProperInputBoxes(List<String> expectedItems) {
        continueAsGuestPage.addValuesToFieldsInContinueAsGuestPage(expectedItems);
    }
    @When("user clicks on continue as guest button in guest page")
    public void user_clicks_on_continue_as_guest_button_in_guest_page() {
       continueAsGuestPage.clickOnConitnueAsGuestButtonInGuestPage();
    }
    @Then("user is able to see the order summary")
    public void user_is_able_to_see_the_order_summary() {
Assert.assertTrue(continueAsGuestPage.isOrderSummaryLabelDisplayed());
    }

}