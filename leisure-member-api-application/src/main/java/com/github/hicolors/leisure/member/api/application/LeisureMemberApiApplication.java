package com.github.hicolors.leisure.member.api.application;

import com.github.hicolors.leisure.member.authorization.token.UserInfo;
import com.github.hicolors.leisure.member.model.persistence.Member;
import com.github.hicolors.leisure.member.sdk.MemberClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * LeisureMemberApiApplication
 *
 * @author weichao.li (liweichao0102@gmail.com)
 * @date 2018/11/14
 */
@SpringBootApplication
@RestController
@EnableFeignClients("com.github.hicolors.leisure.member.sdk")
public class LeisureMemberApiApplication {

    @Autowired
    private MemberClient memberClient;

    public static void main(String[] args) {
        SpringApplication.run(LeisureMemberApiApplication.class, args);
    }

    @GetMapping("/xxx/{id}")
    public Member get(@ApiIgnore UserInfo userInfo, @PathVariable("id") Long id) {
        return memberClient.queryOneById(id);
    }
}