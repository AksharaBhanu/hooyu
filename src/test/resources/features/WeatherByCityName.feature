#Author - Bhanu Prakash
#Date - 27/11/2021
Feature: Weather details by City name

	@smoke
	Scenario: Verify Get Weather by city name smoke test
	This scenario will fetch weather by providing city name as query param
		
		Given Query param "q" has value "London,uk"				
		When "GET" request is executed
		Then Verify status code is 200
	
	@regression
	Scenario Outline: Get Weather by City name
		This scenario will fetch weather by providing city name as query param
		
		Given Query param "q" has value "<city_name>,<country>"	
		When "GET" request is executed
		Then Verify status code is <expected_status_code>
		And Verify body contains "name" as "<city_name>" 
		And Verify body contains "id" as <id>
		And Verify "lat" is "<lat>" in "coord" of response body
		And Verify "lon" is "<lon>" in "coord" of response body
		And Verify "country" is "<country>" in "sys" of response body
				
	Examples:
		|city_name|country|expected_status_code|id|lat|lon|
		|London|GB|200|2643743|51.5085|-0.1257|
		|Bristol|GB|200|2654675|51.4552|-2.5967|
		
	@regression	
	Scenario: Get Weather by City name with invalid api_key
		This scenario will try to fetch weather info by providing invalid api_key and city name as query param
		
		Given Query param appid has value "invalidapikey"
		And Query param "q" has value "London,uk"				
		When "GET" request is executed
		Then Verify status code is 401
