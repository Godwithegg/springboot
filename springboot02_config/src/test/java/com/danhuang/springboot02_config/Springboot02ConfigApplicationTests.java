package com.danhuang.springboot02_config;


import com.danhuang.springboot02_config.bean.Person;
import com.danhuang.springboot02_config.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * springboot单元测试；
 * <p>
 * 可以在测试期间很方便类似编码一样进行自动注入等容器的功能
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot02ConfigApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;

    @Test
    public void testHelloService(){
        boolean b = ioc.containsBean("helloService");
        System.out.println(b);

    }
    @Test
    public void contextLoads() {
        System.out.println(person);
    }

}
