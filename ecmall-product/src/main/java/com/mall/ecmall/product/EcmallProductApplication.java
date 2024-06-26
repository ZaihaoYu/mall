package com.mall.ecmall.product;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/*
 *1.整合MyBatis-plus
 *  1).导入依赖
 *  2).配置
 * 		1.配置数据源
 * 			1).导入数据库驱动
 * 			2).在application.yml配置数据源相关的信息
 * 		2.配置MyBatis-Plus
 * 			1). 使用MapperScan扫描mapper
 * 			2). 告诉MyBatis-plus，sqk映射文件的位置（在yml中配置）
 * */
@EnableDiscoveryClient
@MapperScan("com.mall.ecmall.product.dao")
@SpringBootApplication
public class EcmallProductApplication {
	public static void main(String[] args) {
		SpringApplication.run(EcmallProductApplication.class, args);
	}

}
