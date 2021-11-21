package cn.ekgc.medical.patient.risk.pojo.vo;

import cn.ekgc.medical.base.pojo.vo.BaseVO;
import cn.ekgc.medical.patient.risk.pojo.entity.Risk;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.BeanUtils;


/**
 * <b>若天医疗患者信息 - 患者个体危险信息表实体信息</b>
 * @author WangJiahao
 * @version 1.0.0
 */
@ApiModel("若天医疗患者信息 - 患者个体危险信息表实体信息")
public class RiskVO extends BaseVO {
	private static final long serialVersionUID = 5779748538962729221L;
	@ApiModelProperty("主键")
	private String id;                              // 主键
	@ApiModelProperty("患者信息")
	private String summary;                         // 患者信息
	@ApiModelProperty("个体危险性信息")
	private String risk;                            // 个体危险性信息

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

	public String getRisk() {
		return risk;
	}

	public void setRisk(String risk) {
		this.risk = risk;
	}

	/**
	 * 根据实体对象获得视图对象
	 * @param entity
	 * @return
	 */
	public static RiskVO getVOFromEntity(Risk entity) {
		RiskVO vo = new RiskVO();
		BeanUtils.copyProperties(entity, vo);
		return vo;
	}
}