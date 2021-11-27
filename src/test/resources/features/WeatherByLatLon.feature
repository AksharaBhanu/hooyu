Feature: Weather details by Lat Lon

	@smoke
	Scenario: Verify Get Weather by lat lon smoke test
	This scenario will fetch weather by providing lat and lon as query param
		
		Given Query param "lat" has value "51.5085"
		And Query param "lon" has value "-0.1257"				
		When "GET" request is executed
		Then Verify status code is 200
	
	@regression
	Scenario Outline: Get Weather by Lat Lon
		This scenario will fetch weather by providing city name as query param
		
		Given Query param "lat" has value "<lat>"
		And Query param "lon" has value "<lon>"		
		When "GET" request is executed
		Then Verify status code is <expected_status_code>
		And Verify body contains "name" as "<city_name>" 
		And Verify body contains "id" as <id>
		And Verify "lat" is "<lat>" in "coord" of response body
		And Verify "lon" is "<lon>" in "coord" of response body
		And Verify "country" is "<country>" in "sys" of response body
				
	Examples:
		|lat|lon|expected_status_code|city_name|id|country|
		|51.5085|-0.1257|200|London|2643743|GB|
		|51.4552|-2.5967|200|Bristol|2654675|GB|
		
	@regression	
	Scenario: Get Weather by lat lon with invalid api_key
		This scenario will try to fetch weather info by providing invalid api_key and lat lon as query param
		
		Given Query param appid has value "invalidapikey"
		And Query param "lat" has value "51.5085"
		And Query param "lon" has value "-0.1257"		
		When "GET" request is executed
		Then Verify status code is 401
