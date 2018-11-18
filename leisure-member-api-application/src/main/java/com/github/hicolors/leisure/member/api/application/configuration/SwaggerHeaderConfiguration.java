package com.github.hicolors.leisure.member.api.application.configuration;

import com.github.hicolors.leisure.backend.gateway.sdk.consts.AuthenticationConsts;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.Parameter;

/**
 * SwaggerConfiguration
 *
 * @author weichao.li (liweichao0102@gmail.com)
 * @date 2018/11/18
 */
@Configuration
public class SwaggerHeaderConfiguration {

    @Bean
    public Parameter accessToken() {
        return new ParameterBuilder().name(AuthenticationConsts.HEADER_AUTHENTICATION)
                .description("访问令牌")
                .modelRef(new ModelRef("string"))
                .parameterType("header")
                .required(false)
                .build();
    }

    @Bean
    public Parameter userInfo() {
        return new ParameterBuilder().name(AuthenticationConsts.HEADER_USER_INFO)
                .description("用户信息")
                .modelRef(new ModelRef("string"))
                .parameterType("header")
                .required(false)
                .build();
    }

}
