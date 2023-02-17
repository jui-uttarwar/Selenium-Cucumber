package runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", features = "C:\\Users\\karan\\OneDrive\\Desktop\\MySeleniumFramework\\myselenium\\src\\main\\java\\Feature", glue = {
		"Stepdefinations" },plugin = { "pretty" } , monochrome = true, publish = true)
					
public class TestRunner  extends AbstractTestNGCucumberTests  {
    
}
