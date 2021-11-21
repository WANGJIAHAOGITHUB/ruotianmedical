package cn.ekgc.medical.system.dictionary.transport.impl;

import cn.ekgc.medical.base.pojo.vo.PageVO;
import cn.ekgc.medical.base.pojo.vo.QueryPageVO;
import cn.ekgc.medical.system.dictionary.pojo.vo.DictionaryVO;
import cn.ekgc.medical.system.dictionary.service.DictionaryService;
import cn.ekgc.medical.system.dictionary.transport.DictionaryTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <b>若天医疗系统信息 - 数据字典信息数据传输层接口实现类</b>
 * <p>
 *     数据字典信息数据传输层接口实现类
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@RestController("DictionaryTransport")
@RequestMapping("/system/dictionary/trans")
public class DictionaryTransportImpl implements DictionaryTransport {
	@Autowired
	private DictionaryService dictionaryService;
	/**
	 * 根据分页信息查询列表
	 * @param queryPageVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/page")
	public PageVO<DictionaryVO> queryByPage(@RequestBody QueryPageVO<DictionaryVO> queryPageVO) throws Exception {
		PageVO<DictionaryVO> pageVO = queryPageVO.getPageVO();
		DictionaryVO vo = queryPageVO.getQuery();
		return dictionaryService.queryByPage(pageVO, vo);
	}

	/**
	 * 根据 id 查询对象信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/id")
	public DictionaryVO getById(@RequestParam String id) throws Exception {
		return dictionaryService.getById(id);
	}

	/**
	 * 根据 code 查询对象信息
	 * @param code
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/code")
	public DictionaryVO getByCode(@RequestParam String code) throws Exception {
		return dictionaryService.getByCode(code);
	}

	/**
	 * 保存数据字典信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/save")
	public boolean save(@RequestBody DictionaryVO vo) throws Exception {
		return dictionaryService.save(vo);
	}

	/**
	 * 修改数据字典信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/update")
	public boolean update(@RequestBody DictionaryVO vo) throws Exception {
		return dictionaryService.update(vo);
	}
}
