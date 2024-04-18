package cucucmberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",
glue="stepDefinitions",monochrome=true, tags ="@RegressionTest",plugin= {"pretty","html: target/cucumber1.json"})
public class TestNGRunner extends AbstractTestNGCucumberTests{
	
	

}
