package com.whackon.witmed.system.dictionary.pojo.entity;

import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>系统功能 - 学历实体信息</b>
 *
 * @author user
 * @date 2022/1/4
 * @version 1.0.0
 * @since 1.0.0
 */
@Data
public class Education extends BaseEntity {
	private static final long serialVersionUID = 5657456268970653359L;
	private Integer id;                             //主键
	private String code;                            //学历编号
	private String name;                            //学历名称

}
