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
 * @author chengpan
 * @since 2018-10-16
 */
public class BizRainHistory{
    private String stcd;
    private Date tm;
    private Integer dataStyle;
    private String hourRainP;
    private String hourRain;
    private String dayRain;
    private String monthRain;
    private String yearRain;
    private String totalRain;
    private String voltage;
    private BigDecimal intv;
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

    public String getHourRainP() {
        return hourRainP;
    }

    public void setHourRainP(String hourRainP) {
        this.hourRainP = hourRainP;
    }

    public String getHourRain() {
        return hourRain;
    }

    public void setHourRain(String hourRain) {
        this.hourRain = hourRain;
    }

    public String getDayRain() {
        return dayRain;
    }

    public void setDayRain(String dayRain) {
        this.dayRain = dayRain;
    }

    public String getMonthRain() {
        return monthRain;
    }

    public void setMonthRain(String monthRain) {
        this.monthRain = monthRain;
    }

    public String getYearRain() {
        return yearRain;
    }

    public void setYearRain(String yearRain) {
        this.yearRain = yearRain;
    }

    public String getTotalRain() {
        return totalRain;
    }

    public void setTotalRain(String totalRain) {
        this.totalRain = totalRain;
    }

    public String getVoltage() {
        return voltage;
    }

    public void setVoltage(String voltage) {
        this.voltage = voltage;
    }

    public BigDecimal getIntv() {
        return intv;
    }

    public void setIntv(BigDecimal intv) {
        this.intv = intv;
    }
}
