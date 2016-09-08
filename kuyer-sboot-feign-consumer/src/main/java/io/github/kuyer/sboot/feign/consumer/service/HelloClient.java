package io.github.kuyer.sboot.feign.consumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="eureka-provider", fallback=HelloHystrix.class)
public interface HelloClient {
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String sayHello(@RequestParam("name") String name);

}
