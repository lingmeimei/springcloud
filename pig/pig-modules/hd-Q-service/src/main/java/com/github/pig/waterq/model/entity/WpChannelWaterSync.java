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
 * 
 * </p>
 *
 * @author xlhua
 * @since 2018-11-09
 */
@TableName("wp_channel_water_sync")
public class WpChannelWaterSync extends Model<WpChannelWaterSync> {

    private static final long serialVersionUID = 1L;

    @TableId("STCD")
    private String stcd;
    /**
     * 时间
     */
    @TableField("TM")
    private Date tm;
    @TableField("Q")
    private BigDecimal q;
    @TableField("TOTAL")
    private BigDecimal total;
    @TableField("TS")
    private Date ts;


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

    public BigDecimal getQ() {
        return q;
    }

    public void setQ(BigDecimal q) {
        this.q = q;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }

    @Override
    protected Serializable pkVal() {
        return this.stcd;
    }

    @Override
    public String toString() {
        return "WpChannelWaterSync{" +
        ", stcd=" + stcd +
        ", tm=" + tm +
        ", q=" + q +
        ", total=" + total +
        ", ts=" + ts +
        "}";
    }
}
