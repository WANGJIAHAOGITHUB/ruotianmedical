package cn.ekgc.medical.emr.summary.service.impl;

import cn.ekgc.medical.base.pojo.vo.PageVO;
import cn.ekgc.medical.base.util.IdGenerator;
import cn.ekgc.medical.emr.summary.dao.SummaryInsuranceDao;
import cn.ekgc.medical.emr.summary.pojo.entity.SummaryInsurance;
import cn.ekgc.medical.emr.summary.pojo.vo.SummaryInsuranceVO;
import cn.ekgc.medical.emr.summary.service.SummaryInsuranceService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>若天医疗电子病历模块 - 病例概要医保信息业务层接口实现类</b>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@Service("summaryInsuranceService")
@Transactional
public class SummaryInsuranceServiceImpl implements SummaryInsuranceService {
	@Autowired
	private SummaryInsuranceDao summaryInsuranceDao;
	@Autowired
	private IdGenerator idGenerator;

	/**
	 * 根据分页信息查询列表
	 * @param pageVO
	 * @param vo
	 * @return
	 */
	@Override
	public PageVO<SummaryInsuranceVO> queryByPage(PageVO<SummaryInsuranceVO> pageVO, SummaryInsuranceVO vo) throws Exception {
		SummaryInsurance entity = SummaryInsurance.getEntityFromVO(vo);
		// 开启分页过滤器
		PageHelper.startPage(pageVO.getPageNum(), pageVO.getPageSize());
		List<SummaryInsurance> entityList = summaryInsuranceDao.findListByQuery(entity);
		PageInfo<SummaryInsurance> pageInfo = new PageInfo<>(entityList);
		List<SummaryInsuranceVO> voList = new ArrayList<>();
		for (SummaryInsurance summary : pageInfo.getList()) {
			SummaryInsuranceVO summaryVO = SummaryInsuranceVO.getVOFromEntity(summary);
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
	public SummaryInsuranceVO getById(String id) throws Exception {
		SummaryInsurance entity = new SummaryInsurance();
		entity.setId(id);
		List<SummaryInsurance> list = summaryInsuranceDao.findListByQuery(entity);
		if (list != null && !list.isEmpty()) {
			return SummaryInsuranceVO.getVOFromEntity(list.get(0));
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
	public boolean save(SummaryInsuranceVO vo) throws Exception {
		SummaryInsurance entity = new SummaryInsurance();
		BeanUtils.copyProperties(vo, entity);
		entity.setId(idGenerator.createId());
		int result = summaryInsuranceDao.save(entity);
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
	public boolean update(SummaryInsuranceVO vo) throws Exception {
		SummaryInsurance entity = new SummaryInsurance();
		BeanUtils.copyProperties(vo, entity);
		int result = summaryInsuranceDao.update(entity);
		if (result > 0) {
			return true;
		}
		return false;
	}
}
