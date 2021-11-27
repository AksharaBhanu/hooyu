package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

/**
 * @author user
 *
 */
public class GenericUtils {	
		
	/**
	 * Method to fetch property value by providing the key
	 * @param propertyFileName
	 * @param propertyKey
	 * @return property value
	 */
	public static String getProperties(String propertyFileName, String propertyKey) {
		String keyVal=null;
		try {
			FileInputStream fis = new FileInputStream("src/test/resources/"+propertyFileName+".properties");
			Properties prop = new Properties();
			prop.load(fis);	
			keyVal = prop.getProperty(propertyKey);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return keyVal;
	}
	
	
	/**
	 * This method is used to create a request spec builder object with filter for logging the request and response
	 * automatically to a log file
	 * @return RequestSpecBuilder object
	 */
	public static RequestSpecBuilder getRequestSpecBuilder() {
		PrintStream printOutput = getReportLogFilePath();
		RequestSpecBuilder reqSpecBuilder = new RequestSpecBuilder();
		reqSpecBuilder.addFilter(RequestLoggingFilter.logRequestTo(printOutput));
		reqSpecBuilder.addFilter(ResponseLoggingFilter.logResponseTo(printOutput));
		
		return reqSpecBuilder;
	}
	
	/**
	 * Method to generate a log file with date and time stamp and return the PrintStream object
	 * @return PrintStream object
	 */
	public static PrintStream getReportLogFilePath() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");  
	    Date date = new Date();  
	    String dt = formatter.format(date);
		PrintStream printOutput = null;
		try {
			printOutput = new PrintStream(new FileOutputStream("test-output/logs/logfile_"+dt+".txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}		
		
		return printOutput;
	}
	
	
	/**
	 * This method accepts environment string and creates a ResponseSpecBuilder object with 
	 * response header validation for Server and Content-Type
	 * @param env
	 * @return ResponseSpecBuilder object
	 */
	public static ResponseSpecBuilder getResponseSpecBuilder(String env) {
		String server = GenericUtils.getProperties(env,"SERVER");
		String contentType = GenericUtils.getProperties(env,"CONTENT_TYPE");
		
		ResponseSpecBuilder responseSpecBuilder = new ResponseSpecBuilder();
		responseSpecBuilder.expectHeader("Server", server);
		responseSpecBuilder.expectHeader("Content-Type", contentType);
		
		return responseSpecBuilder;
	}
}
