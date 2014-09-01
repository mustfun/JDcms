package com.dzy.struts.form;

import org.apache.struts.action.ActionForm;
import org.apache.struts.upload.FormFile;

public class AppForm extends ActionForm {
	private FormFile applogo;
	private FormFile appjietu;
	public FormFile getAppjietu() {
		return appjietu;
	}
	public void setAppjietu(FormFile appjietu) {
		this.appjietu = appjietu;
	}
	private String app_name;
	public String getApp_name() {
		return app_name;
	}
	public void setApp_name(String appName) {
		app_name = appName;
	}
	private String app_id;
	private String app_desc;
	private String app_spedesc;
	private String downadre;
	private String app_logo;
	private String app_photo;
	private Integer app_type;
	public Integer getApp_type() {
		return app_type;
	}
	public void setApp_type(Integer appType) {
		app_type = appType;
	}
	public FormFile getApplogo() {
		return applogo;
	}
	public void setApplogo(FormFile applogo) {
		this.applogo = applogo;
	}
	public String getApp_id() {
		return app_id;
	}
	public void setApp_id(String appId) {
		app_id = appId;
	}
	public String getApp_desc() {
		return app_desc;
	}
	public void setApp_desc(String appDesc) {
		app_desc = appDesc;
	}
	public String getApp_spedesc() {
		return app_spedesc;
	}
	public void setApp_spedesc(String appSpedesc) {
		app_spedesc = appSpedesc;
	}
	public String getDownadre() {
		return downadre;
	}
	public void setDownadre(String downadre) {
		this.downadre = downadre;
	}
	public String getApp_logo() {
		return app_logo;
	}
	public void setApp_logo(String appLogo) {
		app_logo = appLogo;
	}
	public String getApp_photo() {
		return app_photo;
	}
	public void setApp_photo(String appPhoto) {
		app_photo = appPhoto;
	}
}
