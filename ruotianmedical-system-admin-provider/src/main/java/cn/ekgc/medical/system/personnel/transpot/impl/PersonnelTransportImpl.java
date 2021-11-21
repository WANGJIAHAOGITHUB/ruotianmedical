package cn.ekgc.medical.system.personnel.transpot.impl;

import cn.ekgc.medical.base.pojo.vo.LoginInfoVO;
import cn.ekgc.medical.base.pojo.vo.PageVO;
import cn.ekgc.medical.base.pojo.vo.QueryPageVO;
import cn.ekgc.medical.system.personnel.pojo.vo.PersonnelVO;
import cn.ekgc.medical.system.personnel.service.PersonnelService;
import cn.ekgc.medical.system.personnel.transport.PersonnelTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <b>若天医疗系统信息 - 系统人员信息数据传输层接口实现类</b>
 * <p>
 *     系统人员信息数据传输层接口实现类
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@RestController("personnelTransport")
@RequestMapping("/system/personnel/trans")
public class PersonnelTransportImpl implements PersonnelTransport {
	@Autowired
	private PersonnelService personnelService;
	/**
	 * 从 redis 中使用 token 获取用户信息
	 * @param token
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/auth")
	@Override
	public PersonnelVO getToken(@RequestParam String token) throws Exception {
		return personnelService.getToken(token);
	}

	/**
	 * 根据分页信息查询列表
	 * @param queryPageVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/page")
	@Override
	public PageVO<PersonnelVO> queryByPage(@RequestBody QueryPageVO<PersonnelVO> queryPageVO) throws Exception {
		PageVO<PersonnelVO> pageVO = queryPageVO.getPageVO();
		PersonnelVO vo = queryPageVO.getQuery();
		return personnelService.queryByPage(pageVO, vo);
	}

	/**
	 * 根据 id 查询对象信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/id")
	@Override
	public PersonnelVO getById(@RequestParam String id) throws Exception {
		return personnelService.getById(id);
	}

	/**
	 * 保存数据字典信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/save")
	@Override
	public boolean save(@RequestBody PersonnelVO vo) throws Exception {
		return personnelService.save(vo);
	}

	/**
	 * 修改数据字典信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/update")
	@Override
	public boolean update(@RequestBody PersonnelVO vo) throws Exception {
		return personnelService.update(vo);
	}

	/**
	 * 修改系统人员信息
	 * @param cellphone
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/cellphone")
	@Override
	public PersonnelVO getByCellphone(@RequestParam String cellphone) throws Exception {
		return personnelService.getByCellphone(cellphone);
	}

	/**
	 * 修改系统人员信息
	 * @param idCard
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/idCard")
	@Override
	public PersonnelVO getByIdCard(@RequestParam String idCard) throws Exception {
		return personnelService.getByIdCard(idCard);
	}

	/**
	 * 保存 token 到 redis 中
	 * @param loginInfoVO
	 * @throws Exception
	 */
	@PostMapping("/redis")
	@Override
	public void saveTokenToRedis(LoginInfoVO loginInfoVO) throws Exception {
		PersonnelVO vo = loginInfoVO.getVo();
		Long expireTime = loginInfoVO.getExpireTime();
		String token = loginInfoVO.getToken();
		personnelService.saveTokenToRedis(vo, expireTime, token);
	}
}
