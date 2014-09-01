package com.dzy.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Province entity. @author MyEclipse Persistence Tools
 */

public class Province implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Set universities = new HashSet(0);
	private Set userses = new HashSet(0);
	private Set cities = new HashSet(0);

	// Constructors

	/** default constructor */
	public Province() {
	}

	/** minimal constructor */
	public Province(String name) {
		this.name = name;
	}

	/** full constructor */
	public Province(String name, Set universities, Set userses, Set cities) {
		this.name = name;
		this.universities = universities;
		this.userses = userses;
		this.cities = cities;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getUniversities() {
		return this.universities;
	}

	public void setUniversities(Set universities) {
		this.universities = universities;
	}

	public Set getUserses() {
		return this.userses;
	}

	public void setUserses(Set userses) {
		this.userses = userses;
	}

	public Set getCities() {
		return this.cities;
	}

	public void setCities(Set cities) {
		this.cities = cities;
	}

}