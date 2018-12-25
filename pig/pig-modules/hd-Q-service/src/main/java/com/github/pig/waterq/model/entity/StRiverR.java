package com.github.pig.waterq.model.entity;

import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * <p>
 * 国标库河道水情表
 * </p>
 *
 * @author xlhua
 * @since 2018-11-09
 */
@TableName("st_river_r")
public class StRiverR extends Model<StRiverR> {

    private static final long serialVersionUID = 1L;

    /**
     * 测站编码
     */
    @TableId("STCD")
    private String stcd;
    /**
     * 时间
     */
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @TableField("TM")
    private Date tm;
    /**
     * 水位
     */
    @TableField("Z")
    private BigDecimal z;
    /**
     * 流量
     */
    @TableField("Q")
    private BigDecimal q;
    /**
     * 断面过水面积
     */
    @TableField("XSA")
    private BigDecimal xsa;
    /**
     * 断面平均流速
     */
    @TableField("XSAVV")
    private BigDecimal xsavv;
    /**
     * 断面最大流速
     */
    @TableField("XSMXV")
    private BigDecimal xsmxv;
    /**
     * 河水特征码
     */
    @TableField("FLWCHRCD")
    private String flwchrcd;
    /**
     * 水势
     */
    @TableField("WPTN")
    private String wptn;
    /**
     * 测流方法
     */
    @TableField("MSQMT")
    private String msqmt;
    /**
     * 测积方法
     */
    @TableField("MSAMT")
    private String msamt;
    /**
     * 测速方法
     */
    @TableField("MSVMT")
    private String msvmt;
    /**
     * 同步状况
     */
    @TableField("SYNC_FLG")
    private String syncFlg;
    /**
     * 电压
     */
    @TableField("VOLTAGE")
    private BigDecimal voltage;


    public String getStcd() {
        return stcd;
    }

    public void setStcd(String stcd) {
        this.stcd = stcd;
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    public Date getTm() {
        return tm;
    }

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    public void setTm(Date tm) {
        this.tm = tm;
    }

    public BigDecimal getZ() {
        return z;
    }

    public void setZ(BigDecimal z) {
        this.z = z;
    }

    public BigDecimal getQ() {
        return q;
    }

    public void setQ(BigDecimal q) {
        this.q = q;
    }

    public BigDecimal getXsa() {
        return xsa;
    }

    public void setXsa(BigDecimal xsa) {
        this.xsa = xsa;
    }

    public BigDecimal getXsavv() {
        return xsavv;
    }

    public void setXsavv(BigDecimal xsavv) {
        this.xsavv = xsavv;
    }

    public BigDecimal getXsmxv() {
        return xsmxv;
    }

    public void setXsmxv(BigDecimal xsmxv) {
        this.xsmxv = xsmxv;
    }

    public String getFlwchrcd() {
        return flwchrcd;
    }

    public void setFlwchrcd(String flwchrcd) {
        this.flwchrcd = flwchrcd;
    }

    public String getWptn() {
        return wptn;
    }

    public void setWptn(String wptn) {
        this.wptn = wptn;
    }

    public String getMsqmt() {
        return msqmt;
    }

    public void setMsqmt(String msqmt) {
        this.msqmt = msqmt;
    }

    public String getMsamt() {
        return msamt;
    }

    public void setMsamt(String msamt) {
        this.msamt = msamt;
    }

    public String getMsvmt() {
        return msvmt;
    }

    public void setMsvmt(String msvmt) {
        this.msvmt = msvmt;
    }

    public String getSyncFlg() {
        return syncFlg;
    }

    public void setSyncFlg(String syncFlg) {
        this.syncFlg = syncFlg;
    }

    public BigDecimal getVoltage() {
        return voltage;
    }

    public void setVoltage(BigDecimal voltage) {
        this.voltage = voltage;
    }

    @Override
    protected Serializable pkVal() {
        return this.stcd;
    }

    @Override
    public String toString() {
        return "StRiverR{" +
        ", stcd=" + stcd +
        ", tm=" + tm +
        ", z=" + z +
        ", q=" + q +
        ", xsa=" + xsa +
        ", xsavv=" + xsavv +
        ", xsmxv=" + xsmxv +
        ", flwchrcd=" + flwchrcd +
        ", wptn=" + wptn +
        ", msqmt=" + msqmt +
        ", msamt=" + msamt +
        ", msvmt=" + msvmt +
        ", syncFlg=" + syncFlg +
        ", voltage=" + voltage +
        "}";
    }
}
