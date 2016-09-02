package io.github.kuyer.sboot.dubbo.provider.service;

import java.util.Date;
import java.util.List;

import com.alibaba.dubbo.config.annotation.Service;

import io.github.kuyer.common.Strings;
import io.github.kuyer.sboot.api.AnimalApi;
import io.github.kuyer.sboot.api.model.AnimalMdl;

/**
 * 动物服务
 * @author rory.zhang
 */
@Service
public class AnimalService implements AnimalApi {

	@Override
	public String sayHello(String name) {
		if(Strings.isEmpty(name)) {
			return "please give your name!";
		}
		return String.format("hello, %s!", Strings.getString(name));
	}

	@Override
	public AnimalMdl getAnmialById(Integer id) {
		if(null==id || id<=0) {
			return null;
		}
		return new AnimalMdl(id, "pig", new Date());
	}

	@Override
	public List<AnimalMdl> getAnimalsByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AnimalMdl> getAnimals(AnimalMdl animal) {
		// TODO Auto-generated method stub
		return null;
	}

}
