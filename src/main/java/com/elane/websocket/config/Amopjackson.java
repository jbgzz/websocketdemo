package com.elane.websocket.config;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zhengwei on 2018/10/9.
 */
@Configuration
public class Amopjackson {

    @Bean
    public MessageConverter messageconverter(){
        return  new Jackson2JsonMessageConverter();
    }
}
