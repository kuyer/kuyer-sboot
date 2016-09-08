package io.github.kuyer.sboot.ribbon.consumer.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.github.kuyer.sboot.ribbon.consumer.service.HelloService;

@RestController
public class HelloApp {
	
	@Autowired
	private HelloService helloService;
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String hello() {
		return helloService.hello();
	}

}
