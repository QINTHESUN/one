package com.cp.subject.infra.basic.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 多选题信息表(SubjectMultiple)表实体类
 * 
 * @author makejava
 * @since 2024-10-22 20:13:03
 */

@Data
@TableName("subject_multiple")
public class SubjectMultipleEntity  implements Serializable {
    private static final long serialVersionUID = -18976788726495476L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 题目id
     */
    private Long subjectId;

    /**
     * 选项类型
     */
    private Long optionType;

    /**
     * 选项内容
     */
    private String optionContent;

    /**
     * 是否正确
     */
    private Integer isCorrect;

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
     * 
     */
    private Integer isDeleted;

}

