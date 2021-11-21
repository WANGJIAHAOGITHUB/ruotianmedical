package cn.ekgc.medical.base.pojo.enums;

import java.io.IOException;
import java.util.Properties;

/**
 * <b>系统枚举信息常量类 - 系统枚举常量信息</b>
 * <p>
 *     包含以下枚举常量信息：<br/>
 *     1、ENUM_STATUS_ENABLE 系统状态启用编码<br/>
 *     2、ENUM_STATUS_DISABLE 系统状态禁用编码<br/>
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
class BaseEnumConstants {
	private static Properties properties = new Properties();
	static {
		try {
			properties.load(BaseEnumConstants.class.getClassLoader().getResourceAsStream("properties/base/enums.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 系统状态：启用
	 */
	static final String ENUM_STATUS_ENABLE = properties.getProperty("enum.status.enable");

	/**
	 * 系统状态：禁用
	 */
	static final String ENUM_STATUS_DISABLE = properties.getProperty("enum.status.disable");

	/**
	 * 系统响应：成功
	 */
	static final Integer ENUM_RESPONSE_CODE_SUCCESS = Integer.parseInt(properties.getProperty("enum.response.code.success"));

	/**
	 * 系统响应：用户未认证
	 */
	static final Integer ENUM_RESPONSE_CODE_UNAUTHORIZED = Integer.parseInt(properties.getProperty("enum.response.code.unauthorized"));

	/**
	 * 系统响应：业务处理错误
	 */
	static final Integer ENUM_RESPONSE_CODE_ERROR = Integer.parseInt(properties.getProperty("enum.response.code.error"));

	/**
	 * 系统响应：响应异常
	 */
	static final Integer ENUM_RESPONSE_CODE_EXCEPTION = Integer.parseInt(properties.getProperty("enum.response.code.exception"));
}
