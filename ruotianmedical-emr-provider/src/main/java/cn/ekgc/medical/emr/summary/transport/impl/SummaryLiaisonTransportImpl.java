package cn.ekgc.medical.emr.summary.transport.impl;

import cn.ekgc.medical.base.pojo.vo.PageVO;
import cn.ekgc.medical.base.pojo.vo.QueryPageVO;
import cn.ekgc.medical.emr.summary.pojo.vo.SummaryLiaisonVO;
import cn.ekgc.medical.emr.summary.service.SummaryLiaisonService;
import cn.ekgc.medical.emr.summary.transport.SummaryLiaisonTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <b>若天医疗电子病历模块 - 病例概要联系人信息传输层接口实现类</b>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@RestController("summaryLiaisonTransport")
@RequestMapping("/emr/summary/liaison/trans")
public class SummaryLiaisonTransportImpl implements SummaryLiaisonTransport {
	@Autowired
	private SummaryLiaisonService summaryLiaisonService;
	/**
	 * 根据分页信息查询列表
	 * @param queryPageVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/page")
	public PageVO<SummaryLiaisonVO> queryByPage(@RequestBody QueryPageVO<SummaryLiaisonVO> queryPageVO) throws Exception {
		PageVO<SummaryLiaisonVO> pageVO = queryPageVO.getPageVO();
		SummaryLiaisonVO vo = queryPageVO.getQuery();
		return summaryLiaisonService.queryByPage(pageVO, vo);
	}

	/**
	 * 根据 id 查询对象信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/id")
	public SummaryLiaisonVO getById(@RequestParam String id) throws Exception {
		return summaryLiaisonService.getById(id);
	}

	/**
	 * 保存信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/save")
	public boolean save(@RequestBody SummaryLiaisonVO vo) throws Exception {
		return summaryLiaisonService.save(vo);
	}

	/**
	 * 修改信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/update")
	public boolean update(@RequestBody SummaryLiaisonVO vo) throws Exception {
		return summaryLiaisonService.update(vo);
	}
}
