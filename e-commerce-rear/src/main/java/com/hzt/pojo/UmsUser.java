package com.hzt.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hzt.pojo.BasePojo;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author huzt
 * @since 2022-04-18
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UmsUser extends BasePojo {

    private static final long serialVersionUID = 1L;

    /**
     * 登陆名
     */
    private String loginName;

    /**
     * 昵称
     */
    private String nickyName;

    /**
     * 密码
     */
    @JsonIgnore
    private String password;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 是否有效
     */
    private Integer active;

    /**
     * 用户头像
     */
    private String icon;

    /**
     * 密码明文
     */
    @TableField(exist = false)
    @JsonIgnore
    private String rawPassword;


}
