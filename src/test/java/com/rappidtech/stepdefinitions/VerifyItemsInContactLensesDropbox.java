package com.rappidtech.stepdefinitions;

import com.rappidtech.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import io.cucumber.datatable.DataTable;

import java.util.List;


public class VerifyItemsInContactLensesDropbox {
    HomePage homePage= new HomePage();
    @When("User clicks on Contact Lenses Link")
    public void user_clicks_on_contact_lenses_link()
    {
        homePage.clickOnContactLensesLinkOnHomePage();
    }
    @Then("User is able to see a list of items in contact lenses dropbox")
    public void user_is_able_to_see_a_list_of_items_in_contact_lenses_dropbox(List<String> expectedItems) {
        Assert.assertEquals(expectedItems,homePage.getListOfItemsInContactLensesDropBox());
    }
}
