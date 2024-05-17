package com.mall.ecmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.mall.ecmall.product.entity.BrandEntity;

import com.mall.common.utils.PageUtils;
import java.util.Map;
import org.springframework.stereotype.Service;

/**
 * 品牌
 *
 * @author yu zaihao
 * @email yuzaihao1234@gmail.com
 * @date 2024-05-16 14:44:25
 */

public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

