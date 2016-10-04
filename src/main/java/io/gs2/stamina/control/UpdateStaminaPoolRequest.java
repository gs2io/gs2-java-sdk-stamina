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
public class UpdateStaminaPoolRequest extends Gs2BasicRequest<UpdateStaminaPoolRequest> {

	public static class Constant extends Gs2Stamina.Constant {
		public static final String FUNCTION = "UpdateStaminaPool";
	}

	/** スタミナプール名 */
	String staminaPoolName;
	/** 説明 */
	String description;
	/** サービスクラス */
	String serviceClass;
	/** スタミナの回復速度 */
	Integer increaseInterval;

	/**
	 * スタミナプール名を取得。
	 * 
	 * @return スタミナプール名
	 */
	public String getStaminaPoolName() {
		return staminaPoolName;
	}
	
	/**
	 * スタミナプール名を設定。
	 * 
	 * @param staminaPoolName スタミナプール名
	 */
	public void setStaminaPoolName(String staminaPoolName) {
		this.staminaPoolName = staminaPoolName;
	}
	
	/**
	 * スタミナプール名を設定。
	 * 
	 * @param staminaPoolName スタミナプール名
	 * @return this
	 */
	public UpdateStaminaPoolRequest withStaminaPoolName(String staminaPoolName) {
		setStaminaPoolName(staminaPoolName);
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
	public UpdateStaminaPoolRequest withDescription(String description) {
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
	public UpdateStaminaPoolRequest withServiceClass(String serviceClass) {
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
	public UpdateStaminaPoolRequest withIncreaseInterval(Integer increaseInterval) {
		setIncreaseInterval(increaseInterval);
		return this;
	}
	
}
