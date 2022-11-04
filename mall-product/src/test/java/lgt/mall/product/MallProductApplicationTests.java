package lgt.mall.product;

import lgt.mall.product.entity.AttrEntity;
import lgt.mall.product.service.AttrService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;


@SpringBootTest
public class MallProductApplicationTests {

    @Resource
    private AttrService attrService;

    @Test
    public void dbConnectTest() {
        AttrEntity attrEntity = new AttrEntity();
        attrEntity.setAttrName("我都asda");
        attrEntity.setIcon("asdasdad");
        attrService.save(attrEntity);
    }
}
