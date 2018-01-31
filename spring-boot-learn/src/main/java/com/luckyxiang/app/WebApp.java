package com.luckyxiang.app;

import com.luckyxiang.config.DruidConfig;
import com.luckyxiang.config.JpaConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({DruidConfig.class, JpaConfig.class})
@ComponentScan({
        "com.luckyxiang.controller",
        "com.luckyxiang.controller.advice",
        "com.luckyxiang.service.impl"
})
@MapperScan("com.luckyxiang.dao.mapper")
public class WebApp {

    public static void main(String [] args) {
        SpringApplication.run(WebApp.class, args);
    }

}
