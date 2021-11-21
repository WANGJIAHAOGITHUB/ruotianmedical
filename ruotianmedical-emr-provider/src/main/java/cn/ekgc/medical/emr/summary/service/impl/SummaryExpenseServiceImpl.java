package cn.ekgc.medical.emr.summary.service.impl;

import cn.ekgc.medical.base.pojo.vo.PageVO;
import cn.ekgc.medical.base.util.IdGenerator;
import cn.ekgc.medical.emr.summary.dao.SummaryExpenseDao;
import cn.ekgc.medical.emr.summary.pojo.entity.SummaryExpense;
import cn.ekgc.medical.emr.summary.pojo.vo.SummaryExpenseVO;
import cn.ekgc.medical.emr.summary.service.SummaryExpenseService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>若天医疗电子病历模块 - 病例概要收费信息业务层接口实现类</b>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@Service("summaryExpenseService")
@Transactional
public class SummaryExpenseServiceImpl implements SummaryExpenseService {
	@Autowired
	private SummaryExpenseDao summaryExpenseDao;
	@Autowired
	private IdGenerator idGenerator;

	/**
	 * 根据分页信息查询列表
	 * @param pageVO
	 * @param vo
	 * @return
	 */
	@Override
	public PageVO<SummaryExpenseVO> queryByPage(PageVO<SummaryExpenseVO> pageVO, SummaryExpenseVO vo) throws Exception {
		SummaryExpense entity = SummaryExpense.getEntityFromVO(vo);
		// 开启分页过滤器
		PageHelper.startPage(pageVO.getPageNum(), pageVO.getPageSize());
		List<SummaryExpense> entityList = summaryExpenseDao.findListByQuery(entity);
		PageInfo<SummaryExpense> pageInfo = new PageInfo<>(entityList);
		List<SummaryExpenseVO> voList = new ArrayList<>();
		for (SummaryExpense summary : pageInfo.getList()) {
			SummaryExpenseVO summaryVO = SummaryExpenseVO.getVOFromEntity(summary);
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
	public SummaryExpenseVO getById(String id) throws Exception {
		SummaryExpense entity = new SummaryExpense();
		entity.setId(id);
		List<SummaryExpense> list = summaryExpenseDao.findListByQuery(entity);
		if (list != null && !list.isEmpty()) {
			return SummaryExpenseVO.getVOFromEntity(list.get(0));
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
	public boolean save(SummaryExpenseVO vo) throws Exception {
		SummaryExpense entity = new SummaryExpense();
		BeanUtils.copyProperties(vo, entity);
		entity.setId(idGenerator.createId());
		int result = summaryExpenseDao.save(entity);
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
	public boolean update(SummaryExpenseVO vo) throws Exception {
		SummaryExpense entity = new SummaryExpense();
		BeanUtils.copyProperties(vo, entity);
		int result = summaryExpenseDao.update(entity);
		if (result > 0) {
			return true;
		}
		return false;
	}
}
