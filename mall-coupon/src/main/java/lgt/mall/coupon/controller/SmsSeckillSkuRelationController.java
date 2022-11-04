package lgt.mall.coupon.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lgt.mall.coupon.entity.SmsSeckillSkuRelationEntity;
import lgt.mall.coupon.service.SmsSeckillSkuRelationService;
import lgt.common.utils.PageUtils;
import lgt.common.utils.R;



/**
 * 秒杀活动商品关联
 *
 * @author longguotao
 * @email longgt9898@163.com
 * @date 2022-11-03 13:25:07
 */
@RestController
@RequestMapping("product/smsseckillskurelation")
public class SmsSeckillSkuRelationController {
    @Autowired
    private SmsSeckillSkuRelationService smsSeckillSkuRelationService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("product:smsseckillskurelation:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = smsSeckillSkuRelationService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("product:smsseckillskurelation:info")
    public R info(@PathVariable("id") Long id){
		SmsSeckillSkuRelationEntity smsSeckillSkuRelation = smsSeckillSkuRelationService.getById(id);

        return R.ok().put("smsSeckillSkuRelation", smsSeckillSkuRelation);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("product:smsseckillskurelation:save")
    public R save(@RequestBody SmsSeckillSkuRelationEntity smsSeckillSkuRelation){
		smsSeckillSkuRelationService.save(smsSeckillSkuRelation);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("product:smsseckillskurelation:update")
    public R update(@RequestBody SmsSeckillSkuRelationEntity smsSeckillSkuRelation){
		smsSeckillSkuRelationService.updateById(smsSeckillSkuRelation);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("product:smsseckillskurelation:delete")
    public R delete(@RequestBody Long[] ids){
		smsSeckillSkuRelationService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
