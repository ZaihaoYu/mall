package com.mall.ecmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.mall.ecmall.product.entity.AttrGroupEntity;

import com.mall.common.utils.PageUtils;
import java.util.Map;

/**
 * 属性分组
 *
 * @author yu zaihao
 * @email yuzaihao1234@gmail.com
 * @date 2024-05-16 14:57:51
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

