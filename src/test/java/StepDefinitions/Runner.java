package StepDefinitions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"src\\test\\resources\\Features"},glue={"StepDefinitions"},plugin={})
public class Runner extends AbstractTestNGCucumberTests 
{
	
}
