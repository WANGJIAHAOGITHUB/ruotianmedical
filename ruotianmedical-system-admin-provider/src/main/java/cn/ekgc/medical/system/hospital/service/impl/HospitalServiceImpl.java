package cn.ekgc.medical.system.hospital.service.impl;

import cn.ekgc.medical.base.pojo.vo.PageVO;
import cn.ekgc.medical.base.util.IdGenerator;
import cn.ekgc.medical.system.hospital.dao.HospitalDao;
import cn.ekgc.medical.system.hospital.pojo.entity.Hospital;
import cn.ekgc.medical.system.hospital.pojo.vo.HospitalVO;
import cn.ekgc.medical.system.hospital.service.HospitalService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>若天医疗系统信息 - 医院信息数据业务层接口实现类</b>
 * @author WangJiahao
 * @version 1.0.0
 */
@Service("hospitalService")
@Transactional
public class HospitalServiceImpl implements HospitalService {
	@Autowired
	private HospitalDao hospitalDao;
	@Autowired
	private IdGenerator idGenerator;
	/**
	 * 根据分页信息查询列表
	 * @param pageVO
	 * @param vo
	 * @return
	 */
	@Override
	public PageVO<HospitalVO> queryByPage(PageVO<HospitalVO> pageVO, HospitalVO vo) throws Exception {
		Hospital entity = Hospital.getEntityFromVO(vo);
		// 开启分页过滤器
		PageHelper.startPage(pageVO.getPageNum(), pageVO.getPageSize());
		List<Hospital> entityList = hospitalDao.findListByQuery(entity);
		PageInfo<Hospital> pageInfo = new PageInfo<>(entityList);
		List<HospitalVO> voList = new ArrayList<>();
		for (Hospital hospital : pageInfo.getList()) {
			HospitalVO hospitalVO = HospitalVO.getVOFromEntity(hospital);
			voList.add(hospitalVO);
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
	public HospitalVO getById(String id) throws Exception {
		Hospital entity = new Hospital();
		entity.setId(id);
		List<Hospital> list = hospitalDao.findListByQuery(entity);
		if (list != null && !list.isEmpty()) {
			return HospitalVO.getVOFromEntity(list.get(0));
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
	public HospitalVO getByCode(String code) throws Exception {
		Hospital entity = new Hospital();
		entity.setOrgCode(code);
		List<Hospital> list = hospitalDao.findListByQuery(entity);
		if (list != null && !list.isEmpty()) {
			return HospitalVO.getVOFromEntity(list.get(0));
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
	public boolean save(HospitalVO vo) throws Exception {
		Hospital entity = new Hospital();
		BeanUtils.copyProperties(vo, entity);
		entity.setId(idGenerator.createId());
		int result = hospitalDao.save(entity);
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
	public boolean update(HospitalVO vo) throws Exception {
		Hospital entity = new Hospital();
		BeanUtils.copyProperties(vo, entity);
		int result = hospitalDao.update(entity);
		if (result > 0) {
			return true;
		}
		return false;
	}
}
