package cn.ekgc.medical.system.personnel.pojo.vo;

import cn.ekgc.medical.base.pojo.vo.BaseVO;
import cn.ekgc.medical.system.department.pojo.entity.Department;
import cn.ekgc.medical.system.department.pojo.vo.DepartmentVO;
import cn.ekgc.medical.system.dictionary.pojo.entity.Dictionary;
import cn.ekgc.medical.system.dictionary.pojo.vo.DictionaryVO;
import cn.ekgc.medical.system.personnel.pojo.entity.Personnel;
import cn.ekgc.medical.system.personnel.pojo.entity.Role;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.BeanUtils;

/**
 * <b>若天医疗系统信息 - 系统人员信息视图类</b>
 * <p>
 *     系统人员信息
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@ApiModel("若天医疗系统信息 - 系统人员信息视图类")
public class PersonnelVO extends BaseVO {
	private static final long serialVersionUID = 4688261075779843831L;
	@ApiModelProperty(name = "主键")
	private String id;                                      // 主键
	@ApiModelProperty(name = "姓名")
	private String name;                                    // 姓名
	@ApiModelProperty(name = "手机号码")
	private String cellphone;                               // 手机号码
	@ApiModelProperty(name = "登陆密码: MD5加密")
	private String password;                                // 登陆密码: MD5加密
	@ApiModelProperty(name = "人员身份：0-行政人员，1-医护人员")
	private String identity;                                // 人员身份：0-行政人员，1-医护人员
	@ApiModelProperty(name = "人员职务")
	private RoleVO role;                                    // 人员职务
	@ApiModelProperty(name = "所属部门")
	private DepartmentVO department;                        // 所属部门
	@ApiModelProperty(name = "身份证号码")
	private String idCard;                                  // 身份证号码
	@ApiModelProperty(name = "专业技术职务")
	private DictionaryVO techPosition;                      // 专业技术职务
	@ApiModelProperty(name = "学历")
	private DictionaryVO eduBackground;                     // 学历
	@ApiModelProperty(name = "所学专业")
	private String major;                                   // 所学专业
	@ApiModelProperty(name = "专业技术职务等级")
	private DictionaryVO techPositionRank;                  // 专业技术职务等级
	@ApiModelProperty(name = "职务")
	private DictionaryVO position;                          // 职务

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

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public RoleVO getRole() {
		return role;
	}

	public void setRole(RoleVO role) {
		this.role = role;
	}

	public DepartmentVO getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentVO department) {
		this.department = department;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public DictionaryVO getTechPosition() {
		return techPosition;
	}

	public void setTechPosition(DictionaryVO techPosition) {
		this.techPosition = techPosition;
	}

	public DictionaryVO getEduBackground() {
		return eduBackground;
	}

	public void setEduBackground(DictionaryVO eduBackground) {
		this.eduBackground = eduBackground;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public DictionaryVO getTechPositionRank() {
		return techPositionRank;
	}

	public void setTechPositionRank(DictionaryVO techPositionRank) {
		this.techPositionRank = techPositionRank;
	}

	public DictionaryVO getPosition() {
		return position;
	}

	public void setPosition(DictionaryVO position) {
		this.position = position;
	}

	/**
	 * 将实体对象转换为视图对象
	 * @param entity
	 * @return
	 */
	public static PersonnelVO getVOFromEntity(Personnel entity) {
		PersonnelVO vo = new PersonnelVO();
		BeanUtils.copyProperties(entity, vo);
		if (entity.getRole() != null) {
			RoleVO roleVO = new RoleVO();
			roleVO.setId(entity.getRole().getId());
			roleVO.setName(entity.getRole().getName());
			roleVO.setCode(entity.getRole().getCode());
			vo.setRole(roleVO);
		}
		if (entity.getDepartment() != null) {
			DepartmentVO departmentVO = new DepartmentVO();
			departmentVO.setId(entity.getDepartment().getId());
			departmentVO.setName(entity.getDepartment().getName());
			departmentVO.setCode(entity.getDepartment().getCode());
			vo.setDepartment(departmentVO);
		}
		if (entity.getTechPosition() != null) {
			DictionaryVO dictionaryVO = new DictionaryVO();
			dictionaryVO.setId(entity.getTechPosition().getId());
			dictionaryVO.setName(entity.getTechPosition().getName());
			dictionaryVO.setCode(entity.getTechPosition().getCode());
			vo.setTechPosition(dictionaryVO);
		}
		if (entity.getEduBackground() != null) {
			DictionaryVO dictionaryVO = new DictionaryVO();
			dictionaryVO.setId(entity.getEduBackground().getId());
			dictionaryVO.setName(entity.getEduBackground().getName());
			dictionaryVO.setCode(entity.getEduBackground().getCode());
			vo.setEduBackground(dictionaryVO);
		}
		if (entity.getTechPositionRank() != null) {
			DictionaryVO dictionaryVO = new DictionaryVO();
			dictionaryVO.setId(entity.getTechPositionRank().getId());
			dictionaryVO.setName(entity.getTechPositionRank().getName());
			dictionaryVO.setCode(entity.getTechPositionRank().getCode());
			vo.setTechPositionRank(dictionaryVO);
		}
		if (entity.getPosition() != null) {
			DictionaryVO dictionaryVO = new DictionaryVO();
			dictionaryVO.setId(entity.getPosition().getId());
			dictionaryVO.setName(entity.getPosition().getName());
			dictionaryVO.setCode(entity.getPosition().getCode());
			vo.setPosition(dictionaryVO);
		}
		return vo;
	}
}
