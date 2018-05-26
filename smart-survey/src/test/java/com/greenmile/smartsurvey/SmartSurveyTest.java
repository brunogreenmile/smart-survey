package com.greenmile.smartsurvey;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:historyes", tags = "@SmartSurveyTest", 
glue = "com.greenmile.smartsurvey.test.steps", monochrome = true, dryRun = false)
public class SmartSurveyTest {
}