package cn.ekgc.medical.system.dictionary.service;

import cn.ekgc.medical.base.pojo.vo.PageVO;
import cn.ekgc.medical.system.dictionary.pojo.vo.DictionaryVO;

/**
 * <b>若天医疗系统信息 - 数据字典信息业务层层接口</b>
 * <p>
 *     数据字典信息业务层层接口
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
public interface DictionaryService {
	/**
	 * 根据分页信息查询列表
	 * @param pageVO
	 * @param vo
	 * @return
	 */
	PageVO<DictionaryVO> queryByPage(PageVO<DictionaryVO> pageVO, DictionaryVO vo) throws Exception;

	/**
	 * 根据 id 查询对象信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	DictionaryVO getById(String id) throws Exception;

	/**
	 * 根据 code 查询对象信息
	 * @param code
	 * @return
	 * @throws Exception
	 */
	DictionaryVO getByCode(String code) throws Exception;

	/**
	 * 保存数据字典信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	boolean save(DictionaryVO vo) throws Exception;

	/**
	 * 修改数据字典信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	boolean update(DictionaryVO vo) throws Exception;
}
