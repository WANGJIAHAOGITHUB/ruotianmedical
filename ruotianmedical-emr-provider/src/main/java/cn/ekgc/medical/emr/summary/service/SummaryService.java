package cn.ekgc.medical.emr.summary.service;


import cn.ekgc.medical.base.pojo.vo.PageVO;
import cn.ekgc.medical.emr.summary.pojo.vo.SummaryVO;

/**
 * <b>若天医疗电子病历模块 - 病例概要信息业务层接口</b>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
public interface SummaryService {
	/**
	 * 根据分页信息查询列表
	 * @param pageVO
	 * @param vo
	 * @return
	 */
	PageVO<SummaryVO> queryByPage(PageVO<SummaryVO> pageVO, SummaryVO vo) throws Exception;

	/**
	 * 根据 id 查询对象信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	SummaryVO getById(String id) throws Exception;

	/**
	 * 保存信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	boolean save(SummaryVO vo) throws Exception;

	/**
	 * 修改信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	boolean update(SummaryVO vo) throws Exception;
}
