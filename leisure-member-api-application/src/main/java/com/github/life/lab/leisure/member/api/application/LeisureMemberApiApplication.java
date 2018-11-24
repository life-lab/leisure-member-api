package com.github.life.lab.leisure.member.api.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * LeisureMemberApiApplication
 *
 * @author weichao.li (liweichao0102@gmail.com)
 * @date 2018/11/14
 */
@SpringBootApplication
@EnableFeignClients({
        "com.github.life.lab.leisure.member.sdk"

})
public class LeisureMemberApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeisureMemberApiApplication.class, args);
    }

}