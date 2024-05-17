package com.mall.ecmall.menber.dao;

import com.mall.ecmall.menber.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author yu zaihao
 * @email yuzaihao1234@gmail.com
 * @date 2024-05-17 20:43:53
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
