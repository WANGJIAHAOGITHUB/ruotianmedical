package cn.ekgc.medical.system.personnel.controller;

import cn.ekgc.medical.base.controller.BaseController;
import cn.ekgc.medical.base.pojo.enums.StatusEnum;
import cn.ekgc.medical.base.pojo.vo.LoginInfoVO;
import cn.ekgc.medical.base.pojo.vo.PageVO;
import cn.ekgc.medical.base.pojo.vo.QueryPageVO;
import cn.ekgc.medical.base.pojo.vo.ResponseVO;
import cn.ekgc.medical.base.util.MD5EncryptionUtil;
import cn.ekgc.medical.base.util.MapUtil;
import cn.ekgc.medical.base.util.TokenUtil;
import cn.ekgc.medical.base.util.ValidationUtil;
import cn.ekgc.medical.system.personnel.pojo.vo.PersonnelVO;
import cn.ekgc.medical.system.personnel.transport.PersonnelTransport;
import cn.hutool.core.util.StrUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * <b>若天医疗系统信息 - 系统人员信息控制层</b>
 * <p>
 *     系统人员信息控制层
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@Api(value = "若天医疗系统信息 - 系统人员信息控制层", tags = "若天医疗系统信息 - 系统人员信息控制层")
@RequestMapping("/system/personnel")
@RestController("personnelController")
public class PersonnelController extends BaseController {
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
	public ResponseVO getListByPage(@PathVariable("pageNum") Integer pageNum, @PathVariable("pageSize") Integer pageSize, @RequestBody PersonnelVO vo) throws Exception {
		// 先将参数封装为为一个传输对象
		QueryPageVO<PersonnelVO> queryPageVO = new QueryPageVO<>(vo, pageNum, pageSize);
		// 调用传输层传入后端
		PageVO<PersonnelVO> pageVO = personnelTransport.queryByPage(queryPageVO);
		return ResponseVO.getResponseSuccess(pageVO);
	}

	/**
	 * 根据 id 查询对象信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "根据 id 查询系统人员信息", httpMethod = "GET", protocols = "application/json")
	@GetMapping ("/id/{id}")
	public ResponseVO getById(@PathVariable("id") String id) throws Exception {
		if (!StrUtil.isBlank(id)) {
			PersonnelVO vo = personnelTransport.getById(id);
			return ResponseVO.getResponseSuccess(vo);
		}
		return ResponseVO.getResponseError("请填写有效信息");
	}

	/**
	 * 保存系统人员信息
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "保存系统人员信息", tags = "保存系统人员信息", httpMethod = "POST", protocols = "application/json")
	@PostMapping("/save")
	public ResponseVO save(@RequestBody PersonnelVO vo) throws Exception {
		String token = request.getHeader("Authorization");
		PersonnelVO personnelVO = personnelTransport.getToken(token);
		if (personnelVO != null) {
			if (vo != null && StrUtil.isNotBlank(vo.getName()) && StrUtil.isNotBlank(vo.getCellphone()) && StrUtil.isNotBlank(vo.getPassword())) {
				if (ValidationUtil.isCellphone(vo.getCellphone()) && ValidationUtil.isPassword(vo.getPassword()) && ValidationUtil.isIdCard(vo.getIdCard())) {
					if (personnelTransport.getByCellphone(vo.getCellphone()) == null && personnelTransport.getByIdCard(vo.getIdCard()) == null) {
						// 对登陆密码进行加密
						vo.setPassword(MD5EncryptionUtil.encrypt(vo.getPassword()));
						// 设置添加人
						vo.setCreateUser(personnelVO.getId());
						if (personnelTransport.save(vo)) {
							return ResponseVO.getResponseSuccess("保存成功！");
						}
						return ResponseVO.getResponseError("保存失败！");
					}
					return ResponseVO.getResponseSuccess("该手机号或者身份证号已被注册！");
				}
				return ResponseVO.getResponseError("输入格式错误！");
			}
			return ResponseVO.getResponseError("请输入信息再提交！");
		}
		return ResponseVO.getResponseUnauthorized();
	}

	/**
	 * 修改系统人员信息
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "修改系统人员信息", tags = "修改系统人员信息", httpMethod = "POST", protocols = "application/json")
	@PostMapping("/update")
	public ResponseVO update(@RequestBody PersonnelVO vo) throws Exception {
		String token = request.getHeader("Authorization");
		PersonnelVO personnelVO = personnelTransport.getToken(token);
		if (personnelVO != null) {
			if (vo != null && StrUtil.isNotBlank(vo.getName()) && StrUtil.isNotBlank(vo.getCellphone()) && StrUtil.isNotBlank(vo.getPassword())) {
				if (ValidationUtil.isCellphone(vo.getCellphone()) && ValidationUtil.isPassword(vo.getPassword()) && ValidationUtil.isIdCard(vo.getIdCard())) {
					if (personnelTransport.getById(vo.getId()) != null) {
						// 对登陆密码进行加密
						vo.setPassword(MD5EncryptionUtil.encrypt(vo.getPassword()));
						// 设置修改人信息
						vo.setCreateUser(personnelVO.getId());
						if (personnelTransport.update(vo)) {
							return ResponseVO.getResponseSuccess("修改成功！");
						}
						return ResponseVO.getResponseError("修改失败！");
					}
					return ResponseVO.getResponseError("信息输入有误！");
				}
				return ResponseVO.getResponseError("输入格式错误！");
			}
			return ResponseVO.getResponseError("请输入信息再提交！");
		}
		return ResponseVO.getResponseUnauthorized();
	}

	/**
	 * 用户登录验证
	 * @param loginInfoVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "用户登录验证", tags = "用户登录验证", httpMethod = "POST", protocols = "application/json")
	@PostMapping("/login")
	public ResponseVO userLogin(@RequestBody LoginInfoVO loginInfoVO) throws Exception {
		if (ValidationUtil.isCellphone(loginInfoVO.getCellphone()) && ValidationUtil.isPassword(loginInfoVO.getPassword())) {
			// 使用手机号码查询用户信息
			PersonnelVO vo = personnelTransport.getByCellphone(loginInfoVO.getCellphone());
			if (MD5EncryptionUtil.encrypt(loginInfoVO.getPassword()).equals(vo.getPassword())) {
				// 判断用户状态
				if (vo.getStatus().equals(StatusEnum.STATUS_ENABLE.getCode())) {
					Map<String, Object> claimMap = new HashMap<>();
					claimMap.put("id", vo.getId());
					String token = TokenUtil.createToken(claimMap, loginInfoVO.getExpireTime());
					personnelTransport.saveTokenToRedis(new LoginInfoVO(token, vo, loginInfoVO.getExpireTime()));
				}
			}
			return ResponseVO.getResponseError("手机号或密码输入有误！");
		}
		return ResponseVO.getResponseError("输入信息有误！");
	}
}
