package org.lyon_yan.support.plugin.info;

/**
 * 模块描述信息
 * 
 * @author Lyon_Yan
 *
 */
public class Description {
	/**
	 * 模块的可识别ID 此ID需要经过合法认证，由模块提供者进行申请
	 */
	private String id = null;
	/**
	 * 名称
	 */
	private String name = null;
	/**
	 * 认证密钥 由模块提供者申请，用于检查模块是否被篡改
	 */
	private String key = null;
	/**
	 * 模块描述信息
	 */
	private String description = null;
	/**
	 * 文本编码信息
	 */
	private String charset = "utf-8";

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCharset() {
		return charset;
	}

	public void setCharset(String charset) {
		this.charset = charset;
	}
}
