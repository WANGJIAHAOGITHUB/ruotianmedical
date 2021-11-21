package cn.ekgc.medical.emr.summary.service.impl;

import cn.ekgc.medical.base.pojo.vo.PageVO;
import cn.ekgc.medical.base.util.IdGenerator;
import cn.ekgc.medical.emr.summary.dao.SummaryDao;
import cn.ekgc.medical.emr.summary.pojo.entity.Summary;
import cn.ekgc.medical.emr.summary.pojo.vo.SummaryVO;
import cn.ekgc.medical.emr.summary.service.SummaryService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>若天医疗电子病历模块 - 病例概要信息业务层接口实现类</b>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@Service("summaryService")
@Transactional
public class SummaryServiceImpl implements SummaryService {
	@Autowired
	private SummaryDao summaryDao;
	@Autowired
	private IdGenerator idGenerator;

	/**
	 * 根据分页信息查询列表
	 * @param pageVO
	 * @param vo
	 * @return
	 */
	@Override
	public PageVO<SummaryVO> queryByPage(PageVO<SummaryVO> pageVO, SummaryVO vo) throws Exception {
		Summary entity = Summary.getEntityFromVO(vo);
		// 开启分页过滤器
		PageHelper.startPage(pageVO.getPageNum(), pageVO.getPageSize());
		List<Summary> entityList = summaryDao.findListByQuery(entity);
		PageInfo<Summary> pageInfo = new PageInfo<>(entityList);
		List<SummaryVO> voList = new ArrayList<>();
		for (Summary summary : pageInfo.getList()) {
			SummaryVO summaryVO = SummaryVO.getVOFromEntity(summary);
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
	public SummaryVO getById(String id) throws Exception {
		Summary entity = new Summary();
		entity.setId(id);
		List<Summary> list = summaryDao.findListByQuery(entity);
		if (list != null && !list.isEmpty()) {
			return SummaryVO.getVOFromEntity(list.get(0));
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
	public boolean save(SummaryVO vo) throws Exception {
		Summary entity = new Summary();
		BeanUtils.copyProperties(vo, entity);
		entity.setId(idGenerator.createId());
		int result = summaryDao.insert(entity);
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
	public boolean update(SummaryVO vo) throws Exception {
		Summary entity = new Summary();
		BeanUtils.copyProperties(vo, entity);
		int result = summaryDao.modify(entity);
		if (result > 0) {
			return true;
		}
		return false;
	}
}
