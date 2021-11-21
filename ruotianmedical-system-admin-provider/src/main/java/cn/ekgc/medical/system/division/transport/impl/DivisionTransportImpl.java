package cn.ekgc.medical.system.division.transport.impl;

import cn.ekgc.medical.base.pojo.vo.PageVO;
import cn.ekgc.medical.base.pojo.vo.QueryPageVO;
import cn.ekgc.medical.system.division.pojo.vo.DivisionVO;
import cn.ekgc.medical.system.division.service.DivisionService;
import cn.ekgc.medical.system.division.transport.DivisionTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <b>若天医疗系统信息 - 行政区划数据传输层接口实现类</b>
 * <p>
 *     行政区划数据传输层接口实现类
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@RestController("divisionTransport")
@RequestMapping("/system/division/trans")
public class DivisionTransportImpl implements DivisionTransport {
	@Autowired
	private DivisionService divisionService;
	/**
	 * 根据分页信息查询列表
	 * @param queryPageVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/page")
	public PageVO<DivisionVO> queryByPage(@RequestBody QueryPageVO<DivisionVO> queryPageVO) throws Exception {
		PageVO<DivisionVO> pageVO = queryPageVO.getPageVO();
		DivisionVO vo = queryPageVO.getQuery();
		return divisionService.queryByPage(pageVO, vo);
	}

	/**
	 * 根据 id 查询对象信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/id")
	public DivisionVO getById(@RequestParam String id) throws Exception {
		return divisionService.getById(id);
	}

	/**
	 * 根据 code 查询对象信息
	 * @param code
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/code")
	public DivisionVO getByCode(@RequestParam String code) throws Exception {
		return divisionService.getByCode(code);
	}

	/**
	 * 保存行政区划信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/save")
	public boolean save(@RequestBody DivisionVO vo) throws Exception {
		return divisionService.save(vo);
	}

	/**
	 * 修改行政区划信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/update")
	public boolean update(@RequestBody DivisionVO vo) throws Exception {
		return divisionService.update(vo);
	}
}
