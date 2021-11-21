package cn.ekgc.medical.system.personnel.transport;

import cn.ekgc.medical.base.pojo.vo.PageVO;
import cn.ekgc.medical.base.pojo.vo.QueryPageVO;
import cn.ekgc.medical.system.personnel.pojo.vo.RoleVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <b>若天医疗系统信息 - 角色信息数据传输层接口</b>
 * <p>
 *     角色信息数据传输层接口
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@FeignClient("ruotianmedical-system-admin-provider")
@RequestMapping("/system/personnel/role/trans")
public interface RoleTransport {
	/**
	 * 根据分页信息查询列表
	 * @param queryPageVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/page")
	PageVO<RoleVO> queryByPage(@RequestBody QueryPageVO<RoleVO> queryPageVO) throws Exception;

	/**
	 * 根据 id 查询对象信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/id")
	RoleVO getById(@RequestParam String id) throws Exception;

	/**
	 * 根据 code 查询对象信息
	 * @param code
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/code")
	RoleVO getByCode(@RequestParam String code) throws Exception;

	/**
	 * 保存角色信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/save")
	boolean save(@RequestBody RoleVO vo) throws Exception;

	/**
	 * 修改角色信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/update")
	boolean update(@RequestBody RoleVO vo) throws Exception;
}
