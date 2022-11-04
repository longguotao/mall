package lgt.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import lgt.common.utils.PageUtils;
import lgt.mall.order.entity.OmsOrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author longguotao
 * @email longgt9898@163.com
 * @date 2022-11-03 11:37:14
 */
public interface OmsOrderReturnApplyService extends IService<OmsOrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

