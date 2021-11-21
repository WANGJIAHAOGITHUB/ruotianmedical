package cn.ekgc.medical.emr.summary.transport.impl;

import cn.ekgc.medical.base.pojo.vo.PageVO;
import cn.ekgc.medical.base.pojo.vo.QueryPageVO;
import cn.ekgc.medical.emr.summary.pojo.vo.SummaryInsuranceVO;
import cn.ekgc.medical.emr.summary.service.SummaryInsuranceService;
import cn.ekgc.medical.emr.summary.transport.SummaryInsuranceTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <b>若天医疗电子病历模块 - 病例概要医保信息传输层接口实现类</b>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@RestController("summaryInsuranceTransport")
@RequestMapping("/emr/summary/insurance/trans")
public class SummaryInsuranceTransportImpl implements SummaryInsuranceTransport {
	@Autowired
	private SummaryInsuranceService summaryInsuranceService;
	/**
	 * 根据分页信息查询列表
	 * @param queryPageVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/page")
	public PageVO<SummaryInsuranceVO> queryByPage(@RequestBody QueryPageVO<SummaryInsuranceVO> queryPageVO) throws Exception {
		PageVO<SummaryInsuranceVO> pageVO = queryPageVO.getPageVO();
		SummaryInsuranceVO vo = queryPageVO.getQuery();
		return summaryInsuranceService.queryByPage(pageVO, vo);
	}

	/**
	 * 根据 id 查询对象信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/id")
	public SummaryInsuranceVO getById(@RequestParam String id) throws Exception {
		return summaryInsuranceService.getById(id);
	}

	/**
	 * 保存信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/save")
	public boolean save(@RequestBody SummaryInsuranceVO vo) throws Exception {
		return summaryInsuranceService.save(vo);
	}

	/**
	 * 修改信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/update")
	public boolean update(@RequestBody SummaryInsuranceVO vo) throws Exception {
		return summaryInsuranceService.update(vo);
	}
}
