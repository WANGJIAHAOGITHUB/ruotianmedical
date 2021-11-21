package cn.ekgc.medical.system.dictionary.service.impl;

import cn.ekgc.medical.base.pojo.vo.PageVO;
import cn.ekgc.medical.base.util.IdGenerator;
import cn.ekgc.medical.system.dictionary.dao.DictionaryDao;
import cn.ekgc.medical.system.dictionary.pojo.entity.Dictionary;
import cn.ekgc.medical.system.dictionary.pojo.vo.DictionaryVO;
import cn.ekgc.medical.system.dictionary.service.DictionaryService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>若天医疗系统信息 - 数据字典信息业务层层接口实现类</b>
 * <p>
 *     数据字典信息业务层层接口实现类
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@Service("dictionaryService")
@Transactional
public class DictionaryServiceImpl implements DictionaryService {
	@Autowired
	private DictionaryDao dictionaryDao;
	@Autowired
	private IdGenerator idGenerator;
	/**
	 * 根据分页信息查询列表
	 * @param pageVO
	 * @param vo
	 * @return
	 */
	@Override
	public PageVO<DictionaryVO> queryByPage(PageVO<DictionaryVO> pageVO, DictionaryVO vo) throws Exception {
		Dictionary entity = Dictionary.getEntityFromVO(vo);
		// 开启分页过滤器
		PageHelper.startPage(pageVO.getPageNum(), pageVO.getPageSize());
		List<Dictionary> entityList = dictionaryDao.findListByQuery(entity);
		PageInfo<Dictionary> pageInfo = new PageInfo<>(entityList);
		List<DictionaryVO> voList = new ArrayList<>();
		for (Dictionary dictionary : pageInfo.getList()) {
			DictionaryVO dictionaryVO = DictionaryVO.getVOFromEntity(dictionary);
			voList.add(dictionaryVO);
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
	public DictionaryVO getById(String id) throws Exception {
		Dictionary entity = new Dictionary();
		entity.setId(id);
		List<Dictionary> list = dictionaryDao.findListByQuery(entity);
		if (list != null && !list.isEmpty()) {
			return DictionaryVO.getVOFromEntity(list.get(0));
		}
		return null;
	}

	/**
	 * 根据 code 查询对象信息
	 * @param code
	 * @return
	 * @throws Exception
	 */
	@Override
	public DictionaryVO getByCode(String code) throws Exception {
		Dictionary entity = new Dictionary();
		entity.setCode(code);
		List<Dictionary> list = dictionaryDao.findListByQuery(entity);
		if (list != null && !list.isEmpty()) {
			return DictionaryVO.getVOFromEntity(list.get(0));
		}
		return null;
	}

	/**
	 * 保存数据字典信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean save(DictionaryVO vo) throws Exception {
		Dictionary entity = new Dictionary();
		BeanUtils.copyProperties(vo, entity);
		entity.setId(idGenerator.createId());
		int result = dictionaryDao.insert(entity);
		if (result > 0) {
			return true;
		}
		return false;
	}

	/**
	 * 修改数据字典信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean update(DictionaryVO vo) throws Exception {
		Dictionary entity = new Dictionary();
		BeanUtils.copyProperties(vo, entity);
		int result = dictionaryDao.modify(entity);
		if (result > 0) {
			return true;
		}
		return false;
	}
}
