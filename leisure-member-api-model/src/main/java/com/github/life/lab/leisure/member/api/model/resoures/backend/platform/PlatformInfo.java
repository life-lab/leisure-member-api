package com.github.life.lab.leisure.member.api.model.resoures.backend.platform;

import com.github.life.lab.leisure.member.model.consts.EnumPlatformStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * PlatformInfo
 *
 * @author weichao.li (liweichao0102@gmail.com)
 * @date 2018-11-25
 */
@Data
@NoArgsConstructor
public class PlatformInfo {

    private Long id;

    private String name;

    private EnumPlatformStatus status;

    private String comment;
}
