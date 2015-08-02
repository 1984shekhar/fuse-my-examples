package com.mycompany.camel.blueprint.jettyTest;

public class Employee {

	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/*
	 * public Employee() { } public Employee(Long id) { this.id=id; }
	 */
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "[Employee: " + id + ", " + name + "]";
	}
}