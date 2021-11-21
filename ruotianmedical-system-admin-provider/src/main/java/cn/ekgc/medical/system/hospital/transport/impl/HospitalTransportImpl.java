package cn.ekgc.medical.system.hospital.transport.impl;

import cn.ekgc.medical.base.pojo.vo.PageVO;
import cn.ekgc.medical.base.pojo.vo.QueryPageVO;
import cn.ekgc.medical.system.hospital.pojo.vo.HospitalVO;
import cn.ekgc.medical.system.hospital.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <b>若天医疗系统信息 - 医院信息数据传输层接口实现类</b>
 * <p>
 *     医院信息数据传输层接口实现类
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@RestController("HospitalTransport")
@RequestMapping("/system/hospital/trans")
public class HospitalTransportImpl {
	@Autowired
	private HospitalService hospitalService;
	/**
	 * 根据分页信息查询列表
	 * @param queryPageVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/page")
	public PageVO<HospitalVO> queryByPage(@RequestBody QueryPageVO<HospitalVO> queryPageVO) throws Exception {
		PageVO<HospitalVO> pageVO = queryPageVO.getPageVO();
		HospitalVO vo = queryPageVO.getQuery();
		return hospitalService.queryByPage(pageVO, vo);
	}

	/**
	 * 根据 id 查询对象信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/id")
	public HospitalVO getById(@RequestParam String id) throws Exception {
		return hospitalService.getById(id);
	}

	/**
	 * 根据 code 查询对象信息
	 * @param code
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/code")
	public HospitalVO getByCode(@RequestParam String code) throws Exception {
		return hospitalService.getByCode(code);
	}

	/**
	 * 保存数据字典信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/save")
	public boolean save(@RequestBody HospitalVO vo) throws Exception {
		return hospitalService.save(vo);
	}

	/**
	 * 修改数据字典信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/update")
	public boolean update(@RequestBody HospitalVO vo) throws Exception {
		return hospitalService.update(vo);
	}
}
