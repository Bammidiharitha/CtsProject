package com.StepDefinition;

import com.Pages.PriceUpdate;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PriceUpdateSD {
PriceUpdate price=new PriceUpdate();
	
	
	@Given("^the url open in chrome browser$")
	public void the_url_open_in_chrome_browser() throws Throwable {
	    price.url("chrome");
	}

	@When("^user click on cart option$")
	public void user_click_on_cart_option() throws Throwable {
	    price.homepage();
	}

	@Then("^increase the quantity of the product$")
	public void increase_the_quantity_of_the_product() throws Throwable {
	    price.actions();
	    price.Screenshot("C:\\Users\\DELL\\git\\CtsProject\\CartProject\\Screenshot\\image.jpeg");
	}

	@Then("^click on refresh button$")
	public void click_on_refresh_button() throws Throwable {
	    price.incquan();
	}
}
