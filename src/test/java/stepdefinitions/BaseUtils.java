package stepdefinitions;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

/**
 * The Class BaseUtils.
 * This is a pico-container dependency injection class to maintain the Request and Response for RestAssured
 */
public class BaseUtils {

	/** The r spec. */
	RequestSpecification rSpec;
	
	/** The res. */
	Response res;
	
	/** The validatable response. */
	ValidatableResponse validatableResponse;
	
	/** The api key. */
	public static String apiKey;
	
	/** The valid api key. */
	public static String validApiKey;
}
