package cn.ekgc.medical.system.hospital.dao;

import cn.ekgc.medical.system.hospital.pojo.entity.Hospital;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
* <b>若天医疗系统信息 - 医院信息数据持久层接口</b>
* @author WangJiahao
* @version 1.0.0
*/
@Repository
public interface HospitalDao {
	/**
	* <b>根据查询对象查询列表</b>
	* @param query
	* @return
	* @throws Exception
	*/
	List<Hospital> findListByQuery(Hospital query) throws Exception;

	/**
	* <b>保存对象信息</b>
	* @param entity
	* @return
	* @throws Exception
	*/
	int save(Hospital entity) throws Exception;

	/**
	* <b>修改对象信息</b>
	* @param entity
	* @return
	* @throws Exception
	*/
	int update(Hospital entity) throws Exception;
}