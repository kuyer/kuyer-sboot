package io.github.kuyer.sboot.feign.consumer.service;

import org.springframework.stereotype.Component;

@Component
public class HelloHystrix implements HelloClient {

	@Override
	public String sayHello(String name) {
		return "hi, "+name+"! server feign hystrix is error.";
	}

}
