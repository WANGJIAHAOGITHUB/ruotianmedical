package cn.ekgc.medical.emr.summary.service;

import cn.ekgc.medical.base.pojo.vo.PageVO;
import cn.ekgc.medical.emr.summary.pojo.vo.SummaryPastDiseaseVO;

/**
 * <b>若天医疗电子病历模块 - 病例概要疾病史信息业务层接口</b>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
public interface SummaryPastDiseaseService {
	/**
	 * 根据分页信息查询列表
	 * @param pageVO
	 * @param vo
	 * @return
	 */
	PageVO<SummaryPastDiseaseVO> queryByPage(PageVO<SummaryPastDiseaseVO> pageVO, SummaryPastDiseaseVO vo) throws Exception;

	/**
	 * 根据 id 查询对象信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	SummaryPastDiseaseVO getById(String id) throws Exception;

	/**
	 * 保存信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	boolean save(SummaryPastDiseaseVO vo) throws Exception;

	/**
	 * 修改信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	boolean update(SummaryPastDiseaseVO vo) throws Exception;
}
