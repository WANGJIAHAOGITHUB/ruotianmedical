package cn.ekgc.medical.clinic.clinicemr.pojo.vo;

import cn.ekgc.medical.base.pojo.vo.BaseVO;
import cn.ekgc.medical.clinic.clinicemr.pojo.entity.ClinicPresentDisease;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.BeanUtils;

import java.util.Date;

/**
 * <b>若天医疗门诊信息 - 门诊现病史信息表视图信息</b>
 * @author WangJiahao
 * @version 1.0.0
 */
@ApiModel("若天医疗门诊电子病例模块 - 门诊现病史信息表视图信息")
public class ClinicPresentDiseaseVO extends BaseVO {
	private static final long serialVersionUID = -4016195457355609357L;
	@ApiModelProperty("主键")
	private String id;                                      // 主键
	@ApiModelProperty("所属门(急)诊病历")
	private String clinic;                                  // 所属门(急)诊病历
	@ApiModelProperty("起病时间")
	private Date beginDate;                                 // 起病时间
	@ApiModelProperty("起病情况描述")
	private String situationDesc;                           // 起病情况描述
	@ApiModelProperty("症状开始原因/诱因")
	private String sxReason;                                // 症状开始原因/诱因
	@ApiModelProperty("症状特点")
	private String sxFeature;                               // 症状特点
	@ApiModelProperty("伴随症状")
	private String sxOther;                                 // 伴随症状
	@ApiModelProperty("本疾病既往诊疗经过")
	private String treatment;                               // 本疾病既往诊疗经过
	@ApiModelProperty("起病后一般情况")
	private String ordinarySituation;                       // 起病后一般情况
	@ApiModelProperty("基础疾病诊疗情况")
	private String baseSituation;                           // 基础疾病诊疗情况

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

	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public String getSituationDesc() {
		return situationDesc;
	}

	public void setSituationDesc(String situationDesc) {
		this.situationDesc = situationDesc;
	}

	public String getSxReason() {
		return sxReason;
	}

	public void setSxReason(String sxReason) {
		this.sxReason = sxReason;
	}

	public String getSxFeature() {
		return sxFeature;
	}

	public void setSxFeature(String sxFeature) {
		this.sxFeature = sxFeature;
	}

	public String getSxOther() {
		return sxOther;
	}

	public void setSxOther(String sxOther) {
		this.sxOther = sxOther;
	}

	public String getTreatment() {
		return treatment;
	}

	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}

	public String getOrdinarySituation() {
		return ordinarySituation;
	}

	public void setOrdinarySituation(String ordinarySituation) {
		this.ordinarySituation = ordinarySituation;
	}

	public String getBaseSituation() {
		return baseSituation;
	}

	public void setBaseSituation(String baseSituation) {
		this.baseSituation = baseSituation;
	}

	/**
	 * 根据实体对象获得视图对象
	 * @param entity
	 * @return
	 */
	public static ClinicPresentDiseaseVO getVOFromEntity(ClinicPresentDisease entity) {
		ClinicPresentDiseaseVO vo = new ClinicPresentDiseaseVO();
		BeanUtils.copyProperties(entity, vo);
		return vo;
	}
}