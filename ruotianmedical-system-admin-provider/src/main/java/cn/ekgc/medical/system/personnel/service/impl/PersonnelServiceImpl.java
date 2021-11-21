package cn.ekgc.medical.system.personnel.service.impl;

import cn.ekgc.medical.base.pojo.vo.PageVO;
import cn.ekgc.medical.base.util.IdGenerator;
import cn.ekgc.medical.base.util.RedisUtil;
import cn.ekgc.medical.system.personnel.pojo.entity.Personnel;
import cn.ekgc.medical.system.personnel.pojo.vo.PersonnelVO;
import cn.ekgc.medical.system.personnel.dao.PersonnelDao;
import cn.ekgc.medical.system.personnel.service.PersonnelService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>若天医疗系统信息 - 系统人员信息数据业务层接口实现类</b>
 * <p>
 *     系统人员信息数据业务层接口实现类
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@Service("personnelService")
@Transactional
public class PersonnelServiceImpl implements PersonnelService {
	@Autowired
	private PersonnelDao personnelDao;
	@Autowired
	private IdGenerator idGenerator;
	@Autowired
	private RedisUtil redisUtil;
	/**
	 * 根据分页信息查询列表
	 * @param pageVO
	 * @param vo
	 * @return
	 */
	@Override
	public PageVO<PersonnelVO> queryByPage(PageVO<PersonnelVO> pageVO, PersonnelVO vo) throws Exception {
		Personnel entity = Personnel.getEntityFromVO(vo);
		// 开启分页过滤器
		PageHelper.startPage(pageVO.getPageNum(), pageVO.getPageSize());
		List<Personnel> entityList = personnelDao.findListByQuery(entity);
		PageInfo<Personnel> pageInfo = new PageInfo<>(entityList);
		List<PersonnelVO> voList = new ArrayList<>();
		for (Personnel personnel : pageInfo.getList()) {
			PersonnelVO personnelVO = PersonnelVO.getVOFromEntity(personnel);
			voList.add(personnelVO);
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
	public PersonnelVO getById(String id) throws Exception {
		Personnel entity = new Personnel();
		entity.setId(id);
		List<Personnel> list = personnelDao.findListByQuery(entity);
		if (list != null && !list.isEmpty()) {
			return PersonnelVO.getVOFromEntity(list.get(0));
		}
		return null;
	}

	/**
	 * 保存系统人员信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean save(PersonnelVO vo) throws Exception {
		Personnel entity = new Personnel();
		BeanUtils.copyProperties(vo, entity);
		entity.setId(idGenerator.createId());
		int result = personnelDao.insert(entity);
		if (result > 0) {
			return true;
		}
		return false;
	}

	/**
	 * 修改系统人员信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean update(PersonnelVO vo) throws Exception {
		Personnel entity = new Personnel();
		BeanUtils.copyProperties(vo, entity);
		int result = personnelDao.modify(entity);
		if (result > 0) {
			return true;
		}
		return false;
	}

	/**
	 * 修改系统人员信息
	 * @param cellphone
	 * @return
	 * @throws Exception
	 */
	@Override
	public PersonnelVO getByCellphone(String cellphone) throws Exception {
		Personnel entity = new Personnel();
		entity.setCellphone(cellphone);
		List<Personnel> list = personnelDao.findListByQuery(entity);
		if (list != null && !list.isEmpty()) {
			return PersonnelVO.getVOFromEntity(list.get(0));
		}
		return null;
	}

	/**
	 * 修改系统人员信息
	 * @param idCard
	 * @return
	 * @throws Exception
	 */
	@Override
	public PersonnelVO getByIdCard(String idCard) throws Exception {
		Personnel entity = new Personnel();
		entity.setIdCard(idCard);
		List<Personnel> list = personnelDao.findListByQuery(entity);
		if (list != null && !list.isEmpty()) {
			return PersonnelVO.getVOFromEntity(list.get(0));
		}
		return null;
	}

	/**
	 * 从 reids 中获取用户信息
	 * @param token
	 * @return
	 * @throws Exception
	 */
	@Override
	public PersonnelVO getToken(String token) throws Exception {
		PersonnelVO vo = (PersonnelVO) redisUtil.getFromRedis(token, PersonnelVO.class);
		return vo;
	}

	@Override
	public void saveTokenToRedis(PersonnelVO vo, Long expireTime, String token) throws Exception {
		redisUtil.saveToRedis(token, vo, expireTime);
	}
}
