package com.mszlu.blog.dao.pojo;

import lombok.Data;

/**
 * @ClassName SysUser
 * @Description TODO
 * @Author jiaomf
 * @Date 2021/8/15 11:36
 * @Version 1.0
 **/
@Data
public class SysUser {

    private Long id;

    private String account;

    private Integer admin;

    private String avatar;

    private Long createDate;

    private Integer deleted;

    private String email;

    private Long lastLogin;

    private String mobilePhoneNumber;

    private String nickname;

    private String password;

    private String salt;

    private String status;
}
