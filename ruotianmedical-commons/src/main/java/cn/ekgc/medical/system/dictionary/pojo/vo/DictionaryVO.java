package cn.ekgc.medical.system.dictionary.pojo.vo;

import cn.ekgc.medical.base.pojo.vo.BaseVO;
import cn.ekgc.medical.system.dictionary.pojo.entity.Dictionary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.BeanUtils;

import java.util.List;

/**
 * <b>若天医疗系统信息 - 数据字典视图类</b>
 * <p>
 *     查询医疗专业信息代码
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
@ApiModel("若天医疗系统信息 - 数据字典视图类")
public class DictionaryVO extends BaseVO {
	private static final long serialVersionUID = 4976071371692708648L;
	@ApiModelProperty(name = "主键")
	private String id;                          // 主键
	@ApiModelProperty(name = "上一级数据字典")
	private DictionaryVO superior;              // 上一级数据字典
	@ApiModelProperty(name = "数据名称")
	private String name;                        // 数据名称
	@ApiModelProperty(name = "数据编码")
	private String code;                        // 数据编码
	@ApiModelProperty(name = "下级数据字典列表")
	private List<DictionaryVO> subordinate;     // 下级数据字典列表

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public DictionaryVO getSuperior() {
		return superior;
	}

	public void setSuperior(DictionaryVO superior) {
		this.superior = superior;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<DictionaryVO> getSubordinate() {
		return subordinate;
	}

	public void setSubordinate(List<DictionaryVO> subordinate) {
		this.subordinate = subordinate;
	}

	/**
	 * 根据实体对象获取视图对象
	 * @param dictionary
	 * @return
	 */
	public static DictionaryVO getVOFromEntity(Dictionary dictionary) {
		DictionaryVO vo = new DictionaryVO();
		BeanUtils.copyProperties(dictionary, vo);
		if (dictionary.getSuperior() != null) {
			DictionaryVO superior = new DictionaryVO();
			superior.setId(dictionary.getSuperior().getId());
			superior.setName(dictionary.getSuperior().getName());
			superior.setCode(dictionary.getSuperior().getCode());
			vo.setSuperior(superior);
		}
		return vo;
	}
}
