package cn.ekgc.medical.clinic.perscription.service;


import cn.ekgc.medical.base.pojo.vo.PageVO;
import cn.ekgc.medical.clinic.perscription.pojo.vo.ClinicRxVO;

/**
 * <b>若天医疗门诊模块 - 门诊西医处方信息业务层接口</b>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
public interface ClinicRxService {
	/**
	 * 根据分页信息查询列表
	 * @param pageVO
	 * @param vo
	 * @return
	 */
	PageVO<ClinicRxVO> queryByPage(PageVO<ClinicRxVO> pageVO, ClinicRxVO vo) throws Exception;

	/**
	 * 根据 id 查询对象信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	ClinicRxVO getById(String id) throws Exception;

	/**
	 * 保存信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	boolean save(ClinicRxVO vo) throws Exception;

	/**
	 * 修改信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	boolean update(ClinicRxVO vo) throws Exception;
}
