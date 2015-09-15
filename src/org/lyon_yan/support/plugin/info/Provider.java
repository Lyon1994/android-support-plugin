package org.lyon_yan.support.plugin.info;

/**
 * 模块提供者
 * 
 * @author Lyon_Yan
 *
 */
public class Provider {
	/**
	 * 模块提供者的可识别ID 此ID需要经过合法认证，符合一定的规定
	 */
	private String id = null;
	/**
	 * 模块提供者的认证名称
	 */
	private String name = null;
	/**
	 * 版权信息
	 */
	private String copyright = null;
	/**
	 * 认证密钥
	 */
	private String key = null;
	/**
	 * 声明信息
	 */
	private String declare = null;
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

	public String getCopyright() {
		return copyright;
	}

	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getDeclare() {
		return declare;
	}

	public void setDeclare(String declare) {
		this.declare = declare;
	}

	public String getCharset() {
		return charset;
	}

	public void setCharset(String charset) {
		this.charset = charset;
	}
}
