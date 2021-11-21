package cn.ekgc.medical.system.menu.pojo.vo;

import cn.ekgc.medical.base.pojo.vo.BaseVO;
import cn.ekgc.medical.system.personnel.pojo.vo.RoleVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * <b>若天医疗系统信息 - 系统人员菜单信息视图类</b>
 * <p>
 *     系统人员菜单信息
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@ApiModel("若天医疗系统信息 - 系统人员菜单信息视图类")
public class MenuVO extends BaseVO {
	private static final long serialVersionUID = 5806403879313751775L;
	@ApiModelProperty(name = "主键")
	private String id;                          // 主键
	@ApiModelProperty(name = "上级菜单")
	private MenuVO superior;                      // 上级菜单
	@ApiModelProperty(name = "菜单名称")
	private String name;                        // 菜单名称
	@ApiModelProperty(name = "菜单编码")
	private String code;                        // 菜单编码
	@ApiModelProperty(name = "操作连接地址")
	private String url;                         // 操作连接地址
	@ApiModelProperty(name = "菜单图标")
	private String icon;                        // 菜单图标
	@ApiModelProperty(name = "菜单顺序")
	private Integer sort;                       // 菜单顺序
	@ApiModelProperty(name = "下级菜单列表")
	private List<MenuVO> childrenList;          // 下级菜单列表
	@ApiModelProperty(name = "角色信息列表")
	private List<RoleVO> roleList;              // 角色信息列表
}
