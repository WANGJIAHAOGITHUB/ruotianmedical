package cn.ekgc.medical.clinic.perscription.pojo.vo;

import cn.ekgc.medical.base.pojo.vo.BaseVO;
import cn.ekgc.medical.clinic.perscription.pojo.entity.ClinicRxInsurance;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.BeanUtils;

/**
 * <b>若天医疗门诊处方信息 - 门诊医保信息表视图信息</b>
 * @author WangJiahao
 * @version 1.0.0
 */
@ApiModel("若天医疗门诊处方模块 - 门诊医保信息表视图信息")
public class ClinicRxInsuranceVO extends BaseVO {
	private static final long serialVersionUID = -7348917598761475050L;
	@ApiModelProperty("主键")
	private String id;                                  // 主键
	@ApiModelProperty("门(急)诊西医处方")
	private String clinicRx;                            // 门(急)诊西医处方
	@ApiModelProperty("医疗保险-类别")
	private String cat;                                 // 医疗保险-类别
	@ApiModelProperty("医疗保险-类别代码")
	private String catCode;                             // 医疗保险-类别代码
	@ApiModelProperty("医疗待遇名称")
	private String treatment;                           // 医疗待遇名称
	@ApiModelProperty("医疗待遇代码")
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
	 * 根据实体对象获得视图对象
	 * @param entity
	 * @return
	 */
	public static ClinicRxInsuranceVO getVOFromEntity(ClinicRxInsurance entity) {
		ClinicRxInsuranceVO vo = new ClinicRxInsuranceVO();
		BeanUtils.copyProperties(entity, vo);
		return vo;
	}
}