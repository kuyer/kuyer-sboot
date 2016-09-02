package io.github.kuyer.sboot.api.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 动物Model类
 * @author rory.zhang
 */
public class AnimalMdl implements Serializable {

	private static final long serialVersionUID = 195956214524894025L;
	/** 编号 **/
	private Integer id;
	/** 名称 **/
	private String name;
	/** 生日 **/
	private Date birthday;
	
	public AnimalMdl() {}
	
	public AnimalMdl(Integer id) {
		this.id = id;
	}

	public AnimalMdl(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public AnimalMdl(Integer id, String name, Date birthday) {
		this.id = id;
		this.name = name;
		this.birthday = birthday;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	@Override
	public String toString() {
		return "AnimalMdl [id=" + id + ", name=" + name + ", birthday=" + birthday + "]";
	}

}
