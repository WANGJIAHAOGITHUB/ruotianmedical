package cn.ekgc.medical.emr.summary.dao;

import cn.ekgc.medical.emr.summary.pojo.entity.SummaryPastTrauma;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <b>若天医疗电子病历模块 - 病例概要既往病史外伤史信息数据持久层层接口</b>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@Repository
public interface SummaryPastTraumaDao {
	/**
	* <b>根据查询对象查询列表</b>
	* @param query
	* @return
	* @throws Exception
	*/
	List<SummaryPastTrauma> findListByQuery(SummaryPastTrauma query) throws Exception;

	/**
	* <b>保存对象信息</b>
	* @param entity
	* @return
	* @throws Exception
	*/
	int save(SummaryPastTrauma entity) throws Exception;

	/**
	* <b>修改对象信息</b>
	* @param entity
	* @return
	* @throws Exception
	*/
	int update(SummaryPastTrauma entity) throws Exception;
}