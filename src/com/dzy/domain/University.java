package com.dzy.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * University entity. @author MyEclipse Persistence Tools
 */

public class University implements java.io.Serializable {

	// Fields

	private Integer id;
	private City city;
	private Province province;
	private String name;
	private Set userses = new HashSet(0);

	// Constructors

	/** default constructor */
	public University() {
	}

	/** minimal constructor */
	public University(String name) {
		this.name = name;
	}

	/** full constructor */
	public University(City city, Province province, String name, Set userses) {
		this.city = city;
		this.province = province;
		this.name = name;
		this.userses = userses;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public City getCity() {
		return this.city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Province getProvince() {
		return this.province;
	}

	public void setProvince(Province province) {
		this.province = province;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getUserses() {
		return this.userses;
	}

	public void setUserses(Set userses) {
		this.userses = userses;
	}

}