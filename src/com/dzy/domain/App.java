package com.dzy.domain;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * App entity. @author MyEclipse Persistence Tools
 */

public class App implements java.io.Serializable {

	// Fields

	private Integer id;
	private String appId;
	private String appDownadd;
	private String appDesc;
	private java.util.Date appDate;
	private String appName;
	private String appSpedesc;
	private Integer appDownnum;
	private String appLogo;
	private String appPhoto;
	private String appSrc;
	private Set appcomments = new HashSet(0);
	private Integer appType;
	private Integer appLike;

	// Constructors

	
	public Integer getAppLike() {
		return appLike;
	}

	public void setAppLike(Integer appLike) {
		this.appLike = appLike;
	}

	/** default constructor */
	public App() {
	}

	public Integer getAppType() {
		return appType;
	}

	public void setAppType(Integer appType) {
		this.appType = appType;
	}

	/** minimal constructor */
	public App(String appId, Integer appDownnum, String appLogo,
			String appPhoto, String appSrc) {
		this.appId = appId;
		this.appDownnum = appDownnum;
		this.appLogo = appLogo;
		this.appPhoto = appPhoto;
		this.appSrc = appSrc;
	}

	/** full constructor */
	public App(String appId, String appDownadd, String appDesc,
			java.util.Date appDate, String appName, String appSpedesc,
			Integer appDownnum, String appLogo, String appPhoto, String appSrc,
			Set appcomments) {
		this.appId = appId;
		this.appDownadd = appDownadd;
		this.appDesc = appDesc;
		this.appDate = appDate;
		this.appName = appName;
		this.appSpedesc = appSpedesc;
		this.appDownnum = appDownnum;
		this.appLogo = appLogo;
		this.appPhoto = appPhoto;
		this.appSrc = appSrc;
		this.appcomments = appcomments;
	}

	// Property accessors

	public java.util.Date getAppDate() {
		return appDate;
	}

	public void setAppDate(java.util.Date appDate) {
		this.appDate = appDate;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getAppDownadd() {
		return this.appDownadd;
	}

	public void setAppDownadd(String appDownadd) {
		this.appDownadd = appDownadd;
	}

	public String getAppDesc() {
		return this.appDesc;
	}

	public void setAppDesc(String appDesc) {
		this.appDesc = appDesc;
	}

	

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppSpedesc() {
		return this.appSpedesc;
	}

	public void setAppSpedesc(String appSpedesc) {
		this.appSpedesc = appSpedesc;
	}

	public Integer getAppDownnum() {
		return this.appDownnum;
	}

	public void setAppDownnum(Integer appDownnum) {
		this.appDownnum = appDownnum;
	}

	public String getAppLogo() {
		return this.appLogo;
	}

	public void setAppLogo(String appLogo) {
		this.appLogo = appLogo;
	}

	public String getAppPhoto() {
		return this.appPhoto;
	}

	public void setAppPhoto(String appPhoto) {
		this.appPhoto = appPhoto;
	}

	public String getAppSrc() {
		return this.appSrc;
	}

	public void setAppSrc(String appSrc) {
		this.appSrc = appSrc;
	}

	public Set getAppcomments() {
		return this.appcomments;
	}

	public void setAppcomments(Set appcomments) {
		this.appcomments = appcomments;
	}

}