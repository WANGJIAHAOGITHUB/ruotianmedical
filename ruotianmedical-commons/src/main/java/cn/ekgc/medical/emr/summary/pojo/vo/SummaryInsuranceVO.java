package cn.ekgc.medical.emr.summary.pojo.vo;


import cn.ekgc.medical.base.pojo.vo.BaseVO;
import cn.ekgc.medical.emr.summary.pojo.entity.SummaryInsurance;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.BeanUtils;

/**
 * <b>若天医疗电子病例模块 - 病例概要医保信息视图类</b>
 * <p>
 *     病例概要医保信息视图类
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@ApiModel("若天医疗电子病例模块 - 病例概要医保信息视图类")
public class SummaryInsuranceVO extends BaseVO {
	private static final long serialVersionUID = 4829900413067099193L;
	@ApiModelProperty("主键")
	private String id;                                          // 主键
	@ApiModelProperty("所属病历概要")
	private String summary;                                     // 所属病历概要
	@ApiModelProperty("医疗保险-类别")
	private String insuranceCat;                                // 医疗保险-类别
	@ApiModelProperty("医疗保险-类别代码")
	private String insuranceCatCode;                            // 医疗保险-类别代码
	@ApiModelProperty("医疗待遇名称")
	private String insuranceTreatment;                          // 医疗待遇名称
	@ApiModelProperty("医疗待遇代码")
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
	 * 根据实体对象获得视图对象
	 * @param entity
	 * @return
	 */
	public static SummaryInsuranceVO getVOFromEntity(SummaryInsurance entity) {
		SummaryInsuranceVO vo = new SummaryInsuranceVO();
		BeanUtils.copyProperties(entity, vo);
		return vo;
	}
}