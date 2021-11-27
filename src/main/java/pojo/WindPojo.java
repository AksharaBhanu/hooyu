package pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class WindPojo.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WindPojo {
	
	/** The speed. */
	private double speed;
	
	/** The deg. */
	private int deg;
	
	/**
	 * Gets the speed.
	 *
	 * @return the speed
	 */
	public double getSpeed() {
		return speed;
	}
	
	/**
	 * Sets the speed.
	 *
	 * @param speed the new speed
	 */
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	/**
	 * Gets the deg.
	 *
	 * @return the deg
	 */
	public int getDeg() {
		return deg;
	}
	
	/**
	 * Sets the deg.
	 *
	 * @param deg the new deg
	 */
	public void setDeg(int deg) {
		this.deg = deg;
	}
    
    
}
