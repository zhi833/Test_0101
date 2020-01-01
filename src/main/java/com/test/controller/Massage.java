package com.test.controller;


import com.sun.xml.internal.bind.v2.model.core.ID;
import lombok.Data;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController

@Data
public class Massage {


   public class SendMassage {

        private String id;
        private String name;
        private String code;
        private Date sendTime;
        private String operId;
    }


    public static void main(String[] args) {

        SendMassage sendMassage = new SendMassage() ; //错误代码

        sendMassage.id = "13888888888";
        sendMassage.name = "zhangsan";
        sendMassage.code = "9889654";
        sendMassage.sendTime = new Date();


        System.out.println(sendMassage);

    }

}
