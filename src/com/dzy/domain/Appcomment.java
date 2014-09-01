package com.dzy.domain;

/**
 * Appcomment entity. @author MyEclipse Persistence Tools
 */

public class Appcomment implements java.io.Serializable {

	// Fields

	private Integer id;
	private Users users;
	private App app;
	private String contents;

	// Constructors

	/** default constructor */
	public Appcomment() {
	}

	/** full constructor */
	public Appcomment(Users users, App app, String contents) {
		this.users = users;
		this.app = app;
		this.contents = contents;
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

	public String getContents() {
		return this.contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

}