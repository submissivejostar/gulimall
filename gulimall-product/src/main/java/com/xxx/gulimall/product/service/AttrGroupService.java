package com.xxx.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxx.common.utils.PageUtils;
import com.xxx.gulimall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author xiexiaoxuan
 * @email xiaoxuan1998@gmail.com
 * @date 2022-08-16 14:57:25
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

