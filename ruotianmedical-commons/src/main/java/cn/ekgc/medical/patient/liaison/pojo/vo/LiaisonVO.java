package cn.ekgc.medical.patient.liaison.pojo.vo;

import cn.ekgc.medical.base.pojo.vo.BaseVO;
import cn.ekgc.medical.patient.liaison.pojo.entity.Liaison;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.BeanUtils;

import java.util.Date;

/**
 * <b>若天医疗患者信息 - 患者联系人信息表视图信息</b>
 * @author WangJiahao
 * @version 1.0.0
 */
@ApiModel("若天医疗患者信息 - 患者联系人信息表视图信息")
public class LiaisonVO extends BaseVO {
	private static final long serialVersionUID = 7687033197683179678L;
	@ApiModelProperty("主键")
	private String id;                              // 主键
	@ApiModelProperty("患者信息")
	private String patient;                         // 患者信息
	@ApiModelProperty("姓名")
	private String name;                            // 姓名
	@ApiModelProperty("联系人类别")
	private String objCat;                          // 联系人类别
	@ApiModelProperty("证件类别")
	private String noCat;                           // 证件类别
	@ApiModelProperty("证件号码")
	private String no;                              // 证件号码
	@ApiModelProperty("证件生效日期")
	private Date noEffDate;                         // 证件生效日期
	@ApiModelProperty("证件失效日期")
	private Date noExpDate;                         // 证件失效日期
	@ApiModelProperty("证件提供标识的机构名称")
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
	 * 根据实体对象获得视图对象
	 * @param entity
	 * @return
	 */
	public static LiaisonVO getVOFromEntity(Liaison entity) {
		LiaisonVO vo = new LiaisonVO();
		BeanUtils.copyProperties(entity, vo);
		return vo;
	}
}