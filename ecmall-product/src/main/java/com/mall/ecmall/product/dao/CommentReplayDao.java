package com.mall.ecmall.product.dao;

import com.mall.ecmall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author yu zaihao
 * @email yuzaihao1234@gmail.com
 * @date 2024-05-16 14:44:25
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
