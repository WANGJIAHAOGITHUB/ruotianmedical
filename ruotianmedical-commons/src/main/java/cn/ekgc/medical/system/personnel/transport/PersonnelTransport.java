package cn.ekgc.medical.system.personnel.transport;

import cn.ekgc.medical.base.pojo.vo.LoginInfoVO;
import cn.ekgc.medical.base.pojo.vo.PageVO;
import cn.ekgc.medical.base.pojo.vo.QueryPageVO;
import cn.ekgc.medical.system.personnel.pojo.vo.PersonnelVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <b>若天医疗系统信息 - 系统人员信息数据传输层接口</b>
 * <p>
 *     系统人员信息数据传输层接口
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@FeignClient(name = "ruotianmedical-system-admin-provider")
@RequestMapping("/system/personnel/trans")
public interface PersonnelTransport {
	/**
	 * 从 redis 中使用 token 获取用户信息
	 * @param token
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/auth")
	PersonnelVO getToken(@RequestParam String token) throws Exception;

	/**
	 * 根据分页信息查询列表
	 * @param queryPageVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/page")
	PageVO<PersonnelVO> queryByPage(@RequestBody QueryPageVO<PersonnelVO> queryPageVO) throws Exception;

	/**
	 * 根据 id 查询对象信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/id")
	PersonnelVO getById(@RequestParam String id) throws Exception;

	/**
	 * 保存系统人员信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/save")
	boolean save(@RequestBody PersonnelVO vo) throws Exception;

	/**
	 * 修改系统人员信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/update")
	boolean update(@RequestBody PersonnelVO vo) throws Exception;

	/**
	 * 修改系统人员信息
	 * @param cellphone
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/cellphone")
	PersonnelVO getByCellphone(@RequestParam String cellphone) throws Exception;

	/**
	 * 修改系统人员信息
	 * @param idCard
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/idCard")
	PersonnelVO getByIdCard(@RequestParam String idCard) throws Exception;

	/**
	 * 保存 token 到 redis 中
	 * @param loginInfoVO
	 * @throws Exception
	 */
	@PostMapping("/redis")
	void saveTokenToRedis(@RequestBody LoginInfoVO loginInfoVO) throws Exception;
}
