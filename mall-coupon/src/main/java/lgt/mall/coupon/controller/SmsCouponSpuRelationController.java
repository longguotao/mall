package lgt.mall.coupon.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lgt.mall.coupon.entity.SmsCouponSpuRelationEntity;
import lgt.mall.coupon.service.SmsCouponSpuRelationService;
import lgt.common.utils.PageUtils;
import lgt.common.utils.R;



/**
 * 优惠券与产品关联
 *
 * @author longguotao
 * @email longgt9898@163.com
 * @date 2022-11-03 13:25:07
 */
@RestController
@RequestMapping("product/smscouponspurelation")
public class SmsCouponSpuRelationController {
    @Autowired
    private SmsCouponSpuRelationService smsCouponSpuRelationService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("product:smscouponspurelation:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = smsCouponSpuRelationService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("product:smscouponspurelation:info")
    public R info(@PathVariable("id") Long id){
		SmsCouponSpuRelationEntity smsCouponSpuRelation = smsCouponSpuRelationService.getById(id);

        return R.ok().put("smsCouponSpuRelation", smsCouponSpuRelation);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("product:smscouponspurelation:save")
    public R save(@RequestBody SmsCouponSpuRelationEntity smsCouponSpuRelation){
		smsCouponSpuRelationService.save(smsCouponSpuRelation);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("product:smscouponspurelation:update")
    public R update(@RequestBody SmsCouponSpuRelationEntity smsCouponSpuRelation){
		smsCouponSpuRelationService.updateById(smsCouponSpuRelation);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("product:smscouponspurelation:delete")
    public R delete(@RequestBody Long[] ids){
		smsCouponSpuRelationService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
