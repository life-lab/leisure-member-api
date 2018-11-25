package com.github.life.lab.leisure.member.api.application.service;

import com.github.life.lab.leisure.member.api.model.resoures.backend.member.MemberInfo;
import com.github.life.lab.leisure.member.api.model.resoures.backend.platform.PlatformInfo;
import com.github.life.lab.leisure.member.authorization.token.UserInfo;

import java.util.List;

/**
 * MemberService
 *
 * @author weichao.li (liweichao0102@gmail.com)
 * @date 2018-11-25
 */
public interface MemberService {

    MemberInfo memberInfo(UserInfo userInfo);

    PlatformInfo primaryPlatform(UserInfo userInfo);

    List<PlatformInfo> platform(UserInfo userInfo);
}
