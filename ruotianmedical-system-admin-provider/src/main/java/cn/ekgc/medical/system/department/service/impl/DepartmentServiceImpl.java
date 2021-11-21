package cn.ekgc.medical.system.department.service.impl;

import cn.ekgc.medical.base.pojo.vo.PageVO;
import cn.ekgc.medical.base.util.IdGenerator;
import cn.ekgc.medical.system.department.dao.DepartmentDao;
import cn.ekgc.medical.system.department.pojo.entity.Department;
import cn.ekgc.medical.system.department.pojo.vo.DepartmentVO;
import cn.ekgc.medical.system.department.service.DepartmentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>若天医疗系统信息 - 部门信息数据业务层接口实现类</b>
 * <p>
 *     部门信息数据业务层接口实现类
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@Service("departmentService")
@Transactional
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	private DepartmentDao departmentDao;
	@Autowired
	private IdGenerator idGenerator;
	/**
	 * 根据分页信息查询列表
	 * @param pageVO
	 * @param vo
	 * @return
	 */
	@Override
	public PageVO<DepartmentVO> queryByPage(PageVO<DepartmentVO> pageVO, DepartmentVO vo) throws Exception {
		Department entity = Department.getEntityFromVO(vo);
		// 开启分页过滤器
		PageHelper.startPage(pageVO.getPageNum(), pageVO.getPageSize());
		List<Department> entityList = departmentDao.findListByQuery(entity);
		PageInfo<Department> pageInfo = new PageInfo<>(entityList);
		List<DepartmentVO> voList = new ArrayList<>();
		for (Department department : pageInfo.getList()) {
			DepartmentVO departmentVO = DepartmentVO.getVOFromEntity(department);
			voList.add(departmentVO);
		}
		pageVO.setTotalSize(pageInfo.getTotal());
		pageVO.setTotalPage(pageInfo.getPages());
		pageVO.setList(voList);
		return pageVO;
	}

	/**
	 * 根据 id 查询对象信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@Override
	public DepartmentVO getById(String id) throws Exception {
		Department entity = new Department();
		entity.setId(id);
		List<Department> list = departmentDao.findListByQuery(entity);
		if (list != null && !list.isEmpty()) {
			return DepartmentVO.getVOFromEntity(list.get(0));
		}
		return null;
	}

	/**
	 * 根据 code 查询对象信息
	 * @param code
	 * @return
	 * @throws Exception
	 */
	@Override
	public DepartmentVO getByCode(String code) throws Exception {
		Department entity = new Department();
		entity.setCode(code);
		List<Department> list = departmentDao.findListByQuery(entity);
		if (list != null && !list.isEmpty()) {
			return DepartmentVO.getVOFromEntity(list.get(0));
		}
		return null;
	}

	/**
	 * 保存数据字典信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean save(DepartmentVO vo) throws Exception {
		Department entity = new Department();
		BeanUtils.copyProperties(vo, entity);
		entity.setId(idGenerator.createId());
		int result = departmentDao.insert(entity);
		if (result > 0) {
			return true;
		}
		return false;
	}

	/**
	 * 修改数据字典信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean update(DepartmentVO vo) throws Exception {
		Department entity = new Department();
		BeanUtils.copyProperties(vo, entity);
		int result = departmentDao.modify(entity);
		if (result > 0) {
			return true;
		}
		return false;
	}
}
