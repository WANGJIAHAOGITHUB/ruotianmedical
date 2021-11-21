package cn.ekgc.medical.emr.summary.service.impl;

import cn.ekgc.medical.base.pojo.vo.PageVO;
import cn.ekgc.medical.base.util.IdGenerator;
import cn.ekgc.medical.emr.summary.dao.SummaryRiskDao;
import cn.ekgc.medical.emr.summary.pojo.entity.SummaryRisk;
import cn.ekgc.medical.emr.summary.pojo.vo.SummaryRiskVO;
import cn.ekgc.medical.emr.summary.service.SummaryRiskService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>若天医疗电子病历模块 - 病例概要个体危险信息业务层接口实现类</b>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@Service("summaryRiskService")
@Transactional
public class SummaryRiskServiceImpl implements SummaryRiskService {
	@Autowired
	private SummaryRiskDao summaryRiskDao;
	@Autowired
	private IdGenerator idGenerator;

	/**
	 * 根据分页信息查询列表
	 * @param pageVO
	 * @param vo
	 * @return
	 */
	@Override
	public PageVO<SummaryRiskVO> queryByPage(PageVO<SummaryRiskVO> pageVO, SummaryRiskVO vo) throws Exception {
		SummaryRisk entity = SummaryRisk.getEntityFromVO(vo);
		// 开启分页过滤器
		PageHelper.startPage(pageVO.getPageNum(), pageVO.getPageSize());
		List<SummaryRisk> entityList = summaryRiskDao.findListByQuery(entity);
		PageInfo<SummaryRisk> pageInfo = new PageInfo<>(entityList);
		List<SummaryRiskVO> voList = new ArrayList<>();
		for (SummaryRisk summary : pageInfo.getList()) {
			SummaryRiskVO summaryVO = SummaryRiskVO.getVOFromEntity(summary);
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
	public SummaryRiskVO getById(String id) throws Exception {
		SummaryRisk entity = new SummaryRisk();
		entity.setId(id);
		List<SummaryRisk> list = summaryRiskDao.findListByQuery(entity);
		if (list != null && !list.isEmpty()) {
			return SummaryRiskVO.getVOFromEntity(list.get(0));
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
	public boolean save(SummaryRiskVO vo) throws Exception {
		SummaryRisk entity = new SummaryRisk();
		BeanUtils.copyProperties(vo, entity);
		entity.setId(idGenerator.createId());
		int result = summaryRiskDao.save(entity);
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
	public boolean update(SummaryRiskVO vo) throws Exception {
		SummaryRisk entity = new SummaryRisk();
		BeanUtils.copyProperties(vo, entity);
		int result = summaryRiskDao.update(entity);
		if (result > 0) {
			return true;
		}
		return false;
	}
}
