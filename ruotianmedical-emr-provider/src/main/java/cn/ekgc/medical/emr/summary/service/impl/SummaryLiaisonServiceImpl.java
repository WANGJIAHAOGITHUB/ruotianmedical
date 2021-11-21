package cn.ekgc.medical.emr.summary.service.impl;

import cn.ekgc.medical.base.pojo.vo.PageVO;
import cn.ekgc.medical.base.util.IdGenerator;
import cn.ekgc.medical.emr.summary.dao.SummaryLiaisonDao;
import cn.ekgc.medical.emr.summary.pojo.entity.SummaryLiaison;
import cn.ekgc.medical.emr.summary.pojo.vo.SummaryLiaisonVO;
import cn.ekgc.medical.emr.summary.service.SummaryLiaisonService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>若天医疗电子病历模块 - 病例概要联系人信息业务层接口实现类</b>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@Service("summaryLiaisonService")
@Transactional
public class SummaryLiaisonServiceImpl implements SummaryLiaisonService {
	@Autowired
	private SummaryLiaisonDao summaryLiaisonDao;
	@Autowired
	private IdGenerator idGenerator;

	/**
	 * 根据分页信息查询列表
	 * @param pageVO
	 * @param vo
	 * @return
	 */
	@Override
	public PageVO<SummaryLiaisonVO> queryByPage(PageVO<SummaryLiaisonVO> pageVO, SummaryLiaisonVO vo) throws Exception {
		SummaryLiaison entity = SummaryLiaison.getEntityFromVO(vo);
		// 开启分页过滤器
		PageHelper.startPage(pageVO.getPageNum(), pageVO.getPageSize());
		List<SummaryLiaison> entityList = summaryLiaisonDao.findListByQuery(entity);
		PageInfo<SummaryLiaison> pageInfo = new PageInfo<>(entityList);
		List<SummaryLiaisonVO> voList = new ArrayList<>();
		for (SummaryLiaison summary : pageInfo.getList()) {
			SummaryLiaisonVO summaryVO = SummaryLiaisonVO.getVOFromEntity(summary);
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
	public SummaryLiaisonVO getById(String id) throws Exception {
		SummaryLiaison entity = new SummaryLiaison();
		entity.setId(id);
		List<SummaryLiaison> list = summaryLiaisonDao.findListByQuery(entity);
		if (list != null && !list.isEmpty()) {
			return SummaryLiaisonVO.getVOFromEntity(list.get(0));
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
	public boolean save(SummaryLiaisonVO vo) throws Exception {
		SummaryLiaison entity = new SummaryLiaison();
		BeanUtils.copyProperties(vo, entity);
		entity.setId(idGenerator.createId());
		int result = summaryLiaisonDao.save(entity);
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
	public boolean update(SummaryLiaisonVO vo) throws Exception {
		SummaryLiaison entity = new SummaryLiaison();
		BeanUtils.copyProperties(vo, entity);
		int result = summaryLiaisonDao.update(entity);
		if (result > 0) {
			return true;
		}
		return false;
	}
}
