package org.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="@src\\test\\resources\\Reports\\failedScenario\\failed.txt",
glue="org.stepDefinition")
public class TestRERunner {

}
