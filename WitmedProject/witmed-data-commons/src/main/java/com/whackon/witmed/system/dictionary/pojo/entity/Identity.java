package com.whackon.witmed.system.dictionary.pojo.entity;

import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>系统功能 - 人员身份实体信息</b>
 *
 * @author user
 * @date 2022/1/4
 * @version 1.0.0
 * @since 1.0.0
 */
@Data
public class Identity extends BaseEntity {
	private static final long serialVersionUID = 7229802796791467997L;
	private Integer id;                         //主键
	private String code;                        //身份编号
	private String name;                        //身份信息
}
