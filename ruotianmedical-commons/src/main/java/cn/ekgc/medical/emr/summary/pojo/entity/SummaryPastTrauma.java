package cn.ekgc.medical.emr.summary.pojo.entity;

import cn.ekgc.medical.base.pojo.entity.BaseEntity;
import cn.ekgc.medical.emr.summary.pojo.vo.SummaryPastTraumaVO;
import org.springframework.beans.BeanUtils;

import java.util.Date;

/**
 * <b>若天医疗电子病例模块 - 病历概要既往病史信息表实体信息</b>
 * @author WangJiahao
 * @version 1.0.0
 */
public class SummaryPastTrauma extends BaseEntity {
    private static final long serialVersionUID = -4292923325469231110L;
    private String id;                                      // 主键
    private String summary;                                 // 所属病历概要
    private String diseaseHistory;                          // 既往疾病史
    private String mentalDiagnosis;                         // 既往精神类疾病诊断名称
    private String diseaseName;                             // 既往疾病名称
    private String diseaseCode;                             // 既往疾病代码
    private String diagnosisOrg;                            // 既往疾病诊断机构
    private String diagnosisCode;                           // 既往疾病诊断机构级别代码
    private Date diagnosisDate;                             // 既往疾病诊断时间
    private String diseaseStatusCode;                       // 疾病当前状态代码

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDiseaseHistory() {
        return diseaseHistory;
    }

    public void setDiseaseHistory(String diseaseHistory) {
        this.diseaseHistory = diseaseHistory;
    }

    public String getMentalDiagnosis() {
        return mentalDiagnosis;
    }

    public void setMentalDiagnosis(String mentalDiagnosis) {
        this.mentalDiagnosis = mentalDiagnosis;
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

    public String getDiagnosisOrg() {
        return diagnosisOrg;
    }

    public void setDiagnosisOrg(String diagnosisOrg) {
        this.diagnosisOrg = diagnosisOrg;
    }

    public String getDiagnosisCode() {
        return diagnosisCode;
    }

    public void setDiagnosisCode(String diagnosisCode) {
        this.diagnosisCode = diagnosisCode;
    }

    public Date getDiagnosisDate() {
        return diagnosisDate;
    }

    public void setDiagnosisDate(Date diagnosisDate) {
        this.diagnosisDate = diagnosisDate;
    }

    public String getDiseaseStatusCode() {
        return diseaseStatusCode;
    }

    public void setDiseaseStatusCode(String diseaseStatusCode) {
        this.diseaseStatusCode = diseaseStatusCode;
    }

    /**
     * 根据视图对象获取实体对象
     * @param vo
     * @return
     */
    public static SummaryPastTrauma getEntityFromVO(SummaryPastTraumaVO vo) {
        SummaryPastTrauma entity = new SummaryPastTrauma();
        BeanUtils.copyProperties(vo, entity);
        return entity;
    }
}