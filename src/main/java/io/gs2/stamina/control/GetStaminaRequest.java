package io.gs2.stamina.control;

import io.gs2.control.Gs2UserRequest;
import io.gs2.stamina.Gs2Stamina;

/**
 * スタミナの取得リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class GetStaminaRequest extends Gs2UserRequest<GetStaminaRequest> {

	public static class Constant extends Gs2Stamina.Constant {
		public static final String FUNCTION = "GetStamina";
	}

	/** スタミナプール名 */
	String staminaPoolName;
	/** スタミナの最大値 */
	Integer maxValue;

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
	public GetStaminaRequest withStaminaPoolName(String staminaPoolName) {
		setStaminaPoolName(staminaPoolName);
		return this;
	}

	/**
	 * スタミナの最大値を取得。
	 * 
	 * @return スタミナの最大値
	 */
	public Integer getMaxValue() {
		return maxValue;
	}
	
	/**
	 * スタミナの最大値を設定。
	 * 
	 * @param maxValue スタミナの最大値
	 */
	public void setMaxValue(Integer maxValue) {
		this.maxValue = maxValue;
	}
	
	/**
	 * スタミナの最大値を設定。
	 * 
	 * @param maxValue スタミナの最大値
	 * @return this
	 */
	public GetStaminaRequest withMaxValue(Integer maxValue) {
		setMaxValue(maxValue);
		return this;
	}
}
