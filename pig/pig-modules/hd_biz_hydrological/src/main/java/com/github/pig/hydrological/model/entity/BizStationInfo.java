/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.pig.hydrological.model.entity;

import java.util.Date;

/**
 * @date 2016-09-12
 * @Description: 测站基本信息实体类
 * @author htyi Copyright（C） 2010~2020 深圳市宏电技术股份有限公司
 */
public class BizStationInfo {
	private Integer stationId;       
	private String termSn;          
	private String stationCode;     
	private String stationType;     
	private String name;             
	private Date buildDate;       
	private String managementUnit;  
	private String person;           
	private String telephone;        
	private String photo;            
	private Integer deptId;          
	private String baseValue;       
	private String drAreaId;       
	private String delflag;          
	private String sourceType;      
	private String rvnm;
	public Integer getStationId() {
		return stationId;
	}
	public void setStationId(Integer stationId) {
		this.stationId = stationId;
	}
	public String getTermSn() {
		return termSn;
	}
	public void setTermSn(String termSn) {
		this.termSn = termSn;
	}
	public String getStationCode() {
		return stationCode;
	}
	public void setStationCode(String stationCode) {
		this.stationCode = stationCode;
	}
	public String getStationType() {
		return stationType;
	}
	public void setStationType(String stationType) {
		this.stationType = stationType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBuildDate() {
		return buildDate;
	}
	public void setBuildDate(Date buildDate) {
		this.buildDate = buildDate;
	}
	public String getManagementUnit() {
		return managementUnit;
	}
	public void setManagementUnit(String managementUnit) {
		this.managementUnit = managementUnit;
	}
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public String getBaseValue() {
		return baseValue;
	}
	public void setBaseValue(String baseValue) {
		this.baseValue = baseValue;
	}
	public String getDrAreaId() {
		return drAreaId;
	}
	public void setDrAreaId(String drAreaId) {
		this.drAreaId = drAreaId;
	}
	public String getDelflag() {
		return delflag;
	}
	public void setDelflag(String delflag) {
		this.delflag = delflag;
	}
	public String getSourceType() {
		return sourceType;
	}
	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}
	public String getRvnm() {
		return rvnm;
	}
	public void setRvnm(String rvnm) {
		this.rvnm = rvnm;
	}             
}
