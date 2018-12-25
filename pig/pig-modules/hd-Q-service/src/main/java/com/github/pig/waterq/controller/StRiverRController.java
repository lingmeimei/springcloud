package com.github.pig.waterq.controller;
import java.util.List;
import java.util.Map;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.github.pig.common.constant.CommonConstant;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.github.pig.common.util.Query;
import com.github.pig.common.util.R;
import com.github.pig.waterq.model.entity.StRiverR;
import com.github.pig.waterq.service.StRiverRService;
import com.github.pig.common.web.BaseController;

/**
 * <p>
 * 国标库河道水情表 前端控制器
 * </p>
 *
 * @author xlhua
 * @since 2018-11-09
 */
@RestController
@RequestMapping("/stRiverR")
public class StRiverRController extends BaseController {
    @Autowired
    private StRiverRService stRiverRService;

    /**
    * 通过ID查询
    *
    * @param id ID
    * @return StRiverR
    */
    @GetMapping("/{id}")
    public R<StRiverR> get(@PathVariable Integer id) {
        return new R<>(stRiverRService.selectById(id));
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
        return stRiverRService.selectPage(new Query<>(params), new EntityWrapper<>());
    }

    /**
     * 查询信息(LIST)
     *
     * @param params list
     * @return list
     */
    @RequestMapping("/list")
    public List<StRiverR> getStRiverRList(@RequestParam Map<String, Object> params) {
//        params.put(CommonConstant.DEL_FLAG, CommonConstant.STATUS_NORMAL);
        return stRiverRService.selectList(new EntityWrapper<>());
    }

    /**
     * 查询信息(page)
     *
     * @param params 分页对象
     * @return 分页对象
     */
    @RequestMapping("/multipleData")
    public Page getMultipleData(@RequestParam Map<String, Object> params) {
//        params.put(CommonConstant.DEL_FLAG, CommonConstant.STATUS_NORMAL);
        return stRiverRService.selectMultipleDataPage(new Query<>(params), new EntityWrapper<>());
    }

    /**
     * 添加
     * @param  stRiverR  实体
     * @return success/false
     */
    @PostMapping
    public R<Boolean> add(@RequestBody StRiverR stRiverR) {
        return new R<>(stRiverRService.insert(stRiverR));
    }

    /**
     * 删除
     * @param id ID
     * @return success/false
     */
    @DeleteMapping("/{id}")
    public R<Boolean> delete(@PathVariable Integer id) {
        StRiverR stRiverR = new StRiverR();
//        stRiverR.setStcd(id);
//        stRiverR.setUpdateTime(new Date());
//        stRiverR.setDelFlag(CommonConstant.STATUS_DEL);
        return new R<>(stRiverRService.updateById(stRiverR));
    }

    /**
     * 编辑
     * @param  stRiverR  实体
     * @return success/false
     */
    @PutMapping
    public R<Boolean> edit(@RequestBody StRiverR stRiverR) {
//        stRiverR.setUpdateTime(new Date());
        return new R<>(stRiverRService.updateById(stRiverR));
    }
}
