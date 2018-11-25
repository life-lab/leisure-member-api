package com.github.life.lab.leisure.member.api.application.service.impl;

import com.github.life.lab.leisure.common.utils.ColorsBeanUtils;
import com.github.life.lab.leisure.member.api.application.service.MemberService;
import com.github.life.lab.leisure.member.api.model.resoures.backend.member.MemberInfo;
import com.github.life.lab.leisure.member.api.model.resoures.backend.platform.PlatformInfo;
import com.github.life.lab.leisure.member.authorization.token.UserInfo;
import com.github.life.lab.leisure.member.model.persistence.Member;
import com.github.life.lab.leisure.member.model.persistence.Platform;
import com.github.life.lab.leisure.member.sdk.MemberClient;
import com.github.life.lab.leisure.member.sdk.PlatformClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


/**
 * MemberService
 *
 * @author weichao.li (liweichao0102@gmail.com)
 * @date 2018-11-25
 */
@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberClient memberClient;

    @Autowired
    private PlatformClient platformClient;

    @Override
    public MemberInfo memberInfo(UserInfo userInfo) {
        Member member = memberClient.queryOneById(userInfo.getId());
        MemberInfo memberInfo = new MemberInfo();
        ColorsBeanUtils.copyPropertiesNonNull(member, memberInfo);
        ColorsBeanUtils.copyPropertiesNonNull(member.getMemberDetail(), memberInfo);
        return memberInfo;
    }

    @Override
    public PlatformInfo primaryPlatform(UserInfo userInfo) {
        Platform platform = platformClient.query(userInfo.getPlatformId());
        PlatformInfo platformInfo = new PlatformInfo();
        ColorsBeanUtils.copyPropertiesNonNull(platform, platformInfo);
        return platformInfo;
    }

    @Override
    public List<PlatformInfo> platform(UserInfo userInfo) {
        List<Platform> platforms = memberClient.queryPlatformByMemberId(userInfo.getId());
        List<PlatformInfo> platformInfos = new ArrayList<>();
        platforms.forEach(e -> {
            PlatformInfo platformInfo = new PlatformInfo();
            ColorsBeanUtils.copyPropertiesNonNull(e, platformInfo);
            platformInfos.add(platformInfo);
        });
        return platformInfos;
    }
}
