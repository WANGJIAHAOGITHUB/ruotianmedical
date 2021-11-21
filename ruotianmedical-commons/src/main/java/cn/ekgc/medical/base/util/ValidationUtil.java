package cn.ekgc.medical.base.util;

import cn.hutool.core.util.StrUtil;


/**
 * <b>若天医疗系统工具 - 验证用户信息格式</b>
 * <p>
 *     验证用户信息格式
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
public class ValidationUtil {
	// 手机号正则表达式
	public static final String CELLPHONE_REGEX = "1\\d{10}";
	// 密码正则表达式
	public static final String PWD_REGEX = "\\w{6,}";
	// 身份证号正则表达式
	public static final String IDCARD_REGEX = "([1-9])(\\d{16})(\\d|X|x)";

	/**
	 * 判断手机号格式是否正确
	 * @param cellphone
	 * @return
	 */
	public static boolean isCellphone(String cellphone) {
		if (StrUtil.isNotBlank(cellphone) && cellphone.matches(CELLPHONE_REGEX)) {
			return true;
		}
		return false;
	}

	/**
	 * 判断密码格式是否正确
	 * @param password
	 * @return
	 */
	public static boolean isPassword(String password) {
		if (StrUtil.isNotBlank(password) && password.matches(PWD_REGEX)) {
			return true;
		}
		return false;
	}

	/**
	 * 判断身份证号码格式是否正确
	 * @param idCard
	 * @return
	 */
	public static boolean isIdCard(String idCard) {
		if (StrUtil.isNotBlank(idCard) && idCard.matches(IDCARD_REGEX)) {
			// 设置前 17 位的权值
			Integer[] powers = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
			// 将身份证号前 17 位与权值相乘后相加
			int result = 0;
			for (int i = 0; i < powers.length; i++) {
				result = result + Integer.parseInt(Character.toString(idCard.charAt(i))) * powers[i];
			}
			result = result % 11;
			// 结果对比取值
			String[] resultStr = {"1", "0", "X", "9", "8", "7", "6", "5", "4", "3", "2"};
			if (Character.toString(idCard.charAt(idCard.length() - 1)).equals(resultStr[result])) {
				return true;
			}
		}
		return false;
	}
}
