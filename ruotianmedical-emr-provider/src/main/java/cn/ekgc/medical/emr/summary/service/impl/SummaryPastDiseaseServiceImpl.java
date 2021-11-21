package cn.ekgc.medical.emr.summary.service.impl;

import cn.ekgc.medical.base.pojo.vo.PageVO;
import cn.ekgc.medical.base.util.IdGenerator;
import cn.ekgc.medical.emr.summary.dao.SummaryPastDiseaseDao;
import cn.ekgc.medical.emr.summary.pojo.entity.SummaryPastDisease;
import cn.ekgc.medical.emr.summary.pojo.vo.SummaryPastDiseaseVO;
import cn.ekgc.medical.emr.summary.service.SummaryPastDiseaseService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>若天医疗电子病历模块 - 病例概要疾病史信息业务层接口实现类</b>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@Service("summaryPastDiseaseService")
@Transactional
public class SummaryPastDiseaseServiceImpl implements SummaryPastDiseaseService {
	@Autowired
	private SummaryPastDiseaseDao summaryPastDiseaseDao;
	@Autowired
	private IdGenerator idGenerator;

	/**
	 * 根据分页信息查询列表
	 * @param pageVO
	 * @param vo
	 * @return
	 */
	@Override
	public PageVO<SummaryPastDiseaseVO> queryByPage(PageVO<SummaryPastDiseaseVO> pageVO, SummaryPastDiseaseVO vo) throws Exception {
		SummaryPastDisease entity = SummaryPastDisease.getEntityFromVO(vo);
		// 开启分页过滤器
		PageHelper.startPage(pageVO.getPageNum(), pageVO.getPageSize());
		List<SummaryPastDisease> entityList = summaryPastDiseaseDao.findListByQuery(entity);
		PageInfo<SummaryPastDisease> pageInfo = new PageInfo<>(entityList);
		List<SummaryPastDiseaseVO> voList = new ArrayList<>();
		for (SummaryPastDisease summary : pageInfo.getList()) {
			SummaryPastDiseaseVO summaryVO = SummaryPastDiseaseVO.getVOFromEntity(summary);
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
	public SummaryPastDiseaseVO getById(String id) throws Exception {
		SummaryPastDisease entity = new SummaryPastDisease();
		entity.setId(id);
		List<SummaryPastDisease> list = summaryPastDiseaseDao.findListByQuery(entity);
		if (list != null && !list.isEmpty()) {
			return SummaryPastDiseaseVO.getVOFromEntity(list.get(0));
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
	public boolean save(SummaryPastDiseaseVO vo) throws Exception {
		SummaryPastDisease entity = new SummaryPastDisease();
		BeanUtils.copyProperties(vo, entity);
		entity.setId(idGenerator.createId());
		int result = summaryPastDiseaseDao.save(entity);
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
	public boolean update(SummaryPastDiseaseVO vo) throws Exception {
		SummaryPastDisease entity = new SummaryPastDisease();
		BeanUtils.copyProperties(vo, entity);
		int result = summaryPastDiseaseDao.update(entity);
		if (result > 0) {
			return true;
		}
		return false;
	}
}
