package com.github.life.lab.leisure.member.api.model.resoures.backend.member;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Member
 *
 * @author weichao.li (liweichao0102@gmail.com)
 * @date 2018-11-25
 */
@Data
@NoArgsConstructor
public class MemberInfo {

    private Long id;
    private String nickName;
    private String username;
    private Boolean enabled;
    private Boolean lockStatus;
    private String email;
    private String mobile;
    private String name;
    private Date birthday;
    private String description;
    private String website;
    private String avatar;
}
