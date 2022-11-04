package lgt.mall.order;

import lgt.mall.order.entity.OmsOrderEntity;
import lgt.mall.order.service.OmsOrderService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;


@SpringBootTest
public class MallOrderApplicationTests {

    @Resource
    OmsOrderService omsOrderService;

    @Test
    public void dbConnectTest() {
        OmsOrderEntity omsOrderEntity = new OmsOrderEntity();
        omsOrderEntity.setBillContent("a阿松ss大");
        omsOrderEntity.setOrderSn("asdaa");
        omsOrderService.save(omsOrderEntity);
    }
}
