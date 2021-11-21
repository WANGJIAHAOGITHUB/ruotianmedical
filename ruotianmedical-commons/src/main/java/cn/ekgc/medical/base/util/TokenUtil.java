package cn.ekgc.medical.base.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TokenUtil {
	// 设置 token 加密算法
	private static final Algorithm ALGORITHM  = Algorithm.HMAC256(BaseConstants.SECRET_KRY);

	/**
	 * <b>生成 Token 信息</b>
	 * @param claimMap
	 * @param expireTimeSeconds
	 * @return
	 */
	public static String createToken(Map<String, Object> claimMap, Long expireTimeSeconds ) {
		// 创建生成的 token 对象
		JWTCreator.Builder builder = JWT.create();
		// 1. token 头部信息，包含算法和相关信息
		Map<String, Object> header = new HashMap<>();
		// 设置信息为 JWT 所生成的 Token
		header.put("typ", "jwt");
		// 设置加密锁使用的算法为 HS256
		header.put("alg", "HS256");
		// 将头部信息设定到 Token 中
		builder.withHeader(header);
		// 2、有效载荷，可以将相关信息保存到 Token，在校验解密时，可以获得该信息
		// 将用户的主键增加到有效载荷中
		// 循环用户所给定的 Map 集合，将其中的数据进行设定
		// 获得所有的 key，变成 Set 集合
		builder.withClaim("message", claimMap);
		// 设置 Token 的过期时间
		if (expireTimeSeconds == null || expireTimeSeconds < 0) {
			// 若用户设置的无效，则采用系统默认过期时间
			expireTimeSeconds = BaseConstants.EXPIRE_SECOND;
		}
		// 根据当前时间获得过期时间的毫秒数
		Long expireTimeMillis = System.currentTimeMillis() + expireTimeSeconds * 1000;
		// 根据过期的毫秒数，获得对应的 java.util.Date 对象
		Date expireDate = new Date(expireTimeMillis);
		builder.withExpiresAt(expireDate);
		// 3、进行 Token 签名，获得最后的 Token 信息
		String token = builder.sign(ALGORITHM);
		return token;
	}

	/**
	 * <b>校验 Token 信息，获得该 Token 中的有效载荷数据</b>
	 * @param token
	 * @return
	 */
	public static Map<String, Object> verifyToken(String token) {
		// token 校验
		if (token != null && !"".equals(token.trim())) {
			// 获取 token 校验对象
			JWTVerifier jwtVerifier = JWT.require(ALGORITHM).build();
			// 校验 token
			DecodedJWT decodedJWT = jwtVerifier.verify(token);
			// 如果能够获得 decodedJWT 则说明能够通过密钥对该 token 进行解密
			// 提取绑定在 token 中的有效信息
			Map<String, Object> massageMap = decodedJWT.getClaim("message").asMap();
			return massageMap;
		}
		return null;
	}
}
