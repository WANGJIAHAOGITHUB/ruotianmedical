package cn.ekgc.medical.emr.summary.service.impl;

import cn.ekgc.medical.base.pojo.vo.PageVO;
import cn.ekgc.medical.base.util.IdGenerator;
import cn.ekgc.medical.emr.summary.dao.SummaryCommDao;
import cn.ekgc.medical.emr.summary.pojo.entity.SummaryComm;
import cn.ekgc.medical.emr.summary.pojo.vo.SummaryCommVO;
import cn.ekgc.medical.emr.summary.service.SummaryCommService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>若天医疗电子病历模块 - 病例概要通信信息业务层接口实现类</b>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@Service("summaryCommService")
@Transactional
public class SummaryCommServiceImpl implements SummaryCommService {
	@Autowired
	private SummaryCommDao summaryCommDao;
	@Autowired
	private IdGenerator idGenerator;

	/**
	 * 根据分页信息查询列表
	 * @param pageVO
	 * @param vo
	 * @return
	 */
	@Override
	public PageVO<SummaryCommVO> queryByPage(PageVO<SummaryCommVO> pageVO, SummaryCommVO vo) throws Exception {
		SummaryComm entity = SummaryComm.getEntityFromVO(vo);
		// 开启分页过滤器
		PageHelper.startPage(pageVO.getPageNum(), pageVO.getPageSize());
		List<SummaryComm> entityList = summaryCommDao.findListByQuery(entity);
		PageInfo<SummaryComm> pageInfo = new PageInfo<>(entityList);
		List<SummaryCommVO> voList = new ArrayList<>();
		for (SummaryComm summary : pageInfo.getList()) {
			SummaryCommVO summaryVO = SummaryCommVO.getVOFromEntity(summary);
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
	public SummaryCommVO getById(String id) throws Exception {
		SummaryComm entity = new SummaryComm();
		entity.setId(id);
		List<SummaryComm> list = summaryCommDao.findListByQuery(entity);
		if (list != null && !list.isEmpty()) {
			return SummaryCommVO.getVOFromEntity(list.get(0));
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
	public boolean save(SummaryCommVO vo) throws Exception {
		SummaryComm entity = new SummaryComm();
		BeanUtils.copyProperties(vo, entity);
		entity.setId(idGenerator.createId());
		int result = summaryCommDao.save(entity);
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
	public boolean update(SummaryCommVO vo) throws Exception {
		SummaryComm entity = new SummaryComm();
		BeanUtils.copyProperties(vo, entity);
		int result = summaryCommDao.update(entity);
		if (result > 0) {
			return true;
		}
		return false;
	}
}
