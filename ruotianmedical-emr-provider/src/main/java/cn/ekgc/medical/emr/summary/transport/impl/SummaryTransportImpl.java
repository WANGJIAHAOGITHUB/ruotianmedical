package cn.ekgc.medical.emr.summary.transport.impl;

import cn.ekgc.medical.base.pojo.vo.PageVO;
import cn.ekgc.medical.base.pojo.vo.QueryPageVO;
import cn.ekgc.medical.emr.summary.pojo.vo.SummaryVO;
import cn.ekgc.medical.emr.summary.service.SummaryService;
import cn.ekgc.medical.emr.summary.transport.SummaryTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <b>若天医疗电子病历模块 - 病例概要信息传输层接口实现类</b>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@RestController("summaryTransport")
@RequestMapping("/emr/summary/trans")
public class SummaryTransportImpl implements SummaryTransport {
	@Autowired
	private SummaryService summaryService;
	/**
	 * 根据分页信息查询列表
	 * @param queryPageVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/page")
	public PageVO<SummaryVO> queryByPage(@RequestBody QueryPageVO<SummaryVO> queryPageVO) throws Exception {
		PageVO<SummaryVO> pageVO = queryPageVO.getPageVO();
		SummaryVO vo = queryPageVO.getQuery();
		return summaryService.queryByPage(pageVO, vo);
	}

	/**
	 * 根据 id 查询对象信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/id")
	public SummaryVO getById(@RequestParam String id) throws Exception {
		return summaryService.getById(id);
	}

	/**
	 * 保存信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/save")
	public boolean save(@RequestBody SummaryVO vo) throws Exception {
		return summaryService.save(vo);
	}

	/**
	 * 修改信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/update")
	public boolean update(@RequestBody SummaryVO vo) throws Exception {
		return summaryService.update(vo);
	}
}
