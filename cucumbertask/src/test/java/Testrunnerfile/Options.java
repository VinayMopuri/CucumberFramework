package Testrunnerfile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\VINAY\\eclipse-workspace\\cucumbertask\\src\\test\\java\\Featurefile\\user.feature",
glue = {"Stepdefinitionfile"},
plugin = {"pretty","html:target/login.html"})


public class Options {
	
	

}
