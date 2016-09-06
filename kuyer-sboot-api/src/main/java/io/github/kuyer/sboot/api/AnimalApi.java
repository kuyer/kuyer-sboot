package io.github.kuyer.sboot.api;

import java.util.List;

import io.github.kuyer.sboot.api.model.AnimalMdl;

/**
 * 动物API接口
 * @author rory.zhang
 */
public interface AnimalApi {
	
	/**
	 * 给动物打招呼
	 * @param name
	 * @return
	 */
	public String sayHello(String name);
	
	/**
	 * 加法计算
	 * @param a
	 * @param b
	 * @return
	 */
	public Integer plus(int a, int b);
	
	/**
	 * 根据编号获取动物信息
	 * @param id
	 * @return
	 */
	public AnimalMdl getAnmialById(Integer id);
	
	/**
	 * 根据名称获取动物信息
	 * @param name
	 * @return
	 */
	public List<AnimalMdl> getAnimalsByName(String name);
	
	/**
	 * 获取动物信息
	 * @param name
	 * @return
	 */
	public List<AnimalMdl> getAnimals(AnimalMdl animal);

}
