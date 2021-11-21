package cn.ekgc.medical.patient.liaison.dao;

import cn.ekgc.medical.patient.liaison.pojo.entity.Liaison;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <b>若天医疗患者信息 - 联系人信息数据持久层接口</b>
 * @author WangJiahao
 * @version 1.0.0
 */
@Repository
public interface LiaisonDao {
	/**
	* <b>根据查询对象查询列表</b>
	* @param query
	* @return
	* @throws Exception
	*/
	List<Liaison> findListByQuery(Liaison query) throws Exception;

	/**
	* <b>保存对象信息</b>
	* @param entity
	* @return
	* @throws Exception
	*/
	int save(Liaison entity) throws Exception;

	/**
	* <b>修改对象信息</b>
	* @param entity
	* @return
	* @throws Exception
	*/
	int update(Liaison entity) throws Exception;
}