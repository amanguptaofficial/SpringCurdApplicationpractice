package com.spring.jdbc;

public class Workers {

	private int id;
	private String name;
	private String city;
	private int age;
	private String desg;

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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public Workers(int id, String name, String city, int age, String desg) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.age = age;
		this.desg = desg;
	}

	public Workers() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Workers [id=" + id + ", name=" + name + ", city=" + city + ", age=" + age + ", desg=" + desg + "]";
	}

}
