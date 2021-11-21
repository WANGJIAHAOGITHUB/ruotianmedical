package cn.ekgc.medical.clinic.clinicemr.pojo.entity;

import cn.ekgc.medical.base.pojo.entity.BaseEntity;
import cn.ekgc.medical.clinic.clinicemr.pojo.vo.ClinicSymptomVO;
import org.springframework.beans.BeanUtils;

import java.util.Date;

/**
 * <b>若天医疗门诊信息 - 门(急)诊病历主诉（症状/体征）信息表实体信息</b>
 * @author WangJiahao
 * @version 1.0.0
 */
public class ClinicSymptom extends BaseEntity {
    private static final long serialVersionUID = 1140358708925029468L;
    private String id;                                  // 主键
    private String clinic;                              // 所属门(急)诊病历
    private String symptom;                             // 主诉
    private String codeName;                            // 症状代码编码体系名称
    private String code;                                // 症状代码
    private Date symptomBeginTime;                      // 症状开始日期时间
    private Date symptomEndTime;                        // 症状停止日期时间
    private String description;                         // 症状描述
    private String acuteDegreeCode;                     // 症状急性程度代码
    private String severityCode;                        // 严重程度代码
    private String firstVisitSign;                      // 初诊标志

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClinic() {
        return clinic;
    }

    public void setClinic(String clinic) {
        this.clinic = clinic;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getSymptomBeginTime() {
        return symptomBeginTime;
    }

    public void setSymptomBeginTime(Date symptomBeginTime) {
        this.symptomBeginTime = symptomBeginTime;
    }

    public Date getSymptomEndTime() {
        return symptomEndTime;
    }

    public void setSymptomEndTime(Date symptomEndTime) {
        this.symptomEndTime = symptomEndTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAcuteDegreeCode() {
        return acuteDegreeCode;
    }

    public void setAcuteDegreeCode(String acuteDegreeCode) {
        this.acuteDegreeCode = acuteDegreeCode;
    }

    public String getSeverityCode() {
        return severityCode;
    }

    public void setSeverityCode(String severityCode) {
        this.severityCode = severityCode;
    }

    public String getFirstVisitSign() {
        return firstVisitSign;
    }

    public void setFirstVisitSign(String firstVisitSign) {
        this.firstVisitSign = firstVisitSign;
    }

    /**
     * 根据视图对象获取实体对象
     * @param vo
     * @return
     */
    public static ClinicSymptom getVOFromEntity(ClinicSymptomVO vo) {
        ClinicSymptom entity = new ClinicSymptom();
        BeanUtils.copyProperties(vo, entity);
        return entity;
    }
}