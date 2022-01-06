package com.whackon.witmed.system.admin.pojo.entity;

import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
* <b>系统功能 - 系统用户实体信息</b>
*
* @author Arthur
* @date 2022/1/5
* @version 1.0.0
* @since 1.0.0
*/
@Data
public class Role extends BaseEntity {
	private static final long serialVersionUID = -2416862974445603140L;
	private Long id;                        // 主键
	private String code;                        // 角色编码
	private String name;                        // 角色名称
}