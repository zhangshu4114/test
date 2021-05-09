package com.atguigu.test;

import org.apache.tomcat.jni.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }
    @Bean
    public User user(){
        
        System.out.println("/----/");
        return new User();
    }




    public Integer add(Integer n1,Integer n2){
        return n1+n2;
    }
}
