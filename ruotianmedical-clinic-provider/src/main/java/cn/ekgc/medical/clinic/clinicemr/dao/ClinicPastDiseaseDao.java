package cn.ekgc.medical.clinic.clinicemr.dao;

import cn.ekgc.medical.clinic.clinicemr.pojo.entity.ClinicPastDisease;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <b>若天医疗门诊 - 门（急）诊病历数据信息数据持久层接口</b>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@Repository
public interface ClinicPastDiseaseDao {
	/**
	* <b>根据查询对象查询列表</b>
	* @param query
	* @return
	* @throws Exception
	*/
	List<ClinicPastDisease> findListByQuery(ClinicPastDisease query) throws Exception;

	/**
	* <b>保存对象信息</b>
	* @param entity
	* @return
	* @throws Exception
	*/
	int save(ClinicPastDisease entity) throws Exception;

	/**
	* <b>修改对象信息</b>
	* @param entity
	* @return
	* @throws Exception
	*/
	int update(ClinicPastDisease entity) throws Exception;
}