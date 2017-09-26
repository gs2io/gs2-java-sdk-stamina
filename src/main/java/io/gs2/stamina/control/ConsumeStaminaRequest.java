package io.gs2.stamina.control;

import io.gs2.control.Gs2UserRequest;
import io.gs2.stamina.Gs2Stamina;

/**
 * スタミナの消費リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class ConsumeStaminaRequest extends Gs2UserRequest<ConsumeStaminaRequest> {

	public static class Constant extends Gs2Stamina.Constant {
		public static final String FUNCTION = "ConsumeStamina";
	}
	
	/** スタミナプール名 */
	String staminaPoolName;
	/** スタミナの消費量 */
	Integer variation;
	/** スタミナの最大量 */
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
	public ConsumeStaminaRequest withStaminaPoolName(String staminaPoolName) {
		setStaminaPoolName(staminaPoolName);
		return this;
	}

	/**
	 * スタミナの消費量を取得。
	 * 
	 * @return スタミナの消費量
	 */
	public Integer getVariation() {
		return variation;
	}

	/**
	 * スタミナの消費量を設定。
	 * 
	 * @param variation スタミナの消費量
	 */
	public void setVariation(Integer variation) {
		this.variation = variation;
	}

	/**
	 * スタミナの消費量を設定。
	 * 
	 * @param variation スタミナの消費量
	 * @return this
	 */
	public ConsumeStaminaRequest withVariation(Integer variation) {
		setVariation(variation);
		return this;
	}

	/**
	 * スタミナの最大量を取得。
	 * 
	 * @return スタミナの最大量
	 */
	public Integer getMaxValue() {
		return maxValue;
	}

	/**
	 * スタミナの最大量を設定。
	 * 
	 * @param maxValue スタミナの最大量
	 */
	public void setMaxValue(Integer maxValue) {
		this.maxValue = maxValue;
	}

	/**
	 * スタミナの最大量を設定。
	 * 
	 * @param maxValue スタミナの最大量
	 * @return this
	 */
	public ConsumeStaminaRequest withMaxValue(Integer maxValue) {
		setMaxValue(maxValue);
		return this;
	}
}
