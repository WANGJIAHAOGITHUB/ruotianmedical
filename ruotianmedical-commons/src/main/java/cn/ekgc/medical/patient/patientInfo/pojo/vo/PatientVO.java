package cn.ekgc.medical.patient.patientInfo.pojo.vo;

import cn.ekgc.medical.base.pojo.vo.BaseVO;
import cn.ekgc.medical.patient.patientInfo.pojo.entity.Patient;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.BeanUtils;

import java.util.Date;

/**
 * <b>若天医疗患者信息 - 患者个人信息表视图信息</b>
 * @author WangJiahao
 * @version 1.0.0
 */
@ApiModel("若天医疗患者信息 - 患者个人信息表视图信息")
public class PatientVO extends BaseVO {
	private static final long serialVersionUID = 2071030800009717125L;
	@ApiModelProperty("主键")
	private String id;                              // 主键
	@ApiModelProperty("患者姓名")
	private String name;                            // 患者姓名
	@ApiModelProperty("病历编号")
	private String emrNo;                           // 病历编号
	@ApiModelProperty("患者证件类别")
	private String noCat;                           // 患者证件类别
	@ApiModelProperty("患者证件号码")
	private String no;                              // 患者证件号码
	@ApiModelProperty("患者证件生效日期")
	private Date noEffDate;                         // 患者证件生效日期
	@ApiModelProperty("患者证件失效日期")
	private Date noExpDate;                         // 患者证件失效日期
	@ApiModelProperty("ABO血型")
	private String aboBlood;                        // ABO血型
	@ApiModelProperty("RH血型")
	private String rhBlood;                         // RH血型
	@ApiModelProperty("性别")
	private String gender;                          // 性别
	@ApiModelProperty("国籍")
	private String nationality;                     // 国籍
	@ApiModelProperty("民族")
	private String ethnic;                          // 民族
	@ApiModelProperty("婚姻状况")
	private String marital;                         // 婚姻状况
	@ApiModelProperty("职业")
	private String occCode;                         // 职业
	@ApiModelProperty("出生日期")
	private Date birthday;                          // 出生日期
	@ApiModelProperty("出生地")
	private String birthPlace;                      // 出生地
	@ApiModelProperty("工作单位名称")
	private String workUnitName;                    // 工作单位名称
	@ApiModelProperty("标识地址类别")
	private String addrCat;                         // 标识地址类别
	@ApiModelProperty("地址-省（自治区、直辖市）")
	private String provence;                        // 地址-省（自治区、直辖市）
	@ApiModelProperty("地址-市（地区）")
	private String city;                            // 地址-市（地区）
	@ApiModelProperty("地址-县（区）")
	private String district;                        // 地址-县（区）
	@ApiModelProperty("地址-乡（镇、街道办事处）")
	private String subdistrict;                     // 地址-乡（镇、街道办事处）
	@ApiModelProperty("地址-村（街、路、弄等）")
	private String village;                         // 地址-村（街、路、弄等）
	@ApiModelProperty("地址-门牌号码")
	private String houseNo;                         // 地址-门牌号码
	@ApiModelProperty("邮政编码")
	private String zipCode;                         // 邮政编码

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

	public String getEmrNo() {
		return emrNo;
	}

	public void setEmrNo(String emrNo) {
		this.emrNo = emrNo;
	}

	public String getNoCat() {
		return noCat;
	}

	public void setNoCat(String noCat) {
		this.noCat = noCat;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public Date getNoEffDate() {
		return noEffDate;
	}

	public void setNoEffDate(Date noEffDate) {
		this.noEffDate = noEffDate;
	}

	public Date getNoExpDate() {
		return noExpDate;
	}

	public void setNoExpDate(Date noExpDate) {
		this.noExpDate = noExpDate;
	}

	public String getAboBlood() {
		return aboBlood;
	}

	public void setAboBlood(String aboBlood) {
		this.aboBlood = aboBlood;
	}

	public String getRhBlood() {
		return rhBlood;
	}

	public void setRhBlood(String rhBlood) {
		this.rhBlood = rhBlood;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getEthnic() {
		return ethnic;
	}

	public void setEthnic(String ethnic) {
		this.ethnic = ethnic;
	}

	public String getMarital() {
		return marital;
	}

	public void setMarital(String marital) {
		this.marital = marital;
	}

	public String getOccCode() {
		return occCode;
	}

	public void setOccCode(String occCode) {
		this.occCode = occCode;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public String getWorkUnitName() {
		return workUnitName;
	}

	public void setWorkUnitName(String workUnitName) {
		this.workUnitName = workUnitName;
	}

	public String getAddrCat() {
		return addrCat;
	}

	public void setAddrCat(String addrCat) {
		this.addrCat = addrCat;
	}

	public String getProvence() {
		return provence;
	}

	public void setProvence(String provence) {
		this.provence = provence;
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

	/**
	 * 根据实体对象获得视图对象
	 * @param entity
	 * @return
	 */
	public static PatientVO getVOFromEntity(Patient entity) {
		PatientVO vo = new PatientVO();
		BeanUtils.copyProperties(entity, vo);
		return vo;
	}
}