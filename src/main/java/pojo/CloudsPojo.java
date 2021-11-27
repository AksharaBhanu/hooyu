package pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class CloudsPojo.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CloudsPojo {
	
	/** The all. */
	private int all;

	/**
	 * Gets the all.
	 *
	 * @return the all
	 */
	public int getAll() {
		return all;
	}

	/**
	 * Sets the all.
	 *
	 * @param all the new all
	 */
	public void setAll(int all) {
		this.all = all;
	}
}
