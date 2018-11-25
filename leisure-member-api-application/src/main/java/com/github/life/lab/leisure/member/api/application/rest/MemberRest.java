package com.github.life.lab.leisure.member.api.application.rest;

import com.github.life.lab.leisure.member.api.application.service.MemberService;
import com.github.life.lab.leisure.member.api.intf.MemberApi;
import com.github.life.lab.leisure.member.api.model.resoures.backend.member.MemberInfo;
import com.github.life.lab.leisure.member.api.model.resoures.backend.platform.PlatformInfo;
import com.github.life.lab.leisure.member.authorization.token.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

/**
 * MemberRest
 *
 * @author weichao.li (liweichao0102@gmail.com)
 * @date 2018-11-24
 */
@RestController
@RequestMapping("/member")
public class MemberRest implements MemberApi {

    @Autowired
    private MemberService memberService;

    @Override
    public MemberInfo memberInfo(@ApiIgnore UserInfo userInfo) {
        return memberService.memberInfo(userInfo);
    }

    @Override
    public PlatformInfo primaryPlatform(@ApiIgnore UserInfo userInfo) {
        return memberService.primaryPlatform(userInfo);
    }

    @Override
    public List<PlatformInfo> platform(@ApiIgnore UserInfo userInfo) {
        return memberService.platform(userInfo);
    }
}
