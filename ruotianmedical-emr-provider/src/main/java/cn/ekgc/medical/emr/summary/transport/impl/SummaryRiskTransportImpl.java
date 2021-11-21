package cn.ekgc.medical.emr.summary.transport.impl;

import cn.ekgc.medical.base.pojo.vo.PageVO;
import cn.ekgc.medical.base.pojo.vo.QueryPageVO;
import cn.ekgc.medical.emr.summary.pojo.vo.SummaryRiskVO;
import cn.ekgc.medical.emr.summary.service.SummaryRiskService;
import cn.ekgc.medical.emr.summary.transport.SummaryRiskTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <b>若天医疗电子病历模块 - 病例概要个体危险信息传输层接口实现类</b>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@RestController("summaryRiskTransport")
@RequestMapping("/emr/summary/risk/trans")
public class SummaryRiskTransportImpl implements SummaryRiskTransport {
	@Autowired
	private SummaryRiskService summaryRiskService;
	/**
	 * 根据分页信息查询列表
	 * @param queryPageVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/page")
	public PageVO<SummaryRiskVO> queryByPage(@RequestBody QueryPageVO<SummaryRiskVO> queryPageVO) throws Exception {
		PageVO<SummaryRiskVO> pageVO = queryPageVO.getPageVO();
		SummaryRiskVO vo = queryPageVO.getQuery();
		return summaryRiskService.queryByPage(pageVO, vo);
	}

	/**
	 * 根据 id 查询对象信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/id")
	public SummaryRiskVO getById(@RequestParam String id) throws Exception {
		return summaryRiskService.getById(id);
	}

	/**
	 * 保存信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/save")
	public boolean save(@RequestBody SummaryRiskVO vo) throws Exception {
		return summaryRiskService.save(vo);
	}

	/**
	 * 修改信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/update")
	public boolean update(@RequestBody SummaryRiskVO vo) throws Exception {
		return summaryRiskService.update(vo);
	}
}
