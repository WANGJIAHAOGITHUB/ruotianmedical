package cn.ekgc.medical.system.dictionary.transport;

import cn.ekgc.medical.base.pojo.vo.PageVO;
import cn.ekgc.medical.base.pojo.vo.QueryPageVO;
import cn.ekgc.medical.system.dictionary.pojo.vo.DictionaryVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <b>若天医疗系统信息 - 数据字典信息数据传输层接口</b>
 * <p>
 *     数据字典信息数据传输层接口
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@FeignClient(name = "ruotianmedical-system-admin-provider")
@RequestMapping("/system/dictionary/trans")
public interface DictionaryTransport {
	/**
	 * 根据分页信息查询列表
	 * @param queryPageVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/page")
	PageVO<DictionaryVO> queryByPage(@RequestBody QueryPageVO<DictionaryVO> queryPageVO) throws Exception;

	/**
	 * 根据 id 查询对象信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/id")
	DictionaryVO getById(@RequestParam String id) throws Exception;

	/**
	 * 根据 code 查询对象信息
	 * @param code
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/code")
	DictionaryVO getByCode(@RequestParam String code) throws Exception;

	/**
	 * 保存数据字典信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/save")
	boolean save(@RequestBody DictionaryVO vo) throws Exception;

	/**
	 * 修改数据字典信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/update")
	boolean update(@RequestBody DictionaryVO vo) throws Exception;
}
