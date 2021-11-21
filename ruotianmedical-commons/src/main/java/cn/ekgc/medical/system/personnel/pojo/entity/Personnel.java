package cn.ekgc.medical.system.personnel.pojo.entity;

import cn.ekgc.medical.base.pojo.entity.BaseEntity;
import cn.ekgc.medical.system.department.pojo.entity.Department;
import cn.ekgc.medical.system.dictionary.pojo.entity.Dictionary;
import cn.ekgc.medical.system.personnel.pojo.vo.PersonnelVO;
import org.springframework.beans.BeanUtils;

/**
 * <b>若天医疗系统信息 - 系统人员信息实体类</b>
 * <p>
 *     系统人员信息
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
public class Personnel extends BaseEntity {
	private static final long serialVersionUID = 6825712611683790602L;
	private String id;                                      // 主键
	private String name;                                    // 姓名
	private String cellphone;                               // 手机号码
	private String password;                                // 登陆密码: MD5加密
	private String identity;                                // 人员身份：0-行政人员，1-医护人员
	private Role role;                                      // 人员职务
	private Department department;                          // 所属部门
	private String idCard;                                  // 身份证号码
	private Dictionary techPosition;                        // 专业技术职务
	private Dictionary eduBackground;                        // 学历
	private String major;                                   // 所学专业
	private Dictionary techPositionRank;                    // 专业技术职务等级
	private Dictionary position;                            // 职务

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

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public Dictionary getTechPosition() {
		return techPosition;
	}

	public void setTechPosition(Dictionary techPosition) {
		this.techPosition = techPosition;
	}

	public Dictionary getEduBackground() {
		return eduBackground;
	}

	public void setEduBackground(Dictionary eduBackground) {
		this.eduBackground = eduBackground;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public Dictionary getTechPositionRank() {
		return techPositionRank;
	}

	public void setTechPositionRank(Dictionary techPositionRank) {
		this.techPositionRank = techPositionRank;
	}

	public Dictionary getPosition() {
		return position;
	}

	public void setPosition(Dictionary position) {
		this.position = position;
	}

	/**
	 * 将视图想转换为实体对象
	 * @param vo
	 * @return
	 */
	public static Personnel getEntityFromVO(PersonnelVO vo) {
		Personnel entity = new Personnel();
		BeanUtils.copyProperties(vo, entity);
		if (vo.getRole() != null) {
			Role role = new Role();
			role.setId(vo.getRole().getId());
			role.setName(vo.getRole().getName());
			role.setCode(vo.getRole().getCode());
			entity.setRole(role);
		}
		if (vo.getDepartment() != null) {
			Department department = new Department();
			department.setId(vo.getDepartment().getId());
			department.setName(vo.getDepartment().getName());
			department.setCode(vo.getDepartment().getCode());
			entity.setDepartment(department);
		}
		if (vo.getTechPosition() != null) {
			Dictionary dictionary = new Dictionary();
			dictionary.setId(vo.getTechPosition().getId());
			dictionary.setName(vo.getTechPosition().getName());
			dictionary.setCode(vo.getTechPosition().getCode());
			entity.setTechPosition(dictionary);
		}
		if (vo.getEduBackground() != null) {
			Dictionary dictionary = new Dictionary();
			dictionary.setId(vo.getEduBackground().getId());
			dictionary.setName(vo.getEduBackground().getName());
			dictionary.setCode(vo.getEduBackground().getCode());
			entity.setEduBackground(dictionary);
		}
		if (vo.getTechPositionRank() != null) {
			Dictionary dictionary = new Dictionary();
			dictionary.setId(vo.getTechPositionRank().getId());
			dictionary.setName(vo.getTechPositionRank().getName());
			dictionary.setCode(vo.getTechPositionRank().getCode());
			entity.setTechPositionRank(dictionary);
		}
		if (vo.getPosition() != null) {
			Dictionary dictionary = new Dictionary();
			dictionary.setId(vo.getPosition().getId());
			dictionary.setName(vo.getPosition().getName());
			dictionary.setCode(vo.getPosition().getCode());
			entity.setPosition(dictionary);
		}
		return entity;
	}
}
