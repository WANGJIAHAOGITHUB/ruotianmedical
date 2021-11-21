package cn.ekgc.medical.emr.summary.transport.impl;

import cn.ekgc.medical.base.pojo.vo.PageVO;
import cn.ekgc.medical.base.pojo.vo.QueryPageVO;
import cn.ekgc.medical.emr.summary.pojo.vo.SummaryPastDiseaseVO;
import cn.ekgc.medical.emr.summary.service.SummaryPastDiseaseService;
import cn.ekgc.medical.emr.summary.transport.SummaryPastDiseaseTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <b>若天医疗电子病历模块 - 病例概要疾病史信息传输层接口实现类</b>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@RestController("summaryPastDiseaseTransport")
@RequestMapping("/emr/summary/pastDisease/trans")
public class SummaryPastDiseaseTransportImpl implements SummaryPastDiseaseTransport {
	@Autowired
	private SummaryPastDiseaseService summaryPastDiseaseService;
	/**
	 * 根据分页信息查询列表
	 * @param queryPageVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/page")
	public PageVO<SummaryPastDiseaseVO> queryByPage(@RequestBody QueryPageVO<SummaryPastDiseaseVO> queryPageVO) throws Exception {
		PageVO<SummaryPastDiseaseVO> pageVO = queryPageVO.getPageVO();
		SummaryPastDiseaseVO vo = queryPageVO.getQuery();
		return summaryPastDiseaseService.queryByPage(pageVO, vo);
	}

	/**
	 * 根据 id 查询对象信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/id")
	public SummaryPastDiseaseVO getById(@RequestParam String id) throws Exception {
		return summaryPastDiseaseService.getById(id);
	}

	/**
	 * 保存信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/save")
	public boolean save(@RequestBody SummaryPastDiseaseVO vo) throws Exception {
		return summaryPastDiseaseService.save(vo);
	}

	/**
	 * 修改信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/update")
	public boolean update(@RequestBody SummaryPastDiseaseVO vo) throws Exception {
		return summaryPastDiseaseService.update(vo);
	}
}
