package cn.ekgc.medical.base.util;


import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * <b>若天医疗系统工具 - Map 工具类</b>
 * <p>
 *     Map 工具类
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
public class MapUtil {

	/**
	 * 将对象信息生成一个 Map 集合
	 * @param obj
	 * @return
	 */
	public static Map<String, Object> saveToMap(Object obj) throws Exception {
		Map<String, Object> claimMap = new HashMap<>();
		// 获取当前对象的类信息
		Class objClass = obj.getClass();
		// 获取类的所有属性
		Field[] fields = objClass.getDeclaredFields();
		for (Field field : fields) {
			if (field.getName().equals("serialVersionUID")) {
				continue;
			}
			String fieldName = field.getName();
			if (field.isAccessible()) {
				claimMap.put(fieldName, field.get(obj));
			} else {
				String getterMethodName = "get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1, fieldName.length());
				Method getterMethod = objClass.getDeclaredMethod(getterMethodName);
				Object fieldValue = getterMethod.invoke(obj);
				claimMap.put(fieldName, fieldValue);
			}
		}
		return claimMap;
	}
}
