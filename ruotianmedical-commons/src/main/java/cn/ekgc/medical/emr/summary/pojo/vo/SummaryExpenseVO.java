package cn.ekgc.medical.emr.summary.pojo.vo;


import cn.ekgc.medical.base.pojo.vo.BaseVO;

import cn.ekgc.medical.emr.summary.pojo.entity.SummaryExpense;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.BeanUtils;

/**
 * <b>若天医疗电子病例模块 - 病例概要门诊费用信息视图类</b>
 * <p>
 *     病例概要门诊费用信息视图类
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@ApiModel("若天医疗电子病例模块 - 病例概要门诊费用信息视图类")
public class SummaryExpenseVO extends BaseVO {
	private static final long serialVersionUID = 7387966545115674252L;
	@ApiModelProperty("主键")
	private String id;                                      // 主键
	@ApiModelProperty("所属病历概要")
	private String summary;                                 // 所属病历概要
	@ApiModelProperty("门诊费用-分类")
	private String expenseCat;                              // 门诊费用-分类
	@ApiModelProperty("门诊费用-分类代码")
	private String expenseCatCode;                          // 门诊费用-分类代码
	@ApiModelProperty("门诊费用-金额（元/人民币）")
	private Double expenseAmount;                           // 门诊费用-金额（元/人民币）
	@ApiModelProperty("门诊费用-支付方式代码")
	private String expensePayTypeCode;                      // 门诊费用-支付方式代码
	@ApiModelProperty("个人承担费用（元）")
	private Double personalAmount;                          // 个人承担费用（元）

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

	public String getExpenseCat() {
		return expenseCat;
	}

	public void setExpenseCat(String expenseCat) {
		this.expenseCat = expenseCat;
	}

	public String getExpenseCatCode() {
		return expenseCatCode;
	}

	public void setExpenseCatCode(String expenseCatCode) {
		this.expenseCatCode = expenseCatCode;
	}

	public Double getExpenseAmount() {
		return expenseAmount;
	}

	public void setExpenseAmount(Double expenseAmount) {
		this.expenseAmount = expenseAmount;
	}

	public String getExpensePayTypeCode() {
		return expensePayTypeCode;
	}

	public void setExpensePayTypeCode(String expensePayTypeCode) {
		this.expensePayTypeCode = expensePayTypeCode;
	}

	public Double getPersonalAmount() {
		return personalAmount;
	}

	public void setPersonalAmount(Double personalAmount) {
		this.personalAmount = personalAmount;
	}

	/**
	 * 根据实体对象获得视图对象
	 * @param entity
	 * @return
	 */
	public static SummaryExpenseVO getVOFromEntity(SummaryExpense entity) {
		SummaryExpenseVO vo = new SummaryExpenseVO();
		BeanUtils.copyProperties(entity, vo);
		return vo;
	}
}