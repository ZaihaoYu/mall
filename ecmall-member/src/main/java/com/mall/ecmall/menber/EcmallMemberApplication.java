package com.mall.ecmall.menber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/*
* 1，想要远程调用
*   1).引入open-feign
*   2).编写一个接口，告诉SpringCloud这个接口需要远程调用服务
*     1.声明接口的每一个方法都是调用那个远程服务的请求的方法
*   3).开启远程调用
* */
@EnableFeignClients(basePackages = "com.mall.ecmall.menber.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class EcmallMemberApplication {

  public static void main(String[] args) {
    SpringApplication.run(EcmallMemberApplication.class, args);
  }

}
