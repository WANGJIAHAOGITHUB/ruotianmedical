package cn.ekgc.medical.emr.summary.pojo.entity;


import cn.ekgc.medical.base.pojo.entity.BaseEntity;
import cn.ekgc.medical.emr.summary.pojo.vo.SummaryInsuranceVO;
import org.springframework.beans.BeanUtils;

/**
 * <b>若天医疗电子病例模块 - 病历概要医保信息表视图信息</b>
 * @author WangJiahao
 * @version 1.0.0
 */
public class SummaryInsurance extends BaseEntity {
	private static final long serialVersionUID = -7630735251560773545L;
	private String id;                                          // 主键
    private String summary;                                     // 所属病历概要
    private String insuranceCat;                                // 医疗保险-类别
    private String insuranceCatCode;                            // 医疗保险-类别代码
    private String insuranceTreatment;                          // 医疗待遇名称
    private String insuranceTreatmentCode;                      // 医疗待遇代码

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

	public String getInsuranceCat() {
		return insuranceCat;
	}

	public void setInsuranceCat(String insuranceCat) {
		this.insuranceCat = insuranceCat;
	}

	public String getInsuranceCatCode() {
		return insuranceCatCode;
	}

	public void setInsuranceCatCode(String insuranceCatCode) {
		this.insuranceCatCode = insuranceCatCode;
	}

	public String getInsuranceTreatment() {
		return insuranceTreatment;
	}

	public void setInsuranceTreatment(String insuranceTreatment) {
		this.insuranceTreatment = insuranceTreatment;
	}

	public String getInsuranceTreatmentCode() {
		return insuranceTreatmentCode;
	}

	public void setInsuranceTreatmentCode(String insuranceTreatmentCode) {
		this.insuranceTreatmentCode = insuranceTreatmentCode;
	}

	/**
	 * 根据视图对象获取实体对象
	 * @param vo
	 * @return
	 */
	public static SummaryInsurance getEntityFromVO(SummaryInsuranceVO vo) {
		SummaryInsurance entity = new SummaryInsurance();
		BeanUtils.copyProperties(vo, entity);
		return entity;
	}
}