package utils;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

import pojo.CoordPojo;
import pojo.SysPojo;

// TODO: Auto-generated Javadoc
/**
 * The Class PojoHelper.
 */
public class PojoHelper {

	/**
	 * Verify coordinate values from the response body
	 *
	 * @param coordPojo the coord pojo
	 * @param key the key
	 * @param val the val
	 */
	public static void verifyCoordinates(CoordPojo coordPojo, String key, String val) {
		double dVal = Double.parseDouble(val);
		switch (key) {
		case "lat":			
			MatcherAssert.assertThat(coordPojo.getLat(), Matchers.equalTo(dVal));	
			break;
			
		case "lon":
			MatcherAssert.assertThat(coordPojo.getLon(), Matchers.equalTo(dVal));	
			break;
			
		default:
			break;
		}		
		
	}
	
	/**
	 * Verify sys values from the response body
	 *
	 * @param sysPojo the sys pojo
	 * @param key the key
	 * @param val the val
	 */
	public static void verifySys(SysPojo sysPojo, String key, String val) {
		switch (key) {
		case "country":
			MatcherAssert.assertThat(sysPojo.getCountry(), Matchers.equalTo(val));	
			break;
								
		default:
			break;
		}
		
		
	}
}
