package cn.ekgc.medical.system.personnel.service;

import cn.ekgc.medical.base.pojo.vo.PageVO;
import cn.ekgc.medical.system.personnel.pojo.vo.RoleVO;

/**
 * <b>若天医疗系统信息 - 角色信息数据业务层接口</b>
 * <p>
 *     角色信息数据业务层接口
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
public interface RoleService {
	/**
	 * 根据分页信息查询列表
	 * @param pageVO
	 * @param vo
	 * @return
	 */
	PageVO<RoleVO> queryByPage(PageVO<RoleVO> pageVO, RoleVO vo) throws Exception;

	/**
	 * 根据 id 查询对象信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	RoleVO getById(String id) throws Exception;

	/**
	 * 根据 code 查询对象信息
	 * @param code
	 * @return
	 * @throws Exception
	 */
	RoleVO getByCode(String code) throws Exception;

	/**
	 * 保存角色信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	boolean save(RoleVO vo) throws Exception;

	/**
	 * 修改角色信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	boolean update(RoleVO vo) throws Exception;
}
