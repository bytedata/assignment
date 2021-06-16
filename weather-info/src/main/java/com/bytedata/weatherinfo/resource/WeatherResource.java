package com.bytedata.weatherinfo.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bytedata.weatherinfo.models.Weather;
import com.bytedata.weatherinfo.models.WeatherSummary;

@RestController
@RequestMapping("/weather")
public class WeatherResource {

	/*
	 * @RequestMapping("/{weatherId}") public Weather
	 * getWeatherInfo(@PathVariable("weatherId") String weatherId) { return new
	 * Weather(weatherId, "35"); }
	 */

	@Value("${app.key}")
	private String appkey;

	@Autowired
	private RestTemplate restTemplate;
//api.openweathermap.org/data/2.5/weather?q={city name}&appkey=ffa6f13ea40a22452bba3be726315d3f
	@RequestMapping("/{city}")
	public Weather getWeatherInfo(@PathVariable("city") String city) {
		String websiteResponse = "http://api.openweathermap.org/data/2.5/forecast?q=" +city + "&appkey=" +appkey;
		
		WeatherSummary weatherSummary = restTemplate.getForObject(websiteResponse, WeatherSummary.class);
		return new Weather(city, weatherSummary.getCity());
	}

}
