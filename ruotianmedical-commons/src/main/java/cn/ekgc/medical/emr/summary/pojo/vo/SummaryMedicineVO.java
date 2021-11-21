package cn.ekgc.medical.emr.summary.pojo.vo;


import cn.ekgc.medical.base.pojo.vo.BaseVO;
import cn.ekgc.medical.emr.summary.pojo.entity.Summary;
import cn.ekgc.medical.emr.summary.pojo.entity.SummaryMedicine;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.BeanUtils;

import java.util.Date;

/**
 * <b>若天医疗电子病例模块 - 病例概要用药信息视图类</b>
 * <p>
 *     病例概要用药信息视图类
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@ApiModel("若天医疗电子病例模块 - 病例概要用药信息视图类")
public class SummaryMedicineVO extends BaseVO {
	private static final long serialVersionUID = 7939721490891633623L;
	@ApiModelProperty("主键")
	private String id;                                          // 主键
	@ApiModelProperty("所属病历概要")
	private String summary;                                     // 所属病历概要
	@ApiModelProperty("药物用法")
	private String medicineUsage;                               // 药物用法
	@ApiModelProperty("药物使用-频率")
	private String medicineRate;                                // 药物使用-频率
	@ApiModelProperty("药物使用-剂量单位")
	private String medicineUnit;                                // 药物使用-剂量单位
	@ApiModelProperty("药物使用-次剂量")
	private String medicinePerAmount;                           // 药物使用-次剂量
	@ApiModelProperty("药物使用-总剂量")
	private String medicineTotalAmount;                         // 药物使用-总剂量
	@ApiModelProperty("药物使用-途径代码")
	private String medicineWayCode;                             // 药物使用-途径代码
	@ApiModelProperty("药物名称")
	private Date medicineName;                                  // 药物名称
	@ApiModelProperty("药物剂型代码")
	private String medicineFormCode;                            // 药物剂型代码
	@ApiModelProperty("药物类型")
	private String medicineCat;                                 // 药物类型
	@ApiModelProperty("药物名称代码")
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
	 * 根据实体对象获得视图对象
	 * @param entity
	 * @return
	 */
	public static SummaryMedicineVO getVOFromEntity(SummaryMedicine entity) {
		SummaryMedicineVO vo = new SummaryMedicineVO();
		BeanUtils.copyProperties(entity, vo);
		return vo;
	}
}