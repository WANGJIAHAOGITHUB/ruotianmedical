package cn.ekgc.medical.emr.summary.transport;

import cn.ekgc.medical.base.pojo.vo.PageVO;
import cn.ekgc.medical.base.pojo.vo.QueryPageVO;
import cn.ekgc.medical.emr.summary.pojo.vo.SummaryVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <b>若天医疗电子病历模块 - 病例概要信息传输层接口</b>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@FeignClient(name = "ruotianmedical-emr-provider")
@RequestMapping("/emr/summary/trans")
public interface SummaryTransport {
	/**
	 * 根据分页信息查询列表
	 * @param queryPageVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/page")
	PageVO<SummaryVO> queryByPage(@RequestBody QueryPageVO<SummaryVO> queryPageVO) throws Exception;

	/**
	 * 根据 id 查询对象信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/id")
	SummaryVO getById(@RequestParam String id) throws Exception;

	/**
	 * 保存信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/save")
	boolean save(@RequestBody SummaryVO vo) throws Exception;

	/**
	 * 修改信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/update")
	boolean update(@RequestBody SummaryVO vo) throws Exception;
}
