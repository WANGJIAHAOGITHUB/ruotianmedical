package cn.ekgc.medical.emr.summary.pojo.vo;

import cn.ekgc.medical.base.pojo.vo.BaseVO;
import cn.ekgc.medical.emr.summary.pojo.entity.SummaryPastDisease;
import cn.ekgc.medical.emr.summary.pojo.entity.SummaryPastDisease;
import org.springframework.beans.BeanUtils;

public class SummaryPastDiseaseVO extends BaseVO {
	private static final long serialVersionUID = 2156330241044370200L;
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 根据实体对象获得视图对象
	 * @param entity
	 * @return
	 */
	public static SummaryPastDiseaseVO getVOFromEntity(SummaryPastDisease entity) {
		SummaryPastDiseaseVO vo = new SummaryPastDiseaseVO();
		BeanUtils.copyProperties(entity, vo);
		return vo;
	}
}
