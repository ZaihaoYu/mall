package com.mall.ecmall.order.dao;

import com.mall.ecmall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author yu zaihao
 * @email yuzaihao1234@gmail.com
 * @date 2024-05-17 21:09:04
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
