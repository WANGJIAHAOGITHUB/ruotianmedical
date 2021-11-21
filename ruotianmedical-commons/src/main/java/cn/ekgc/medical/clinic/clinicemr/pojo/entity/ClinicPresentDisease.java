package cn.ekgc.medical.clinic.clinicemr.pojo.entity;

import cn.ekgc.medical.base.pojo.entity.BaseEntity;
import cn.ekgc.medical.clinic.clinicemr.pojo.vo.ClinicPresentDiseaseVO;
import org.springframework.beans.BeanUtils;

import java.util.Date;

/**
 * <b>若天医疗门诊信息 - 门诊现病史信息表实体信息</b>
 * @author WangJiahao
 * @version 1.0.0
 */
public class ClinicPresentDisease extends BaseEntity {
    private static final long serialVersionUID = -6031731032009799875L;
    private String id;                                  // 主键
    private String clinic;                              // 所属门(急)诊病历
    private Date beginDate;                             // 起病时间
    private String situationDesc;                       // 起病情况描述
    private String sxReason;                            // 症状开始原因/诱因
    private String sxFeature;                           // 症状特点
    private String sxOther;                             // 伴随症状
    private String treatment;                           // 本疾病既往诊疗经过
    private String ordinarySituation;                   // 起病后一般情况
    private String baseSituation;                       // 基础疾病诊疗情况

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

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public String getSituationDesc() {
        return situationDesc;
    }

    public void setSituationDesc(String situationDesc) {
        this.situationDesc = situationDesc;
    }

    public String getSxReason() {
        return sxReason;
    }

    public void setSxReason(String sxReason) {
        this.sxReason = sxReason;
    }

    public String getSxFeature() {
        return sxFeature;
    }

    public void setSxFeature(String sxFeature) {
        this.sxFeature = sxFeature;
    }

    public String getSxOther() {
        return sxOther;
    }

    public void setSxOther(String sxOther) {
        this.sxOther = sxOther;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getOrdinarySituation() {
        return ordinarySituation;
    }

    public void setOrdinarySituation(String ordinarySituation) {
        this.ordinarySituation = ordinarySituation;
    }

    public String getBaseSituation() {
        return baseSituation;
    }

    public void setBaseSituation(String baseSituation) {
        this.baseSituation = baseSituation;
    }

    /**
     * 根据视图对象获取实体对象
     * @param vo
     * @return
     */
    public static ClinicPresentDisease getVOFromEntity(ClinicPresentDiseaseVO vo) {
        ClinicPresentDisease entity = new ClinicPresentDisease();
        BeanUtils.copyProperties(vo, entity);
        return entity;
    }
}