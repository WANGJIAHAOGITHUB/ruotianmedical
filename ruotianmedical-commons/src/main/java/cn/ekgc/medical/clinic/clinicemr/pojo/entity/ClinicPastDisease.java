package cn.ekgc.medical.clinic.clinicemr.pojo.entity;

import cn.ekgc.medical.base.pojo.entity.BaseEntity;
import cn.ekgc.medical.clinic.clinicemr.pojo.vo.ClinicPastDiseaseVO;
import org.springframework.beans.BeanUtils;

import java.util.Date;

/**
 * <b>若天医疗门诊信息 - 门诊既往史信息表实体信息</b>
 * @author WangJiahao
 * @version 1.0.0
 */
public class ClinicPastDisease extends BaseEntity {
    private static final long serialVersionUID = 1676256206189690574L;
    private String id;                                      // 主键
    private String clinic;                                  // 所属门(急)诊病历
    private String history;                                 // 既往疾病史
    private String mentalDiagnosis;                         // 既往精神类疾病诊断名称
    private String name;                                    // 既往疾病名称
    private String code;                                    // 既往疾病代码
    private String org;                                     // 既往疾病诊断机构
    private String orgCode;                                 // 既往疾病诊断机构级别代码
    private Date diagnosisDate;                             // 既往疾病诊断时间
    private String statusCode;                              // 疾病当前状态代码

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

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getMentalDiagnosis() {
        return mentalDiagnosis;
    }

    public void setMentalDiagnosis(String mentalDiagnosis) {
        this.mentalDiagnosis = mentalDiagnosis;
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

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public Date getDiagnosisDate() {
        return diagnosisDate;
    }

    public void setDiagnosisDate(Date diagnosisDate) {
        this.diagnosisDate = diagnosisDate;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * 根据视图对象获取实体对象
     * @param vo
     * @return
     */
    public static ClinicPastDisease getVOFromEntity(ClinicPastDiseaseVO vo) {
        ClinicPastDisease entity = new ClinicPastDisease();
        BeanUtils.copyProperties(vo, entity);
        return entity;
    }
}