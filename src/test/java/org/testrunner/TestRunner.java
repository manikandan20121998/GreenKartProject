package org.testrunner;

import org.base.JVMReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",
glue="org.stepdefinition",
monochrome=true,
dryRun=false,tags="@E2E",
plugin= {"pretty",
		"usage:usage.txt",
		"html:src\\test\\resources\\Reports\\htmlreport",
		"json:src\\test\\resources\\Reports\\jsonReport\\jsonrep.json",
		"junit:src\\test\\resources\\Reports\\junitReport\\junit.xml",
		"rerun:src\\test\\resources\\Reports\\failedScenario\\failed.txt"	
})
public class TestRunner {
	@AfterClass
	public static void generateReport() {
		JVMReport.generateJVMReport("src\\test\\resources\\Reports\\jsonReport\\jsonrep.json");
		System.out.println("........Done..........");
	}

}
