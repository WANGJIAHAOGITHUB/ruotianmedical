package cn.ekgc.medical.base.pojo.vo;


import cn.ekgc.medical.base.pojo.enums.StatusEnum;
import cn.ekgc.medical.base.util.BaseConstants;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

/**
 * <b>系统基础信息类 - 分页试图信息</b>
 * <p>
 *     包含以下属性：<br/>
 *     1、pageNum 当前页码信息<br/>
 *     2、pageSize 当前页码显示记录条数<br/>
 *     3、list 当前分页信息列表<b>必须是继承于基础试图信息类(BaseVO)</b>
 *     4、totalSize 当前查询总记录条数<br/>
 *     5、totalPage 当前总记录条数分页后的总页数<br/>
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 * @param <E> 规范必须是 BaseVO 的子类
 */
@ApiModel("系统基础信息类 - 分页试图信息")
public class PageVO<E extends BaseVO> implements Serializable {
	private static final long serialVersionUID = -129504218424431644L;
	@ApiModelProperty(name = "当前页码", example = "1")
	private Integer pageNum;                    // 当前页码
	@ApiModelProperty(name = "本页显示记录条数", example = "10")
	private Integer pageSize;                   // 本页显示记录条数
	@ApiModelProperty(name = "分页信息列表")
	private List<E> list;                       // 分页信息列表
	@ApiModelProperty(name = "总记录条数")
	private Long totalSize;                     // 总记录条数
	@ApiModelProperty(name = "总页数")
	private Integer totalPage;                  // 总页数

	public PageVO() {}

	public PageVO(Integer pageNum, Integer pageSize) {
		if (pageNum != null && pageNum > 0) {
			this.pageNum = pageNum;
		} else {
			this.pageNum = BaseConstants.PAGE_NUM;
		}
		if (pageSize != null && pageSize > 0) {
			this.pageSize = pageSize;
		} else {
			this.pageSize = BaseConstants.PAGE_SIZE;
		}
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		if (pageNum != null && pageNum > 0) {
			this.pageNum = pageNum;
		} else {
			this.pageNum = BaseConstants.PAGE_NUM;
		}
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		if (pageSize != null && pageSize > 0) {
			this.pageSize = pageSize;
		} else {
			this.pageSize = BaseConstants.PAGE_SIZE;
		}
	}

	public List<E> getList() {
		return list;
	}

	public void setList(List<E> list) {
		this.list = list;
	}

	public Long getTotalSize() {
		return totalSize;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
}
