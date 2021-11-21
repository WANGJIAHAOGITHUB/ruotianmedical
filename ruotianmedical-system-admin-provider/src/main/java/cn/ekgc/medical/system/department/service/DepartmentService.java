package cn.ekgc.medical.system.department.service;

import cn.ekgc.medical.base.pojo.vo.PageVO;
import cn.ekgc.medical.system.department.pojo.vo.DepartmentVO;

/**
 * <b>若天医疗系统信息 - 部门信息数据业务层接口</b>
 * <p>
 *     部门信息数据业务层接口
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
public interface DepartmentService {
	/**
	 * 根据分页信息查询列表
	 * @param pageVO
	 * @param vo
	 * @return
	 */
	PageVO<DepartmentVO> queryByPage(PageVO<DepartmentVO> pageVO, DepartmentVO vo) throws Exception;

	/**
	 * 根据 id 查询对象信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	DepartmentVO getById(String id) throws Exception;

	/**
	 * 根据 code 查询对象信息
	 * @param code
	 * @return
	 * @throws Exception
	 */
	DepartmentVO getByCode(String code) throws Exception;

	/**
	 * 保存数据字典信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	boolean save(DepartmentVO vo) throws Exception;

	/**
	 * 修改数据字典信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	boolean update(DepartmentVO vo) throws Exception;
}
