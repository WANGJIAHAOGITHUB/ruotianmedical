package cn.ekgc.medical.clinic.perscription.pojo.entity;

import cn.ekgc.medical.base.pojo.entity.BaseEntity;
import cn.ekgc.medical.clinic.perscription.pojo.vo.ClinicRxInsuranceVO;
import org.springframework.beans.BeanUtils;


/**
 * <b>若天医疗门诊处方信息 - 门诊医保信息表实体信息</b>
 * @author WangJiahao
 * @version 1.0.0
 */
public class ClinicRxInsurance extends BaseEntity {
    private static final long serialVersionUID = -4943385721204193904L;
    private String id;                                  // 主键
    private String clinicRx;                            // 门(急)诊西医处方
    private String cat;                                 // 医疗保险-类别
    private String catCode;                             // 医疗保险-类别代码
    private String treatment;                           // 医疗待遇名称
    private String treatmentCode;                       // 医疗待遇代码

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClinicRx() {
        return clinicRx;
    }

    public void setClinicRx(String clinicRx) {
        this.clinicRx = clinicRx;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public String getCatCode() {
        return catCode;
    }

    public void setCatCode(String catCode) {
        this.catCode = catCode;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getTreatmentCode() {
        return treatmentCode;
    }

    public void setTreatmentCode(String treatmentCode) {
        this.treatmentCode = treatmentCode;
    }

    /**
     * 根据视图对象获取实体对象
     * @param vo
     * @return
     */
    public static ClinicRxInsurance getEntityFromVO(ClinicRxInsuranceVO vo) {
        ClinicRxInsurance entity = new ClinicRxInsurance();
        BeanUtils.copyProperties(vo, entity);
        return entity;
    }
}