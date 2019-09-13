package com.example.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/*
 * The following annotation marks this class as an "entity"
 *essentially, it is being marked as the counterpart to a table in the DB
 *This is technically not from Spring (it is from JPA aka Java Persistence API)
 *These annotations are also commonly seen in Hibernate. Note that they can get
 *very intricate, and I highly encourage that you learn more of them to make your
 *projects more robust... but we don't fully cover them in this curriculum
 */

/*
 * JPA is not a tool or a framework
 * rather it defines a set of concepts that can be
 * implemented by any tool or framework
 * 
 * JPA is used to map java classes that are meant to contain data that will
 * persist beyone the life of the application
 */
@Entity
public class Polkamans {
	
	@Id//used to indicate field is the primary key
	@GeneratedValue//used to indicate that it will be auto generated
	private Integer id;
	private String name;
	private String type;
	
	@Override
	public String toString() {
		return "Polkamans [id=" + id + ", name=" + name + ", type=" + type + "]";
	}
	public Polkamans() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Polkamans(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
	public Polkamans(Integer id, String name, String type) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}