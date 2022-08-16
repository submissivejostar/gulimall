package com.xxx.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxx.common.utils.PageUtils;
import com.xxx.gulimall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author xiexiaoxuan
 * @email xiaoxuan1998@gmail.com
 * @date 2022-08-16 14:57:24
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

