package cn.ekgc.medical.system.department.pojo.entity;

import cn.ekgc.medical.base.pojo.entity.BaseEntity;
import cn.ekgc.medical.system.department.pojo.vo.DepartmentVO;
import org.springframework.beans.BeanUtils;

import java.util.List;

/**
 * <b>若天医疗系统信息 - 部门信息实体类</b>
 * <p>
 *     部门信息实体类
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
public class Department extends BaseEntity {
	private static final long serialVersionUID = 1730147831495990842L;
	private String id;                          // 主键
	private Department superior;                // 上级部门
	private String name;                        // 数据名称
	private String code;                        // 数据编码
	private List<Department> subordinate;       // 下级部门列表

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Department getSuperior() {
		return superior;
	}

	public void setSuperior(Department superior) {
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

	public List<Department> getSubordinate() {
		return subordinate;
	}

	public void setSubordinate(List<Department> subordinate) {
		this.subordinate = subordinate;
	}

	/**
	 * 根据视图对象获取实体对象
	 * @param vo
	 * @return
	 */
	public static Department getEntityFromVO(DepartmentVO vo) {
		Department entity = new Department();
		BeanUtils.copyProperties(vo, entity);
		if (vo.getSuperior() != null) {
			Department superior = new Department();
			superior.setName(vo.getSuperior().getName());
			superior.setId(vo.getSuperior().getId());
			superior.setCode(vo.getSuperior().getCode());
			entity.setSuperior(superior);
		}
		return entity;
	}
}
