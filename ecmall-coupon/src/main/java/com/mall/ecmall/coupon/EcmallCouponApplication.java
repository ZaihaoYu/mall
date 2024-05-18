package com.mall.ecmall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EcmallCouponApplication {

  public static void main(String[] args) {
    SpringApplication.run(EcmallCouponApplication.class, args);
  }

}
