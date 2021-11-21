package cn.ekgc.medical.system.division.transport;

import cn.ekgc.medical.base.pojo.vo.PageVO;
import cn.ekgc.medical.base.pojo.vo.QueryPageVO;
import cn.ekgc.medical.system.division.pojo.vo.DivisionVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <b>若天医疗系统信息 - 行政区划数据传输层接口</b>
 * <p>
 *     行政区划数据传输层接口
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@FeignClient(name = "ruotianmedical-system-admin-provider")
@RequestMapping("/system/division/trans")
public interface DivisionTransport {
	/**
	 * 根据分页信息查询列表
	 * @param queryPageVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/page")
	PageVO<DivisionVO> queryByPage(@RequestBody QueryPageVO<DivisionVO> queryPageVO) throws Exception;

	/**
	 * 根据 id 查询对象信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/id")
	DivisionVO getById(@RequestParam String id) throws Exception;

	/**
	 * 根据 code 查询对象信息
	 * @param code
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/code")
	DivisionVO getByCode(@RequestParam String code) throws Exception;

	/**
	 * 保存行政区划信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/save")
	boolean save(@RequestBody DivisionVO vo) throws Exception;

	/**
	 * 修改行政区划信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/update")
	boolean update(@RequestBody DivisionVO vo) throws Exception;
}
