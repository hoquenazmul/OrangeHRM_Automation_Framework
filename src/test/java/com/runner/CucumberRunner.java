package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	plugin= {"pretty","json:target/cucumber.json" }, // for html= {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" },	
	features = {".//features/"}, 
    glue = {"com.stepdefs","com.hooks"}, 	
    tags = "@OrangeHRM_44001 or @OrangeHRM_44002",
	dryRun = false, 
	monochrome = true
)

public class CucumberRunner extends AbstractTestNGCucumberTests {

}
