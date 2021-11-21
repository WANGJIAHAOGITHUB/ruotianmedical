package cn.ekgc.medical.emr.summary.pojo.vo;


import cn.ekgc.medical.base.pojo.vo.BaseVO;
import cn.ekgc.medical.emr.summary.pojo.entity.SummaryRisk;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.BeanUtils;

/**
 * <b>若天医疗电子病例模块 - 病例概要个体危险信息视图类</b>
 * <p>
 *     病例概要个体危险信息视图类
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@ApiModel("若天医疗电子病例模块 - 病例概要个体危险信息视图类")
public class SummaryRiskVO extends BaseVO {
	private static final long serialVersionUID = -5735601054329662654L;
	@ApiModelProperty("主键")
	private String id;                                  // 主键
	@ApiModelProperty("所属病历概要")
	private String summary;                             // 所属病历概要
	@ApiModelProperty("个体危险性名称")
	private String riskName;                            // 个体危险性名称
	@ApiModelProperty("个体危险性代码")
	private String riskCode;                            // 个体危险性代码

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

	public String getRiskName() {
		return riskName;
	}

	public void setRiskName(String riskName) {
		this.riskName = riskName;
	}

	public String getRiskCode() {
		return riskCode;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	/**
	 * 根据实体对象获得视图对象
	 * @param entity
	 * @return
	 */
	public static SummaryRiskVO getVOFromEntity(SummaryRisk entity) {
		SummaryRiskVO vo = new SummaryRiskVO();
		BeanUtils.copyProperties(entity, vo);
		return vo;
	}
}