package lgt.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import lgt.common.utils.PageUtils;
import lgt.mall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author longguotao
 * @email longgt9898@163.com
 * @date 2022-11-03 10:48:25
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

