package com.kaikeba.consumer.codeconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author fyl
 * @data
 **/
@Configuration
public class DepartCodeConfig {

    @Bean
    public RestTemplate restTemplate(){

        return  new RestTemplate();
    }

}
