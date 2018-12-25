package com.github.pig.waterq.controller;
import java.util.Map;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.github.pig.common.constant.CommonConstant;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.github.pig.common.util.Query;
import com.github.pig.common.util.R;
import com.github.pig.waterq.model.entity.WpChannelSpeedSync;
import com.github.pig.waterq.service.WpChannelSpeedSyncService;
import com.github.pig.common.web.BaseController;

/**
 * <p>
 * 流速表 前端控制器
 * </p>
 *
 * @author xlhua
 * @since 2018-11-09
 */
@RestController
@RequestMapping("/wpChannelSpeedSync")
public class WpChannelSpeedSyncController extends BaseController {
    @Autowired private WpChannelSpeedSyncService wpChannelSpeedSyncService;

    /**
    * 通过ID查询
    *
    * @param id ID
    * @return WpChannelSpeedSync
    */
    @GetMapping("/{id}")
    public R<WpChannelSpeedSync> get(@PathVariable Integer id) {
        return new R<>(wpChannelSpeedSyncService.selectById(id));
    }


    /**
    * 分页查询信息
    *
    * @param params 分页对象
    * @return 分页对象
    */
    @RequestMapping("/page")
    public Page page(@RequestParam Map<String, Object> params) {
//        params.put(CommonConstant.DEL_FLAG, CommonConstant.STATUS_NORMAL);
        return wpChannelSpeedSyncService.selectPage(new Query<>(params), new EntityWrapper<>());
    }

    /**
     * 添加
     * @param  wpChannelSpeedSync  实体
     * @return success/false
     */
    @PostMapping
    public R<Boolean> add(@RequestBody WpChannelSpeedSync wpChannelSpeedSync) {
        return new R<>(wpChannelSpeedSyncService.insert(wpChannelSpeedSync));
    }

    /**
     * 删除
     * @param id ID
     * @return success/false
     */
    @DeleteMapping("/{id}")
    public R<Boolean> delete(@PathVariable Integer id) {
        WpChannelSpeedSync wpChannelSpeedSync = new WpChannelSpeedSync();
//        wpChannelSpeedSync.setId(id);
//        wpChannelSpeedSync.setUpdateTime(new Date());
//        wpChannelSpeedSync.setDelFlag(CommonConstant.STATUS_DEL);
        return new R<>(wpChannelSpeedSyncService.updateById(wpChannelSpeedSync));
    }

    /**
     * 编辑
     * @param  wpChannelSpeedSync  实体
     * @return success/false
     */
    @PutMapping
    public R<Boolean> edit(@RequestBody WpChannelSpeedSync wpChannelSpeedSync) {
//        wpChannelSpeedSync.setUpdateTime(new Date());
        return new R<>(wpChannelSpeedSyncService.updateById(wpChannelSpeedSync));
    }
}
