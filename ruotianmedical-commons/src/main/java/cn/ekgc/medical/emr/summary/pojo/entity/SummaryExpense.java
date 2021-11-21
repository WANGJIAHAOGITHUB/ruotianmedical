package cn.ekgc.medical.emr.summary.pojo.entity;

import cn.ekgc.medical.base.pojo.entity.BaseEntity;
import cn.ekgc.medical.emr.summary.pojo.vo.SummaryExpenseVO;
import cn.ekgc.medical.emr.summary.pojo.vo.SummaryVO;
import org.springframework.beans.BeanUtils;

/**
 * <b>若天医疗电子病例模块 - 病历概要收费信息表实体信息</b>
 * @author WangJiahao
 * @version 1.0.0
 */
public class SummaryExpense extends BaseEntity {
    private String id;                                          // 主键
    private String summary;                                     // 所属病历概要
    private String expenseCat;                                  // 门诊费用-分类
    private String expenseCatCode;                              // 门诊费用-分类代码
    private Double expenseAmount;                               // 门诊费用-金额（元/人民币）
    private String expensePayTypeCode;                          // 门诊费用-支付方式代码
    private Double personalAmount;                              // 个人承担费用（元）

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
	 * 根据视图对象获取实体对象
	 * @param vo
	 * @return
	 */
	public static SummaryExpense getEntityFromVO(SummaryExpenseVO vo) {
		SummaryExpense entity = new SummaryExpense();
		BeanUtils.copyProperties(vo, entity);
		return entity;
	}
}