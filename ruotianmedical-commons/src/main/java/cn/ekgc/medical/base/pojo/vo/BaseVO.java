package cn.ekgc.medical.base.pojo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * <b>系统信息类 - 基础视图信息类</b>
 * <p>
 *     基础视图信息类：包含属性<br/>
 *     1、系统状态：用来控制用户状态是否可用<br/>
 *     2、创建人：该实体信息的创建人
 *     3、创建时间：创建该条记录的时间
 *     4、修改人：记录该条记录被谁修改
 *     5、修改时间：该条记录修改时间
 *     <b>所有的系统视图信息类，都必须继承与本基础视图信息类</b>
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@ApiModel("系统信息类 - 基础视图信息类")
public class BaseVO implements Serializable {
	private static final long serialVersionUID = -1289637793756488485L;
	@ApiModelProperty(name = "系统状态: 0-禁用 1-启用", example = "1")
	private String status;                          // 系统状态: 0-禁用 1-启用
	@ApiModelProperty(name = "创建人")
	private String createUser;                      // 创建人
	@ApiModelProperty(name = "创建时间")
	private Date createTime;                        // 创建时间
	@ApiModelProperty(name = "修改人")
	private String updateUser;                      // 修改人
	@ApiModelProperty(name = "修改时间")
	private Date updateTime;                        // 修改时间

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
