package cn.ekgc.medical.system.dictionary.dao;

import cn.ekgc.medical.system.dictionary.pojo.entity.Dictionary;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <b>若天医疗系统信息 - 数据字典信息数据持久层接口</b>
 * <p>
 *     数据字典信息数据持久层
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@Repository
public interface DictionaryDao {
	/**
	 * 根据查询对象查询对象信息列表
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	List<Dictionary> findListByQuery(Dictionary entity) throws Exception;

	/**
	 * 保存实体信息
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	int insert(Dictionary entity) throws Exception;

	/**
	 * 修改实体信息
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	int modify(Dictionary entity) throws Exception;
}
