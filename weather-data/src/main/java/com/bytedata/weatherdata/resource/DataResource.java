
package com.bytedata.weatherdata.resource;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bytedata.weatherdata.models.WForcast;
import com.bytedata.weatherdata.models.Wdata;

@RestController
@RequestMapping("/data")
public class DataResource {

	@RequestMapping("/{dataId}")
	public Wdata getData(@PathVariable("dataId") String dataId) {
		return new Wdata(dataId, 4);
	}

	@RequestMapping("/forcast/{id}")
	public WForcast getDataDetails(@PathVariable("id") String id) {
		List<Wdata> datas = Arrays.asList(new Wdata("123", 1), new Wdata("456", 2), new Wdata("789", 3));

		WForcast wForCast = new WForcast();
		wForCast.setWforcast(datas);
		return wForCast;

	}

}
