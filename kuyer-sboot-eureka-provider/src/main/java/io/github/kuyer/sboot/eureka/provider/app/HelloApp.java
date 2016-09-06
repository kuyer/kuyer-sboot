package io.github.kuyer.sboot.eureka.provider.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.github.kuyer.common.Strings;

@RestController
public class HelloApp {
	
	private Logger logger = LoggerFactory.getLogger(HelloApp.class);
	
	@Autowired
	private DiscoveryClient discoveryClient;
	
	@RequestMapping(value="hello", method=RequestMethod.GET)
	public String sayHello(@RequestParam String name) {
		ServiceInstance instance = discoveryClient.getLocalServiceInstance();
		logger.info("/hello. param: {}. host: {}, port: {}, serviceId: {}.", 
				name, instance.getHost(), instance.getPort(), instance.getServiceId());
		if(Strings.isEmpty(name)) {
			return "please give your name!";
		}
		return "hello, "+Strings.getString(name)+"!";
	}

}
