package cn.ekgc.medical.emr.summary.pojo.entity;

import cn.ekgc.medical.base.pojo.entity.BaseEntity;
import cn.ekgc.medical.emr.summary.pojo.vo.SummaryLiaisonVO;
import org.springframework.beans.BeanUtils;

import java.util.Date;

/**
 * <b>若天医疗电子病例模块 - 病历概要联系人信息表实体信息</b>
 * @author WangJiahao
 * @version 1.0.0
 */
public class SummaryLiaison extends BaseEntity {
	private static final long serialVersionUID = 6554133550034938365L;
	private String id;                              // 主键
    private String summary;                         // 所属病历概要
    private String noCatCode;                       // 标识号-类别代码
    private String no;                              // 标识号-号码
    private Date noEffDate;                         // 标识号-生效日期
    private Date noExpDate;                         // 标识号-失效日期
    private String noOrgName;                       // 标识号-提供标识的机构名称
    private String objCat;                          // 姓名-标识对象
    private String objCatCode;                      // 姓名-标识对象代码
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
	 * 根据视图对象获取实体对象
	 * @param vo
	 * @return
	 */
	public static SummaryLiaison getEntityFromVO(SummaryLiaisonVO vo) {
		SummaryLiaison entity = new SummaryLiaison();
		BeanUtils.copyProperties(vo, entity);
		return entity;
	}
}