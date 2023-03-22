package com.lavender.controller;

import com.lavender.entities.CommonResult;
import com.lavender.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.UUID;

@Slf4j
@RestController
public class PaymentController {

//    @Resource
//    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/payment/zk")
    public String paymentzk(){

        return "springcloud with zookeeper:"+serverPort+"\t"
                + UUID.randomUUID ().toString ();

    }

}
