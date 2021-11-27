package runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.restassured.RestAssured;
import stepdefinitions.BaseUtils;
import utils.GenericUtils;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = {"stepdefinitions"},
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		snippets = SnippetType.CAMELCASE,
		dryRun = false
//		tags = "@smoke"
)
public class TestRunner {

	@BeforeClass
	public static void beforeRun() {
		//Get the environment variable and set the base url and path
		String env = GenericUtils.getProperties("global","ENV");
		String url = GenericUtils.getProperties(env,"BASE_URL");
		String path = GenericUtils.getProperties(env,"PATH");
		BaseUtils.apiKey = GenericUtils.getProperties(env,"API_KEY");
		BaseUtils.validApiKey = GenericUtils.getProperties(env,"API_KEY");
		RestAssured.baseURI=url;
		RestAssured.basePath = path;
				
		//Code to generate text log file for logging request and response		
		RestAssured.requestSpecification = GenericUtils.getRequestSpecBuilder().build();
				
		//Response Specification to validate standard response headers
		RestAssured.responseSpecification = GenericUtils.getResponseSpecBuilder(env).build();
		
	}
}
