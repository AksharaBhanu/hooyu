package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.restassured.RestAssured;

/**
 * The Class BaseClass.
 */
public class BaseClass {
	
	/** The base utils. */
	private BaseUtils baseUtils;
	
	/**
	 * Instantiates a new base class.
	 *
	 * @param base the base
	 */
	public BaseClass(BaseUtils base) {
		this.baseUtils=base;
	}
		
	/**
	 * Before scenario.
	 * Set the RestAssured RequestSpecification object
	 */
	@Before
	public void beforeScenario(Scenario scenario) {
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Starting Execution of scenario - "+scenario.getName());
		baseUtils.rSpec = RestAssured
				.given();
				
	}				
	
	/**
	 * After scenario to reset the api key.
	 */
	@After
	public void afterScenario(Scenario scenario) {
		BaseUtils.apiKey = BaseUtils.validApiKey;	
		System.out.println("Ending Execution of scenario - "+scenario.getName());
		System.out.println("-------------------------------------------------------------------");
	}
}
