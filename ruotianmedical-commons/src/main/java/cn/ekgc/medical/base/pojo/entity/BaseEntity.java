package cn.ekgc.medical.base.pojo.entity;


import java.io.Serializable;
import java.util.Date;

/**
 * <b>系统信息类 - 基础信息类</b>
 * <p>
 *     基础信息类：包含属性<br/>
 *     1、系统状态：用来控制用户状态是否可用<br/>
 *     2、创建人：该实体信息的创建人
 *     3、创建时间：创建该条记录的时间
 *     4、修改人：记录该条记录被谁修改
 *     5、修改时间：该条记录修改时间
 *     <b>所有的系统实体类，都必须继承与本基础信息类</b>
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
public class BaseEntity implements Serializable {
	private static final long serialVersionUID = 8289316932140559789L;
	private String status;                          // 系统状态: 0-禁用 1-启用, 起始默认值为：1
	private String createUser;                      // 创建人
	private Date createTime;                        // 创建时间
	private String updateUser;                      // 修改人
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
