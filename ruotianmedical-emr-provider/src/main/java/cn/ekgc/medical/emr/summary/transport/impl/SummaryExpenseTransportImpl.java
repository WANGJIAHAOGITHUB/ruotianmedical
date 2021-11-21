package cn.ekgc.medical.emr.summary.transport.impl;

import cn.ekgc.medical.base.pojo.vo.PageVO;
import cn.ekgc.medical.base.pojo.vo.QueryPageVO;
import cn.ekgc.medical.emr.summary.pojo.vo.SummaryExpenseVO;
import cn.ekgc.medical.emr.summary.service.SummaryExpenseService;
import cn.ekgc.medical.emr.summary.transport.SummaryExpenseTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <b>若天医疗电子病历模块 - 病例概要收费信息传输层接口实现类</b>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@RestController("summaryExpenseTransport")
@RequestMapping("/emr/summary/expense/trans")
public class SummaryExpenseTransportImpl implements SummaryExpenseTransport {
	@Autowired
	private SummaryExpenseService summaryExpenseService;
	/**
	 * 根据分页信息查询列表
	 * @param queryPageVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/page")
	public PageVO<SummaryExpenseVO> queryByPage(@RequestBody QueryPageVO<SummaryExpenseVO> queryPageVO) throws Exception {
		PageVO<SummaryExpenseVO> pageVO = queryPageVO.getPageVO();
		SummaryExpenseVO vo = queryPageVO.getQuery();
		return summaryExpenseService.queryByPage(pageVO, vo);
	}

	/**
	 * 根据 id 查询对象信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/id")
	public SummaryExpenseVO getById(@RequestParam String id) throws Exception {
		return summaryExpenseService.getById(id);
	}

	/**
	 * 保存信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/save")
	public boolean save(@RequestBody SummaryExpenseVO vo) throws Exception {
		return summaryExpenseService.save(vo);
	}

	/**
	 * 修改信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/update")
	public boolean update(@RequestBody SummaryExpenseVO vo) throws Exception {
		return summaryExpenseService.update(vo);
	}
}
