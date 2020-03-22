package com.att.CxfDemo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {

	private Integer eno;
	private String name;
	private Double salary;
	public Integer getEno() {
		return eno;
	}
	public void setEno(Integer eno) {
		this.eno = eno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", name=" + name + ", salary=" + salary + "]";
	}
	public Employee(Integer eno, String name, Double salary) {
		super();
		this.eno = eno;
		this.name = name;
		this.salary = salary;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
}
