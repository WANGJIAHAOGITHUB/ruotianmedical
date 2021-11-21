package cn.ekgc.medical.base.pojo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <b>系统基础信息类 - 分页查询信息视图类</b>
 * <p>
 *     分页查询必须以该类作为查询信息请求 json 格式
 * </p>
 * @param <E> 继承基础信息视图类
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@ApiModel("系统基础信息类 - 分页查询信息视图类")
public class QueryPageVO<E extends BaseVO> extends BaseVO{
	private static final long serialVersionUID = 6636952035693211216L;
	@ApiModelProperty(name = "查询对象视图信息")
	private E query;                            // 查询对象视图信息
	@ApiModelProperty(name = "分页查询视图对象")
	private PageVO pageVO;                      // 分页视图信息对象

	public QueryPageVO() {}

	public QueryPageVO(E query, PageVO pageVO) {
		this.query = query;
		this.pageVO = pageVO;
	}

	public QueryPageVO(E query, Integer pageNum, Integer pageSize) {
		this.query = query;
		this.pageVO = new PageVO(pageNum, pageSize);
	}

	public E getQuery() {
		return query;
	}

	public void setQuery(E query) {
		this.query = query;
	}

	public PageVO getPageVO() {
		return pageVO;
	}

	public void setPageVO(PageVO pageVO) {
		this.pageVO = pageVO;
	}
}
