package io.github.kuyer.sboot.ribbon.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HelloService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod="error")
	public String hello() {
		return restTemplate.getForEntity("http://eureka-provider/hello?name=ribbon", String.class).getBody();
	}
	
	public String error() {
		return "ribbon has error.";
	}

}
