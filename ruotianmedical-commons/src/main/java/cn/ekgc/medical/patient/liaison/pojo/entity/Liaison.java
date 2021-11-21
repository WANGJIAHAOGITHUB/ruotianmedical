package cn.ekgc.medical.patient.liaison.pojo.entity;

import cn.ekgc.medical.base.pojo.entity.BaseEntity;
import cn.ekgc.medical.patient.liaison.pojo.vo.LiaisonVO;
import org.springframework.beans.BeanUtils;

import java.util.Date;

/**
 * <b>若天医疗患者信息 - 患者联系人信息表实体信息</b>
 * @author WangJiahao
 * @version 1.0.0
 */
public class Liaison extends BaseEntity {
    private static final long serialVersionUID = 5271223531632278972L;
    private String id;                              // 主键
    private String patient;                         // 患者信息
    private String name;                            // 姓名
    private String objCat;                          // 联系人类别
    private String noCat;                           // 证件类别
    private String no;                              // 证件号码
    private Date noEffDate;                         // 证件生效日期
    private Date noExpDate;                         // 证件失效日期
    private String noOrgName;                       // 证件提供标识的机构名称

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getObjCat() {
        return objCat;
    }

    public void setObjCat(String objCat) {
        this.objCat = objCat;
    }

    public String getNoCat() {
        return noCat;
    }

    public void setNoCat(String noCat) {
        this.noCat = noCat;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public Date getNoEffDate() {
        return noEffDate;
    }

    public void setNoEffDate(Date noEffDate) {
        this.noEffDate = noEffDate;
    }

    public Date getNoExpDate() {
        return noExpDate;
    }

    public void setNoExpDate(Date noExpDate) {
        this.noExpDate = noExpDate;
    }

    public String getNoOrgName() {
        return noOrgName;
    }

    public void setNoOrgName(String noOrgName) {
        this.noOrgName = noOrgName;
    }

    /**
     * 根据视图对象获取实体对象
     * @param vo
     * @return
     */
    public static Liaison getVOFromEntity(LiaisonVO vo) {
        Liaison entity = new Liaison();
        BeanUtils.copyProperties(vo, entity);
        return entity;
    }
}