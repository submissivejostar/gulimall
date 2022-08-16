package com.xxx.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxx.common.utils.PageUtils;
import com.xxx.gulimall.product.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author xiexiaoxuan
 * @email xiaoxuan1998@gmail.com
 * @date 2022-08-16 14:57:25
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

