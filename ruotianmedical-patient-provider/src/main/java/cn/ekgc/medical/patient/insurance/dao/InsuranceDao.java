package cn.ekgc.medical.patient.insurance.dao;

import cn.ekgc.medical.patient.insurance.pojo.entity.Insurance;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <b>若天医疗患者信息 - 医保信息数据持久层接口</b>
 * @author WangJiahao
 * @version 1.0.0
 */
@Repository
public interface InsuranceDao {
	/**
	* <b>根据查询对象查询列表</b>
	* @param query
	* @return
	* @throws Exception
	*/
	List<Insurance> findListByQuery(Insurance query) throws Exception;

	/**
	* <b>保存对象信息</b>
	* @param entity
	* @return
	* @throws Exception
	*/
	int save(Insurance entity) throws Exception;

	/**
	* <b>修改对象信息</b>
	* @param entity
	* @return
	* @throws Exception
	*/
	int update(Insurance entity) throws Exception;
}