package cn.ekgc.medical.system.division.dao;

import cn.ekgc.medical.system.division.pojo.entity.Division;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <b>若天医疗系统信息 - 行政区划信息数据持久层接口</b>
 * <p>
 *     行政区划信息数据持久层接口
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@Repository
public interface DivisionDao {
	/**
	 * 根据查询对象查询对象信息列表
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	List<Division> findListByQuery(Division entity) throws Exception;

	/**
	 * 保存实体信息
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	int insert(Division entity) throws Exception;

	/**
	 * 修改实体信息
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	int modify(Division entity) throws Exception;
}
