package com.bytedata.weathercatalog.resource;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bytedata.weathercatalog.model.CatalogItem;
import com.bytedata.weathercatalog.model.WForcast;
import com.bytedata.weathercatalog.model.Weather;

@RestController
@RequestMapping("/catalog")
public class WeatherCatalogResource {

	@Autowired
	
	private RestTemplate restTemplate;

	@RequestMapping("/{id}")
	public List<CatalogItem> getCatalog(@PathVariable("id") String id) {

		WForcast datas = restTemplate.getForObject("http://weather-data/data/forcast/" + id, WForcast.class);
		
		return datas.getWforcast().stream().map(wdata -> {
			Weather weather = restTemplate.getForObject("http://weather-info/weather/" + wdata.getwId(),
					Weather.class);
			return new CatalogItem(weather.getName(), "bangalore", wdata.getWdata());

		}).collect(Collectors.toList());

	}
}
