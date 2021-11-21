package cn.ekgc.medical.system.division.service.impl;

import cn.ekgc.medical.base.pojo.vo.PageVO;
import cn.ekgc.medical.base.util.IdGenerator;
import cn.ekgc.medical.system.division.dao.DivisionDao;
import cn.ekgc.medical.system.division.pojo.entity.Division;
import cn.ekgc.medical.system.division.pojo.vo.DivisionVO;
import cn.ekgc.medical.system.division.service.DivisionService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>若天医疗系统信息 - 行政区划数据业务层接口实现类</b>
 * <p>
 *     行政区划数据业务层接口实现类
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@Service("divisionService")
@Transactional
public class DivisionServiceImpl implements DivisionService {
	@Autowired
	private DivisionDao divisionDao;
	@Autowired
	private IdGenerator idGenerator;
	/**
	 * 根据分页信息查询列表
	 * @param pageVO
	 * @param vo
	 * @return
	 */
	@Override
	public PageVO<DivisionVO> queryByPage(PageVO<DivisionVO> pageVO, DivisionVO vo) throws Exception {
		Division entity = Division.getEntityFromVO(vo);
		// 开启分页过滤器
		PageHelper.startPage(pageVO.getPageNum(), pageVO.getPageSize());
		List<Division> entityList = divisionDao.findListByQuery(entity);
		PageInfo<Division> pageInfo = new PageInfo<>(entityList);
		List<DivisionVO> voList = new ArrayList<>();
		for (Division division : pageInfo.getList()) {
			DivisionVO divisionVO = DivisionVO.getVOFromEntity(division);
			voList.add(divisionVO);
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
	public DivisionVO getById(String id) throws Exception {
		Division entity = new Division();
		entity.setId(id);
		List<Division> list = divisionDao.findListByQuery(entity);
		if (list != null && !list.isEmpty()) {
			return DivisionVO.getVOFromEntity(list.get(0));
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
	public DivisionVO getByCode(String code) throws Exception {
		Division entity = new Division();
		entity.setCode(code);
		List<Division> list = divisionDao.findListByQuery(entity);
		if (list != null && !list.isEmpty()) {
			return DivisionVO.getVOFromEntity(list.get(0));
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
	public boolean save(DivisionVO vo) throws Exception {
		Division entity = new Division();
		BeanUtils.copyProperties(vo, entity);
		entity.setId(idGenerator.createId());
		int result = divisionDao.insert(entity);
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
	public boolean update(DivisionVO vo) throws Exception {
		Division entity = new Division();
		BeanUtils.copyProperties(vo, entity);
		int result = divisionDao.modify(entity);
		if (result > 0) {
			return true;
		}
		return false;
	}
}
