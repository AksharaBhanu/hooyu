package pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class WeatherPojo.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherPojo {
	
	/** The id. */
	private int id;
	
	/** The main. */
	private String main;
	
	/** The description. */
	private String description;
	
	/** The icon. */
	private String icon;
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Gets the main.
	 *
	 * @return the main
	 */
	public String getMain() {
		return main;
	}
	
	/**
	 * Sets the main.
	 *
	 * @param main the new main
	 */
	public void setMain(String main) {
		this.main = main;
	}
	
	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * Sets the description.
	 *
	 * @param description the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * Gets the icon.
	 *
	 * @return the icon
	 */
	public String getIcon() {
		return icon;
	}
	
	/**
	 * Sets the icon.
	 *
	 * @param icon the new icon
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}
	
	
}
