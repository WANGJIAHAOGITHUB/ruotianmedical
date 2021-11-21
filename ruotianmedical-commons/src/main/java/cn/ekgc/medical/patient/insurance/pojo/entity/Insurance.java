package cn.ekgc.medical.patient.insurance.pojo.entity;


import cn.ekgc.medical.base.pojo.entity.BaseEntity;
import cn.ekgc.medical.patient.insurance.pojo.vo.InsuranceVO;
import org.springframework.beans.BeanUtils;

/**
 * <b>若天医疗患者信息 - 患者医保信息表实体信息</b>
 * @author WangJiahao
 * @version 1.0.0
 */
public class Insurance extends BaseEntity {
    private static final long serialVersionUID = 2191861557964455075L;
    private String id;                              // 主键
    private String patient;                         // 患者
    private String cat;                             // 医疗保险-类别
    private String treatment;                       // 医疗待遇名称

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

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    /**
     * 根据视图对象获取实体对象
     * @param vo
     * @return
     */
    public static Insurance getVOFromEntity(InsuranceVO vo) {
        Insurance entity = new Insurance();
        BeanUtils.copyProperties(vo, entity);
        return entity;
    }
}