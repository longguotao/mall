package lgt.mall.product.feign;

import lgt.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("mall-order")
public interface OrderFeignService {

    @RequestMapping("/product/omsorder/countByPid")
    R countSalesByPid(@RequestParam("pid") String pid);
}
