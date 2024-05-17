package com.mall.ecmall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 属性分组
 * 
 * @author yu zaihao
 * @email yuzaihao1234@gmail.com
 * @date 2024-05-16 14:57:51
 */

@TableName("pms_attr_group")
public class AttrGroupEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 分组id
	 */
	@TableId
	private Long attrGroupId;
	/**
	 * 组名
	 */
	private String attrGroupName;
	/**
	 * 排序
	 */
	private Integer sort;
	/**
	 * 描述
	 */
	private String descript;
	/**
	 * 组图标
	 */
	private String icon;
	/**
	 * 所属分类id
	 */
	private Long catelogId;

	public Long getAttrGroupId() {
		return attrGroupId;
	}

	public String getAttrGroupName() {
		return attrGroupName;
	}

	public Integer getSort() {
		return sort;
	}

	public String getDescript() {
		return descript;
	}

	public String getIcon() {
		return icon;
	}

	public Long getCatelogId() {
		return catelogId;
	}
}
