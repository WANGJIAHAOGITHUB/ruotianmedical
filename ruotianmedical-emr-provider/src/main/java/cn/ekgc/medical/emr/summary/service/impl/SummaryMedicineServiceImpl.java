package cn.ekgc.medical.emr.summary.service.impl;

import cn.ekgc.medical.base.pojo.vo.PageVO;
import cn.ekgc.medical.base.util.IdGenerator;
import cn.ekgc.medical.emr.summary.dao.SummaryMedicineDao;
import cn.ekgc.medical.emr.summary.pojo.entity.SummaryMedicine;
import cn.ekgc.medical.emr.summary.pojo.vo.SummaryMedicineVO;
import cn.ekgc.medical.emr.summary.service.SummaryMedicineService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>若天医疗电子病历模块 - 病例概要用药信息业务层接口实现类</b>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@Service("summaryMedicineService")
@Transactional
public class SummaryMedicineServiceImpl implements SummaryMedicineService {
	@Autowired
	private SummaryMedicineDao summaryMedicineDao;
	@Autowired
	private IdGenerator idGenerator;

	/**
	 * 根据分页信息查询列表
	 * @param pageVO
	 * @param vo
	 * @return
	 */
	@Override
	public PageVO<SummaryMedicineVO> queryByPage(PageVO<SummaryMedicineVO> pageVO, SummaryMedicineVO vo) throws Exception {
		SummaryMedicine entity = SummaryMedicine.getEntityFromVO(vo);
		// 开启分页过滤器
		PageHelper.startPage(pageVO.getPageNum(), pageVO.getPageSize());
		List<SummaryMedicine> entityList = summaryMedicineDao.findListByQuery(entity);
		PageInfo<SummaryMedicine> pageInfo = new PageInfo<>(entityList);
		List<SummaryMedicineVO> voList = new ArrayList<>();
		for (SummaryMedicine summary : pageInfo.getList()) {
			SummaryMedicineVO summaryVO = SummaryMedicineVO.getVOFromEntity(summary);
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
	public SummaryMedicineVO getById(String id) throws Exception {
		SummaryMedicine entity = new SummaryMedicine();
		entity.setId(id);
		List<SummaryMedicine> list = summaryMedicineDao.findListByQuery(entity);
		if (list != null && !list.isEmpty()) {
			return SummaryMedicineVO.getVOFromEntity(list.get(0));
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
	public boolean save(SummaryMedicineVO vo) throws Exception {
		SummaryMedicine entity = new SummaryMedicine();
		BeanUtils.copyProperties(vo, entity);
		entity.setId(idGenerator.createId());
		int result = summaryMedicineDao.save(entity);
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
	public boolean update(SummaryMedicineVO vo) throws Exception {
		SummaryMedicine entity = new SummaryMedicine();
		BeanUtils.copyProperties(vo, entity);
		int result = summaryMedicineDao.update(entity);
		if (result > 0) {
			return true;
		}
		return false;
	}
}
