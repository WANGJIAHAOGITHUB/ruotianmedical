package cn.ekgc.medical.clinic.clinicemr.pojo.vo;

import cn.ekgc.medical.base.pojo.vo.BaseVO;
import cn.ekgc.medical.clinic.clinicemr.pojo.entity.ClinicSymptom;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.BeanUtils;

import java.util.Date;

/**
 * <b>若天医疗门诊信息 - 门(急)诊病历主诉（症状/体征）信息表视图信息</b>
 * @author WangJiahao
 * @version 1.0.0
 */
@ApiModel("若天医疗门诊电子病例模块 - 门(急)诊病历主诉（症状/体征）信息表视图信息")
public class ClinicSymptomVO extends BaseVO {
	private static final long serialVersionUID = 3686066252626622008L;
	@ApiModelProperty("主键")
	private String id;                                  // 主键
	@ApiModelProperty("所属门(急)诊病历")
	private String clinic;                              // 所属门(急)诊病历
	@ApiModelProperty("主诉")
	private String symptom;                             // 主诉
	@ApiModelProperty("症状代码编码体系名称")
	private String codeName;                            // 症状代码编码体系名称
	@ApiModelProperty("症状代码")
	private String code;                                // 症状代码
	@ApiModelProperty("症状开始日期时间")
	private Date symptomBeginTime;                      // 症状开始日期时间
	@ApiModelProperty("症状停止日期时间")
	private Date symptomEndTime;                        // 症状停止日期时间
	@ApiModelProperty("症状描述")
	private String description;                         // 症状描述
	@ApiModelProperty("症状急性程度代码")
	private String acuteDegreeCode;                     // 症状急性程度代码
	@ApiModelProperty("严重程度代码")
	private String severityCode;                        // 严重程度代码
	@ApiModelProperty("初诊标志")
	private String firstVisitSign;                      // 初诊标志

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

	public String getSymptom() {
		return symptom;
	}

	public void setSymptom(String symptom) {
		this.symptom = symptom;
	}

	public String getCodeName() {
		return codeName;
	}

	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getSymptomBeginTime() {
		return symptomBeginTime;
	}

	public void setSymptomBeginTime(Date symptomBeginTime) {
		this.symptomBeginTime = symptomBeginTime;
	}

	public Date getSymptomEndTime() {
		return symptomEndTime;
	}

	public void setSymptomEndTime(Date symptomEndTime) {
		this.symptomEndTime = symptomEndTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAcuteDegreeCode() {
		return acuteDegreeCode;
	}

	public void setAcuteDegreeCode(String acuteDegreeCode) {
		this.acuteDegreeCode = acuteDegreeCode;
	}

	public String getSeverityCode() {
		return severityCode;
	}

	public void setSeverityCode(String severityCode) {
		this.severityCode = severityCode;
	}

	public String getFirstVisitSign() {
		return firstVisitSign;
	}

	public void setFirstVisitSign(String firstVisitSign) {
		this.firstVisitSign = firstVisitSign;
	}

	/**
	 * 根据实体对象获得视图对象
	 * @param entity
	 * @return
	 */
	public static ClinicSymptomVO getVOFromEntity(ClinicSymptom entity) {
		ClinicSymptomVO vo = new ClinicSymptomVO();
		BeanUtils.copyProperties(entity, vo);
		return vo;
	}
}