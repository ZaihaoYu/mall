package com.mall.ecmall.menber.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mall.common.utils.R;

@FeignClient("ecmall-coupon")
public interface CouponFeignService {
    @RequestMapping("/coupon/coupon/menber/list")
    R menbercoupons();
}
