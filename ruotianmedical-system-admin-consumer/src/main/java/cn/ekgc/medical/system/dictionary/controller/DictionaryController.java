package cn.ekgc.medical.system.dictionary.controller;

import cn.ekgc.medical.base.controller.BaseController;
import cn.ekgc.medical.base.pojo.vo.PageVO;
import cn.ekgc.medical.base.pojo.vo.QueryPageVO;
import cn.ekgc.medical.base.pojo.vo.ResponseVO;
import cn.ekgc.medical.system.dictionary.pojo.vo.DictionaryVO;
import cn.ekgc.medical.system.dictionary.transport.DictionaryTransport;
import cn.ekgc.medical.system.personnel.pojo.vo.PersonnelVO;
import cn.ekgc.medical.system.personnel.transport.PersonnelTransport;
import cn.hutool.core.util.StrUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <b>若天医疗系统信息 - 数据字典信息控制层</b>
 * <p>
 *     数据字典信息控制层
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@Api(value = "若天医疗系统信息 - 数据字典信息控制层", tags = "若天医疗系统信息 - 数据字典信息控制层")
@RestController("dictionaryController")
@RequestMapping("/system/dictionary")
public class DictionaryController extends BaseController {
	@Autowired
	private DictionaryTransport dictionaryTransport;
	@Autowired
	private PersonnelTransport personnelTransport;

	/**
	 * 根据分页信息查询列表
	 * @param pageNum
	 * @param pageSize
	 * @param vo
	 * @return
	 */
	@ApiOperation(value = "根据分页信息查询列表", httpMethod = "POST", protocols = "application/json")
	@PostMapping("/page/{pageNum}/{pageSize}")
	public ResponseVO getListByPage(@PathVariable("pageNum") Integer pageNum, @PathVariable("pageSize") Integer pageSize, @RequestBody DictionaryVO vo) throws Exception {
		// 先将参数封装为为一个传输对象
		QueryPageVO<DictionaryVO> queryPageVO = new QueryPageVO<>(vo, pageNum, pageSize);
		// 调用传输层传入后端
		PageVO<DictionaryVO> pageVO = dictionaryTransport.queryByPage(queryPageVO);
		return ResponseVO.getResponseSuccess(pageVO);
	}

	/**
	 * 根据 id 查询对象信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "根据 id 查询数据字典信息", httpMethod = "GET", protocols = "application/json")
	@GetMapping ("/id/{id}")
	public ResponseVO getById(@PathVariable("id") String id) throws Exception {
		if (!StrUtil.isBlank(id)) {
			DictionaryVO vo = dictionaryTransport.getById(id);
			return ResponseVO.getResponseSuccess(vo);
		}
		return ResponseVO.getResponseError("请填写信息");
	}

	/**
	 * 根据 code 查询对象信息
	 * @param code
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "根据 code 查询数据字典信息", httpMethod = "GET", protocols = "application/json")
	@GetMapping ("/code/{code}")
	public ResponseVO getByCode(@PathVariable("code") String code) throws Exception {
		if (!StrUtil.isBlank(code)) {
			DictionaryVO vo = dictionaryTransport.getByCode(code);
			return ResponseVO.getResponseSuccess(vo);
		}
		return ResponseVO.getResponseError("请填写信息");
	}

	/**
	 * 保存数据字典信息
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "保存数据字典信息", tags = "保存数据字典信息", httpMethod = "POST", protocols = "application/json")
	@PostMapping("/save")
	public ResponseVO save(@RequestBody DictionaryVO vo) throws Exception {
		String token = request.getHeader("Authorization");
		PersonnelVO personnelVO = personnelTransport.getToken(token);
		if (personnelVO != null) {
			if (vo != null && StrUtil.isBlank(vo.getName()) && StrUtil.isBlank(vo.getCode())) {
				if (vo.getSuperior() == null || dictionaryTransport.getByCode(vo.getSuperior().getCode()) != null) {
					if (dictionaryTransport.getByCode(vo.getCode()) == null) {
						if (dictionaryTransport.save(vo)) {
							return ResponseVO.getResponseSuccess("保存成功");
						}
						return ResponseVO.getResponseError("保存失败！");
					}
					return ResponseVO.getResponseError("该编码已被占用！");
				}
				return ResponseVO.getResponseError("该父级编码无效！");
			}
			return ResponseVO.getResponseError("请输入信息再提交！");
		}
		return ResponseVO.getResponseUnauthorized();
	}

	/**
	 * 修改数据字典信息
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "修改数据字典信息", tags = "修改数据字典信息", httpMethod = "POST", protocols = "application/json")
	@PostMapping("/update")
	public ResponseVO update(@RequestBody DictionaryVO vo) throws Exception {
		String token = request.getHeader("Authorization");
		PersonnelVO personnelVO = personnelTransport.getToken(token);
		if (personnelVO != null) {
			if (vo != null && StrUtil.isBlank(vo.getId())) {
				if (vo.getSuperior() == null || dictionaryTransport.getByCode(vo.getSuperior().getCode()) != null) {
					if (dictionaryTransport.getByCode(vo.getCode()) == null || dictionaryTransport.getByCode(vo.getCode()).getCode().equals(vo.getCode())) {
						if (dictionaryTransport.update(vo)) {
							return ResponseVO.getResponseSuccess("修改成功！");
						}
						return ResponseVO.getResponseError("修改失败！");
					}
					return ResponseVO.getResponseError("该编码已被占用！");
				}
				return ResponseVO.getResponseError("该父级编码无效！");
			}
			return ResponseVO.getResponseError("请输入正确信息再进行更改！");
		}
		return ResponseVO.getResponseUnauthorized();
	}
}
