package cn.ekgc.medical.system.hospital.pojo.vo;

import cn.ekgc.medical.base.pojo.vo.BaseVO;
import cn.ekgc.medical.system.hospital.pojo.entity.Hospital;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.BeanUtils;

/**
 * <b>若天医疗系统信息 - 医院信息视图类</b>
 * <p>
 *     医院信息视图类
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@ApiModel("若天医疗电子病例模块 - 医院信息视图类")
public class HospitalVO extends BaseVO {
	private static final long serialVersionUID = -2112444406751793214L;
	@ApiModelProperty("主键")
	private String id;                                  // 主键
	@ApiModelProperty("医院名称")
	private String name;                                // 医院名称
	@ApiModelProperty("医院代码")
	private String orgCode;                             // 医院代码
	@ApiModelProperty("负责人")
	private String charge;                              // 负责人
	@ApiModelProperty("所在省份")
	private String province;                            // 所在省份
	@ApiModelProperty("所在城市")
	private String city;                                // 所在城市
	@ApiModelProperty("所在区县")
	private String district;                            // 所在区县
	@ApiModelProperty("所在乡（镇、街道办事处）")
	private String subdistrict;                         // 所在乡（镇、街道办事处）
	@ApiModelProperty("村（街、路、弄等）")
	private String village;                             // 村（街、路、弄等）
	@ApiModelProperty("门牌号码")
	private String houseNo;                             // 门牌号码
	@ApiModelProperty("邮政编码")
	private String zipCode;                             // 邮政编码
	@ApiModelProperty("联系电话")
	private String phone;                               // 联系电话
	@ApiModelProperty("电子邮件")
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
	 * 根据实体对象获取视图对象
	 * @param entity
	 * @return
	 */
	public static HospitalVO getVOFromEntity(Hospital entity) {
		HospitalVO vo = new HospitalVO();
		BeanUtils.copyProperties(entity, vo);
		return vo;
	}
}