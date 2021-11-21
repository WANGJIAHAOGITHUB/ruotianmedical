package cn.ekgc.medical.system.menu.pojo.entity;

import cn.ekgc.medical.base.pojo.entity.BaseEntity;
import cn.ekgc.medical.system.personnel.pojo.entity.Role;

import java.util.List;

/**
 * <b>若天医疗系统信息 - 系统人员菜单信息实体类</b>
 * <p>
 *     系统人员菜单信息
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
public class Menu extends BaseEntity {
	private static final long serialVersionUID = -2003652836838834276L;
	private String id;                      // 主键
	private Menu superior;                  // 上级菜单
	private String name;                    // 菜单名称
	private String code;                    // 菜单编码
	private String url;                     // 操作连接地址
	private String icon;                    // 菜单图标
	private Integer sort;                   // 菜单顺序
	private List<Menu> childrenList;        // 下级菜单列表
	private List<Role> roleList;            // 角色信息列表

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Menu getSuperior() {
		return superior;
	}

	public void setSuperior(Menu superior) {
		this.superior = superior;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public List<Menu> getChildrenList() {
		return childrenList;
	}

	public void setChildrenList(List<Menu> childrenList) {
		this.childrenList = childrenList;
	}

	public List<Role> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<Role> roleList) {
		this.roleList = roleList;
	}
}
