package cn.ekgc.medical.emr.summary.transport.impl;

import cn.ekgc.medical.base.pojo.vo.PageVO;
import cn.ekgc.medical.base.pojo.vo.QueryPageVO;
import cn.ekgc.medical.emr.summary.pojo.vo.SummaryMedicineVO;
import cn.ekgc.medical.emr.summary.service.SummaryMedicineService;
import cn.ekgc.medical.emr.summary.transport.SummaryMedicineTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <b>若天医疗电子病历模块 - 病例概要用药信息传输层接口实现类</b>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@RestController("summaryMedicineTransport")
@RequestMapping("/emr/summary/medicine/trans")
public class SummaryMedicineTransportImpl implements SummaryMedicineTransport {
	@Autowired
	private SummaryMedicineService summaryMedicineService;
	/**
	 * 根据分页信息查询列表
	 * @param queryPageVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/page")
	public PageVO<SummaryMedicineVO> queryByPage(@RequestBody QueryPageVO<SummaryMedicineVO> queryPageVO) throws Exception {
		PageVO<SummaryMedicineVO> pageVO = queryPageVO.getPageVO();
		SummaryMedicineVO vo = queryPageVO.getQuery();
		return summaryMedicineService.queryByPage(pageVO, vo);
	}

	/**
	 * 根据 id 查询对象信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/id")
	public SummaryMedicineVO getById(@RequestParam String id) throws Exception {
		return summaryMedicineService.getById(id);
	}

	/**
	 * 保存信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/save")
	public boolean save(@RequestBody SummaryMedicineVO vo) throws Exception {
		return summaryMedicineService.save(vo);
	}

	/**
	 * 修改信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/update")
	public boolean update(@RequestBody SummaryMedicineVO vo) throws Exception {
		return summaryMedicineService.update(vo);
	}
}
