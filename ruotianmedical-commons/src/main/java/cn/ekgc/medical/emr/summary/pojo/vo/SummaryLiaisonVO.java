package cn.ekgc.medical.emr.summary.pojo.vo;

import cn.ekgc.medical.base.pojo.vo.BaseVO;
import cn.ekgc.medical.emr.summary.pojo.entity.Summary;
import cn.ekgc.medical.emr.summary.pojo.entity.SummaryLiaison;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.BeanUtils;

import java.util.Date;

/**
 * <b>若天医疗电子病例模块 - 病例概要联系人信息视图类</b>
 * <p>
 *     病例概要联系人信息视图类
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@ApiModel("若天医疗电子病例模块 - 病例概要联系人信息视图类")
public class SummaryLiaisonVO extends BaseVO {
	private static final long serialVersionUID = 4685881979909169149L;
	@ApiModelProperty("主键")
	private String id;                              // 主键
	@ApiModelProperty("所属病历概要")
	private String summary;                         // 所属病历概要
	@ApiModelProperty("标识号-类别代码")
	private String noCatCode;                       // 标识号-类别代码
	@ApiModelProperty("标识号-号码")
	private String no;                              // 标识号-号码
	@ApiModelProperty("标识号-生效日期")
	private Date noEffDate;                         // 标识号-生效日期
	@ApiModelProperty("标识号-失效日期")
	private Date noExpDate;                         // 标识号-失效日期
	@ApiModelProperty("标识号-提供标识的机构名称")
	private String noOrgName;                       // 标识号-提供标识的机构名称
	@ApiModelProperty("姓名-标识对象")
	private String objCat;                          // 姓名-标识对象
	@ApiModelProperty("姓名-标识对象代码")
	private String objCatCode;                      // 姓名-标识对象代码
	@ApiModelProperty("姓名")
	private String name;                            // 姓名

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

	public String getNoCatCode() {
		return noCatCode;
	}

	public void setNoCatCode(String noCatCode) {
		this.noCatCode = noCatCode;
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

	public String getObjCat() {
		return objCat;
	}

	public void setObjCat(String objCat) {
		this.objCat = objCat;
	}

	public String getObjCatCode() {
		return objCatCode;
	}

	public void setObjCatCode(String objCatCode) {
		this.objCatCode = objCatCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 根据实体对象获得视图对象
	 * @param entity
	 * @return
	 */
	public static SummaryLiaisonVO getVOFromEntity(SummaryLiaison entity) {
		SummaryLiaisonVO vo = new SummaryLiaisonVO();
		BeanUtils.copyProperties(entity, vo);
		return vo;
	}
}