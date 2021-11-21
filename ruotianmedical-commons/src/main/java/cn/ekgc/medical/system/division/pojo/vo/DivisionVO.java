package cn.ekgc.medical.system.division.pojo.vo;

import cn.ekgc.medical.base.pojo.vo.BaseVO;
import cn.ekgc.medical.system.division.pojo.entity.Division;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.BeanUtils;

import java.util.List;

/**
 * <b>若天医疗系统信息 - 行政区划信息视图类</b>
 * <p>
 *     行政区划信息视图类
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@ApiModel("若天医疗系统信息 - 行政区划信息实体类")
public class DivisionVO extends BaseVO {
	private static final long serialVersionUID = 7068380731628006104L;
	@ApiModelProperty(name = "主键")
	private String id;                          // 主键
	@ApiModelProperty(name = "上级部门")
	private DivisionVO superior;              // 上级行政区划
	@ApiModelProperty(name = "数据名称")
	private String name;                        // 行政区划名称
	@ApiModelProperty(name = "数据编码")
	private String code;                        // 行政区划编码
	@ApiModelProperty(name = "下级部门列表")
	private List<DivisionVO> subordinate;     // 下级行政区划列表

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public DivisionVO getSuperior() {
		return superior;
	}

	public void setSuperior(DivisionVO superior) {
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

	public List<DivisionVO> getSubordinate() {
		return subordinate;
	}

	public void setSubordinate(List<DivisionVO> subordinate) {
		this.subordinate = subordinate;
	}

	/**
	 * 根据实体对象获取视图对象
	 * @param division
	 * @return
	 */
	public static DivisionVO getVOFromEntity(Division division) {
		DivisionVO vo = new DivisionVO();
		BeanUtils.copyProperties(division, vo);
		if (division.getSuperior() != null) {
			DivisionVO superior = new DivisionVO();
			superior.setId(division.getSuperior().getId());
			superior.setName(division.getSuperior().getName());
			superior.setCode(division.getSuperior().getCode());
			vo.setSuperior(superior);
		}
		return vo;
	}
}
