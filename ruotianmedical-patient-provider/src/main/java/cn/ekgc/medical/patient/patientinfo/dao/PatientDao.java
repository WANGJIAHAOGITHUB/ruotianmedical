package cn.ekgc.medical.patient.patientinfo.dao;

import cn.ekgc.medical.patient.patientInfo.pojo.entity.Patient;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <b>若天医疗患者信息 - 患者个人信息数据持久层接口</b>
 * @author WangJiahao
 * @version 1.0.0
 */
@Repository
public interface PatientDao {
	/**
	* <b>根据查询对象查询列表</b>
	* @param query
	* @return
	* @throws Exception
	*/
	List<Patient> findListByQuery(Patient query) throws Exception;

	/**
	* <b>保存对象信息</b>
	* @param entity
	* @return
	* @throws Exception
	*/
	int save(Patient entity) throws Exception;

	/**
	* <b>修改对象信息</b>
	* @param entity
	* @return
	* @throws Exception
	*/
	int update(Patient entity) throws Exception;
}