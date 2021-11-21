package cn.ekgc.medical.clinic.perscription.service;


import cn.ekgc.medical.base.pojo.vo.PageVO;
import cn.ekgc.medical.clinic.perscription.pojo.vo.ClinicRxInsuranceVO;

/**
 * <b>若天医疗门诊模块 - 门诊医保信息业务层接口</b>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
public interface ClinicRxInsuranceService {
	/**
	 * 根据分页信息查询列表
	 * @param pageVO
	 * @param vo
	 * @return
	 */
	PageVO<ClinicRxInsuranceVO> queryByPage(PageVO<ClinicRxInsuranceVO> pageVO, ClinicRxInsuranceVO vo) throws Exception;

	/**
	 * 根据 id 查询对象信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	ClinicRxInsuranceVO getById(String id) throws Exception;

	/**
	 * 保存信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	boolean save(ClinicRxInsuranceVO vo) throws Exception;

	/**
	 * 修改信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	boolean update(ClinicRxInsuranceVO vo) throws Exception;
}
