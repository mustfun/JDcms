package com.dzy.domain;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Users entity. @author MyEclipse Persistence Tools
 */

public class Users implements java.io.Serializable {

	// Fields

	private Integer id;
	private University university;
	private Province province;
	private City city;
	private String email;
	private String name;
	private String pwd;
	private String photo;
	private String sex;
	private String birth;
	private String tel;
	private String mobile;
	private String oicq;
	private String msn;
	private String website;
	private String interest;
	private String music;
	private String movie;
	private String game;
	private String cartoon;
	private String sport;
	private String book;
	private String assn;
	private Integer visited;
	private String doing;
	private Short online;
	private java.util.Date  registerDate;
	private java.util.Date  loginDate;
	private Short level;
	private Short locked;
	private String username;
	private Set appcomments = new HashSet(0);

	// Constructors

	/** default constructor */
	public Users() {
	}

	/** minimal constructor */
	public Users(String email, String name, String pwd, String username) {
		this.email = email;
		this.name = name;
		this.pwd = pwd;
		this.username = username;
	}

	/** full constructor */
	public Users(University university, Province province, City city,
			String email, String name, String pwd, String photo, String sex,
			String birth, String tel, String mobile, String oicq, String msn,
			String website, String interest, String music, String movie,
			String game, String cartoon, String sport, String book,
			String assn, Integer visited, String doing, Short online,
			java.util.Date registerDate, java.util.Date loginDate, Short level,
			Short locked, String username, Set appcomments) {
		this.university = university;
		this.province = province;
		this.city = city;
		this.email = email;
		this.name = name;
		this.pwd = pwd;
		this.photo = photo;
		this.sex = sex;
		this.birth = birth;
		this.tel = tel;
		this.mobile = mobile;
		this.oicq = oicq;
		this.msn = msn;
		this.website = website;
		this.interest = interest;
		this.music = music;
		this.movie = movie;
		this.game = game;
		this.cartoon = cartoon;
		this.sport = sport;
		this.book = book;
		this.assn = assn;
		this.visited = visited;
		this.doing = doing;
		this.online = online;
		this.registerDate = registerDate;
		this.loginDate = loginDate;
		this.level = level;
		this.locked = locked;
		this.username = username;
		this.appcomments = appcomments;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public University getUniversity() {
		return this.university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	public Province getProvince() {
		return this.province;
	}

	public void setProvince(Province province) {
		this.province = province;
	}

	public City getCity() {
		return this.city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirth() {
		return this.birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOicq() {
		return this.oicq;
	}

	public void setOicq(String oicq) {
		this.oicq = oicq;
	}

	public String getMsn() {
		return this.msn;
	}

	public void setMsn(String msn) {
		this.msn = msn;
	}

	public String getWebsite() {
		return this.website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getInterest() {
		return this.interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	public String getMusic() {
		return this.music;
	}

	public void setMusic(String music) {
		this.music = music;
	}

	public String getMovie() {
		return this.movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}

	public String getGame() {
		return this.game;
	}

	public void setGame(String game) {
		this.game = game;
	}

	public String getCartoon() {
		return this.cartoon;
	}

	public void setCartoon(String cartoon) {
		this.cartoon = cartoon;
	}

	public String getSport() {
		return this.sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	public String getBook() {
		return this.book;
	}

	public void setBook(String book) {
		this.book = book;
	}

	public String getAssn() {
		return this.assn;
	}

	public void setAssn(String assn) {
		this.assn = assn;
	}

	public Integer getVisited() {
		return this.visited;
	}

	public void setVisited(Integer visited) {
		this.visited = visited;
	}

	public String getDoing() {
		return this.doing;
	}

	public void setDoing(String doing) {
		this.doing = doing;
	}

	public Short getOnline() {
		return this.online;
	}

	public void setOnline(Short online) {
		this.online = online;
	}

	public java.util.Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(java.util.Date registerDate) {
		this.registerDate = registerDate;
	}

	public java.util.Date getLoginDate() {
		return loginDate;
	}

	public void setLoginDate(java.util.Date loginDate) {
		this.loginDate = loginDate;
	}

	public Short getLevel() {
		return this.level;
	}

	public void setLevel(Short level) {
		this.level = level;
	}

	public Short getLocked() {
		return this.locked;
	}

	public void setLocked(Short locked) {
		this.locked = locked;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Set getAppcomments() {
		return this.appcomments;
	}

	public void setAppcomments(Set appcomments) {
		this.appcomments = appcomments;
	}

}