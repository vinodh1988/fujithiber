package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person {
	@Id
    private Integer sno;
	@Column
    private String name;
	@Column
    private String city;
    
    
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Person(Integer sno, String name, String city) {
		super();
		this.sno = sno;
		this.name = name;
		this.city = city;
	}


	public Integer getSno() {
		return sno;
	}


	public void setSno(Integer sno) {
		this.sno = sno;
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
	
	
    
    
}
