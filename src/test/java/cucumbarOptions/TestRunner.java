package cucumbarOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;



	//@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src/test/java/features"
			,glue="stepDefinations",tags= "@NewSiteFormTest" ,monochrome=true,
					plugin= {"pretty","html:target/cucumber"})

	
	 //@CucumberOptions("src/test/java/features"= {"login.feature","NewSiteNavigation.feature"})
	
	
	public class TestRunner extends AbstractTestNGCucumberTests{
		
	}
			
	

