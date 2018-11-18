package com.github.hicolors.leisure.member.api.application.configuration;

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
    public Parameter parameter() {
        return new ParameterBuilder().name("access-token")
                .description("访问令牌")
                .modelRef(new ModelRef("string"))
                .parameterType("header")
                .required(false)
                .build();
    }

}
