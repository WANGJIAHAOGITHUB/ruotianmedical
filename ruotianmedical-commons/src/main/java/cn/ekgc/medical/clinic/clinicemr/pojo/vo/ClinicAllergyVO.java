package cn.ekgc.medical.clinic.clinicemr.pojo.vo;


import cn.ekgc.medical.base.pojo.vo.BaseVO;
import cn.ekgc.medical.clinic.clinicemr.pojo.entity.ClinicAllergy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.BeanUtils;

/**
 * <b>若天医疗门诊信息 - 门诊过敏史信息表视图信息</b>
 * @author WangJiahao
 * @version 1.0.0
 */
@ApiModel("若天医疗门诊电子病例模块 - 门诊过敏史信息表视图信息")
public class ClinicAllergyVO extends BaseVO {
	private static final long serialVersionUID = 8543175688241510469L;
	@ApiModelProperty("主键")
	private String id;                              // 主键
	@ApiModelProperty("所属门(急)诊病历")
	private String clinic;                          // 所属门(急)诊病历
	@ApiModelProperty("过敏史")
	private String history;                         // 过敏史
	@ApiModelProperty("过敏原")
	private String allergen;                        // 过敏原
	@ApiModelProperty("过敏症状")
	private String sx;                              // 过敏症状
	@ApiModelProperty("过敏症状代码")
	private String sxCode;                          // 过敏症状代码
	@ApiModelProperty("过敏原代码")
	private String code;                            // 过敏原代码
	@ApiModelProperty("过敏药物名称")
	private String medicine;                        // 过敏药物名称
	@ApiModelProperty("过敏病情状态代码")
	private String statusCode;                      // 过敏病情状态代码
	@ApiModelProperty("过敏严重性代码")
	private String seriousCode;                     // 过敏严重性代码
	@ApiModelProperty("过敏史标识代码")
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
	 * 根据实体对象获得视图对象
	 * @param entity
	 * @return
	 */
	public static ClinicAllergyVO getVOFromEntity(ClinicAllergy entity) {
		ClinicAllergyVO vo = new ClinicAllergyVO();
		BeanUtils.copyProperties(entity, vo);
		return vo;
	}
}