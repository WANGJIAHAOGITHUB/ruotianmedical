package cn.ekgc.medical.clinic.perscription.service.impl;

import cn.ekgc.medical.base.pojo.vo.PageVO;
import cn.ekgc.medical.base.util.IdGenerator;
import cn.ekgc.medical.clinic.perscription.dao.ClinicRxInsuranceDao;
import cn.ekgc.medical.clinic.perscription.pojo.entity.ClinicRxInsurance;
import cn.ekgc.medical.clinic.perscription.pojo.vo.ClinicRxInsuranceVO;
import cn.ekgc.medical.clinic.perscription.service.ClinicRxInsuranceService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>若天医疗门诊模块 - 门诊医保信息业务层接口实现类</b>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@Service("clinicRxInsuranceService")
@Transactional
public class ClinicRxInsuranceServiceImpl implements ClinicRxInsuranceService {
	@Autowired
	private ClinicRxInsuranceDao clinicRxInsuranceDao;
	@Autowired
	private IdGenerator idGenerator;

	/**
	 * 根据分页信息查询列表
	 * @param pageVO
	 * @param vo
	 * @return
	 */
	@Override
	public PageVO<ClinicRxInsuranceVO> queryByPage(PageVO<ClinicRxInsuranceVO> pageVO, ClinicRxInsuranceVO vo) throws Exception {
		ClinicRxInsurance entity = ClinicRxInsurance.getEntityFromVO(vo);
		// 开启分页过滤器
		PageHelper.startPage(pageVO.getPageNum(), pageVO.getPageSize());
		List<ClinicRxInsurance> entityList = clinicRxInsuranceDao.findListByQuery(entity);
		PageInfo<ClinicRxInsurance> pageInfo = new PageInfo<>(entityList);
		List<ClinicRxInsuranceVO> voList = new ArrayList<>();
		for (ClinicRxInsurance summary : pageInfo.getList()) {
			ClinicRxInsuranceVO summaryVO = ClinicRxInsuranceVO.getVOFromEntity(summary);
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
	public ClinicRxInsuranceVO getById(String id) throws Exception {
		ClinicRxInsurance entity = new ClinicRxInsurance();
		entity.setId(id);
		List<ClinicRxInsurance> list = clinicRxInsuranceDao.findListByQuery(entity);
		if (list != null && !list.isEmpty()) {
			return ClinicRxInsuranceVO.getVOFromEntity(list.get(0));
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
	public boolean save(ClinicRxInsuranceVO vo) throws Exception {
		ClinicRxInsurance entity = new ClinicRxInsurance();
		BeanUtils.copyProperties(vo, entity);
		entity.setId(idGenerator.createId());
		int result = clinicRxInsuranceDao.save(entity);
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
	public boolean update(ClinicRxInsuranceVO vo) throws Exception {
		ClinicRxInsurance entity = new ClinicRxInsurance();
		BeanUtils.copyProperties(vo, entity);
		int result = clinicRxInsuranceDao.update(entity);
		if (result > 0) {
			return true;
		}
		return false;
	}
}
