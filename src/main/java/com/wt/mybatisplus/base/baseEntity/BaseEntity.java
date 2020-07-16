package com.wt.mybatisplus.base.baseEntity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.gitee.sunchenbin.mybatis.actable.annotation.Column;

import java.io.Serializable;
import java.util.Date;

public abstract class BaseEntity  implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO, value = "id")
    @Column(name = "id", type = "bigint",length=20, isKey = true, isAutoIncrement = true)
    private Long id;// 自增长ID

    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    @Column(name = "create_time", type = "datetime",comment = "创建时间")
    private Date createTime;// 创建时间

    @Column(name = "is_del" ,length=1, type = "int",comment = "是否删除")
    private int isDel;

    @Column(name = "create_user",length=36, type = "varchar",comment = "创建人名")
    private String createUser;// 创建人名

    @Column(name = "create_user_id",length=36, type = "varchar",comment = "创建人id")
    private String createUserId;// 创建人id

    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    @Column(name = "update_time", type = "datetime",comment = "修改时间")
    private Date updateTime;// 修改时间

    @Column(name = "update_user",length=36, type = "varchar",comment = "修改人名")
    private String updateUser;// 修改人名

    @Column(name = "update_user_id",length=36, type = "varchar",comment = "修改人id")
    private String updateUserId;// 修改人id

    //当前用户是否是创建者
    @TableField(exist = false)
    private boolean isCreater;


}
