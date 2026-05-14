package runners;

import java.security.cert.TrustAnchor;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/Feature/search.feature"}
,glue = "step_defination",
monochrome = true,
dryRun=false,
plugin= {"pretty","html:target\\htmlRepoerOfCurrentTestCases.html"}
		
		)
public class RunnerClass extends AbstractTestNGCucumberTests  {

	
}
