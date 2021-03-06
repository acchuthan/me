package org.runnerc;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utilityclass.Jvmreport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources", glue = "org.stepdefinition", plugin = { "pretty",
		"html:src\\test\\resources\\Reports", "json:src\\test\\resources\\Reports\\mypro.json",
		"junit:src\\test\\resources\\Reports\\output.xml" }, dryRun = false, tags = "@sanity")
public class Runner {

	@AfterClass
	public static void Report() {
		Jvmreport.reportjvm(System.getProperty("user.dir" + "\\src\\test\\resources\\Reports\\mypro.json"));

	}
}
