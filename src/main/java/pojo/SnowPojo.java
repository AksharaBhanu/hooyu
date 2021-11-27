package pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

// TODO: Auto-generated Javadoc
/**
 * The Class SnowPojo.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SnowPojo {
	
	/** The 1 h. */
	@JsonProperty("1h") 
    private double _1h;

	/**
	 * Gets the 1 h.
	 *
	 * @return the 1 h
	 */
	public double get_1h() {
		return _1h;
	}

	/**
	 * Sets the 1 h.
	 *
	 * @param _1h the new 1 h
	 */
	public void set_1h(double _1h) {
		this._1h = _1h;
	}
	
	
}
