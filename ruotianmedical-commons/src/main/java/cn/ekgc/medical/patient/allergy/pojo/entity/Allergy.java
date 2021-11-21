package cn.ekgc.medical.patient.allergy.pojo.entity;

import cn.ekgc.medical.base.pojo.entity.BaseEntity;
import cn.ekgc.medical.patient.allergy.pojo.vo.AllergyVO;
import org.springframework.beans.BeanUtils;

/**
 * <b>若天医疗患者信息 - 患者过敏史信息表视图信息</b>
 * @author WangJiahao
 * @version 1.0.0
 */
public class Allergy extends BaseEntity {
    private static final long serialVersionUID = -2176054098182514919L;
    private String id;                              // 主键
    private String patient;                         // 患者信息
    private String history;                         // 过敏史
    private String allergen;                        // 过敏原
    private String sx;                              // 过敏症状信息
    private String medicine;                        // 过敏药物名称
    private String allergyStatus;                   // 过敏病情状态
    private String serious;                         // 过敏严重性
    private String sign;                            // 过敏史标识

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
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

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public String getAllergyStatus() {
        return allergyStatus;
    }

    public void setAllergyStatus(String allergyStatus) {
        this.allergyStatus = allergyStatus;
    }

    public String getSerious() {
        return serious;
    }

    public void setSerious(String serious) {
        this.serious = serious;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    /**
     * 根据视图对象获取实体对象
     * @param vo
     * @return
     */
    public static Allergy getVOFromEntity(AllergyVO vo) {
        Allergy entity = new Allergy();
        BeanUtils.copyProperties(vo, entity);
        return entity;
    }
}