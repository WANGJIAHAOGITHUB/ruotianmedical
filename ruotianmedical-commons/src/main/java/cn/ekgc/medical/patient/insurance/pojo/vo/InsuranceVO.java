package cn.ekgc.medical.patient.insurance.pojo.vo;

import cn.ekgc.medical.base.pojo.vo.BaseVO;
import cn.ekgc.medical.patient.insurance.pojo.entity.Insurance;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.BeanUtils;


/**
 * <b>若天医疗患者信息 - 患者医保信息表视图信息</b>
 * @author WangJiahao
 * @version 1.0.0
 */
@ApiModel("若天医疗患者信息 - 患者医保信息表视图信息")
public class InsuranceVO extends BaseVO {
	private static final long serialVersionUID = 6098432988066879006L;
	@ApiModelProperty("主键")
	private String id;                              // 主键
	@ApiModelProperty("患者")
	private String patient;                         // 患者
	@ApiModelProperty("医疗保险-类别")
	private String cat;                             // 医疗保险-类别
	@ApiModelProperty("医疗待遇名称")
	private String treatment;                       // 医疗待遇名称

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

	public String getCat() {
		return cat;
	}

	public void setCat(String cat) {
		this.cat = cat;
	}

	public String getTreatment() {
		return treatment;
	}

	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}

	/**
	 * 根据实体对象获得视图对象
	 * @param entity
	 * @return
	 */
	public static InsuranceVO getVOFromEntity(Insurance entity) {
		InsuranceVO vo = new InsuranceVO();
		BeanUtils.copyProperties(entity, vo);
		return vo;
	}
}