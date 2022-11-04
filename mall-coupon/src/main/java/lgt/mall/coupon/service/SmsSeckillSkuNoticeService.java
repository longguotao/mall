package lgt.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import lgt.common.utils.PageUtils;
import lgt.mall.coupon.entity.SmsSeckillSkuNoticeEntity;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author longguotao
 * @email longgt9898@163.com
 * @date 2022-11-03 13:25:07
 */
public interface SmsSeckillSkuNoticeService extends IService<SmsSeckillSkuNoticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

