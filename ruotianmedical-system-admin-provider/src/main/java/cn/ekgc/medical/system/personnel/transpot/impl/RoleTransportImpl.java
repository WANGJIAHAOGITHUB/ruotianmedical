package cn.ekgc.medical.system.personnel.transpot.impl;

import cn.ekgc.medical.base.pojo.vo.PageVO;
import cn.ekgc.medical.base.pojo.vo.QueryPageVO;
import cn.ekgc.medical.system.personnel.pojo.vo.RoleVO;
import cn.ekgc.medical.system.personnel.service.RoleService;
import cn.ekgc.medical.system.personnel.transport.RoleTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <b>若天医疗系统信息 - 角色信息数据传输层接口实现类</b>
 * <p>
 *     角色信息数据传输层接口实现类
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@RestController("roleTransport")
@RequestMapping("/system/personnel/role/trans")
public class RoleTransportImpl implements RoleTransport {
	@Autowired
	private RoleService roleService;
	/**
	 * 根据分页信息查询列表
	 * @param queryPageVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/page")
	public PageVO<RoleVO> queryByPage(@RequestBody QueryPageVO<RoleVO> queryPageVO) throws Exception {
		PageVO<RoleVO> pageVO = queryPageVO.getPageVO();
		RoleVO vo = queryPageVO.getQuery();
		return roleService.queryByPage(pageVO, vo);
	}

	/**
	 * 根据 id 查询对象信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/id")
	public RoleVO getById(@RequestParam String id) throws Exception {
		return roleService.getById(id);
	}

	/**
	 * 根据 code 查询对象信息
	 * @param code
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/code")
	public RoleVO getByCode(@RequestParam String code) throws Exception {
		return roleService.getByCode(code);
	}

	/**
	 * 保存角色信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/save")
	public boolean save(@RequestBody RoleVO vo) throws Exception {
		return roleService.save(vo);
	}

	/**
	 * 修改角色信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/update")
	public boolean update(@RequestBody RoleVO vo) throws Exception {
		return roleService.update(vo);
	}
}
