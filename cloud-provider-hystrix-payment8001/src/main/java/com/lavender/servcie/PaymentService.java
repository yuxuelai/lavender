package com.lavender.servcie;

import com.sun.xml.internal.ws.resources.UtilMessages;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class PaymentService {

    /**
     * 正常访问
     * can visit
     * @param id
     * @return
     */
    public String paymentInfo(Integer id){

        return "线程池："+Thread.currentThread ().getName ()+"paymentInfo_OK,id:"+id;

    }


    /**
     * cant visit normally
     * @param id
     * @return
     */

    public String paymentInfo_Error(Integer id) throws InterruptedException {

        int timeNumber = 3;

        TimeUnit.SECONDS.sleep (timeNumber);

        return "线程池："+Thread.currentThread ().getName ()+"paymentInfo_Error,id:"+id+"\t"+"耗时(秒)"+timeNumber+"秒钟";


    }

}
