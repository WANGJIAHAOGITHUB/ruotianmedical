package cn.ekgc.medical.emr.summary.transport.impl;

import cn.ekgc.medical.base.pojo.vo.PageVO;
import cn.ekgc.medical.base.pojo.vo.QueryPageVO;
import cn.ekgc.medical.emr.summary.pojo.vo.SummaryCommVO;
import cn.ekgc.medical.emr.summary.service.SummaryCommService;
import cn.ekgc.medical.emr.summary.transport.SummaryCommTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <b>若天医疗电子病历模块 - 病例概要通信信息传输层接口实现类</b>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@RestController("summaryCommTransport")
@RequestMapping("/emr/summary/comm/trans")
public class SummaryCommTransportImpl implements SummaryCommTransport {
	@Autowired
	private SummaryCommService summaryCommService;
	/**
	 * 根据分页信息查询列表
	 * @param queryPageVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/page")
	public PageVO<SummaryCommVO> queryByPage(@RequestBody QueryPageVO<SummaryCommVO> queryPageVO) throws Exception {
		PageVO<SummaryCommVO> pageVO = queryPageVO.getPageVO();
		SummaryCommVO vo = queryPageVO.getQuery();
		return summaryCommService.queryByPage(pageVO, vo);
	}

	/**
	 * 根据 id 查询对象信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/id")
	public SummaryCommVO getById(@RequestParam String id) throws Exception {
		return summaryCommService.getById(id);
	}

	/**
	 * 保存信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/save")
	public boolean save(@RequestBody SummaryCommVO vo) throws Exception {
		return summaryCommService.save(vo);
	}

	/**
	 * 修改信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/update")
	public boolean update(@RequestBody SummaryCommVO vo) throws Exception {
		return summaryCommService.update(vo);
	}
}
