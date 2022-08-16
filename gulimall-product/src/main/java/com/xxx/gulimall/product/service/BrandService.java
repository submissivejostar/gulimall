package com.xxx.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxx.common.utils.PageUtils;
import com.xxx.gulimall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author xiexiaoxuan
 * @email xiaoxuan1998@gmail.com
 * @date 2022-08-16 14:57:25
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

