package com.cp.auth.infra.basic.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * (AuthRole)表实体类
 * 
 * @author makejava
 * @since 2024-10-26 09:02:57
 */

@Data
@TableName("auth_role")
public class AuthRoleEntity  implements Serializable {
    private static final long serialVersionUID = 831496908236130481L;

    /**
     * 
     */
    private Long id;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 角色唯一标识
     */
    private String roleKey;

    /**
     * 创建人
     */
    private String createdBy;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 更新人
     */
    private String updateBy;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 是否被删除 0未删除 1已删除
     */
    private Integer isDeleted;

}

