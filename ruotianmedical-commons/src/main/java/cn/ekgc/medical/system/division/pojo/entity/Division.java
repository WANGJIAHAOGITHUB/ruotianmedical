package cn.ekgc.medical.system.division.pojo.entity;

import cn.ekgc.medical.base.pojo.entity.BaseEntity;
import cn.ekgc.medical.system.division.pojo.vo.DivisionVO;
import org.springframework.beans.BeanUtils;

import java.util.List;

/**
 * <b>若天医疗系统信息 - 行政区划信息实体类</b>
 * <p>
 *     行政区划信息实体类
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
public class Division extends BaseEntity {
	private static final long serialVersionUID = 991983945480141144L;
	private String id;                          // 主键
	private Division superior;                  // 上级行政区划
	private String name;                        // 行政区划名称
	private String code;                        // 行政区划编码
	private List<Division> subordinate;         // 下级行政区划列表

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Division getSuperior() {
		return superior;
	}

	public void setSuperior(Division superior) {
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

	public List<Division> getSubordinate() {
		return subordinate;
	}

	public void setSubordinate(List<Division> subordinate) {
		this.subordinate = subordinate;
	}

	/**
	 * 根据视图对象获取实体对象
	 * @param vo
	 * @return
	 */
	public static Division getEntityFromVO(DivisionVO vo) {
		Division entity = new Division();
		BeanUtils.copyProperties(vo, entity);
		if (vo.getSuperior() != null) {
			Division superior = new Division();
			superior.setName(vo.getSuperior().getName());
			superior.setId(vo.getSuperior().getId());
			superior.setCode(vo.getSuperior().getCode());
			entity.setSuperior(superior);
		}
		return entity;
	}
}
