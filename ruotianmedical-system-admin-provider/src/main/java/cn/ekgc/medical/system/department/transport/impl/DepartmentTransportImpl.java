package cn.ekgc.medical.system.department.transport.impl;


import cn.ekgc.medical.base.pojo.vo.PageVO;
import cn.ekgc.medical.base.pojo.vo.QueryPageVO;
import cn.ekgc.medical.system.department.pojo.vo.DepartmentVO;
import cn.ekgc.medical.system.department.service.DepartmentService;
import cn.ekgc.medical.system.department.transport.DepartmentTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <b>若天医疗系统信息 - 部门信息数据传输层接口实现类</b>
 * <p>
 *     部门信息数据传输层接口实现类
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@RestController("departmentTransport")
@RequestMapping("/system/department/trans")
public class DepartmentTransportImpl implements DepartmentTransport {
	@Autowired
	private DepartmentService departmentService;
	/**
	 * 根据分页信息查询列表
	 * @param queryPageVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/page")
	public PageVO<DepartmentVO> queryByPage(@RequestBody QueryPageVO<DepartmentVO> queryPageVO) throws Exception {
		PageVO<DepartmentVO> pageVO = queryPageVO.getPageVO();
		DepartmentVO vo = queryPageVO.getQuery();
		return departmentService.queryByPage(pageVO, vo);
	}

	/**
	 * 根据 id 查询对象信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/id")
	public DepartmentVO getById(@RequestParam String id) throws Exception {
		return departmentService.getById(id);
	}

	/**
	 * 根据 code 查询对象信息
	 * @param code
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/code")
	public DepartmentVO getByCode(@RequestParam String code) throws Exception {
		return departmentService.getByCode(code);
	}

	/**
	 * 保存数据字典信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/save")
	public boolean save(@RequestBody DepartmentVO vo) throws Exception {
		return departmentService.save(vo);
	}

	/**
	 * 修改数据字典信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/update")
	public boolean update(@RequestBody DepartmentVO vo) throws Exception {
		return departmentService.update(vo);
	}
}
