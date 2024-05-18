# mall
ECサイド
/*
* 1.导入依赖
* 2.部署nocos
* 3.配置nocos的服务器信息
* 4.在启动类配置
* */
  @EnableDiscoveryClient
 cloud:
  nacos:
  discovery:
  server-addr: 127.0.0.1:8848
 application:
  name: ecmall-coupon

/*
* 1，想要远程调用
*   1).引入open-feign
*   2).编写一个接口，告诉SpringCloud这个接口需要远程调用服务
*     1.声明接口的每一个方法都是调用那个远程服务的请求的方法
*   3).开启远程调用
* */
  @EnableFeignClients(basePackages = "com.mall.ecmall.menber.feign")


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
  @MapperScan("com.mall.ecmall.product.dao")