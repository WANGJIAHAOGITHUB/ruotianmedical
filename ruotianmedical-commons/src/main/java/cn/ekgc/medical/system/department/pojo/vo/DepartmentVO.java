package cn.ekgc.medical.system.department.pojo.vo;

import cn.ekgc.medical.base.pojo.vo.BaseVO;
import cn.ekgc.medical.system.department.pojo.entity.Department;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.BeanUtils;

import java.util.List;

/**
 * <b>若天医疗系统信息 - 部门信息视图类</b>
 * <p>
 *     部门信息视图类
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@ApiModel("若天医疗系统信息 - 部门信息视图类")
public class DepartmentVO extends BaseVO {
	private static final long serialVersionUID = -159831668180267310L;
	@ApiModelProperty(name = "主键")
	private String id;                          // 主键
	@ApiModelProperty(name = "上级部门")
	private DepartmentVO superior;              // 上级部门
	@ApiModelProperty(name = "数据名称")
	private String name;                        // 数据名称
	@ApiModelProperty(name = "数据编码")
	private String code;                        // 数据编码
	@ApiModelProperty(name = "下级部门列表")
	private List<DepartmentVO> subordinate;     // 下级部门列表

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public DepartmentVO getSuperior() {
		return superior;
	}

	public void setSuperior(DepartmentVO superior) {
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

	public List<DepartmentVO> getSubordinate() {
		return subordinate;
	}

	public void setSubordinate(List<DepartmentVO> subordinate) {
		this.subordinate = subordinate;
	}

	/**
	 * 根据实体对象获取视图对象
	 * @param department
	 * @return
	 */
	public static DepartmentVO getVOFromEntity(Department department) {
		DepartmentVO vo = new DepartmentVO();
		BeanUtils.copyProperties(department, vo);
		if (department.getSuperior() != null) {
			DepartmentVO superior = new DepartmentVO();
			superior.setId(department.getSuperior().getId());
			superior.setName(department.getSuperior().getName());
			superior.setCode(department.getSuperior().getCode());
			vo.setSuperior(superior);
		}
		return vo;
	}
}
