package cn.ekgc.medical.clinic.perscription.service.impl;

import cn.ekgc.medical.base.pojo.vo.PageVO;
import cn.ekgc.medical.base.util.IdGenerator;
import cn.ekgc.medical.clinic.perscription.dao.ClinicRxDao;
import cn.ekgc.medical.clinic.perscription.pojo.entity.ClinicRx;
import cn.ekgc.medical.clinic.perscription.pojo.vo.ClinicRxVO;
import cn.ekgc.medical.clinic.perscription.service.ClinicRxService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>若天医疗门诊模块 - 门诊西医处方信息业务层接口实现类</b>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@Service("clinicRxService")
@Transactional
public class ClinicRxServiceImpl implements ClinicRxService {
	@Autowired
	private ClinicRxDao clinicRxDao;
	@Autowired
	private IdGenerator idGenerator;

	/**
	 * 根据分页信息查询列表
	 * @param pageVO
	 * @param vo
	 * @return
	 */
	@Override
	public PageVO<ClinicRxVO> queryByPage(PageVO<ClinicRxVO> pageVO, ClinicRxVO vo) throws Exception {
		ClinicRx entity = ClinicRx.getEntityFromVO(vo);
		// 开启分页过滤器
		PageHelper.startPage(pageVO.getPageNum(), pageVO.getPageSize());
		List<ClinicRx> entityList = clinicRxDao.findListByQuery(entity);
		PageInfo<ClinicRx> pageInfo = new PageInfo<>(entityList);
		List<ClinicRxVO> voList = new ArrayList<>();
		for (ClinicRx summary : pageInfo.getList()) {
			ClinicRxVO summaryVO = ClinicRxVO.getVOFromEntity(summary);
			voList.add(summaryVO);
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
	public ClinicRxVO getById(String id) throws Exception {
		ClinicRx entity = new ClinicRx();
		entity.setId(id);
		List<ClinicRx> list = clinicRxDao.findListByQuery(entity);
		if (list != null && !list.isEmpty()) {
			return ClinicRxVO.getVOFromEntity(list.get(0));
		}
		return null;
	}

	/**
	 * 保存信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean save(ClinicRxVO vo) throws Exception {
		ClinicRx entity = new ClinicRx();
		BeanUtils.copyProperties(vo, entity);
		entity.setId(idGenerator.createId());
		int result = clinicRxDao.save(entity);
		if (result > 0) {
			return true;
		}
		return false;
	}

	/**
	 * 修改信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean update(ClinicRxVO vo) throws Exception {
		ClinicRx entity = new ClinicRx();
		BeanUtils.copyProperties(vo, entity);
		int result = clinicRxDao.update(entity);
		if (result > 0) {
			return true;
		}
		return false;
	}
}
