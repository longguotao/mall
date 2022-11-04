package lgt.mall.order.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lgt.mall.order.entity.OmsRefundInfoEntity;
import lgt.mall.order.service.OmsRefundInfoService;
import lgt.common.utils.PageUtils;
import lgt.common.utils.R;



/**
 * 退款信息
 *
 * @author longguotao
 * @email longgt9898@163.com
 * @date 2022-11-03 11:37:14
 */
@RestController
@RequestMapping("product/omsrefundinfo")
public class OmsRefundInfoController {
    @Autowired
    private OmsRefundInfoService omsRefundInfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("product:omsrefundinfo:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = omsRefundInfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("product:omsrefundinfo:info")
    public R info(@PathVariable("id") Long id){
		OmsRefundInfoEntity omsRefundInfo = omsRefundInfoService.getById(id);

        return R.ok().put("omsRefundInfo", omsRefundInfo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("product:omsrefundinfo:save")
    public R save(@RequestBody OmsRefundInfoEntity omsRefundInfo){
		omsRefundInfoService.save(omsRefundInfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("product:omsrefundinfo:update")
    public R update(@RequestBody OmsRefundInfoEntity omsRefundInfo){
		omsRefundInfoService.updateById(omsRefundInfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("product:omsrefundinfo:delete")
    public R delete(@RequestBody Long[] ids){
		omsRefundInfoService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
