package com.learning.SpringDataJPA.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
@NamedQuery(name = "Employee.findByPk", query = "select o from Employee o where o.id = :id")
public class Employee {
	@Id @GeneratedValue
	@Column(name = "ID")
	int id;
	@Column(name = "NAME")
	String name;
	@Column(name = "LOCATION")
	String location;

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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
