package cn.ekgc.medical.clinic.perscription.transport.impl;

import cn.ekgc.medical.base.pojo.vo.PageVO;
import cn.ekgc.medical.base.pojo.vo.QueryPageVO;
import cn.ekgc.medical.clinic.perscription.pojo.vo.ClinicRxInsuranceVO;
import cn.ekgc.medical.clinic.perscription.service.ClinicRxInsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <b>若天医疗门诊模块 - 门诊病历医保信息传输层接口实现类</b>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@RestController("clinicRxInsuranceTransport")
@RequestMapping("/clinic/perscription/clinicRxInsurance/trans")
public class ClinicRxInsuranceTransportImpl {
	@Autowired
	private ClinicRxInsuranceService clinicRxInsuranceService;
	/**
	 * 根据分页信息查询列表
	 * @param queryPageVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/page")
	public PageVO<ClinicRxInsuranceVO> queryByPage(@RequestBody QueryPageVO<ClinicRxInsuranceVO> queryPageVO) throws Exception {
		PageVO<ClinicRxInsuranceVO> pageVO = queryPageVO.getPageVO();
		ClinicRxInsuranceVO vo = queryPageVO.getQuery();
		return clinicRxInsuranceService.queryByPage(pageVO, vo);
	}

	/**
	 * 根据 id 查询对象信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/id")
	public ClinicRxInsuranceVO getById(@RequestParam String id) throws Exception {
		return clinicRxInsuranceService.getById(id);
	}

	/**
	 * 保存信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/save")
	public boolean save(@RequestBody ClinicRxInsuranceVO vo) throws Exception {
		return clinicRxInsuranceService.save(vo);
	}

	/**
	 * 修改信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/update")
	public boolean update(@RequestBody ClinicRxInsuranceVO vo) throws Exception {
		return clinicRxInsuranceService.update(vo);
	}
}
