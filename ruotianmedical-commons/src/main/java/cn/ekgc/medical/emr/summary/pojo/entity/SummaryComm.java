package cn.ekgc.medical.emr.summary.pojo.entity;

import cn.ekgc.medical.base.pojo.entity.BaseEntity;
import cn.ekgc.medical.emr.summary.pojo.vo.SummaryCommVO;
import org.springframework.beans.BeanUtils;

/**
 * <b>若天医疗电子病例模块 - 病历概要通信信息表实体信息</b>
 * @author WangJiahao
 * @version 1.0.0
 */
public class SummaryComm extends BaseEntity {
	private static final long serialVersionUID = 8685151258712023175L;
	private String id;                                  // 主键
    private String summary;                             // 所属病历概要
    private String phoneCat;                            // 联系电话-类别
    private String phoneCatCode;                        // 联系电话-类别代码
    private String phoneNo;                             // 联系电话-号码
    private String email;                               // 电子邮件地址

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

	public String getPhoneCat() {
		return phoneCat;
	}

	public void setPhoneCat(String phoneCat) {
		this.phoneCat = phoneCat;
	}

	public String getPhoneCatCode() {
		return phoneCatCode;
	}

	public void setPhoneCatCode(String phoneCatCode) {
		this.phoneCatCode = phoneCatCode;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 根据视图对象获取实体对象
	 * @param vo
	 * @return
	 */
	public static SummaryComm getEntityFromVO(SummaryCommVO vo) {
		SummaryComm entity = new SummaryComm();
		BeanUtils.copyProperties(vo, entity);
		return entity;
	}
}