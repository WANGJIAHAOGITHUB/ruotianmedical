package cn.ekgc.medical.patient.risk.pojo.entity;

import cn.ekgc.medical.base.pojo.entity.BaseEntity;
import cn.ekgc.medical.patient.risk.pojo.vo.RiskVO;
import org.springframework.beans.BeanUtils;


/**
 * <b>若天医疗患者信息 - 患者个体危险信息表实体信息</b>
 * @author WangJiahao
 * @version 1.0.0
 */
public class Risk extends BaseEntity {
    private static final long serialVersionUID = 5844267920281176734L;
    private String id;                              // 主键
    private String summary;                         // 患者信息
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
     * 根据视图对象获取实体对象
     * @param vo
     * @return
     */
    public static Risk getVOFromEntity(RiskVO vo) {
        Risk entity = new Risk();
        BeanUtils.copyProperties(vo, entity);
        return entity;
    }
}