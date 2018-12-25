package com.github.pig.hydrological.model.entity;

import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author liuchong
 * @since 2018-09-21
 */
public class BizWaterHistory {
    private String stcd;
    private Date tm;
    private Integer dataStyle;
    private String hourWaterP;
    private String hourWater;
    private String voltage;
    private String flow;
    private Integer wptn;
	public String getStcd() {
		return stcd;
	}
	public void setStcd(String stcd) {
		this.stcd = stcd;
	}
	public Date getTm() {
		return tm;
	}
	public void setTm(Date tm) {
		this.tm = tm;
	}
	public Integer getDataStyle() {
		return dataStyle;
	}
	public void setDataStyle(Integer dataStyle) {
		this.dataStyle = dataStyle;
	}
	public String getHourWaterP() {
		return hourWaterP;
	}
	public void setHourWaterP(String hourWaterP) {
		this.hourWaterP = hourWaterP;
	}
	public String getHourWater() {
		return hourWater;
	}
	public void setHourWater(String hourWater) {
		this.hourWater = hourWater;
	}
	public String getVoltage() {
		return voltage;
	}
	public void setVoltage(String voltage) {
		this.voltage = voltage;
	}
	public String getFlow() {
		return flow;
	}
	public void setFlow(String flow) {
		this.flow = flow;
	}
	public Integer getWptn() {
		return wptn;
	}
	public void setWptn(Integer wptn) {
		this.wptn = wptn;
	}
}
