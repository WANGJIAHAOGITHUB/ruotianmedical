package cn.ekgc.medical.emr.summary.pojo.entity;

import cn.ekgc.medical.base.pojo.entity.BaseEntity;
import cn.ekgc.medical.emr.summary.pojo.vo.SummaryMedicineVO;
import cn.ekgc.medical.emr.summary.pojo.vo.SummaryVO;
import org.springframework.beans.BeanUtils;

import java.util.Date;

/**
 * <b>若天医疗电子病例模块 - 病历概要用药信息表实体信息</b>
 * @author WangJiahao
 * @version 1.0.0
 */
public class SummaryMedicine extends BaseEntity {
    private static final long serialVersionUID = 3015792402839793377L;
    private String id;                                          // 主键
    private String summary;                                     // 所属病历概要
    private String medicineUsage;                               // 药物用法
    private String medicineRate;                                // 药物使用-频率
    private String medicineUnit;                                // 药物使用-剂量单位
    private String medicinePerAmount;                           // 药物使用-次剂量
    private String medicineTotalAmount;                         // 药物使用-总剂量
    private String medicineWayCode;                             // 药物使用-途径代码
    private Date medicineName;                                  // 药物名称
    private String medicineFormCode;                            // 药物剂型代码
    private String medicineCat;                                 // 药物类型
    private String medicineNameCode;                            // 药物名称代码

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

    public String getMedicineUsage() {
        return medicineUsage;
    }

    public void setMedicineUsage(String medicineUsage) {
        this.medicineUsage = medicineUsage;
    }

    public String getMedicineRate() {
        return medicineRate;
    }

    public void setMedicineRate(String medicineRate) {
        this.medicineRate = medicineRate;
    }

    public String getMedicineUnit() {
        return medicineUnit;
    }

    public void setMedicineUnit(String medicineUnit) {
        this.medicineUnit = medicineUnit;
    }

    public String getMedicinePerAmount() {
        return medicinePerAmount;
    }

    public void setMedicinePerAmount(String medicinePerAmount) {
        this.medicinePerAmount = medicinePerAmount;
    }

    public String getMedicineTotalAmount() {
        return medicineTotalAmount;
    }

    public void setMedicineTotalAmount(String medicineTotalAmount) {
        this.medicineTotalAmount = medicineTotalAmount;
    }

    public String getMedicineWayCode() {
        return medicineWayCode;
    }

    public void setMedicineWayCode(String medicineWayCode) {
        this.medicineWayCode = medicineWayCode;
    }

    public Date getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(Date medicineName) {
        this.medicineName = medicineName;
    }

    public String getMedicineFormCode() {
        return medicineFormCode;
    }

    public void setMedicineFormCode(String medicineFormCode) {
        this.medicineFormCode = medicineFormCode;
    }

    public String getMedicineCat() {
        return medicineCat;
    }

    public void setMedicineCat(String medicineCat) {
        this.medicineCat = medicineCat;
    }

    public String getMedicineNameCode() {
        return medicineNameCode;
    }

    public void setMedicineNameCode(String medicineNameCode) {
        this.medicineNameCode = medicineNameCode;
    }

    /**
     * 根据视图对象获取实体对象
     * @param vo
     * @return
     */
    public static SummaryMedicine getEntityFromVO(SummaryMedicineVO vo) {
        SummaryMedicine entity = new SummaryMedicine();
        BeanUtils.copyProperties(vo, entity);
        return entity;
    }
}