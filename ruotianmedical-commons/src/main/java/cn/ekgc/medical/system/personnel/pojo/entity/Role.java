package cn.ekgc.medical.system.personnel.pojo.entity;

import cn.ekgc.medical.base.pojo.entity.BaseEntity;
import cn.ekgc.medical.system.personnel.pojo.vo.RoleVO;
import cn.ekgc.medical.system.menu.pojo.entity.Menu;
import org.springframework.beans.BeanUtils;

import java.util.List;

/**
 * <b>若天医疗系统信息 - 角色信息实体类</b>
 * <p>
 *     角色信息
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
public class Role extends BaseEntity {
	private static final long serialVersionUID = -1757921879771649634L;
	private String id;                      // 主键
	private String name;                    // 角色名称
	private String code;                    // 角色编码
	private List<Menu> menuList;            // 角色菜单集合

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public List<Menu> getMenuList() {
		return menuList;
	}

	public void setMenuList(List<Menu> menuList) {
		this.menuList = menuList;
	}

	/**
	 * 根据视图对象获取实体对象
	 * @param vo
	 * @return
	 */
	public static Role getEntityFromVO(RoleVO vo) {
		Role entity = new Role();
		BeanUtils.copyProperties(vo, entity);
		return entity;
	}
}
