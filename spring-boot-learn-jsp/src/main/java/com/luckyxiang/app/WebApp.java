package com.luckyxiang.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({
        "com.luckyxiang.controller",
        "com.luckyxiang.controller.advice"
})
//@ServletComponentScan
public class WebApp extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(WebApp.class);
    }

    /*
    需要使用Tasks中application-》bootRun运行
    否则在子项目中找不到/WEB-INF/jsp路径

    打成jar包也可以就是比较麻烦，需要把jsp文件打到META-INF/resource中
     */
    public static void main(String [] args) {
        SpringApplication.run(WebApp.class, args);
    }

}
