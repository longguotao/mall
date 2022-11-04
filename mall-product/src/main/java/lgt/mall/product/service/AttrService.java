package lgt.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import lgt.common.utils.PageUtils;
import lgt.mall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author longguotao
 * @email longgt9898@163.com
 * @date 2022-11-03 10:48:25
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

