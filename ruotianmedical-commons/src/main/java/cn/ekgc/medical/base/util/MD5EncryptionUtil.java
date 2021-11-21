package cn.ekgc.medical.base.util;

import java.security.MessageDigest;

/**
 * <b>系统基础工具类 - MD5 加密工具类</b>
 * <p>
 *     将密码进行 MD5 加密
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
public class MD5EncryptionUtil {
	private static final String KEY_MD5 = "MD5";

	/**
	 * <b>将给定的字符串进行 MD5 加密</b>
	 * @param message
	 * @return
	 */
	public static String encrypt(String message) {
		StringBuffer sb = new StringBuffer();
		try {
			MessageDigest md = MessageDigest.getInstance(KEY_MD5);
			byte[] inputData = message.getBytes("UTF-8");
			byte[] encryptionData = md.digest(inputData);
			for (int i = 0; i < encryptionData.length; i++) {
				int value = ((int) encryptionData[i]) & 0xff;
				if (value < 16) {
					sb.append("0");
				}
				sb.append(Integer.toHexString(value));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(encrypt("admin123"));
	}
}
