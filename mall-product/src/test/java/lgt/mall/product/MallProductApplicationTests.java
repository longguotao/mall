package lgt.mall.product;

import lgt.mall.product.entity.CategoryEntity;
import lgt.mall.product.service.AttrService;
import lgt.mall.product.service.CategoryService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;


@SpringBootTest
public class MallProductApplicationTests {

    @Resource
    private AttrService attrService;
    @Resource
    private CategoryService categoryService;

    @Test
    public void dbConnectTest() {
        List<CategoryEntity> categories = categoryService.listWithTree();
        System.out.println(categories.size()); //74
    }
}
