/**
 * Create Date:2019年6月17日
 */
package com.chengaunghua.common.utils;

/**
 * <br>
 * Title:TODO 类标题 <br>
 * Description:TODO Person实体类功能描述 <br>
 * Author:陈广华(823865618@qq.com) <br>
 * Date:2019年6月17日
 */
public class Person {
	private int id;
	private String name;
	private int age;
	private String about;
	private String creaed;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public String getCreaed() {
		return creaed;
	}

	public void setCreaed(String creaed) {
		this.creaed = creaed;
	}

	public Person(int id, String name, int age, String about, String creaed) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.about = about;
		this.creaed = creaed;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age, String about, String creaed) {
		super();
		this.name = name;
		this.age = age;
		this.about = about;
		this.creaed = creaed;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", about=" + about + ", creaed=" + creaed + "]";
	}

}
