package cn.ekgc.medical.emr.summary.pojo.vo;

import cn.ekgc.medical.base.pojo.vo.BaseVO;
import cn.ekgc.medical.emr.summary.pojo.entity.SummaryComm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.BeanUtils;

/**
 * <b>若天医疗电子病例模块 - 病例概要信息视图类</b>
 * <p>
 *     病例概要信息视图类
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@ApiModel("若天医疗电子病例模块 - 病例概要信息视图类")
public class SummaryCommVO extends BaseVO {
	private static final long serialVersionUID = -7543769250412124877L;
	@ApiModelProperty("主键")
	private String id;                                  // 主键
	@ApiModelProperty("所属病历概要")
	private String summary;                             // 所属病历概要
	@ApiModelProperty("联系电话-类别")
	private String phoneCat;                            // 联系电话-类别
	@ApiModelProperty("联系电话-类别代码")
	private String phoneCatCode;                        // 联系电话-类别代码
	@ApiModelProperty("联系电话-号码")
	private String phoneNo;                             // 联系电话-号码
	@ApiModelProperty("电子邮件地址")
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
	 * 根据实体对象获得视图对象
	 * @param entity
	 * @return
	 */
	public static SummaryCommVO getVOFromEntity(SummaryComm entity) {
		SummaryCommVO vo = new SummaryCommVO();
		BeanUtils.copyProperties(entity, vo);
		return vo;
	}
}