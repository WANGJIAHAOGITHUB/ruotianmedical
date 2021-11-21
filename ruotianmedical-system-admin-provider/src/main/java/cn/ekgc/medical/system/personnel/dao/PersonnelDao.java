package cn.ekgc.medical.system.personnel.dao;

import cn.ekgc.medical.system.personnel.pojo.entity.Personnel;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <b>若天医疗系统信息 - 系统人员信息数据持久层接口</b>
 * <p>
 *     系统人员信息数据持久层
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@Repository
public interface PersonnelDao {
	/**
	 * 根据查询对象查询对象信息列表
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	List<Personnel> findListByQuery(Personnel entity) throws Exception;

	/**
	 * 保存实体信息
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	int insert(Personnel entity) throws Exception;

	/**
	 * 修改实体信息
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	int modify(Personnel entity) throws Exception;
}
