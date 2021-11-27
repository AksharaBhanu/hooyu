package pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class CoordPojo.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CoordPojo {
	
	/** The lon. */
	private double lon;
    
    /** The lat. */
    private double lat;
    
	/**
	 * Gets the lon.
	 *
	 * @return the lon
	 */
	public double getLon() {
		return lon;
	}
	
	/**
	 * Sets the lon.
	 *
	 * @param lon the new lon
	 */
	public void setLon(double lon) {
		this.lon = lon;
	}
	
	/**
	 * Gets the lat.
	 *
	 * @return the lat
	 */
	public double getLat() {
		return lat;
	}
	
	/**
	 * Sets the lat.
	 *
	 * @param lat the new lat
	 */
	public void setLat(double lat) {
		this.lat = lat;
	}
}
