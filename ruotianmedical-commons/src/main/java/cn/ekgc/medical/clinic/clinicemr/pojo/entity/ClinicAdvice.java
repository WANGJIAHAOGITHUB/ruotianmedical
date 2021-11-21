package cn.ekgc.medical.clinic.clinicemr.pojo.entity;

import cn.ekgc.medical.base.pojo.entity.BaseEntity;
import cn.ekgc.medical.clinic.clinicemr.pojo.vo.ClinicAdviceVO;
import org.springframework.beans.BeanUtils;

import java.util.Date;

/**
 * <b>若天医疗门诊信息 - 门诊医嘱信息表实体信息</b>
 * @author WangJiahao
 * @version 1.0.0
 */
public class ClinicAdvice extends BaseEntity {
    private static final long serialVersionUID = 8133223360026838874L;
    private String id;                                  // 主键
    private String clinic;                              // 所属门(急)诊病历
    private String beginTime;                           // 医嘱开嘱日期时间
    private String endTime;                             // 长期医嘱停嘱日期时间
    private Date execTime;                              // 医嘱执行日期时间
    private Date execTimeCatCode;                       // 医嘱执行时间类别代码
    private String cancelTime;                          // 医嘱取消日期时间
    private String adviceCat;                           // 医嘱类别
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
     * 根据视图对象获取实体对象
     * @param vo
     * @return
     */
    public static ClinicAdvice getVOFromEntity(ClinicAdviceVO vo) {
        ClinicAdvice entity = new ClinicAdvice();
        BeanUtils.copyProperties(vo, entity);
        return entity;
    }
}