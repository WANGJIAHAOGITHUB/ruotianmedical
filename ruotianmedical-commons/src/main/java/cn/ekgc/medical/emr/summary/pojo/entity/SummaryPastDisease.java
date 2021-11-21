package cn.ekgc.medical.emr.summary.pojo.entity;

import cn.ekgc.medical.base.pojo.entity.BaseEntity;
import cn.ekgc.medical.emr.summary.pojo.vo.SummaryPastDiseaseVO;
import cn.ekgc.medical.emr.summary.pojo.vo.SummaryPastDiseaseVO;
import org.springframework.beans.BeanUtils;

public class SummaryPastDisease extends BaseEntity {
	private static final long serialVersionUID = 4678757476451146521L;
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 根据视图对象获取实体对象
	 * @param vo
	 * @return
	 */
	public static SummaryPastDisease getEntityFromVO(SummaryPastDiseaseVO vo) {
		SummaryPastDisease entity = new SummaryPastDisease();
		BeanUtils.copyProperties(vo, entity);
		return entity;
	}
}
