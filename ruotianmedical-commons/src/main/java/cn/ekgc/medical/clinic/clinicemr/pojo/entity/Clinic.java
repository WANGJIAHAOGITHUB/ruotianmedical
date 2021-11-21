package cn.ekgc.medical.clinic.clinicemr.pojo.entity;

import cn.ekgc.medical.base.pojo.entity.BaseEntity;
import cn.ekgc.medical.clinic.clinicemr.pojo.vo.ClinicVO;
import org.springframework.beans.BeanUtils;

import java.util.Date;

/**
 * <b>若天医疗门诊 - 门（急）诊病历数据信息表实体信息</b>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
public class Clinic extends BaseEntity {
    private static final long serialVersionUID = 8908586394455583032L;
    private String id;                      // 主键
    private String docName;                      // 文档标识-名称
    private String docCatCode;                      // 文档标识-类别代码
    private String docOrgName;                      // 文档标识-管理机构名称
    private String docOrgCode;                      // 文档标识-管理机构组织机构代码（法人代码）
    private String docNo;                      // 文档标识-号码
    private Date docEffDate;                      // 文档标识-生效日期
    private Date docExpDate;                      // 文档标识-失效日期
    private String srvNoCatCode;                      // 标识号-类别代码
    private String srvNo;                      // 标识号-号码
    private Date srvNoEffDate;                      // 标识号-生效日期
    private Date srvNoExpDate;                      // 标识号-失效日期
    private String srvNoOrgName;                      // 姓名-标识对象
    private String srvObj;                      // 姓名-标识对象
    private String srvObjCode;                      // 姓名-标识对象代码
    private String srvName;                      // 姓名
    private String srvPatientCatCode;                      // 病人类型代码
    private String genderCode;                      // 性别代码
    private Integer age;                      // 年龄（岁）
    private String nationality;                      // 国籍代码
    private String ethnicCode;                      // 民族代码
    private String maritalCode;                      // 婚姻状况类别代码
    private String occName;                      // 职业编码系统名称
    private String occCode;                      // 职业代码
    private Date birthday;                      // 出生日期
    private String birthPlace;                      // 出生地
    private String addrUnitName;                      // 工作单位名称
    private String addrCatCode;                      // 标识地址类别的代码
    private String addrProvence;                      // 地址-省（自治区、直辖市）
    private String addrCity;                      // 地址-市（地区）
    private String addrDistrict;                      // 地址-县（区）
    private String addrSubdistrict;                      // 地址-乡（镇、街道办事处）
    private String addrVillage;                      // 地址-村（街、路、弄等）
    private String addrHouseNo;                      // 地址-门牌号码
    private String addrZipCode;                      // 邮政编码
    private String addrDivisionCode;                      // 行政区划代码
    private String orgName;                      // 机构名称
    private String orgCode;                      // 机构组织机构代码
    private String orgCharge;                      // 机构负责人（法人）
    private String orgAddress;                      // 机构地址
    private String orgOfficeName;                      // 科室名称
    private String orgRole;                      // 机构角色
    private String orgRoleCode;                      // 机构角色代码
    private String healthSrvName;                      // 服务者姓名
    private String healthSrvRole;                      // 服务者职责（角色）
    private String healthSrvRoleCode;                      // 服务者职责（角色）代码
    private String healthSrvTechPosition;                      // 服务者专业技术职务
    private String healthSrvBackground;                      // 服务者学历
    private String healthSrvMajor;                      // 服务者所学专业
    private String healthSrvTechPositionRank;                      // 服务者专业技术职务等级
    private String healthSrvPosition;                      // 服务者职务
    private String eventName;                      // 卫生事件(动作)名称
    private String eventCatCode;                      // 事件分类代码
    private Date eventBeginTime;                      // 事件开始时间
    private Date eventEndTime;                      // 事件结束时间
    private String eventAddress;                      // 事件发生地点
    private String eventPlace;                      // 事件发生场所
    private String eventParticipant;                      // 事件参与方
    private String eventReason;                      // 事件发生原因
    private String eventResult;                      // 事件结局
    private String sxMainSuit;                      // 主诉
    private String sxCodeName;                      // 症状代码编码体系名称
    private String sxCode;                      // 症状代码
    private Date sxBeginTime;                      // 症状开始日期时间
    private Date sxEndTime;                      // 症状停止日期时间
    private String sxDetail;                      // 症状描述
    private String sxEmergencyCode;                      // 症状急性程度代码
    private String sxSeverityCode;                      // 严重程度代码
    private String firstVisitSign;                      // 初诊标志
    private String dxOrgName;                      // 诊断机构名称
    private Date dxDate;                      // 诊断日期
    private String dxCat;                      // 诊断类别
    private String dxCatCode;                      // 诊断类别代码
    private String dxOrderCode;                      // 诊断顺位（从属关系）代码
    private String diseaseName;                      // 疾病名称
    private String diseaseCode;                      // 疾病代码
    private String dxAccording;                      // 诊断依据
    private String dxAccordingCode;                      // 诊断依据代码
    private String txPlanExpectCheck;                      // 拟做的检查
    private String txPlanExpectExamine;                      // 拟做的医学检验
    private String txPlan;                      // 今后治疗方案
    private String txPlanVisit;                      // 随访标志
    private Integer txPlanVisitInterval;                      // 随访间隔（随诊期限）
    private String txPlanAdvice;                      // 医嘱
    private String txPlanspecialRemark;                      // 特别注意事项
    private String txProcessName;                      // 诊疗过程名称
    private String txDescription;                      // 诊疗过程描述

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

    public String getSrvNoOrgName() {
        return srvNoOrgName;
    }

    public void setSrvNoOrgName(String srvNoOrgName) {
        this.srvNoOrgName = srvNoOrgName;
    }

    public String getSrvObj() {
        return srvObj;
    }

    public void setSrvObj(String srvObj) {
        this.srvObj = srvObj;
    }

    public String getSrvObjCode() {
        return srvObjCode;
    }

    public void setSrvObjCode(String srvObjCode) {
        this.srvObjCode = srvObjCode;
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

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getOrgCharge() {
        return orgCharge;
    }

    public void setOrgCharge(String orgCharge) {
        this.orgCharge = orgCharge;
    }

    public String getOrgAddress() {
        return orgAddress;
    }

    public void setOrgAddress(String orgAddress) {
        this.orgAddress = orgAddress;
    }

    public String getOrgOfficeName() {
        return orgOfficeName;
    }

    public void setOrgOfficeName(String orgOfficeName) {
        this.orgOfficeName = orgOfficeName;
    }

    public String getOrgRole() {
        return orgRole;
    }

    public void setOrgRole(String orgRole) {
        this.orgRole = orgRole;
    }

    public String getOrgRoleCode() {
        return orgRoleCode;
    }

    public void setOrgRoleCode(String orgRoleCode) {
        this.orgRoleCode = orgRoleCode;
    }

    public String getHealthSrvName() {
        return healthSrvName;
    }

    public void setHealthSrvName(String healthSrvName) {
        this.healthSrvName = healthSrvName;
    }

    public String getHealthSrvRole() {
        return healthSrvRole;
    }

    public void setHealthSrvRole(String healthSrvRole) {
        this.healthSrvRole = healthSrvRole;
    }

    public String getHealthSrvRoleCode() {
        return healthSrvRoleCode;
    }

    public void setHealthSrvRoleCode(String healthSrvRoleCode) {
        this.healthSrvRoleCode = healthSrvRoleCode;
    }

    public String getHealthSrvTechPosition() {
        return healthSrvTechPosition;
    }

    public void setHealthSrvTechPosition(String healthSrvTechPosition) {
        this.healthSrvTechPosition = healthSrvTechPosition;
    }

    public String getHealthSrvBackground() {
        return healthSrvBackground;
    }

    public void setHealthSrvBackground(String healthSrvBackground) {
        this.healthSrvBackground = healthSrvBackground;
    }

    public String getHealthSrvMajor() {
        return healthSrvMajor;
    }

    public void setHealthSrvMajor(String healthSrvMajor) {
        this.healthSrvMajor = healthSrvMajor;
    }

    public String getHealthSrvTechPositionRank() {
        return healthSrvTechPositionRank;
    }

    public void setHealthSrvTechPositionRank(String healthSrvTechPositionRank) {
        this.healthSrvTechPositionRank = healthSrvTechPositionRank;
    }

    public String getHealthSrvPosition() {
        return healthSrvPosition;
    }

    public void setHealthSrvPosition(String healthSrvPosition) {
        this.healthSrvPosition = healthSrvPosition;
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

    public String getSxMainSuit() {
        return sxMainSuit;
    }

    public void setSxMainSuit(String sxMainSuit) {
        this.sxMainSuit = sxMainSuit;
    }

    public String getSxCodeName() {
        return sxCodeName;
    }

    public void setSxCodeName(String sxCodeName) {
        this.sxCodeName = sxCodeName;
    }

    public String getSxCode() {
        return sxCode;
    }

    public void setSxCode(String sxCode) {
        this.sxCode = sxCode;
    }

    public Date getSxBeginTime() {
        return sxBeginTime;
    }

    public void setSxBeginTime(Date sxBeginTime) {
        this.sxBeginTime = sxBeginTime;
    }

    public Date getSxEndTime() {
        return sxEndTime;
    }

    public void setSxEndTime(Date sxEndTime) {
        this.sxEndTime = sxEndTime;
    }

    public String getSxDetail() {
        return sxDetail;
    }

    public void setSxDetail(String sxDetail) {
        this.sxDetail = sxDetail;
    }

    public String getSxEmergencyCode() {
        return sxEmergencyCode;
    }

    public void setSxEmergencyCode(String sxEmergencyCode) {
        this.sxEmergencyCode = sxEmergencyCode;
    }

    public String getSxSeverityCode() {
        return sxSeverityCode;
    }

    public void setSxSeverityCode(String sxSeverityCode) {
        this.sxSeverityCode = sxSeverityCode;
    }

    public String getFirstVisitSign() {
        return firstVisitSign;
    }

    public void setFirstVisitSign(String firstVisitSign) {
        this.firstVisitSign = firstVisitSign;
    }

    public String getDxOrgName() {
        return dxOrgName;
    }

    public void setDxOrgName(String dxOrgName) {
        this.dxOrgName = dxOrgName;
    }

    public Date getDxDate() {
        return dxDate;
    }

    public void setDxDate(Date dxDate) {
        this.dxDate = dxDate;
    }

    public String getDxCat() {
        return dxCat;
    }

    public void setDxCat(String dxCat) {
        this.dxCat = dxCat;
    }

    public String getDxCatCode() {
        return dxCatCode;
    }

    public void setDxCatCode(String dxCatCode) {
        this.dxCatCode = dxCatCode;
    }

    public String getDxOrderCode() {
        return dxOrderCode;
    }

    public void setDxOrderCode(String dxOrderCode) {
        this.dxOrderCode = dxOrderCode;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public String getDiseaseCode() {
        return diseaseCode;
    }

    public void setDiseaseCode(String diseaseCode) {
        this.diseaseCode = diseaseCode;
    }

    public String getDxAccording() {
        return dxAccording;
    }

    public void setDxAccording(String dxAccording) {
        this.dxAccording = dxAccording;
    }

    public String getDxAccordingCode() {
        return dxAccordingCode;
    }

    public void setDxAccordingCode(String dxAccordingCode) {
        this.dxAccordingCode = dxAccordingCode;
    }

    public String getTxPlanExpectCheck() {
        return txPlanExpectCheck;
    }

    public void setTxPlanExpectCheck(String txPlanExpectCheck) {
        this.txPlanExpectCheck = txPlanExpectCheck;
    }

    public String getTxPlanExpectExamine() {
        return txPlanExpectExamine;
    }

    public void setTxPlanExpectExamine(String txPlanExpectExamine) {
        this.txPlanExpectExamine = txPlanExpectExamine;
    }

    public String getTxPlan() {
        return txPlan;
    }

    public void setTxPlan(String txPlan) {
        this.txPlan = txPlan;
    }

    public String getTxPlanVisit() {
        return txPlanVisit;
    }

    public void setTxPlanVisit(String txPlanVisit) {
        this.txPlanVisit = txPlanVisit;
    }

    public Integer getTxPlanVisitInterval() {
        return txPlanVisitInterval;
    }

    public void setTxPlanVisitInterval(Integer txPlanVisitInterval) {
        this.txPlanVisitInterval = txPlanVisitInterval;
    }

    public String getTxPlanAdvice() {
        return txPlanAdvice;
    }

    public void setTxPlanAdvice(String txPlanAdvice) {
        this.txPlanAdvice = txPlanAdvice;
    }

    public String getTxPlanspecialRemark() {
        return txPlanspecialRemark;
    }

    public void setTxPlanspecialRemark(String txPlanspecialRemark) {
        this.txPlanspecialRemark = txPlanspecialRemark;
    }

    public String getTxProcessName() {
        return txProcessName;
    }

    public void setTxProcessName(String txProcessName) {
        this.txProcessName = txProcessName;
    }

    public String getTxDescription() {
        return txDescription;
    }

    public void setTxDescription(String txDescription) {
        this.txDescription = txDescription;
    }

    /**
     * 根据视图对象获取实体对象
     * @param vo
     * @return
     */
    public static Clinic getVOFromEntity(ClinicVO vo) {
        Clinic entity = new Clinic();
        BeanUtils.copyProperties(vo, entity);
        return entity;
    }
}