package io.github.kuyer.sboot.dubbo.consumer.app;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;

import io.github.kuyer.sboot.api.AnimalApi;
import io.github.kuyer.sboot.api.model.AnimalMdl;

@RestController
@RequestMapping("/animal")
public class AnimalApp {
	
	@Reference
	private AnimalApi animalApi;
	
	@RequestMapping(value="/hello/{name}", method=RequestMethod.GET)
	public String hello(@PathVariable("name") String name) {
		return animalApi.sayHello(name);
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public AnimalMdl getAnimalById(@PathVariable("id") Integer id) {
		return animalApi.getAnmialById(id);
	}

}
