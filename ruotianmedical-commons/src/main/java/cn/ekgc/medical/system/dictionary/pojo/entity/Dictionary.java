package cn.ekgc.medical.system.dictionary.pojo.entity;

import cn.ekgc.medical.base.pojo.entity.BaseEntity;
import cn.ekgc.medical.system.dictionary.pojo.entity.Dictionary;
import cn.ekgc.medical.system.dictionary.pojo.vo.DictionaryVO;
import org.springframework.beans.BeanUtils;

import java.util.List;


/**
 * <b>若天医疗系统信息 - 数据字典实体类</b>
 * <p>
 *     查询医疗专业信息代码
 * </p>
 * @author WangJiahao
 * @version 1.0.0
 * @since 1.0.0
 */
public class Dictionary extends BaseEntity {
	private static final long serialVersionUID = 6841577966080277239L;
	private String id;                          // 主键
	private Dictionary superior;                // 上一级数据字典
	private String name;                        // 数据名称
	private String code;                        // 数据编码
	private List<Dictionary> subordinate;       // 下级数据字典列表

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Dictionary getSuperior() {
		return superior;
	}

	public void setSuperior(Dictionary superior) {
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

	public List<Dictionary> getSubordinate() {
		return subordinate;
	}

	public void setSubordinate(List<Dictionary> subordinate) {
		this.subordinate = subordinate;
	}

	/**
	 * 根据视图对象获取实体对象
	 * @param vo
	 * @return
	 */
	public static Dictionary getEntityFromVO(DictionaryVO vo) {
		Dictionary entity = new Dictionary();
		BeanUtils.copyProperties(vo, entity);
		if (vo.getSuperior() != null) {
			Dictionary superior = new Dictionary();
			superior.setName(vo.getSuperior().getName());
			superior.setId(vo.getSuperior().getId());
			superior.setCode(vo.getSuperior().getCode());
			entity.setSuperior(superior);
		}
		return entity;
	}
}
