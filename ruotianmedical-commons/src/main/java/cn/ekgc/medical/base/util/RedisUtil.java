package cn.ekgc.medical.base.util;

import com.fasterxml.jackson.databind.json.JsonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * <b>系统数据模块 - redis 工具类</b>
 * <P>
 *     提供了两个方法
 *     1、将数据存储到 redis 中
 *     2、通过 key 从 reids 中取出对应信息
 * </P>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@Component("redisUtil")
public class RedisUtil {
	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	/**
	 * <b>将数据存储到 redis 中</b>
	 * @param key
	 * @param value
	 * @param expireTimeSeconds
	 * @return
	 */
	public boolean saveToRedis(String key, Object value, Long expireTimeSeconds) {
		try {
			// 将用户所给定的 Object 类型的 value 变为 String 类型的 JSON
			JsonMapper jsonMapper = new JsonMapper();
			String valueJSON = jsonMapper.writeValueAsString(value);
			// 将该 JSON 存储到 Redis 中
			stringRedisTemplate.opsForValue().set(key, valueJSON);
			// 设置过期时间
			stringRedisTemplate.expire(key, expireTimeSeconds, TimeUnit.SECONDS);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * <b>通过 key 和存储的数据类型 从 redis 中取出数据</b>
	 * @param key
	 * @return
	 */
	public Object getFromRedis(String key, Class type) {
		try {
			// 通过 key 从 Redis 中获得对应 JSON
			String valueJSON = stringRedisTemplate.opsForValue().get(key);
			// 判断此时能够获取到对应的 JSON
			if (valueJSON != null && !"".equals(valueJSON)) {
				// 此时存在对应的信息，那么变为对象
				JsonMapper jsonMapper = new JsonMapper();
				Object obj = jsonMapper.readValue(valueJSON, type);
				return obj;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
