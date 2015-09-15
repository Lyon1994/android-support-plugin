package org.lyon_yan.support.plugin;

import org.lyon_yan.support.plugin.info.Description;
import org.lyon_yan.support.plugin.info.Provider;

import android.content.Context;

/**
 * charset:utf-8
 * <p>message:	模块的预留接口，用于应用程序的模块化调用
 * 			Plugin类是每个模块的必有的类，包含着模块的调用方法与信息
 * 			此类作为寄生函数的标识执行</p></br>
 * vision:1.0 beta
 * time:2015-03-21 17:14:55
 * @author lyon_yan
 *
 */
public interface Plugin {
	/**
	 * 绑定宿主activity程序
	 * @param mainActivity
	 * @return
	 */
	public Object setAppContext(Context context);
	/**
	 * 执行方法
	 * @return
	 */
	public Object execute();
	/**
	 * 获取模块的描述信息
	 * @return 
	 */
	public Description getDescription();
	/**
	 * 获取模块的ID
	 * ID由提供商申请获取（申请需要符合ID唯一性）
	 * @return
	 */
	public String getID();
	/**
	 * 获取模块的提供者
	 * 提供者ID需要获取认证资格
	 * @return
	 */
	public Provider getProvider();

}
