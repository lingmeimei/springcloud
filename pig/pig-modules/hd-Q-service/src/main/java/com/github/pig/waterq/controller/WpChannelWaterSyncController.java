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
import com.github.pig.waterq.model.entity.WpChannelWaterSync;
import com.github.pig.waterq.service.WpChannelWaterSyncService;
import com.github.pig.common.web.BaseController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xlhua
 * @since 2018-11-09
 */
@RestController
@RequestMapping("/wpChannelWaterSync")
public class WpChannelWaterSyncController extends BaseController {
    @Autowired private WpChannelWaterSyncService wpChannelWaterSyncService;

    /**
    * 通过ID查询
    *
    * @param id ID
    * @return WpChannelWaterSync
    */
    @GetMapping("/{id}")
    public R<WpChannelWaterSync> get(@PathVariable Integer id) {
        return new R<>(wpChannelWaterSyncService.selectById(id));
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
        return wpChannelWaterSyncService.selectPage(new Query<>(params), new EntityWrapper<>());
    }

    /**
     * 添加
     * @param  wpChannelWaterSync  实体
     * @return success/false
     */
    @PostMapping
    public R<Boolean> add(@RequestBody WpChannelWaterSync wpChannelWaterSync) {
        return new R<>(wpChannelWaterSyncService.insert(wpChannelWaterSync));
    }

    /**
     * 删除
     * @param id ID
     * @return success/false
     */
    @DeleteMapping("/{id}")
    public R<Boolean> delete(@PathVariable Integer id) {
        WpChannelWaterSync wpChannelWaterSync = new WpChannelWaterSync();
//        wpChannelWaterSync.setId(id);
//        wpChannelWaterSync.setUpdateTime(new Date());
//        wpChannelWaterSync.setDelFlag(CommonConstant.STATUS_DEL);
        return new R<>(wpChannelWaterSyncService.updateById(wpChannelWaterSync));
    }

    /**
     * 编辑
     * @param  wpChannelWaterSync  实体
     * @return success/false
     */
    @PutMapping
    public R<Boolean> edit(@RequestBody WpChannelWaterSync wpChannelWaterSync) {
//        wpChannelWaterSync.setUpdateTime(new Date());
        return new R<>(wpChannelWaterSyncService.updateById(wpChannelWaterSync));
    }
}
