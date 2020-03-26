package com.TestRunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/Feature/Testcase.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report","json:reports/cucumber-html-report/jsonreport","com.cucumber.listener.ExtentCucumberFormatter:reports/Extentreports/Extentreport.html"},
		// tags = {"@TC01_AddtoCart","@TC02_Checkcart","@TC03_priceupdate","@TC04_storingProductDetails","@TC5_RemovefromCart"},
		glue = {"com.StepDefinition"},
		monochrome = true
		)
public class CartTR {
	@AfterClass
	public static void extendReport() {
	      Reporter.loadXMLConfig("src\\extent-config.xml");
	      Reporter.setSystemInfo("user", System.getProperty("user.name"));
	      Reporter.setSystemInfo("os","Windows");
	      Reporter.setTestRunnerOutput("Sample test runner output message");
	}
}
