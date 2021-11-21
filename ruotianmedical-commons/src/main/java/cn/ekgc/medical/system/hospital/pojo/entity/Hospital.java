package cn.ekgc.medical.system.hospital.pojo.entity;

import cn.ekgc.medical.base.pojo.entity.BaseEntity;
import cn.ekgc.medical.system.hospital.pojo.vo.HospitalVO;
import org.springframework.beans.BeanUtils;


/**
 * <b>若天医疗系统信息 - 医院信息表实体信息</b>
 * @author WangJiahao
 * @version 1.0.0
 */
public class Hospital extends BaseEntity {
	private static final long serialVersionUID = 1908207698942258046L;
	private String id;                                  // 主键
    private String name;                                // 医院名称
    private String orgCode;                             // 医院代码
    private String charge;                              // 负责人
    private String province;                            // 所在省份
    private String city;                                // 所在城市
    private String district;                            // 所在区县
    private String subdistrict;                         // 所在乡（镇、街道办事处）
    private String village;                             // 村（街、路、弄等）
    private String houseNo;                             // 门牌号码
    private String zipCode;                             // 邮政编码
    private String phone;                               // 联系电话
    private String email;                               // 电子邮件

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

	public String getOrgCode() {
		return orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getCharge() {
		return charge;
	}

	public void setCharge(String charge) {
		this.charge = charge;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getSubdistrict() {
		return subdistrict;
	}

	public void setSubdistrict(String subdistrict) {
		this.subdistrict = subdistrict;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 根据视图对象获取实体对象
	 * @param vo
	 * @return
	 */
	public static Hospital getEntityFromVO(HospitalVO vo) {
		Hospital entity = new Hospital();
		BeanUtils.copyProperties(vo, entity);
		return entity;
	}
}