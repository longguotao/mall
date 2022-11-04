package lgt.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import lgt.common.utils.PageUtils;
import lgt.mall.ware.entity.WmsPurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author longguotao
 * @email longgt9898@163.com
 * @date 2022-11-03 13:27:40
 */
public interface WmsPurchaseDetailService extends IService<WmsPurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

