package com.github.pig.waterq.model.dto;

import com.github.pig.waterq.model.entity.StRiverR;
import com.github.pig.waterq.model.entity.WpChannelSpeedSync;
import com.github.pig.waterq.model.entity.WpChannelWaterSync;

/**
 * 描述:
 * 综合流量，水位，流速
 *
 * @author xlhua
 * @create 2018-11-11 15:14
 */
public class MultipleData extends StRiverR {

//    /**
//     * 水位
//     */
//
//    private StRiverR stRiverR;

//    /**
//     * 流速
//     */
//
//    private WpChannelSpeedSync wpChannelSpeedSync;

    /**
     * 流量
     */

    private WpChannelWaterSync wpChannelWaterSync;

//    public StRiverR getStRiverR() {
//        return stRiverR;
//    }

//    public WpChannelSpeedSync getWpChannelSpeedSync() {
//        return wpChannelSpeedSync;
//    }

    public WpChannelWaterSync getWpChannelWaterSync() {
        return wpChannelWaterSync;
    }

//    public void setStRiverR(StRiverR stRiverR) {
//        this.stRiverR = stRiverR;
//    }

//    public void setWpChannelSpeedSync(WpChannelSpeedSync wpChannelSpeedSync) {
//        this.wpChannelSpeedSync = wpChannelSpeedSync;
//    }

    public void setWpChannelWaterSync(WpChannelWaterSync wpChannelWaterSync) {
        this.wpChannelWaterSync = wpChannelWaterSync;
    }
}
