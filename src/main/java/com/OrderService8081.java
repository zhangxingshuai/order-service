package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)//排除自动配置
@MapperScan("com.dao")
public class OrderService8081 {
    public static void main(String[] args) {
        SpringApplication.run(OrderService8081.class, args);
    }
}
