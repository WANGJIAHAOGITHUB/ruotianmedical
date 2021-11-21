package cn.ekgc.medical.system.personnel.service;

import cn.ekgc.medical.base.pojo.vo.PageVO;
import cn.ekgc.medical.system.personnel.pojo.vo.PersonnelVO;

/**
 * <b>若天医疗系统信息 - 系统人员信息数据业务层接口</b>
 * <p>
 *     系统人员信息数据业务层接口
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
public interface PersonnelService {
	/**
	 * 根据分页信息查询列表
	 * @param pageVO
	 * @param vo
	 * @return
	 */
	PageVO<PersonnelVO> queryByPage(PageVO<PersonnelVO> pageVO, PersonnelVO vo) throws Exception;

	/**
	 * 根据 id 查询对象信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	PersonnelVO getById(String id) throws Exception;

	/**
	 * 保存系统人员信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	boolean save(PersonnelVO vo) throws Exception;

	/**
	 * 修改系统人员信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	boolean update(PersonnelVO vo) throws Exception;

	/**
	 * 修改系统人员信息
	 * @param cellphone
	 * @return
	 * @throws Exception
	 */
	PersonnelVO getByCellphone(String cellphone) throws Exception;

	/**
	 * 修改系统人员信息
	 * @param idCard
	 * @return
	 * @throws Exception
	 */
	PersonnelVO getByIdCard(String idCard) throws Exception;

	/**
	 * 从 reids 中获取用户信息
	 * @param token
	 * @return
	 * @throws Exception
	 */
	PersonnelVO getToken(String token) throws Exception;

	/**
	 * 保存 token 到 redis 中
	 * @param vo
	 * @param expireTime
	 * @param token
	 * @throws Exception
	 */
	void saveTokenToRedis(PersonnelVO vo, Long expireTime, String token) throws Exception;
}
