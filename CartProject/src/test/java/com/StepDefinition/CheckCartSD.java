package com.StepDefinition;

import com.Pages.CheckCart;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckCartSD {
	CheckCart check=new CheckCart();
	@Given("^url opens in chrome browser$")
	public void url_opens_in_chrome_browser() throws Throwable {
	   check.url("chrome");
	}

	@When("^the user clicks on Cart option$")
	public void the_user_clicks_on_Cart_option() throws Throwable {
	    check.homepage();
	}

	@Then("^the user checks the product$")
	public void the_user_checks_the_product() throws Throwable {
	    check.check();
	}

	@Then("^confirms the product we added is present or not$")
	public void confirms_the_product_we_added_is_present_or_not() throws Throwable {
	    check.assert1();
	}
}
