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
@ApiModel(value="SysJob对象", description="")
public class SysJob extends Model<SysJob> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "事件标签")
    @TableField("bean_name")
    private String beanName;

    @ApiModelProperty(value = "计数")
    @TableField("params")
    private String params;

    @ApiModelProperty(value = "影像编码")
    @TableField("cron_expression")
    private String cronExpression;

    @ApiModelProperty(value = "图片相对位置")
    @TableField("status")
    private String status;

    @TableField("remark")
    private String remark;

    @TableField("create_time")
    private LocalDateTime createTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
