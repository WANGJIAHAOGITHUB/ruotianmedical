package cn.ekgc.medical.patient.allergy.pojo.vo;


import cn.ekgc.medical.base.pojo.vo.BaseVO;
import cn.ekgc.medical.patient.allergy.pojo.entity.Allergy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.BeanUtils;

/**
 * <b>若天医疗患者信息 - 患者过敏史信息表视图信息</b>
 * @author WangJiahao
 * @version 1.0.0
 */
@ApiModel("若天医疗患者信息 - 患者过敏史信息表视图信息")
public class AllergyVO extends BaseVO {
	private static final long serialVersionUID = -3106730845139091154L;
	@ApiModelProperty("主键")
	private String id;                              // 主键
	@ApiModelProperty("患者信息")
	private String patient;                         // 患者信息
	@ApiModelProperty("过敏史")
	private String history;                         // 过敏史
	@ApiModelProperty("过敏原")
	private String allergen;                        // 过敏原
	@ApiModelProperty("过敏症状信息")
	private String sx;                              // 过敏症状信息
	@ApiModelProperty("过敏药物名称")
	private String medicine;                        // 过敏药物名称
	@ApiModelProperty("过敏病情状态")
	private String allergyStatus;                   // 过敏病情状态
	@ApiModelProperty("过敏严重性")
	private String serious;                         // 过敏严重性
	@ApiModelProperty("过敏史标识")
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
	 * 根据实体对象获得视图对象
	 * @param entity
	 * @return
	 */
	public static AllergyVO getVOFromEntity(Allergy entity) {
		AllergyVO vo = new AllergyVO();
		BeanUtils.copyProperties(entity, vo);
		return vo;
	}
}