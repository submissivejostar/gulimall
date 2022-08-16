package com.xxx.gulimall.product.dao;

import com.xxx.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author xiexiaoxuan
 * @email xiaoxuan1998@gmail.com
 * @date 2022-08-16 14:57:25
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
