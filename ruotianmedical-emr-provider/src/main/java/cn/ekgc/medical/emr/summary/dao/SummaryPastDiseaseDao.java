package cn.ekgc.medical.emr.summary.dao;

import cn.ekgc.medical.emr.summary.pojo.entity.SummaryPastDisease;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <b>若天医疗电子病历模块 - 病例概要疾病史信息数据持久层层接口</b>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@Repository
public interface SummaryPastDiseaseDao {
	/**
	* <b>根据查询对象查询列表</b>
	* @param query
	* @return
	* @throws Exception
	*/
	List<SummaryPastDisease> findListByQuery(SummaryPastDisease query) throws Exception;

	/**
	* <b>保存对象信息</b>
	* @param entity
	* @return
	* @throws Exception
	*/
	int save(SummaryPastDisease entity) throws Exception;

	/**
	* <b>修改对象信息</b>
	* @param entity
	* @return
	* @throws Exception
	*/
	int update(SummaryPastDisease entity) throws Exception;
}