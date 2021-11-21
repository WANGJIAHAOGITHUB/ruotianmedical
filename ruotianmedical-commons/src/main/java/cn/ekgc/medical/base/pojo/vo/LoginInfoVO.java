package cn.ekgc.medical.base.pojo.vo;

import cn.ekgc.medical.base.util.BaseConstants;
import cn.ekgc.medical.system.personnel.pojo.vo.PersonnelVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <b>系统信息类 - 用户登陆信息类</b>
 * <p>
 *     用户登陆信息类
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@ApiModel("系统信息类 - 用户登陆信息类")
public class LoginInfoVO extends BaseVO{
	@ApiModelProperty(name = "用户token")
	private String token;                           // token
	@ApiModelProperty(name = "登录用户手机号")
	private String cellphone;                       // 登录用户手机号
	@ApiModelProperty(name = "登录用户密码")
	private String password;                        // 登录用户密码
	@ApiModelProperty(name = "当前登录用户视图对象")
	private PersonnelVO vo;                         // 当前登录用户视图对象
	@ApiModelProperty(name = "用户过期时间")
	private Long expireTime;                        // 用户过期时间

	public LoginInfoVO(){}

	public LoginInfoVO(String token, PersonnelVO vo, Long expireTime) {
		this.token = token;
		this.vo = vo;
		if (expireTime == null && expireTime <= 0) {
			this.expireTime = BaseConstants.EXPIRE_SECOND;
		} else {
			this.expireTime = expireTime;
		}
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public PersonnelVO getVo() {
		return vo;
	}

	public void setVo(PersonnelVO vo) {
		this.vo = vo;
	}

	public Long getExpireTime() {
		return expireTime;
	}

	public void setExpireTime(Long expireTime) {
		this.expireTime = expireTime;
	}
}
