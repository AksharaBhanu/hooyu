package pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
// TODO: Auto-generated Javadoc
/**
 * The Class RootPojo.
 */
public class RootPojo{
    
    /** The coord. */
    private CoordPojo coord;
    
    /** The weather. */
    private List<WeatherPojo> weather;
    
    /** The base. */
    private String base;
    
    /** The main. */
    private MainPojo main;
    
    /** The visibility. */
    private int visibility;
    
    /** The wind. */
    private WindPojo wind;
    
    /** The snow. */
    private SnowPojo snow;
    
    /** The rain. */
    private RainPojo rain;
    
    /** The clouds. */
    private CloudsPojo clouds;
    
    /** The dt. */
    private int dt;
    
    /** The sys. */
    private SysPojo sys;
    
    /** The timezone. */
    private int timezone;
    
    /** The id. */
    private int id;
    
    /** The name. */
    private String name;
    
    /** The cod. */
    private int cod;
	
	/**
	 * Gets the coord.
	 *
	 * @return the coord
	 */
	public CoordPojo getCoord() {
		return coord;
	}
	
	/**
	 * Sets the coord.
	 *
	 * @param coord the new coord
	 */
	public void setCoord(CoordPojo coord) {
		this.coord = coord;
	}
	
	/**
	 * Gets the weather.
	 *
	 * @return the weather
	 */
	public List<WeatherPojo> getWeather() {
		return weather;
	}
	
	/**
	 * Sets the weather.
	 *
	 * @param weather the new weather
	 */
	public void setWeather(List<WeatherPojo> weather) {
		this.weather = weather;
	}
	
	/**
	 * Gets the base.
	 *
	 * @return the base
	 */
	public String getBase() {
		return base;
	}
	
	/**
	 * Sets the base.
	 *
	 * @param base the new base
	 */
	public void setBase(String base) {
		this.base = base;
	}
	
	/**
	 * Gets the main.
	 *
	 * @return the main
	 */
	public MainPojo getMain() {
		return main;
	}
	
	/**
	 * Sets the main.
	 *
	 * @param main the new main
	 */
	public void setMain(MainPojo main) {
		this.main = main;
	}
	
	/**
	 * Gets the visibility.
	 *
	 * @return the visibility
	 */
	public int getVisibility() {
		return visibility;
	}
	
	/**
	 * Sets the visibility.
	 *
	 * @param visibility the new visibility
	 */
	public void setVisibility(int visibility) {
		this.visibility = visibility;
	}
	
	/**
	 * Gets the wind.
	 *
	 * @return the wind
	 */
	public WindPojo getWind() {
		return wind;
	}
	
	/**
	 * Sets the wind.
	 *
	 * @param wind the new wind
	 */
	public void setWind(WindPojo wind) {
		this.wind = wind;
	}
	
	/**
	 * Gets the rain.
	 *
	 * @return the rain
	 */
	public RainPojo getRain() {
		return rain;
	}
	
	/**
	 * Sets the rain.
	 *
	 * @param rain the new rain
	 */
	public void setRain(RainPojo rain) {
		this.rain = rain;
	}
	
	/**
	 * Gets the clouds.
	 *
	 * @return the clouds
	 */
	public CloudsPojo getClouds() {
		return clouds;
	}
	
	/**
	 * Sets the clouds.
	 *
	 * @param clouds the new clouds
	 */
	public void setClouds(CloudsPojo clouds) {
		this.clouds = clouds;
	}
	
	/**
	 * Gets the dt.
	 *
	 * @return the dt
	 */
	public int getDt() {
		return dt;
	}
	
	/**
	 * Sets the dt.
	 *
	 * @param dt the new dt
	 */
	public void setDt(int dt) {
		this.dt = dt;
	}
	
	/**
	 * Gets the sys.
	 *
	 * @return the sys
	 */
	public SysPojo getSys() {
		return sys;
	}
	
	/**
	 * Sets the sys.
	 *
	 * @param sys the new sys
	 */
	public void setSys(SysPojo sys) {
		this.sys = sys;
	}
	
	/**
	 * Gets the timezone.
	 *
	 * @return the timezone
	 */
	public int getTimezone() {
		return timezone;
	}
	
	/**
	 * Sets the timezone.
	 *
	 * @param timezone the new timezone
	 */
	public void setTimezone(int timezone) {
		this.timezone = timezone;
	}
	
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
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Gets the cod.
	 *
	 * @return the cod
	 */
	public int getCod() {
		return cod;
	}
	
	/**
	 * Sets the cod.
	 *
	 * @param cod the new cod
	 */
	public void setCod(int cod) {
		this.cod = cod;
	}

	/**
	 * Gets the snow.
	 *
	 * @return the snow
	 */
	public SnowPojo getSnow() {
		return snow;
	}

	/**
	 * Sets the snow.
	 *
	 * @param snow the new snow
	 */
	public void setSnow(SnowPojo snow) {
		this.snow = snow;
	}
    
    
}