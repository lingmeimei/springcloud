package com.github.pig.hydrological.model.entity;

import java.math.BigDecimal;
import java.util.Date;
/**
 * @author chengpan
 * @since 2018-10-16
 */
public class BizRainCurrent{
    private String stcd;
    private Date tm;
    private Integer dataStyle;
    private String hourRainP;
    private String dayRain;
    private String monthRain;
    private String yearRain;
    private String totalRain;
    private String hourRain;
    private BigDecimal voltage;
    private String threeHourValue;
    private String sixHourValue;
    private String twelveHourValue;
    private String oneDayValue;
    private String threeDayValue;
    private String oneHourValue;
    private String tenMinValue;
    private String thirteenMinValue;
    private String intv;
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

    public String getHourRain() {
        return hourRain;
    }

    public void setHourRain(String hourRain) {
        this.hourRain = hourRain;
    }

    public BigDecimal getVoltage() {
        return voltage;
    }

    public void setVoltage(BigDecimal voltage) {
        this.voltage = voltage;
    }

    public String getThreeHourValue() {
        return threeHourValue;
    }

    public void setThreeHourValue(String threeHourValue) {
        this.threeHourValue = threeHourValue;
    }

    public String getSixHourValue() {
        return sixHourValue;
    }

    public void setSixHourValue(String sixHourValue) {
        this.sixHourValue = sixHourValue;
    }

    public String getTwelveHourValue() {
        return twelveHourValue;
    }

    public void setTwelveHourValue(String twelveHourValue) {
        this.twelveHourValue = twelveHourValue;
    }

    public String getOneDayValue() {
        return oneDayValue;
    }

    public void setOneDayValue(String oneDayValue) {
        this.oneDayValue = oneDayValue;
    }

    public String getThreeDayValue() {
        return threeDayValue;
    }

    public void setThreeDayValue(String threeDayValue) {
        this.threeDayValue = threeDayValue;
    }

    public String getOneHourValue() {
        return oneHourValue;
    }

    public void setOneHourValue(String oneHourValue) {
        this.oneHourValue = oneHourValue;
    }

    public String getTenMinValue() {
        return tenMinValue;
    }

    public void setTenMinValue(String tenMinValue) {
        this.tenMinValue = tenMinValue;
    }

    public String getThirteenMinValue() {
        return thirteenMinValue;
    }

    public void setThirteenMinValue(String thirteenMinValue) {
        this.thirteenMinValue = thirteenMinValue;
    }

    public String getIntv() {
        return intv;
    }

    public void setIntv(String intv) {
        this.intv = intv;
    }
}
