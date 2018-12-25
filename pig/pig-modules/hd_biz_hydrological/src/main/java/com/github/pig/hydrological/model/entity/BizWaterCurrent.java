package com.github.pig.hydrological.model.entity;

import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author liuchong
 * @since 2018-09-21
 */
public class BizWaterCurrent{
    private String stcd;
    private Date tm;
    private Integer dataStyle;
    private BigDecimal hourWaterP;
    private String hourWater;
    private BigDecimal voltage;
    private String preWater;
    private String capacity;
    private BigDecimal flow;
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
	public BigDecimal getHourWaterP() {
		return hourWaterP;
	}
	public void setHourWaterP(BigDecimal hourWaterP) {
		this.hourWaterP = hourWaterP;
	}
	public String getHourWater() {
		return hourWater;
	}
	public void setHourWater(String hourWater) {
		this.hourWater = hourWater;
	}
	public BigDecimal getVoltage() {
		return voltage;
	}
	public void setVoltage(BigDecimal voltage) {
		this.voltage = voltage;
	}
	public String getPreWater() {
		return preWater;
	}
	public void setPreWater(String preWater) {
		this.preWater = preWater;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public BigDecimal getFlow() {
		return flow;
	}
	public void setFlow(BigDecimal flow) {
		this.flow = flow;
	}
	public Integer getWptn() {
		return wptn;
	}
	public void setWptn(Integer wptn) {
		this.wptn = wptn;
	}
}
