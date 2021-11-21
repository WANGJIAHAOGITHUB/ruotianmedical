package cn.ekgc.medical.base.pojo.enums;

/**
 * <b>系统响应信息 - 响应编码枚举类</b>
 * <P>
 *     包含属性：<br/>
 *     1、code 响应编码
 *     2、data 响应数据
 * </P>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
public enum ResponseCodeEnum {
	RESPONSE_CODE_SUCCESS(BaseEnumConstants.ENUM_RESPONSE_CODE_SUCCESS, "系统响应成功"),
	RESPONSE_CODE_UNAUTHORIZED(BaseEnumConstants.ENUM_RESPONSE_CODE_UNAUTHORIZED, "用户未认证"),
	RESPONSE_CODE_ERROR(BaseEnumConstants.ENUM_RESPONSE_CODE_ERROR, "系统业务处理错误"),
	RESPONSE_CODE_EXCEPTION(BaseEnumConstants.ENUM_RESPONSE_CODE_EXCEPTION, "系统响应异常");
	private Integer code;                // 响应编码
	private String remark;               // 响应编码说明

	ResponseCodeEnum(Integer code, String remark) {
		this.code = code;
		this.remark = remark;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
