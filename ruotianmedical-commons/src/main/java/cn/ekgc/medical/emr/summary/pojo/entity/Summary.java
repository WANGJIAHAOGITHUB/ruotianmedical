package cn.ekgc.medical.emr.summary.pojo.entity;

import cn.ekgc.medical.base.pojo.entity.BaseEntity;
import cn.ekgc.medical.emr.summary.pojo.vo.SummaryVO;
import org.springframework.beans.BeanUtils;

import java.util.Date;

/**
 * <b>若天医疗电子病例模块 - 病例概要信息实体类</b>
 * <p>
 *     病例概要总表基本信息
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
public class Summary extends BaseEntity {
	private static final long serialVersionUID = -548165638015569647L;
	private String id;                          // 主键
	private String docName;                     // 文档标识名称
	private String docCatCode;                  // 文档标识类别代码
	private String docOrgName;                  // 文档标识管理机构名称
	private String docOrgCode;                  // 文档标识管理机构代码
	private String docNo;                       // 文档标识号码
	private Date docEffDate;                    // 文档标识生效日期
	private Date docExpDate;                    // 文档标识失效日期
	private String srvNoCatCode;                // 标识号-类别代码
	private String srvNo;                       // 标识号-号码
	private Date srvNoEffDate;                  // 标识号-生效日期
	private Date srvNoExpDate;                  // 标识号-失效日期
	private String srvObject;                   // 姓名-标识对象
	private String srvObjectCode;               // 姓名-标识对象代码
	private String srvName;                     // 姓名
	private String srvPatientCatCode;           // 病人类型
	private String aboBloodCode;                // ABO血型
	private String rhBloodCode;                 // RH血型
	private String genderCode;                  // 性别代码
	private Integer age;                        // 年龄
	private String nationality;                 // 国籍代码
	private String ethnicCode;                  // 民族代码
	private String maritalCode;                 // 婚姻状况类别代码
	private String occName;                     // 职业编码系统名称
	private String occCode;                     // 职业编码代码
	private Date birthday;                      // 出生日期
	private String birthPlace;                  // 出生地
	private String addrUnitName;                // 工作单位名称
	private String addrCatCode;                 // 标识地址类别的代码
	private String addrProvence;                // 地址-省（自治区、直辖市）
	private String addrCity;                    // 地址-市
	private String addrDistrict;                // 地址-县
	private String addrSubdistrict;             // 地址-乡
	private String addrVillage;                 // 地址-村
	private String addrHouseNo;                 // 门牌号
	private String addrZipCode;                 // 邮政编码
	private String addrDivisionCode;            // 行政区划代码
	private String eventName;                   // 卫生事件名称
	private String eventCatCode;                // 卫生事件分类代码
	private Date eventBeginTime;                // 卫生事件开始时间
	private Date eventEndTime;                  // 卫生事件结束时间
	private String eventAddress;                // 卫生事件发生地点
	private String eventPlace;                  // 卫生事件发生场所
	private String eventParticipant;            // 卫生事件参与方
	private String eventReason;                 // 卫生事件发生原因
	private String eventResult;                 // 卫生事件结局

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public String getDocCatCode() {
		return docCatCode;
	}

	public void setDocCatCode(String docCatCode) {
		this.docCatCode = docCatCode;
	}

	public String getDocOrgName() {
		return docOrgName;
	}

	public void setDocOrgName(String docOrgName) {
		this.docOrgName = docOrgName;
	}

	public String getDocOrgCode() {
		return docOrgCode;
	}

	public void setDocOrgCode(String docOrgCode) {
		this.docOrgCode = docOrgCode;
	}

	public String getDocNo() {
		return docNo;
	}

	public void setDocNo(String docNo) {
		this.docNo = docNo;
	}

	public Date getDocEffDate() {
		return docEffDate;
	}

	public void setDocEffDate(Date docEffDate) {
		this.docEffDate = docEffDate;
	}

	public Date getDocExpDate() {
		return docExpDate;
	}

	public void setDocExpDate(Date docExpDate) {
		this.docExpDate = docExpDate;
	}

	public String getSrvNoCatCode() {
		return srvNoCatCode;
	}

	public void setSrvNoCatCode(String srvNoCatCode) {
		this.srvNoCatCode = srvNoCatCode;
	}

	public String getSrvNo() {
		return srvNo;
	}

	public void setSrvNo(String srvNo) {
		this.srvNo = srvNo;
	}

	public Date getSrvNoEffDate() {
		return srvNoEffDate;
	}

	public void setSrvNoEffDate(Date srvNoEffDate) {
		this.srvNoEffDate = srvNoEffDate;
	}

	public Date getSrvNoExpDate() {
		return srvNoExpDate;
	}

	public void setSrvNoExpDate(Date srvNoExpDate) {
		this.srvNoExpDate = srvNoExpDate;
	}

	public String getSrvObject() {
		return srvObject;
	}

	public void setSrvObject(String srvObject) {
		this.srvObject = srvObject;
	}

	public String getSrvObjectCode() {
		return srvObjectCode;
	}

	public void setSrvObjectCode(String srvObjectCode) {
		this.srvObjectCode = srvObjectCode;
	}

	public String getSrvName() {
		return srvName;
	}

	public void setSrvName(String srvName) {
		this.srvName = srvName;
	}

	public String getSrvPatientCatCode() {
		return srvPatientCatCode;
	}

	public void setSrvPatientCatCode(String srvPatientCatCode) {
		this.srvPatientCatCode = srvPatientCatCode;
	}

	public String getAboBloodCode() {
		return aboBloodCode;
	}

	public void setAboBloodCode(String aboBloodCode) {
		this.aboBloodCode = aboBloodCode;
	}

	public String getRhBloodCode() {
		return rhBloodCode;
	}

	public void setRhBloodCode(String rhBloodCode) {
		this.rhBloodCode = rhBloodCode;
	}

	public String getGenderCode() {
		return genderCode;
	}

	public void setGenderCode(String genderCode) {
		this.genderCode = genderCode;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getEthnicCode() {
		return ethnicCode;
	}

	public void setEthnicCode(String ethnicCode) {
		this.ethnicCode = ethnicCode;
	}

	public String getMaritalCode() {
		return maritalCode;
	}

	public void setMaritalCode(String maritalCode) {
		this.maritalCode = maritalCode;
	}

	public String getOccName() {
		return occName;
	}

	public void setOccName(String occName) {
		this.occName = occName;
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

	public String getAddrUnitName() {
		return addrUnitName;
	}

	public void setAddrUnitName(String addrUnitName) {
		this.addrUnitName = addrUnitName;
	}

	public String getAddrCatCode() {
		return addrCatCode;
	}

	public void setAddrCatCode(String addrCatCode) {
		this.addrCatCode = addrCatCode;
	}

	public String getAddrProvence() {
		return addrProvence;
	}

	public void setAddrProvence(String addrProvence) {
		this.addrProvence = addrProvence;
	}

	public String getAddrCity() {
		return addrCity;
	}

	public void setAddrCity(String addrCity) {
		this.addrCity = addrCity;
	}

	public String getAddrDistrict() {
		return addrDistrict;
	}

	public void setAddrDistrict(String addrDistrict) {
		this.addrDistrict = addrDistrict;
	}

	public String getAddrSubdistrict() {
		return addrSubdistrict;
	}

	public void setAddrSubdistrict(String addrSubdistrict) {
		this.addrSubdistrict = addrSubdistrict;
	}

	public String getAddrVillage() {
		return addrVillage;
	}

	public void setAddrVillage(String addrVillage) {
		this.addrVillage = addrVillage;
	}

	public String getAddrHouseNo() {
		return addrHouseNo;
	}

	public void setAddrHouseNo(String addrHouseNo) {
		this.addrHouseNo = addrHouseNo;
	}

	public String getAddrZipCode() {
		return addrZipCode;
	}

	public void setAddrZipCode(String addrZipCode) {
		this.addrZipCode = addrZipCode;
	}

	public String getAddrDivisionCode() {
		return addrDivisionCode;
	}

	public void setAddrDivisionCode(String addrDivisionCode) {
		this.addrDivisionCode = addrDivisionCode;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getEventCatCode() {
		return eventCatCode;
	}

	public void setEventCatCode(String eventCatCode) {
		this.eventCatCode = eventCatCode;
	}

	public Date getEventBeginTime() {
		return eventBeginTime;
	}

	public void setEventBeginTime(Date eventBeginTime) {
		this.eventBeginTime = eventBeginTime;
	}

	public Date getEventEndTime() {
		return eventEndTime;
	}

	public void setEventEndTime(Date eventEndTime) {
		this.eventEndTime = eventEndTime;
	}

	public String getEventAddress() {
		return eventAddress;
	}

	public void setEventAddress(String eventAddress) {
		this.eventAddress = eventAddress;
	}

	public String getEventPlace() {
		return eventPlace;
	}

	public void setEventPlace(String eventPlace) {
		this.eventPlace = eventPlace;
	}

	public String getEventParticipant() {
		return eventParticipant;
	}

	public void setEventParticipant(String eventParticipant) {
		this.eventParticipant = eventParticipant;
	}

	public String getEventReason() {
		return eventReason;
	}

	public void setEventReason(String eventReason) {
		this.eventReason = eventReason;
	}

	public String getEventResult() {
		return eventResult;
	}

	public void setEventResult(String eventResult) {
		this.eventResult = eventResult;
	}

	/**
	 * 根据视图对象获取实体对象
	 * @param vo
	 * @return
	 */
	public static Summary getEntityFromVO(SummaryVO vo) {
		Summary entity = new Summary();
		BeanUtils.copyProperties(vo, entity);
		return entity;
	}
}
