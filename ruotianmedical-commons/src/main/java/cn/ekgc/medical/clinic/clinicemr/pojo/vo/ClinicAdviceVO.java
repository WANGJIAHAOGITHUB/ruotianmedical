package cn.ekgc.medical.clinic.clinicemr.pojo.vo;

import cn.ekgc.medical.base.pojo.vo.BaseVO;
import cn.ekgc.medical.clinic.clinicemr.pojo.entity.ClinicAdvice;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.BeanUtils;

import java.util.Date;

/**
 * <b>若天医疗门诊信息 - 门诊医嘱信息表视图信息</b>
 * @author WangJiahao
 * @version 1.0.0
 */
@ApiModel("若天医疗门诊电子病例模块 - 门诊医嘱信息表视图信息")
public class ClinicAdviceVO extends BaseVO {
	private static final long serialVersionUID = 4484141037753388294L;
	@ApiModelProperty("主键")
	private String id;                                  // 主键
	@ApiModelProperty("所属门(急)诊病历")
	private String clinic;                              // 所属门(急)诊病历
	@ApiModelProperty("医嘱开嘱日期时间")
	private String beginTime;                           // 医嘱开嘱日期时间
	@ApiModelProperty("长期医嘱停嘱日期时间")
	private String endTime;                             // 长期医嘱停嘱日期时间
	@ApiModelProperty("医嘱执行日期时间")
	private Date execTime;                              // 医嘱执行日期时间
	@ApiModelProperty("医嘱执行时间类别代码")
	private Date execTimeCatCode;                       // 医嘱执行时间类别代码
	@ApiModelProperty("医嘱取消日期时间")
	private String cancelTime;                          // 医嘱取消日期时间
	@ApiModelProperty("医嘱类别")
	private String adviceCat;                           // 医嘱类别
	@ApiModelProperty("医嘱内容")
	private String adviceDetail;                        // 医嘱内容

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getClinic() {
		return clinic;
	}

	public void setClinic(String clinic) {
		this.clinic = clinic;
	}

	public String getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Date getExecTime() {
		return execTime;
	}

	public void setExecTime(Date execTime) {
		this.execTime = execTime;
	}

	public Date getExecTimeCatCode() {
		return execTimeCatCode;
	}

	public void setExecTimeCatCode(Date execTimeCatCode) {
		this.execTimeCatCode = execTimeCatCode;
	}

	public String getCancelTime() {
		return cancelTime;
	}

	public void setCancelTime(String cancelTime) {
		this.cancelTime = cancelTime;
	}

	public String getAdviceCat() {
		return adviceCat;
	}

	public void setAdviceCat(String adviceCat) {
		this.adviceCat = adviceCat;
	}

	public String getAdviceDetail() {
		return adviceDetail;
	}

	public void setAdviceDetail(String adviceDetail) {
		this.adviceDetail = adviceDetail;
	}

	/**
	 * 根据实体对象获得视图对象
	 * @param entity
	 * @return
	 */
	public static ClinicAdviceVO getVOFromEntity(ClinicAdvice entity) {
		ClinicAdviceVO vo = new ClinicAdviceVO();
		BeanUtils.copyProperties(entity, vo);
		return vo;
	}
}