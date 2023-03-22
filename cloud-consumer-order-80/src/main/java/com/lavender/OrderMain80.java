package com.lavender;

import com.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = MySelfRule.class)  // 不使用默认的轮询,使用自定义的随机
public class OrderMain80 {

    public static void main(String[] args){
        SpringApplication.run(OrderMain80.class,args);
    }

}
