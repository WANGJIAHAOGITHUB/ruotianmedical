package cn.ekgc.medical.emr.summary.service.impl;

import cn.ekgc.medical.base.pojo.vo.PageVO;
import cn.ekgc.medical.base.util.IdGenerator;
import cn.ekgc.medical.emr.summary.dao.SummaryPastTraumaDao;
import cn.ekgc.medical.emr.summary.pojo.entity.SummaryPastTrauma;
import cn.ekgc.medical.emr.summary.pojo.vo.SummaryPastTraumaVO;
import cn.ekgc.medical.emr.summary.service.SummaryPastTraumaService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>若天医疗电子病历模块 - 病例概要既往史（外伤）信息业务层接口实现类</b>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@Service("summaryPastTraumaService")
@Transactional
public class SummaryPastTraumaServiceImpl implements SummaryPastTraumaService {
	@Autowired
	private SummaryPastTraumaDao summaryPastTraumaDao;
	@Autowired
	private IdGenerator idGenerator;

	/**
	 * 根据分页信息查询列表
	 * @param pageVO
	 * @param vo
	 * @return
	 */
	@Override
	public PageVO<SummaryPastTraumaVO> queryByPage(PageVO<SummaryPastTraumaVO> pageVO, SummaryPastTraumaVO vo) throws Exception {
		SummaryPastTrauma entity = SummaryPastTrauma.getEntityFromVO(vo);
		// 开启分页过滤器
		PageHelper.startPage(pageVO.getPageNum(), pageVO.getPageSize());
		List<SummaryPastTrauma> entityList = summaryPastTraumaDao.findListByQuery(entity);
		PageInfo<SummaryPastTrauma> pageInfo = new PageInfo<>(entityList);
		List<SummaryPastTraumaVO> voList = new ArrayList<>();
		for (SummaryPastTrauma summary : pageInfo.getList()) {
			SummaryPastTraumaVO summaryVO = SummaryPastTraumaVO.getVOFromEntity(summary);
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
	public SummaryPastTraumaVO getById(String id) throws Exception {
		SummaryPastTrauma entity = new SummaryPastTrauma();
		entity.setId(id);
		List<SummaryPastTrauma> list = summaryPastTraumaDao.findListByQuery(entity);
		if (list != null && !list.isEmpty()) {
			return SummaryPastTraumaVO.getVOFromEntity(list.get(0));
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
	public boolean save(SummaryPastTraumaVO vo) throws Exception {
		SummaryPastTrauma entity = new SummaryPastTrauma();
		BeanUtils.copyProperties(vo, entity);
		entity.setId(idGenerator.createId());
		int result = summaryPastTraumaDao.save(entity);
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
	public boolean update(SummaryPastTraumaVO vo) throws Exception {
		SummaryPastTrauma entity = new SummaryPastTrauma();
		BeanUtils.copyProperties(vo, entity);
		int result = summaryPastTraumaDao.update(entity);
		if (result > 0) {
			return true;
		}
		return false;
	}
}
