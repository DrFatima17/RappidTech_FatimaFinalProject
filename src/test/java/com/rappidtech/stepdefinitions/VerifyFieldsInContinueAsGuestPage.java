package com.rappidtech.stepdefinitions;

import com.rappidtech.pages.CheckOutPage;
import com.rappidtech.pages.ContinueAsGuestPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import io.cucumber.datatable.DataTable;

import java.util.Arrays;
import java.util.List;

public class VerifyFieldsInContinueAsGuestPage {
    ContinueAsGuestPage continueAsGuestPage= new ContinueAsGuestPage();
    CheckOutPage checkOutPage= new CheckOutPage();
    @Then("user is able to enter following values in their proper input boxes")
    public void user_is_able_to_enter_following_values_in_their_proper_input_boxes(List<String>expectedValue) {
        //List<String> actualValue = Arrays.asList(continueAsGuestPage.getListOfActualFields());
        Assert.assertEquals(continueAsGuestPage.addvaluesToFieldsInContinueAsGuestPage(list, expectedValue);
    }
}