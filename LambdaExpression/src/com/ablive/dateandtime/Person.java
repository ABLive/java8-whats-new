package com.ablive.dateandtime;

import java.time.LocalDate;

public class Person {

	private String name;
	private LocalDate dateOfBirth;
	
	public Person() {
		super();
	}

	public Person(String name, LocalDate dateOfBirth) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", dateOfBirth=" + dateOfBirth + "]";
	}
	
}