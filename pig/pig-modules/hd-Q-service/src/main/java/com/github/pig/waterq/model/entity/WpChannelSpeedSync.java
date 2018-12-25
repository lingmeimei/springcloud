package com.github.pig.waterq.model.entity;

import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 流速表
 * </p>
 *
 * @author xlhua
 * @since 2018-11-09
 */
@TableName("wp_channel_speed_sync")
public class WpChannelSpeedSync extends Model<WpChannelSpeedSync> {

    private static final long serialVersionUID = 1L;

    /**
     * 测站编码
     */
    @TableId("STCD")
    private String stcd;
    /**
     * 时间
     */
    @TableField("TM")
    private Date tm;
    /**
     * 流速
     */
    @TableField("SPEED")
    private BigDecimal speed;
    /**
     * 时间戳
     */
    @TableField("TS")
    private Date ts;
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

    public Date getTm() {
        return tm;
    }

    public void setTm(Date tm) {
        this.tm = tm;
    }

    public BigDecimal getSpeed() {
        return speed;
    }

    public void setSpeed(BigDecimal speed) {
        this.speed = speed;
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
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
        return "WpChannelSpeedSync{" +
        ", stcd=" + stcd +
        ", tm=" + tm +
        ", speed=" + speed +
        ", ts=" + ts +
        ", voltage=" + voltage +
        "}";
    }
}
