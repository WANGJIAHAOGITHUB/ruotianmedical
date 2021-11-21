package cn.ekgc.medical.clinic.clinicemr.pojo.entity;

import cn.ekgc.medical.base.pojo.entity.BaseEntity;
import cn.ekgc.medical.clinic.clinicemr.pojo.vo.ClinicAllergyVO;
import org.springframework.beans.BeanUtils;

/**
 * <b>若天医疗门诊信息 - 门诊过敏史信息表实体信息</b>
 * @author WangJiahao
 * @version 1.0.0
 */
public class ClinicAllergy extends BaseEntity {
    private static final long serialVersionUID = 7985625057064684636L;
    private String id;                              // 主键
    private String clinic;                          // 所属门(急)诊病历
    private String history;                         // 过敏史
    private String allergen;                        // 过敏原
    private String sx;                              // 过敏症状
    private String sxCode;                          // 过敏症状代码
    private String code;                            // 过敏原代码
    private String medicine;                        // 过敏药物名称
    private String statusCode;                      // 过敏病情状态代码
    private String seriousCode;                     // 过敏严重性代码
    private String signCode;                        // 过敏史标识代码

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

    public String getAllergen() {
        return allergen;
    }

    public void setAllergen(String allergen) {
        this.allergen = allergen;
    }

    public String getSx() {
        return sx;
    }

    public void setSx(String sx) {
        this.sx = sx;
    }

    public String getSxCode() {
        return sxCode;
    }

    public void setSxCode(String sxCode) {
        this.sxCode = sxCode;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getSeriousCode() {
        return seriousCode;
    }

    public void setSeriousCode(String seriousCode) {
        this.seriousCode = seriousCode;
    }

    public String getSignCode() {
        return signCode;
    }

    public void setSignCode(String signCode) {
        this.signCode = signCode;
    }

    /**
     * 根据视图对象获取实体对象
     * @param vo
     * @return
     */
    public static ClinicAllergy getVOFromEntity(ClinicAllergyVO vo) {
        ClinicAllergy entity = new ClinicAllergy();
        BeanUtils.copyProperties(vo, entity);
        return entity;
    }
}