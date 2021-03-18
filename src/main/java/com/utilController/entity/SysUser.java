package com.utilController.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author WCH
 * @since 2021-03-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SysUser对象", description="")
public class SysUser extends Model<SysUser> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "用户名")
    @TableField("username")
    private String username;

    @ApiModelProperty(value = "密码")
    @TableField("password")
    private String password;

    @ApiModelProperty(value = "单位")
    @TableField("real_name")
    private String realName;

    @ApiModelProperty(value = "组织机构（部门）")
    @TableField("nick_name")
    private String nickName;

    @ApiModelProperty(value = "电话")
    @TableField("TEL")
    private String tel;

    @ApiModelProperty(value = "邮箱")
    @TableField("dept_id")
    private String deptId;

    @ApiModelProperty(value = "行政区划")
    @TableField("phone")
    private String phone;

    @ApiModelProperty(value = "注册时间")
    @TableField("Enroll_time")
    private LocalDateTime enrollTime;

    @ApiModelProperty(value = "0:首次登录；1：老用户")
    @TableField("Firstlogin")
    private String Firstlogin;

    @TableField("salt")
    private String salt;

    @TableField("email")
    private String email;

    @TableField("status")
    private String status;

    @TableField("sex")
    private String sex;

    @TableField("deleted")
    private String deleted;

    @TableField("create_id")
    private Integer createId;

    @TableField("update_id")
    private Integer updateId;

    @TableField("create_where")
    private String createWhere;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("update_time")
    private LocalDateTime updateTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
