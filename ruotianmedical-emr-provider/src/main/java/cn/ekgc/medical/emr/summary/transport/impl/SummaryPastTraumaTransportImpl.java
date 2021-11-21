package cn.ekgc.medical.emr.summary.transport.impl;

import cn.ekgc.medical.base.pojo.vo.PageVO;
import cn.ekgc.medical.base.pojo.vo.QueryPageVO;
import cn.ekgc.medical.emr.summary.pojo.vo.SummaryPastTraumaVO;
import cn.ekgc.medical.emr.summary.service.SummaryPastTraumaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <b>若天医疗电子病历模块 - 病例概要既往史（外伤）信息传输层接口实现类</b>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@RestController("summaryPastTraumaTransport")
@RequestMapping("/emr/summary/pastTrauma/trans")
public class SummaryPastTraumaTransportImpl {
	@Autowired
	private SummaryPastTraumaService summaryPastTraumaService;
	/**
	 * 根据分页信息查询列表
	 * @param queryPageVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/page")
	public PageVO<SummaryPastTraumaVO> queryByPage(@RequestBody QueryPageVO<SummaryPastTraumaVO> queryPageVO) throws Exception {
		PageVO<SummaryPastTraumaVO> pageVO = queryPageVO.getPageVO();
		SummaryPastTraumaVO vo = queryPageVO.getQuery();
		return summaryPastTraumaService.queryByPage(pageVO, vo);
	}

	/**
	 * 根据 id 查询对象信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/id")
	public SummaryPastTraumaVO getById(@RequestParam String id) throws Exception {
		return summaryPastTraumaService.getById(id);
	}

	/**
	 * 保存信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/save")
	public boolean save(@RequestBody SummaryPastTraumaVO vo) throws Exception {
		return summaryPastTraumaService.save(vo);
	}

	/**
	 * 修改信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/update")
	public boolean update(@RequestBody SummaryPastTraumaVO vo) throws Exception {
		return summaryPastTraumaService.update(vo);
	}
}
