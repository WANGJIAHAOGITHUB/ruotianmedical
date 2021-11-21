package cn.ekgc.medical.emr.summary.pojo.entity;

import cn.ekgc.medical.base.pojo.entity.BaseEntity;
import cn.ekgc.medical.emr.summary.pojo.vo.SummaryRiskVO;
import org.springframework.beans.BeanUtils;


/**
 * <b>若天医疗电子病例模块 - 病历概要个体危险信息表实体信息</b>
 * @author WangJiahao
 * @version 1.0.0
 */
public class SummaryRisk extends BaseEntity {
    private static final long serialVersionUID = 5433728534238197036L;
    private String id;                              // 主键
    private String summary;                         // 所属病历概要
    private String riskName;                        // 个体危险性名称
    private String riskCode;                        // 个体危险性代码

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
     * 根据视图对象获取实体对象
     * @param vo
     * @return
     */
    public static SummaryRisk getEntityFromVO(SummaryRiskVO vo) {
        SummaryRisk entity = new SummaryRisk();
        BeanUtils.copyProperties(vo, entity);
        return entity;
    }
}