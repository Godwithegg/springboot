package com.danhuang.springboot02_config.config;

import com.danhuang.springboot02_config.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration：告诉springboot这是一个配置类
 */
@Configuration
public class MyAppConfig {
    //将方法的返回值添加到容器中，容器中这个组件默认的id就是这个方法名
    @Bean
    public HelloService helloService(){
        System.out.println("配置类Bean给容器中添加组件了");
        return new HelloService();
    }
}
