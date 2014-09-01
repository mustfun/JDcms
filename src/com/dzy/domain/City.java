package com.dzy.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * City entity. @author MyEclipse Persistence Tools
 */

public class City implements java.io.Serializable {

	// Fields

	private Integer id;
	private Province province;
	private String name;
	private Set userses = new HashSet(0);
	private Set universities = new HashSet(0);

	// Constructors

	/** default constructor */
	public City() {
	}

	/** minimal constructor */
	public City(String name) {
		this.name = name;
	}

	/** full constructor */
	public City(Province province, String name, Set userses,
			Set universities) {
		this.province = province;
		this.name = name;
		this.userses = userses;
		this.universities = universities;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Set getUniversities() {
		return this.universities;
	}

	public void setUniversities(Set universities) {
		this.universities = universities;
	}

}