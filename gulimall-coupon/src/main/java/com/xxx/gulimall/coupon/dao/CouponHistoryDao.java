package com.xxx.gulimall.coupon.dao;

import com.xxx.gulimall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author xiexiaoxuan
 * @email xiaoxuan1998@gmail.com
 * @date 2022-08-17 22:57:48
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
