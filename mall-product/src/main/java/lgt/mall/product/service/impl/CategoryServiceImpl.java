package lgt.mall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lgt.common.utils.PageUtils;
import lgt.common.utils.Query;
import lgt.mall.product.dao.CategoryDao;
import lgt.mall.product.entity.CategoryEntity;
import lgt.mall.product.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        List<CategoryEntity> allCategoryEntities = list();
        List<CategoryEntity> lv1Menus = allCategoryEntities.stream()
                .filter(categoryEntity -> categoryEntity.getParentCid().equals(0L))
                .map(categoryEntity -> {
                    categoryEntity.setCategoryChildren(getChildren(categoryEntity, allCategoryEntities));
                    return categoryEntity;
                }).sorted((c1, c2) -> c2.getSort() - c1.getSort()) // order by sort desc
                .collect(Collectors.toList());
        return lv1Menus;
    }

    private List<CategoryEntity> getChildren(CategoryEntity root, List<CategoryEntity> allCategoryEntities) {
        return allCategoryEntities.stream()
                .filter(categoryEntity -> categoryEntity.getParentCid().equals(root.getCatId()))
                .map(categoryEntity -> {
                    categoryEntity.setCategoryChildren(getChildren(categoryEntity, allCategoryEntities));
                    return categoryEntity;
                }).sorted((c1, c2) -> c2.getSort() - c1.getSort()) // order by sort desc
                .collect(Collectors.toList());
    }


}