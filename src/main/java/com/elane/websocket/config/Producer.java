package com.elane.websocket.config;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by zhengwei on 2018/10/9.
 */



@RestController
@RequestMapping("/send")
public class Producer {

    @Autowired
    private RabbitTemplate rabbitTemplate;


    @RequestMapping("/sendmessages")
    public void send(){
        Map<String,Object>  map=new HashMap<>();
        map.put("msg","第一条信息");
        map.put("data",Arrays.asList("hello","123333"));
        rabbitTemplate.convertAndSend("topicExchange","topic.#",map);
    }
}
