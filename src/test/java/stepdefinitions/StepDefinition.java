package stepdefinitions;

import org.hamcrest.Matchers;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pojo.CoordPojo;
import pojo.RootPojo;
import pojo.SysPojo;
import utils.PojoHelper;

/**
 * The Class StepDefinition.
 */
public class StepDefinition{	
	
	/** The base utils. */
	private BaseUtils baseUtils;
	
	/**
	 * Instantiates a new step definition.
	 *
	 * @param base the base
	 */
	public StepDefinition(BaseUtils base) {
		this.baseUtils = base;
	}	
	
	/**
	 * Query param has value.
	 *
	 * @param key the key
	 * @param val the val
	 */
	@Given("Query param {string} has value {string}")
	public void queryParamHasValue(String key, String val) {		
		baseUtils.rSpec.queryParam("appid", BaseUtils.apiKey);
		baseUtils.rSpec.queryParam(key, val);										
	}
	
	/**
	 * Query param has value.
	 *
	 * @param val the val
	 */
	@Given("Query param appid has value {string}")
	public void queryParamHasValue(String val) {		
		BaseUtils.apiKey = val;									
	}

	/**
	 * Request is executed.
	 *
	 * @param requestType the request type
	 */
	@When("{string} request is executed")
	public void requestIsExecuted(String requestType) {
		if(requestType.equals("GET")) {
			baseUtils.res = baseUtils.rSpec.when()
					.get();
			
			baseUtils.validatableResponse = baseUtils.res.then();			
		}
	}

	/**
	 * Verify status code.
	 *
	 * @param statusCode the status code
	 */
	@Then("Verify status code is {int}")
	public void verifyStatusCode(Integer statusCode) {
		
		baseUtils.validatableResponse
			.assertThat().statusCode(statusCode);
	}

	/**
	 * Verify body contains value.
	 *
	 * @param key the key
	 * @param value the value
	 */
	@Then("Verify body contains {string} as {string}")
	public void verifyBodyContainsValue(String key, String value) {
		baseUtils.validatableResponse
			.body(key, Matchers.equalTo(value));
	}

	/**
	 * Verify body contains value.
	 *
	 * @param key the key
	 * @param value the value
	 */
	@Then("Verify body contains {string} as {int}")
	public void verifyBodyContainsValue(String key, Integer value) {
		baseUtils.validatableResponse
		.body(key, Matchers.equalTo(value));
	}

	/**
	 * Verify json in response body.
	 * Deserialization using the POJO class helps in validation of the response body against the known schema/model 
	 * @param key the key
	 * @param val the val
	 * @param parent the parent
	 */
	@Then("Verify {string} is {string} in {string} of response body")
	public void verifyJsonInResponseBody(String key, String val, String parent) {
		switch (parent) {
		case "coord":
			CoordPojo coordPojo = baseUtils.validatableResponse.extract().as(RootPojo.class).getCoord();
			PojoHelper.verifyCoordinates(coordPojo, key, val);
			break;
			
		case "sys":
			SysPojo sysPojo = baseUtils.validatableResponse.extract().as(RootPojo.class).getSys();
			PojoHelper.verifySys(sysPojo, key, val);
			break;

		default:
			break;
		}
	}


}
