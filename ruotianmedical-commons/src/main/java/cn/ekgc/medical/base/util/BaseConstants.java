package cn.ekgc.medical.base.util;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.io.IOException;
import java.util.Properties;

/**
 * <b>系统基础信息常量类 - 系统基础常量信息</b>
 * <p>
 *     包含以下基础常量信息：<br/>
 *     1、PAGE_NUM 默认当前页码信息<br/>
 *     2、PAGE_SIZE 默认当前页码显示记录条数<br/>
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
public class BaseConstants {
	private static Properties properties = new Properties();
	static {
		try {
			properties.load(BaseConstants.class.getClassLoader().getResourceAsStream("properties/base/base.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 分页列表默认页码
	 */
	public static final Integer PAGE_NUM = Integer.parseInt(properties.getProperty("base.page.num"));

	/**
	 * 分页列表默认每页显示记录条数
	 */
	public static final Integer PAGE_SIZE = Integer.parseInt(properties.getProperty("base.page.size"));

	/**
	 * token 密钥信息
	 */
	public static final String SECRET_KRY = properties.getProperty("base.secret.key");

	/**
	 * token 过期时长
	 */
	public static final Long EXPIRE_SECOND = Long.parseLong(properties.getProperty("base.expire.second"));
}
