package com.TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/Feature/Testcase.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@TC01_AddtoCart","@TC02_Checkcart","@TC03_priceupdate","@TC04_storingProductDetails","@TC5_RemovefromCart"},
		glue = {"com.StepDefinition"},
		monochrome = true
		)
public class CartTR {

}
