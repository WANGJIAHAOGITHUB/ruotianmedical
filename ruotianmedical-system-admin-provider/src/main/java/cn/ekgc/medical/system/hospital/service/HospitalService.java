package cn.ekgc.medical.system.hospital.service;

import cn.ekgc.medical.base.pojo.vo.PageVO;
import cn.ekgc.medical.system.hospital.pojo.vo.HospitalVO;

/**
 * <b>若天医疗系统信息 - 医院信息数据业务层接口</b>
 * @author WangJiahao
 * @version 1.0.0
 */
public interface HospitalService {
	/**
	 * 根据分页信息查询列表
	 * @param pageVO
	 * @param vo
	 * @return
	 */
	PageVO<HospitalVO> queryByPage(PageVO<HospitalVO> pageVO, HospitalVO vo) throws Exception;

	/**
	 * 根据 id 查询对象信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	HospitalVO getById(String id) throws Exception;

	/**
	 * 根据 code 查询对象信息
	 * @param orgCode
	 * @return
	 * @throws Exception
	 */
	HospitalVO getByCode(String orgCode) throws Exception;

	/**
	 * 保存信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	boolean save(HospitalVO vo) throws Exception;

	/**
	 * 修改信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	boolean update(HospitalVO vo) throws Exception;
}
