package com.xmfplus.platform.biz.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author huanghao
 * @version 1.0.0
 * @description
 * @data 2022/9/26 20:55
 **/
@SpringBootApplication(scanBasePackages = "com.xmfplus.platform")
public class BizUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(BizUserApplication.class, args);
    }
}
