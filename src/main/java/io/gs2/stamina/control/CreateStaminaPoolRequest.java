package io.gs2.stamina.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.stamina.Gs2Stamina;

/**
 * スタミナプールの作成リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class CreateStaminaPoolRequest extends Gs2BasicRequest<CreateStaminaPoolRequest> {

	public static class Constant extends Gs2Stamina.Constant {
		public static final String FUNCTION = "CreateStaminaPool";
	}

	/** 名前 */
	String name;
	/** 説明 */
	String description;
	/** サービスクラス */
	String serviceClass;
	/** スタミナの回復速度 */
	Integer increaseInterval;

	/**
	 * 名前を取得。
	 * 
	 * @return 名前
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 名前を設定。
	 * 
	 * @param name 名前
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 名前を設定。
	 * 
	 * @param name 名前
	 * @return this
	 */
	public CreateStaminaPoolRequest withName(String name) {
		setName(name);
		return this;
	}

	/**
	 * 説明を取得。
	 * 
	 * @return 説明
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * 説明を設定。
	 * 
	 * @param description 説明
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * 説明を設定。
	 * 
	 * @param description 説明
	 * @return this
	 */
	public CreateStaminaPoolRequest withDescription(String description) {
		setDescription(description);
		return this;
	}

	/**
	 * サービスクラスを取得。
	 * 
	 * @return サービスクラス
	 */
	public String getServiceClass() {
		return serviceClass;
	}
	
	/**
	 * サービスクラスを設定。
	 * 
	 * @param serviceClass サービスクラス
	 */
	public void setServiceClass(String serviceClass) {
		this.serviceClass = serviceClass;
	}
	
	/**
	 * サービスクラスを設定。
	 * 
	 * @param serviceClass サービスクラス
	 * @return this
	 */
	public CreateStaminaPoolRequest withServiceClass(String serviceClass) {
		setServiceClass(serviceClass);
		return this;
	}

	/**
	 * スタミナの回復速度を取得。
	 * 
	 * @return スタミナの回復速度
	 */
	public Integer getIncreaseInterval() {
		return increaseInterval;
	}
	
	/**
	 * スタミナの回復速度を設定。
	 * 
	 * @param increaseInterval スタミナの回復速度
	 */
	public void setIncreaseInterval(Integer increaseInterval) {
		this.increaseInterval = increaseInterval;
	}
	
	/**
	 * スタミナの回復速度を設定。
	 * 
	 * @param increaseInterval スタミナの回復速度
	 * @return this
	 */
	public CreateStaminaPoolRequest withIncreaseInterval(Integer increaseInterval) {
		setIncreaseInterval(increaseInterval);
		return this;
	}
	
}
