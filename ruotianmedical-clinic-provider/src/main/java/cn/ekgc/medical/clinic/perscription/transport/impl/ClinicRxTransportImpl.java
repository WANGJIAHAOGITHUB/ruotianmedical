package cn.ekgc.medical.clinic.perscription.transport.impl;

import cn.ekgc.medical.base.pojo.vo.PageVO;
import cn.ekgc.medical.base.pojo.vo.QueryPageVO;
import cn.ekgc.medical.clinic.perscription.pojo.vo.ClinicRxVO;
import cn.ekgc.medical.clinic.perscription.service.ClinicRxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <b>若天医疗门诊模块 - 门诊病历医保信息传输层接口实现类</b>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@RestController("clinicRxTransport")
@RequestMapping("/clinic/perscription/clinicRx/trans")
public class ClinicRxTransportImpl {
	@Autowired
	private ClinicRxService clinicRxService;
	/**
	 * 根据分页信息查询列表
	 * @param queryPageVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/page")
	public PageVO<ClinicRxVO> queryByPage(@RequestBody QueryPageVO<ClinicRxVO> queryPageVO) throws Exception {
		PageVO<ClinicRxVO> pageVO = queryPageVO.getPageVO();
		ClinicRxVO vo = queryPageVO.getQuery();
		return clinicRxService.queryByPage(pageVO, vo);
	}

	/**
	 * 根据 id 查询对象信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/id")
	public ClinicRxVO getById(@RequestParam String id) throws Exception {
		return clinicRxService.getById(id);
	}

	/**
	 * 保存信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/save")
	public boolean save(@RequestBody ClinicRxVO vo) throws Exception {
		return clinicRxService.save(vo);
	}

	/**
	 * 修改信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/update")
	public boolean update(@RequestBody ClinicRxVO vo) throws Exception {
		return clinicRxService.update(vo);
	}
}
