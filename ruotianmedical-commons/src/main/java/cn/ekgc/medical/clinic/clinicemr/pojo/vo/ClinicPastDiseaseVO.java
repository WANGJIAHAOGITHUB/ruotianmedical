package cn.ekgc.medical.clinic.clinicemr.pojo.vo;

import cn.ekgc.medical.base.pojo.vo.BaseVO;
import cn.ekgc.medical.clinic.clinicemr.pojo.entity.ClinicPastDisease;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.BeanUtils;

import java.util.Date;

/**
 * <b>若天医疗门诊信息 - 门诊既往史信息表视图信息</b>
 * @author WangJiahao
 * @version 1.0.0
 */
@ApiModel("若天医疗门诊电子病例模块 - 门诊既往史信息表视图信息")
public class ClinicPastDiseaseVO extends BaseVO {
	private static final long serialVersionUID = -248499326135797090L;
	@ApiModelProperty("主键")
	private String id;                                  // 主键
	@ApiModelProperty("所属门(急)诊病历")
	private String clinic;                              // 所属门(急)诊病历
	@ApiModelProperty("既往疾病史")
	private String history;                             // 既往疾病史
	@ApiModelProperty("既往精神类疾病诊断名称")
	private String mentalDiagnosis;                     // 既往精神类疾病诊断名称
	@ApiModelProperty("既往疾病名称")
	private String name;                                // 既往疾病名称
	@ApiModelProperty("既往疾病代码")
	private String code;                                // 既往疾病代码
	@ApiModelProperty("既往疾病诊断机构")
	private String org;                                 // 既往疾病诊断机构
	@ApiModelProperty("既往疾病诊断机构级别代码")
	private String orgCode;                             // 既往疾病诊断机构级别代码
	@ApiModelProperty("既往疾病诊断时间")
	private Date diagnosisDate;                         // 既往疾病诊断时间
	@ApiModelProperty("疾病当前状态代码")
	private String statusCode;                          // 疾病当前状态代码

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

	public String getMentalDiagnosis() {
		return mentalDiagnosis;
	}

	public void setMentalDiagnosis(String mentalDiagnosis) {
		this.mentalDiagnosis = mentalDiagnosis;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getOrg() {
		return org;
	}

	public void setOrg(String org) {
		this.org = org;
	}

	public String getOrgCode() {
		return orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public Date getDiagnosisDate() {
		return diagnosisDate;
	}

	public void setDiagnosisDate(Date diagnosisDate) {
		this.diagnosisDate = diagnosisDate;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	/**
	 * 根据实体对象获得视图对象
	 * @param entity
	 * @return
	 */
	public static ClinicPastDiseaseVO getVOFromEntity(ClinicPastDisease entity) {
		ClinicPastDiseaseVO vo = new ClinicPastDiseaseVO();
		BeanUtils.copyProperties(entity, vo);
		return vo;
	}
}