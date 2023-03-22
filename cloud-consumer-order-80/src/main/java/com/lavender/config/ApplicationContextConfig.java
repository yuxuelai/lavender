package com.lavender.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced  // 这个注解赋予了RestTemplate 负载均衡的能力 ---> 轮询
    public RestTemplate getRestTemplate(){

        return new RestTemplate ();
    }

}
