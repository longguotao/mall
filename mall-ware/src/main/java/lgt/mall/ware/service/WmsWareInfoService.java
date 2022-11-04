package lgt.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import lgt.common.utils.PageUtils;
import lgt.mall.ware.entity.WmsWareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author longguotao
 * @email longgt9898@163.com
 * @date 2022-11-03 13:27:40
 */
public interface WmsWareInfoService extends IService<WmsWareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

