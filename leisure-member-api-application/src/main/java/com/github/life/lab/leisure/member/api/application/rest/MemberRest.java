package com.github.life.lab.leisure.member.api.application.rest;

import com.github.life.lab.leisure.member.authorization.token.UserInfo;
import com.github.life.lab.leisure.member.authorization.token.impl.AuthToken;
import com.github.life.lab.leisure.member.model.persistence.Member;
import com.github.life.lab.leisure.member.sdk.MemberClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * MemberRest
 *
 * @author weichao.li (liweichao0102@gmail.com)
 * @date 2018-11-24
 */
@RestController
@RequestMapping("/member")
public class MemberRest {

    @Autowired
    private MemberClient memberClient;

    @GetMapping
    public Member find(@ApiIgnore UserInfo userInfo) {
        return memberClient.queryOneById(userInfo.getId());
    }
}
