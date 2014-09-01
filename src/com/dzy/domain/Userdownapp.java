package com.dzy.domain;

/**
 * Userdownapp entity. @author MyEclipse Persistence Tools
 */

public class Userdownapp implements java.io.Serializable {

	// Fields

	private Integer id;
	private Users users;
	private App app;

	// Constructors

	/** default constructor */
	public Userdownapp() {
	}

	/** full constructor */
	public Userdownapp(Users users, App app) {
		this.users = users;
		this.app = app;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public App getApp() {
		return this.app;
	}

	public void setApp(App app) {
		this.app = app;
	}

}