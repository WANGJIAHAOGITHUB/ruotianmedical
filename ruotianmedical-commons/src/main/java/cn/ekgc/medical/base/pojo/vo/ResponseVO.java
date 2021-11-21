package cn.ekgc.medical.base.pojo.vo;

import cn.ekgc.medical.base.pojo.enums.ResponseCodeEnum;
import cn.ekgc.medical.base.util.BaseConstants;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.aspectj.apache.bcel.classfile.Code;

import javax.xml.ws.Response;
import java.io.Serializable;

/**
 * <b>系统基础信息类 - 系统响应信息视图</b>
 * <p>
 *     与前端交互后返回前端的数据都必须在该系统响应信息视图类的范围内
 *     包含属性
 *     1、系统响应编码
 *     <b>
 *         2000 - 成功<br/>
 *         3000 - 用户未认证<br/>
 *         4000 - 业务处理错误<br/>
 *         5000 - 系统响应异常<br/>
 *     </b>
 *     2、系统响应数据
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 * @param <E> 响应数据泛型
 */
@ApiModel("系统基础信息类 - 系统响应信息视图")
public class ResponseVO<E> implements Serializable {
	private static final long serialVersionUID = -2255482759176634045L;
	@ApiModelProperty(name = "系统响应编码")
	private Integer code;                               // 系统响应编码
	@ApiModelProperty(name = "系统响应数据")
	private E data;                                // 系统响应数据

	private ResponseVO(Integer code, E data) {
		this.code = code;
		this.data = data;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	/**
	 * <b>系统响应成功后，返回响应成功编码，响应结果</b>
	 * @param data
	 * @return
	 */
	public static ResponseVO getResponseSuccess(Object data) {
		return new ResponseVO(ResponseCodeEnum.RESPONSE_CODE_SUCCESS.getCode(), data);
	}

	/**
	 * <b>系统响应成功后，返回响应用户未认证编码，响应结果</b>
	 * @return
	 */
	public static ResponseVO getResponseUnauthorized() {
		return new ResponseVO(ResponseCodeEnum.RESPONSE_CODE_UNAUTHORIZED.getCode(), ResponseCodeEnum.RESPONSE_CODE_UNAUTHORIZED.getRemark());
	}

	/**
	 * <b>系统响应失败后，返回响应失败编码，响应结果</b>
	 * @return
	 */
	public static ResponseVO getResponseError() {
		return new ResponseVO(ResponseCodeEnum.RESPONSE_CODE_ERROR.getCode(), ResponseCodeEnum.RESPONSE_CODE_ERROR.getRemark());
	}

	/**
	 * <b>系统响应失败后，返回响应失败编码，失败结果</b>
	 * @return
	 */
	public static ResponseVO getResponseError(Object errorResult) {
		return new ResponseVO(ResponseCodeEnum.RESPONSE_CODE_ERROR.getCode(), errorResult);
	}

	/**
	 * <b>系统响应失败后，返回响应失败编码，失败结果</b>
	 * @return
	 */
	public static ResponseVO getResponseException(Exception e) {
		return new ResponseVO(ResponseCodeEnum.RESPONSE_CODE_EXCEPTION.getCode(), e.getMessage());
	}
}
