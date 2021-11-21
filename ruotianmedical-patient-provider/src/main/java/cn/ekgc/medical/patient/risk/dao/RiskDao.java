package cn.ekgc.medical.patient.risk.dao;

import cn.ekgc.medical.patient.risk.pojo.entity.Risk;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <b>若天医疗患者信息 - 个体危险信息信息数据持久层接口</b>
 * @author WangJiahao
 * @version 1.0.0
 */
@Repository
public interface RiskDao {
	/**
	* <b>根据查询对象查询列表</b>
	* @param query
	* @return
	* @throws Exception
	*/
	List<Risk> findListByQuery(Risk query) throws Exception;

	/**
	* <b>保存对象信息</b>
	* @param entity
	* @return
	* @throws Exception
	*/
	int save(Risk entity) throws Exception;

	/**
	* <b>修改对象信息</b>
	* @param entity
	* @return
	* @throws Exception
	*/
	int update(Risk entity) throws Exception;
}