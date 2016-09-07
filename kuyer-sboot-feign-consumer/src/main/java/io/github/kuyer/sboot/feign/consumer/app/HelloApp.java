package io.github.kuyer.sboot.feign.consumer.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.github.kuyer.sboot.feign.consumer.service.HelloClient;

@RestController
public class HelloApp {
	
	@Autowired
	private HelloClient helloClient;
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String hello() {
		return helloClient.sayHello("feign");
	}

}
