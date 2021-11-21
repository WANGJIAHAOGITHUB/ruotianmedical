package cn.ekgc.medical.patient.allergy.dao;

import cn.ekgc.medical.patient.allergy.pojo.entity.Allergy;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <b>若天医疗患者信息 - 过敏史信息数据持久层接口</b>
 * @author WangJiahao
 * @version 1.0.0
 */
@Repository
public interface AllergyDao {
	/**
	* <b>根据查询对象查询列表</b>
	* @param query
	* @return
	* @throws Exception
	*/
	List<Allergy> findListByQuery(Allergy query) throws Exception;

	/**
	* <b>保存对象信息</b>
	* @param entity
	* @return
	* @throws Exception
	*/
	int save(Allergy entity) throws Exception;

	/**
	* <b>修改对象信息</b>
	* @param entity
	* @return
	* @throws Exception
	*/
	int update(Allergy entity) throws Exception;
}