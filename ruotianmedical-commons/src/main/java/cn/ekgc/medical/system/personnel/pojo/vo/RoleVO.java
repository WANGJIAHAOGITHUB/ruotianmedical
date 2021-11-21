package cn.ekgc.medical.system.personnel.pojo.vo;

import cn.ekgc.medical.base.pojo.vo.BaseVO;
import cn.ekgc.medical.system.personnel.pojo.entity.Role;
import cn.ekgc.medical.system.menu.pojo.entity.Menu;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
@ApiModel("若天医疗系统信息 - 角色信息实体类")
public class RoleVO extends BaseVO {
	private static final long serialVersionUID = 6646003262154375439L;
	@ApiModelProperty(name = "主键")
	private String id;                      // 主键
	@ApiModelProperty(name = "角色名称")
	private String name;                    // 角色名称
	@ApiModelProperty(name = "角色编码")
	private String code;                    // 角色编码
	@ApiModelProperty(name = "角色菜单集合")
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
	 * 根据实体对象获取视图对象
	 * @param division
	 * @return
	 */
	public static RoleVO getVOFromEntity(Role division) {
		RoleVO vo = new RoleVO();
		BeanUtils.copyProperties(division, vo);
		return vo;
	}
}
