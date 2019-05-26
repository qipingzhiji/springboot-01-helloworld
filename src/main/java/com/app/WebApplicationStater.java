package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by zhang_htao on 2019/5/26.
 */
//标注这是一个springboot应用程序
@SpringBootApplication(scanBasePackages = "com.controller")
public class WebApplicationStater {
    public static void main(String[] args) {
        //启动一个springboot应用程序
        SpringApplication.run(WebApplicationStater.class, args);
    }
}
