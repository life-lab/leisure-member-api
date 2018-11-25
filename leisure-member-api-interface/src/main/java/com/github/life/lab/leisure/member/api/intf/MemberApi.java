package com.github.life.lab.leisure.member.api.intf;


import com.github.life.lab.leisure.member.api.model.resoures.backend.member.MemberInfo;
import com.github.life.lab.leisure.member.api.model.resoures.backend.platform.PlatformInfo;
import com.github.life.lab.leisure.member.authorization.token.UserInfo;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

/**
 * MemberApi
 *
 * @author weichao.li (liweichao0102@gmail.com)
 * @date 2018/11/3
 */
@Api(tags = "member", description = "对人员的相关操作")
@RequestMapping("member")
public interface MemberApi {

    @GetMapping
    MemberInfo memberInfo(@ApiIgnore UserInfo userInfo);

    @GetMapping("/platform/primary")
    PlatformInfo primaryPlatform(@ApiIgnore UserInfo userInfo);

    @GetMapping("/platform")
    List<PlatformInfo> platform(@ApiIgnore UserInfo userInfo);
}
