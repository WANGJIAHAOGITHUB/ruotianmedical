package cn.ekgc.medical.system.menu.dao;

import cn.ekgc.medical.system.menu.pojo.entity.Menu;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <b>若天医疗系统信息 - 菜单信息数据持久层接口</b>
 * <p>
 *     菜单信息数据持久层
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@Repository
public interface MenuDao {
	/**
	 * 根据查询对象查询对象信息列表
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	List<Menu> findListByQuery(Menu entity) throws Exception;

	/**
	 * 保存实体信息
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	int insert(Menu entity) throws Exception;

	/**
	 * 修改实体信息
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	int modify(Menu entity) throws Exception;
}
