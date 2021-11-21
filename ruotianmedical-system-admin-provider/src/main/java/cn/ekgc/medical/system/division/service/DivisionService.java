package cn.ekgc.medical.system.division.service;

import cn.ekgc.medical.base.pojo.vo.PageVO;
import cn.ekgc.medical.system.division.pojo.vo.DivisionVO;

/**
 * <b>若天医疗系统信息 - 行政区划数据业务层接口</b>
 * <p>
 *     行政区划数据业务层接口
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
public interface DivisionService {
	/**
	 * 根据分页信息查询列表
	 * @param pageVO
	 * @param vo
	 * @return
	 */
	PageVO<DivisionVO> queryByPage(PageVO<DivisionVO> pageVO, DivisionVO vo) throws Exception;

	/**
	 * 根据 id 查询对象信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	DivisionVO getById(String id) throws Exception;

	/**
	 * 根据 code 查询对象信息
	 * @param code
	 * @return
	 * @throws Exception
	 */
	DivisionVO getByCode(String code) throws Exception;

	/**
	 * 保存行政区划信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	boolean save(DivisionVO vo) throws Exception;

	/**
	 * 修改行政区划信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	boolean update(DivisionVO vo) throws Exception;
}
