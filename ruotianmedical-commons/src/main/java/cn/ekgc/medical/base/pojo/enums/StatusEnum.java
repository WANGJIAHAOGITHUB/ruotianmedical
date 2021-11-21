package cn.ekgc.medical.base.pojo.enums;

import javax.swing.*;

/**
 * <b>系统状态信息常量类 - 系统状态常量信息类</b>
 * <p>
 *     包含以下常量信息：<br/>
 *     1、STATUS_ENABLE 表示当前用户是启用状态<br/>
 *     2、STATUS_DISABLE 表示当前用户处于禁用状态<br/>
 *     包含以下属性：<br/>
 *     1、code 系统状态编码<br/>
 *     2、remark 对编码的说明<br/>
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
public enum StatusEnum {
	STATUS_ENABLE(BaseEnumConstants.ENUM_STATUS_ENABLE, "该用户为启用状态"),
	STATUS_DISABLE(BaseEnumConstants.ENUM_STATUS_DISABLE, "该用户为禁用状态");
	private String code;                    // 系统用户状态编码
	private String remark;                  // 编码对应状态说明

	private StatusEnum(String code, String remark) {
		this.code = code;
		this.remark = remark;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
