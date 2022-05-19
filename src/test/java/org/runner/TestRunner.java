package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdef.ReportingClass;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\resources\\Adactin1.feature" }, glue = {
		"org.stepdef" }, monochrome = true, snippets = SnippetType.CAMELCASE, dryRun = false, plugin = {
				"pretty", "html:C:\\Users\\Praveen Bpr\\Documents\\Eclipse workspace\\Cucumber1\\target",
				"json:C:\\Users\\Praveen Bpr\\Documents\\Eclipse workspace\\Cucumber1\\target\\sample.json",
				"junit:C:\\Users\\Praveen Bpr\\Documents\\Eclipse workspace\\Cucumber1\\target\\sample.junit" })
public class TestRunner {

	@AfterClass
	public static void afterClass() {

		ReportingClass.generateJVMReport("C:\\\\Users\\\\Praveen Bpr\\\\Documents\\\\Eclipse workspace\\\\Cucumber1\\\\target\\\\sample.json");

	}

}
