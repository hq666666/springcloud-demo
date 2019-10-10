package com.person.test.ribbon;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class MyConfiguration {

    /**
     * RestTemplate可以自动配置为使用功能区。要创建负载平衡RestTemplate创建RestTemplate @Bean并使用@LoadBalanced限定符
     * 创建RestTemplate并访问其他网站路径
     * @return
     */
    @LoadBalanced
    @Bean
    public RestTemplate getRestTemplate(){
        RestTemplate restTemplate = new RestTemplate();

        String result = restTemplate.getForObject("http://localhost:8000/system/user/hello", String.class);
        System.out.println(result);
        return restTemplate;
    }


}
