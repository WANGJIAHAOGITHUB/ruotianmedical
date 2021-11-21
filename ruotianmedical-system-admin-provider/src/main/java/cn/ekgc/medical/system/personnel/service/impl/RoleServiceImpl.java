package cn.ekgc.medical.system.personnel.service.impl;

import cn.ekgc.medical.base.pojo.vo.PageVO;
import cn.ekgc.medical.base.util.IdGenerator;
import cn.ekgc.medical.system.personnel.dao.RoleDao;
import cn.ekgc.medical.system.personnel.pojo.entity.Role;
import cn.ekgc.medical.system.personnel.pojo.vo.RoleVO;
import cn.ekgc.medical.system.personnel.service.RoleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>若天医疗系统信息 - 角色信息数据业务层接口实现类</b>
 * <p>
 *     角色信息数据业务层接口实现类
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@Service("roleService")
@Transactional
public class RoleServiceImpl implements RoleService {
	@Autowired
	private RoleDao roleDao;
	@Autowired
	private IdGenerator idGenerator;
	/**
	 * 根据分页信息查询列表
	 * @param pageVO
	 * @param vo
	 * @return
	 */
	@Override
	public PageVO<RoleVO> queryByPage(PageVO<RoleVO> pageVO, RoleVO vo) throws Exception {
		Role entity = Role.getEntityFromVO(vo);
		// 开启分页过滤器
		PageHelper.startPage(pageVO.getPageNum(), pageVO.getPageSize());
		List<Role> entityList = roleDao.findListByQuery(entity);
		PageInfo<Role> pageInfo = new PageInfo<>(entityList);
		List<RoleVO> voList = new ArrayList<>();
		for (Role role : pageInfo.getList()) {
			RoleVO roleVO = RoleVO.getVOFromEntity(role);
			voList.add(roleVO);
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
	public RoleVO getById(String id) throws Exception {
		Role entity = new Role();
		entity.setId(id);
		List<Role> list = roleDao.findListByQuery(entity);
		if (list != null && !list.isEmpty()) {
			return RoleVO.getVOFromEntity(list.get(0));
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
	public RoleVO getByCode(String code) throws Exception {
		Role entity = new Role();
		entity.setCode(code);
		List<Role> list = roleDao.findListByQuery(entity);
		if (list != null && !list.isEmpty()) {
			return RoleVO.getVOFromEntity(list.get(0));
		}
		return null;
	}

	/**
	 * 保存行政区划信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean save(RoleVO vo) throws Exception {
		Role entity = new Role();
		BeanUtils.copyProperties(vo, entity);
		entity.setId(idGenerator.createId());
		int result = roleDao.insert(entity);
		if (result > 0) {
			return true;
		}
		return false;
	}

	/**
	 * 修改行政区划信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean update(RoleVO vo) throws Exception {
		Role entity = new Role();
		BeanUtils.copyProperties(vo, entity);
		int result = roleDao.modify(entity);
		if (result > 0) {
			return true;
		}
		return false;
	}
}
