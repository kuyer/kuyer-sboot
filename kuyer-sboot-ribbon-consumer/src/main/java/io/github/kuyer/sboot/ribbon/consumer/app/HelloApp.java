package io.github.kuyer.sboot.ribbon.consumer.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloApp {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String hello() {
		return restTemplate.getForEntity("http://eureka-provider/hello?name=ribbon", String.class).getBody();
	}

}
