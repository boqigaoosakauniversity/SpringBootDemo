package com.example.demo.config;


import com.example.demo.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration: 指明当前类是一个配置类，就是来替代之前的
 * Spring配置文件
 * 在配置文件中用<bean></bean>标签添加组件
 */

@Configuration
public class MyAppConfig {

    //Bean的意思就是将方法的返回值添加到容器中；容器中这个组件的名字就是默认的方法名
    @Bean
    public HelloService helloService(){
        System.out.println("配置类@Bean给容器中添加组件了");
        return new HelloService();
    }
}
